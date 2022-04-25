package io.paketo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
public class DemoController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "Hello TBS - 2";

    }
}