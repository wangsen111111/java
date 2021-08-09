package com.company;

/**
 * 这是针对用户进行操作的接口
 * @auther 三木
 * @version V1.0
 */
public interface User用户接口 {
    /**
     * 这是用户登录功能
     * @param username
     * 用户名
     * @param password
     * 密码
     * @return 返回登录是否成功
     */
    public abstract boolean isLogin(String username,String password);
    /**
     * 这是用户注册功能
     * @param user
     *   要注册的用户信息
     */
    public abstract void regist(用户基本描述类 user);
}
