package com.gua.controller;


import com.gua.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminController {
    //创建业务逻辑层的对象
    @Autowired
    private AdminService adminService;

      @RequestMapping("/login")
    public String login(String name, String pwd, Model model) {
        String s = adminService.login(name, pwd);
        if ("ok".equals(s)) {
            model.addAttribute("name", name);
            return "main";
        } else {
            model.addAttribute("errmsg", "用户名或密码不正确！");
            return "login";
        }
    }

}