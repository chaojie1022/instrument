package com.kongwu.insweb.controller.login;

import com.kongwu.insweb.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController extends BaseController{


    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(111);
        return "login";
    }
}
