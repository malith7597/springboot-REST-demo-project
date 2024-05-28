package org.mobitel.springrest.Controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.mobitel.springrest.Bean.someBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class dynamicFilteringController {
    @GetMapping("/dynamicFiltering")
    public someBean returnDynamicFilterBean(){
        someBean someBean =new someBean("value1","value2","value3");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2");
        FilterProvider filters = new SimpleFilterProvider().addFilter("someBeanFilter", filter);
        mappingJacksonValue.setFilters(filters);
        return new someBean("value1","value2","value3");
    }

    @GetMapping("/dynamicFiltering-list")
    public List<someBean> dynamicFilterList(){
        return Arrays.asList(new someBean("field2" ,"field3","field4"), new someBean("field6","field7","field8"));
    }



}
