package com.example.pruebaCasa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* Todo esto hecho desde ejemplo Tutorial Spring boot sencillo y en español
    https://www.youtube.com/watch?v=WVHnk04skPc (min 7)
*/

@RestController
public class HolaMundo {
    @RequestMapping("/holita")
    /* Si pongo ("/holita") lo veré en http://localhost:9000/holita
    Pero si pongo ("/") lo veré en http://localhost:9000/
     */

    public String hola(){
        return "Hola mundito de Rubén!";
    }
}
