package com.example.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

@Slf4j
@Order(1000)
@Component
public class ContextStartup implements ApplicationRunner, ServletContextAware {

    private ServletContext servletContext;

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        servletContext.setAttribute("base", servletContext.getContextPath());
    }
}
