package cn.sxt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sxt.entity.User;
import cn.sxt.service.UserService;

@Controller
public class UserControllerImpl {
	@Autowired
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/selectAll")
	private String selectAll(ModelMap map) {
		map.addAttribute("allUser", userService.selectAll());
		return "/list.jsp";
	}

}
