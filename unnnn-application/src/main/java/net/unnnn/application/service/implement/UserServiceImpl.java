package net.unnnn.application.service.implement;

import net.unnnn.infrastructure.pojo.RequestInstruction;
import net.unnnn.infrastructure.pojo.ResponseInstruction;
import net.unnnn.instructions.LoginParamter;
import net.unnnn.instructions.UserInfoObject;
import net.unnnn.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
	public ResponseInstruction<UserInfoObject> login(RequestInstruction<LoginParamter> request)
	{
		return new ResponseInstruction<UserInfoObject>();
	}
}
