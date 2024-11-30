package com.mobileappbackend.ConfigAndSecurity.Web.Service;

import com.mobileappbackend.ConfigAndSecurity.JwtService;
import com.mobileappbackend.ConfigAndSecurity.Web.DTO.AuthenticationRequest;
import com.mobileappbackend.ConfigAndSecurity.Web.DTO.AuthenticationResponse;
import com.mobileappbackend.ConfigAndSecurity.Web.DTO.RegisterRequest;
import com.mobileappbackend.Dao.IuserRepository;
import com.mobileappbackend.Entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final IuserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;


    public AuthenticationResponse register(RegisterRequest request) {
        var user = User.builder()
                .name(request.getUserName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(request.getRole())
                .build();
        var savedUser = repository.save(user);
        var jwtToken = jwtService.generateToken(user);


        return AuthenticationResponse.builder()
                .accessToken(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = repository.findByEmail(request.getEmail())
                .orElseThrow();
        var jwtToken = jwtService.generateToken((UserDetails) user);


        return AuthenticationResponse.builder()
                .accessToken(jwtToken)
                .build();
    }
}
