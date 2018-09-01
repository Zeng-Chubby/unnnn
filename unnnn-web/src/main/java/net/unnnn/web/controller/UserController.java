package net.unnnn.web.controller;

import net.unnnn.infrastructure.pojo.RequestInstruction;
import net.unnnn.infrastructure.pojo.ResponseInstruction;
import net.unnnn.instructions.LoginParamter;
import net.unnnn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lx
 */
@RestController
@RequestMapping(value = "/user")
public class UserController
{
	@Autowired
	private UserService service;

	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseInstruction login(@RequestBody RequestInstruction<LoginParamter> request)
	{
		return service.login(request);
	}
}
