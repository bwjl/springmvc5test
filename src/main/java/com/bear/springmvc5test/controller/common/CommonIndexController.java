package com.bear.springmvc5test.controller.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/1/13 上午11:04
 * Description:
 */

@RestController
@RequestMapping("common")
public class CommonIndexController {

    @GetMapping("index")
    public String index() {
        return "common/index";
    }
}
