package net.unnnn.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lx
 */
@Controller
@RequestMapping(value = "/user")
public class UserController
{
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String getUser()
	{
		return "index";
	}

	@RequestMapping(value = "/info1", method = RequestMethod.GET)
	public Object getUser1()
	{
		return "index";
	}
}
