
package net.cowfish.controller;


import net.cowfish.entity.User;
import net.cowfish.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@ResponseBody
	@RequestMapping("/findByName")
	public User findByName(String name) {
		return userMapper.findByName(name);
	}

	@ResponseBody
	@RequestMapping("/insert")
	public String insert(String name, Integer age) {
		userMapper.insert(name, age);
		return "success";
	}

}
