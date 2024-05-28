package org.mobitel.springrest.Controller;

import org.mobitel.springrest.Bean.someBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class filteringController {
    @GetMapping("/filtering")
    public someBean returnFilterBean(){
        return new someBean();
    }

    @GetMapping("/filtering-list")
    public List<someBean> filterList(){
        return Arrays.asList(new someBean("field2" ,"field3","field4"), new someBean("field6","field7","field8"));
    }
 }
