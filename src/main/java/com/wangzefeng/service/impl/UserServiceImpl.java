package com.wangzefeng.service.impl;

import com.wangzefeng.dao.SysUserMapper;
import com.wangzefeng.pojo.SysUser;
import com.wangzefeng.service.UserService;
import com.wangzefeng.tools.Constants;
import com.wangzefeng.tools.ValidateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by wangzefeng on 2019/6/13 0013.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int save(SysUser sysUser) {
        if(!ValidateUtil.validateString(sysUser.getSysUserId())){
            sysUser.setSysUserId(ValidateUtil.getUUid());
        }
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public int update(SysUser sysUser, HttpSession session) {
        SysUser sysUser1 = sysUserMapper.selectByPrimaryKey(sysUser.getSysUserId());
        sysUser1.setFullName(sysUser.getFullName());
        sysUser1.setUserBirthday(sysUser.getUserBirthday());
        sysUser1.setUserEmail(sysUser.getUserEmail());
        sysUser1.setUserSign(sysUser.getUserSign());
        sysUser1.setUserPhone(sysUser.getUserPhone());
        int i = sysUserMapper.updateByPrimaryKey(sysUser1);
        if(i==1)
        session.setAttribute(Constants.SESSION_USER,sysUserMapper.selectByPrimaryKey(sysUser.getSysUserId()));
        return i;
    }

    @Override
    public int updatePhoto(SysUser sysUser, HttpSession session) {
        SysUser sysUser1 = sysUserMapper.selectByPrimaryKey(sysUser.getSysUserId());
        sysUser1.setUserPhoto(sysUser.getUserPhoto());
        int i = sysUserMapper.updateByPrimaryKey(sysUser1);
        if(i==1)
        session.setAttribute(Constants.SESSION_USER,sysUserMapper.selectByPrimaryKey(sysUser.getSysUserId()));
        return i;
    }

    @Override
    public SysUser selectById(String sysUserId) {
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(sysUserId);
        return sysUser;
    }

    @Override
    public SysUser selectByUserName(String userName) {
        SysUser sysUser = sysUserMapper.selectByUserName(userName);
        return sysUser;
    }
}
