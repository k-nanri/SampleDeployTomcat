package com.example.demo.hello.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

    @GetMapping(path="/hello")
    public @ResponseBody String hello() {
        return "Hello World";
    }


}
