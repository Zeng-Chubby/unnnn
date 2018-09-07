package net.unnnn.application.service.implement;

import net.unnnn.dao.mapper.UserInfoMapper;
import net.unnnn.domain.UserInfo;
import net.unnnn.infrastructure.pojo.RequestInstruction;
import net.unnnn.infrastructure.pojo.ResponseInstruction;
import net.unnnn.instructions.LoginParamter;
import net.unnnn.instructions.UserInfoObject;
import net.unnnn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lx
 */
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService
{
	@Autowired
	public UserInfoMapper userInfoMapper;

	public ResponseInstruction<UserInfoObject> login(RequestInstruction<LoginParamter> request)
	{
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(1L);
		userInfo.setAccount("Zeng-Chubby");
		userInfo.setPassword("123456");
		userInfo.setUsername("曾智");
		userInfoMapper.insert(userInfo);
		return new ResponseInstruction<UserInfoObject>();
	}
}
