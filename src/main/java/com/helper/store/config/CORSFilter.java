package com.helper.store.config;

import org.apache.shiro.web.servlet.OncePerRequestFilter;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Component
public class CORSFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws ServletException, IOException {

        HttpServletResponse res = (HttpServletResponse) servletResponse;
        String []  allowDomain= {"http://192.168.0.142:8081","http://192.168.0.188:8081","http://139.224.113.2:8081","http://192.168.0.166:8081","http://localhost:8081"};
        Set<String> allowedOrigins= new HashSet<String>(Arrays.asList(allowDomain));
        String originHeader=((HttpServletRequest) servletRequest).getHeader("Origin");
        if (allowedOrigins.contains(originHeader)) {
            res.setContentType("text/html;charset=UTF-8");

            res.setHeader("Access-Control-Allow-Origin", originHeader);

            res.setHeader("Access-Control-Allow-Methods", "*");

            res.setHeader("Access-Control-Max-Age", "0");

            res.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");

            res.setHeader("Access-Control-Allow-Credentials", "true");

            res.setHeader("XDomainRequestAllowed", "1");
        }
        filterChain.doFilter(servletRequest, servletResponse);
        }
}

