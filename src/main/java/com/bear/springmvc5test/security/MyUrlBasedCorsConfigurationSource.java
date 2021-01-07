package com.bear.springmvc5test.security;

import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/1/7 上午9:14
 * Description:
 */

public class MyUrlBasedCorsConfigurationSource extends UrlBasedCorsConfigurationSource {

    public MyUrlBasedCorsConfigurationSource() {
        System.out.println("UrlBasedCorsConfigurationSource");
    }
}
