package com.bear.springmvc5test.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/1/3 下午9:02
 * Description:
 */

public class JwtAuthenticationToken extends UsernamePasswordAuthenticationToken {
    private static final long serialVersionUID = 1L;
    private String token;

    public JwtAuthenticationToken(String token) {
        super(null, null);
        this.token = token;
    }

    public String getToken() {
        return token;
    }

}
