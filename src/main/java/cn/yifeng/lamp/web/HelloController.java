package cn.yifeng.lamp.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Intelligent_lamp_post
 * @description: hello controller
 * @author: Yifeng
 * @create: 2020-05-03 21:05
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        return  "hello world";
    }
}
