package org.mobitel.springrest.Controller;

import org.mobitel.springrest.Bean.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

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

    // video 5
    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
            return new HelloWorldBean("Hello World " +name);
    }


}
