package net.unnnn.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lx
 */
@Controller
@RestController("/user")
public class UserController
{
	@RequestMapping("/info")
	public String getUser()
	{
		return "index";
	}
}
