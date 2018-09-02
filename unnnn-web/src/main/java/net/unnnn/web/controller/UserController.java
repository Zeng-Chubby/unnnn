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
	private UserService userService;

	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseInstruction login(@RequestBody RequestInstruction<LoginParamter> request)
	{
		return userService.login(request);
	}

	@ResponseBody
	@RequestMapping(value = "/login1", method = RequestMethod.POST)
	public ResponseInstruction login1(@RequestBody RequestInstruction<LoginParamter> request)
	{
		return userService.login(request);
	}

	@ResponseBody
	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public ResponseInstruction login2(@RequestBody RequestInstruction<LoginParamter> request)
	{
		return userService.login(request);
	}

	@ResponseBody
	@RequestMapping(value = "/login3", method = RequestMethod.POST)
	public ResponseInstruction login3(@RequestBody RequestInstruction<LoginParamter> request)
	{
		return userService.login(request);
	}

	@ResponseBody
	@RequestMapping(value = "/login5", method = RequestMethod.POST)
	public ResponseInstruction login5(@RequestBody RequestInstruction<LoginParamter> request)
	{
		return userService.login(request);
	}

	@ResponseBody
	@RequestMapping(value = "/login511111111serverTimeserverTimeserverTimeserverTimeserverTime", method = RequestMethod.POST)
	public ResponseInstruction login11115(@RequestBody RequestInstruction<LoginParamter> request)
	{
		return userService.login(request);
	}
}
