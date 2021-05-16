package com.personal.demo.mybatisplus.web.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

@Slf4j
//@Component
public class TimeFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = new Date().getTime();
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("time filter cost: " + (new Date().getTime() - start));
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("time filter initialized...");
    }

    @Override
    public void destroy() {

    }
}
