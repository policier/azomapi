package om.az.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String getProduct() {
        System.out.println("publish fist app in az");

        return "Hello";
    }
}
