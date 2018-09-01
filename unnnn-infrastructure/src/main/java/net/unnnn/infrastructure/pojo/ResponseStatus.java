package net.unnnn.infrastructure.pojo;

import java.rmi.ServerError;

/**
 * 表示数据传输响应状态。
 */
public enum ResponseStatus
{
    //#region 枚举

    /**
     * 成功
     */
    SUCCESS(1, "成功"),

    /**
     * 失败
     */
    FAILURE(0, "失败"),

    /**
     * 签名无效
     */
    INVALIDSIGN(-5, "签名无效"),

    /**
     * 参数无效
     */
    VALIDATIONERROR(-10, "参数无效"),

    /**
     * 服务端发生异常
     */
    SERVERERROR(-15, "服务端发生异常"),

    /**
     * 会话凭证丢失
     */
    SESSIONLOST(-20, "会话凭证丢失"),

    /**
     * 操作未授权
     */
    UNAUTHORIZED(-25, "操作未授权");

    //#endregion

    //#region 成员

    private int value;
    private String description;

    //#endregion

    //#region 构造函数

    /**
     * 构造函数
     * @param value 值
     * @param description 描述
     */
    private ResponseStatus(int value, String description)
    {
        this.value = value;
        this.description = description;
    }

    //#endregion

    //#region 公共方法

    /**
     * 获取枚举值
     *
     * @return 枚举值
     */
    public int getValue()
    {
        return this.value;
    }

    /**
     * 获取枚举描述
     *
     * @return 枚举描述
     */
    public String getDescription()
    {
        return this.description;
    }

    //#endregion
}
