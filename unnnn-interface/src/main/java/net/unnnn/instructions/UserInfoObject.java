package net.unnnn.instructions;

import net.unnnn.infrastructure.pojo.DataObject;

/**
 * 表示`用户信息`数据传输对象。
 * @author Zeng-Chubby
 */
public class UserInfoObject extends DataObject
{
	private Integer userId;
	private String username;

	public Integer getUserId()
	{
		return userId;
	}

	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}
}
