package com.bear.springmvc5test.controller.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/5/20 9:21 上午
 * @Description: controller 单例模式
 */

@Controller
@RequestMapping("singletonController")
public class SingletonDemoController {

    @Autowired
    private SingletonDemoController singletonDemoController;

    @GetMapping("index")
    public void index() {
        System.out.println(singletonDemoController);
    }
}
