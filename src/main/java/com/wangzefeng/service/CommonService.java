package com.wangzefeng.service;

import com.wangzefeng.pojo.SysUser;

/**
 * Created by wangzefeng on 2019/6/6 0006.
 */
public interface CommonService {

    int registerUser(SysUser sysUser);

    int validatePassword(SysUser sysUser);

    SysUser getUserByUserName(String name);

}
