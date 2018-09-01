package net.unnnn.instructions;

import net.unnnn.infrastructure.pojo.DataObject;

/**
 * 表示`登录`数据传输对象。
 * @author Zeng-Chubby
 */
public class LoginParamter extends DataObject
{
	private String account;
	private String password;


	public void setAccount(String account)
	{
		this.account = account;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getAccount()
	{
		return account;
	}
}
