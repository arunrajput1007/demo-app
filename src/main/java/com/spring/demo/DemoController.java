package com.spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("math")
@RestController
public class DemoController {

    @GetMapping("mul5by/{num}")
    public int multiply5By(@PathVariable int num){
        return 5*num;
    }

    @GetMapping("div8by/{num}")
    public int divide8By(int num){
        if(num!=0) return 8/num;
        else return 0;
    }
}
