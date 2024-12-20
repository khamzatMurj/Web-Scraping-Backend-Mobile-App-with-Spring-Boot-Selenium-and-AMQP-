<h1>Hello !!</h1>
<div>
    <h2>Project Overview</h2>
    <div>
        <dl>
            <dt><strong>Design Application:</strong></dt>
            <dd><img src="img/img_3.png"></dd>
        </dl>
        <hr color="#ff0000" size="4">
        <dl>
            <dt>Build Application: </dt>
            <dd>
                <table>
                    <tr>
                        <td width="400"><strong><img src="img/img_4.png"></strong></td>
                        <td width="400"><strong><img src="img/img_5.png"></strong></td>
                    </tr>
                </table>
            </dd>
        </dl>
 
</div>
    
</div>
<br><br><br><br>
<hr>
<hr>
<br><br><br><br>

<div>
    <h2>Project Architecture</h2>
    <a href="https://bernhardwenzel.com/articles/tutorial-build-a-message-driven-microservice-application/">Inspiration :</a>
    <tr>
        <td><img src="img/img_13.png"></td>
    </tr>     
</div>


<h2>JWT Implementation</h2>
<p>this is a my final step about intauring spring security layer using jwt as show below</p>

<div>
<div>
    <dl>
        <dt>Registeration : </dt>
        <dd><img src="img/img.png"></dd>
    </dl>
</div>
<hr>
<div>
    <dl>
        <dt>Authentication : </dt>
        <i>authentication using jwt token : </i>
        <img src="img/img_2.png">
    </dl>

</div>
<hr>

</div>

<br><br><br><br>
<hr>
<hr>
<br><br><br><br>

<h2>AMQP Controller Implementation </h2>


<div>
<dl>
        <dt>I-Authenticate : to get fresh jwt token</dt>
        <dd><img src="img/img_9.png"></dd>
    </dl> 
<hr>
    <dl>
        <dt>II-Start the Rabbit MQ instance : </dt>
        <dd><img src="img/img_8.png"></dd>
    </dl>
</div>
<hr>
<div>
    <dl> <strong>III-</strong>
        
<ol>
<li>
<dt>Consumme AMQP API Sender : </dt>
        <i>We have to consume the api with a jwt authentication alive token</i>
        <dd><img src="img/img_11.png"></dd>
</li>
<li>
<dt>Consumme AMQP API Reader : </dt>
        <i>We have to consume the api with a jwt authentication alive token</i>
        <dd><img src="img/img_12.png"></dd>
</li>
</ol>
    </dl>
    
<br><hr>
<dl>
        <dt>VI-Send Website to MongoDb Document :</dt>
        <dd><img src="img/img_10.png"></dd>
 <dl>
        <dt>V-Data Persistant</dt>
        <i>Users registered are persisted within mongoDB database</i>
        <dd><img src="img/img_1.png"></dd>
    </dl>
        
</dl>    
</dl>
</div>


