package com.wei.ecommercesystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Ecommerce-System
 * @description:
 * @author: Yuheng Wei
 */

@RestController
public class HelloController {
    @RequestMapping
    public String hello(){
        return "NIUBI";
    }

}
