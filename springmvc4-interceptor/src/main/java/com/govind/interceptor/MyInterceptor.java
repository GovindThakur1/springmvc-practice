package com.govind.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("this is pre handle method");
        String name = request.getParameter("user");

        // so here we can do validations and any other checks required
        if (name.startsWith("s")) {
            response.setContentType("text/html");
            response.getWriter().println("Invalid name. Name should not start with 's'");
            return false;
        }
        System.out.println("The name is: " + name);
        return true;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("This is post handle");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("This is after completion");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
