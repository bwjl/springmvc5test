package com.bear.springmvc5test.controller.api;

import com.bear.springmvc5test.security.MyUrlBasedCorsConfigurationSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.lwawt.macosx.CSystemTray;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/1/7 上午1:33
 * Description:
 */

@RestController
@RequestMapping("api")
public class IndexController {

    @Autowired
    private MyUrlBasedCorsConfigurationSource myUrlBasedCorsConfigurationSource;

    @GetMapping("index")
    public void index() {
        System.out.println("Jwt + Spring Security5");
        System.out.println(myUrlBasedCorsConfigurationSource.getCorsConfigurations());
    }

}
