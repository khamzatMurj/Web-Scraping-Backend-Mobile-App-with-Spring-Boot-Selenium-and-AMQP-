package com.mobileappbackend.ConfigAndSecurity.Web;


import com.mobileappbackend.ConfigAndSecurity.Web.DTO.AuthenticationRequest;
import com.mobileappbackend.ConfigAndSecurity.Web.DTO.AuthenticationResponse;
import com.mobileappbackend.ConfigAndSecurity.Web.DTO.RegisterRequest;
import com.mobileappbackend.ConfigAndSecurity.Web.Service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service.register(request));
    }




    @PostMapping("/authenticate")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }



}
