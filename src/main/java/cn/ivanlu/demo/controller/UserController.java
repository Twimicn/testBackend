package cn.ivanlu.demo.controller;

import cn.ivanlu.demo.model.User;
import cn.ivanlu.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/users")
    @ResponseBody
    public List<User> users(HttpServletResponse response) {
        List<User> users = userService.getAll();
        response.setHeader("Access-Control-Allow-Origin", "*");
        return users;
    }
}
