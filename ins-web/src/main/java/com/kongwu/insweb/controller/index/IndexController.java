package com.kongwu.insweb.controller.index;

import com.kongwu.insweb.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController extends BaseController{


    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(111);
        return "index";
    }
}
