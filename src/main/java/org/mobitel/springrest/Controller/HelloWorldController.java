package org.mobitel.springrest.Controller;

import org.mobitel.springrest.Bean.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String sayHello(){
        return "Hello There";
    }


    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }



}
