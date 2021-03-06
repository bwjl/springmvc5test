package com.bear.springmvc5test.controller.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/5/20 9:21 上午
 * @Description: controller 单例模式 @Scope("prototype") 原型模式
 */

@Controller
@Scope("prototype")
@RequestMapping("demo")
public class SingletonDemoController {

    private int num = 0;

//    @Autowired
//    private SingletonDemoController singletonDemoController;

    @GetMapping("singletonController/index")
    public void index() {
        num++;
        //System.out.println(singletonDemoController);
        //第二次访问该方法 num 为2
        System.out.println(num);
        System.out.println(this);
    }
}
