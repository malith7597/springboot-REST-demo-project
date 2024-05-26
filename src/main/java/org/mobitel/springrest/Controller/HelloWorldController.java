package org.mobitel.springrest.Controller;

import org.mobitel.springrest.Bean.HelloWorldBean;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping("api/v1")
public class HelloWorldController {

    private MessageSource messageSource;
    public HelloWorldController(MessageSource messageSource){
        this.messageSource= messageSource;

    }

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

    @RequestMapping(method = RequestMethod.GET, path = "/sayGoodMorning")
    public String sayGoodMorning(){
        Locale locale = LocaleContextHolder.getLocale();
        return this.messageSource.getMessage("good.morning.message" , null, "Default Message", locale);
    }
}
