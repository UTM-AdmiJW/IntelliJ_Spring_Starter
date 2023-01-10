package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
public class HelloController {

    @GetMapping("")
    @ResponseBody
    protected String hello() {
        return "Hello World!";
    }
}
