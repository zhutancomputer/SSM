package cn.zhutan.ssm.controller;

import cn.zhutan.ssm.model.User;
import cn.zhutan.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    // http://localhost/user?id=1
    @RequestMapping
    public String index(@RequestParam("id") long id, Model model) {
        User user = userService.selectUser(id);
        model.addAttribute("user", user);
        return "user";
    }

    // http://localhost/user/selectAll
    @RequestMapping("/selectAll")
    public String selectAll(Model model) {
        List<User> users = userService.selectAll();
        System.out.println(Arrays.toString(users.toArray()));
        model.addAttribute("users", users);
        return "user";
    }
}
