package net.unnnn.service;

import net.unnnn.infrastructure.pojo.RequestInstruction;
import net.unnnn.infrastructure.pojo.ResponseInstruction;
import net.unnnn.instructions.LoginParamter;
import net.unnnn.instructions.UserInfoObject;

/**
 * 表示`用户`服务。
 * @author lx
 */
public interface UserService
{
	/**
	 * 用户登录。
	 * @param request 请求对象。
	 * @return 响应对象。
	 */
	ResponseInstruction<UserInfoObject> login(RequestInstruction<LoginParamter> request);
}
