package com.example.project.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Slf4j
public class filterConfig implements Filter {

    @Autowired
    AppConfig appConfig;

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        Boolean clientIdValidation;
        System.out.println("doFilter() method is invoked");
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        try {
            clientIdValidation = (httpServletRequest.getHeader("clientId")).equals((String) appConfig.getClientId());

            if (clientIdValidation == (false)) {
                log.info("Exception Un authorized");
                httpServletResponse.setStatus(401);
                httpServletResponse.sendError(401, "Un authorized");
                // return;
            }
        } catch (Exception e) {
            log.info("Exception " + e.getLocalizedMessage());
            System.out.println("Exception " + e.getLocalizedMessage());
            httpServletResponse.setStatus(401);
            httpServletResponse.sendError(401, "Un authorized");

        }

        chain.doFilter(httpServletRequest, httpServletResponse);

    }

}