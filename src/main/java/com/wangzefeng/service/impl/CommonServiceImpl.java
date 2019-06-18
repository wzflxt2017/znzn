package com.wangzefeng.service.impl;

import com.wangzefeng.dao.SysUserMapper;
import com.wangzefeng.pojo.SysUser;
import com.wangzefeng.service.CommonService;
import com.wangzefeng.tools.MD5Util;
import com.wangzefeng.tools.ValidateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangzefeng on 2019/6/6 0006.
 */
@Service("commonService")
public class CommonServiceImpl implements CommonService {

    @Autowired
    private SysUserMapper sysUserMapper;


    /**
     *
     * @param sysUser
     * @return 返回0代表密码正确，其他数字代表不同的失败原因
     */
    public int validatePassword(SysUser sysUser){
        SysUser userByDB = sysUserMapper.selectByUserName(sysUser.getUserName());
        if(userByDB==null){
            return 1;//该用户还没有注册
        }else{
            if(!userByDB.getPassword().equals(sysUser.getPassword())){
                return 2;//账号和密码不匹配
            }
        }
        return 0;
    }

    public SysUser getUserByUserName(String name){
        return sysUserMapper.selectByUserName(name);
    }

    /**
     *
     * @param sysUser
     * @return 返回0代表注册成功，其他数字代表不同的失败原因
     */
    @Override
    public int registerUser(SysUser sysUser) {
        SysUser userByDB = sysUserMapper.selectByUserName(sysUser.getUserName());
        if(userByDB!=null){
            return 1;
        }else{
            sysUser.setSysUserId(ValidateUtil.getUUid());
            sysUser.setPassword(MD5Util.getMD5Str(sysUser.getPassword()));
            int insert = sysUserMapper.insert(sysUser);
            if(insert!=1){
                return 2;
            }
        }
        return 0;
    }
}
