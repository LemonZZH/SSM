package com.project.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.pojo.User;
import com.project.service.IUserService;

@Controller
public class TestController {

	@Resource
	private IUserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String test(Model model) {
		List<User> users = userService.selectAll();
		for (User user : users) {
			System.out.println(user);
		}
		model.addAttribute("users", users);
		return "home";
	}
}
