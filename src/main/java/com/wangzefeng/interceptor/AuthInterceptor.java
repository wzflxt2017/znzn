package com.wangzefeng.interceptor;

import com.wangzefeng.pojo.SysUser;
import com.wangzefeng.tools.Constants;
import com.wangzefeng.tools.ValidateUtil;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wangzefeng on 2019/6/4 0004.
 */
public class AuthInterceptor implements HandlerInterceptor {

    private final Logger logger=Logger.getLogger(AuthInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        Object o1 = httpServletRequest.getSession().getAttribute(Constants.SESSION_USER);
        if(o1!=null){
            SysUser sysUser = (SysUser) o1;
            if(ValidateUtil.validateString(sysUser.getSysUserId())){
                httpServletRequest.getSession().setMaxInactiveInterval(100*60*30);
                httpServletRequest.setAttribute("sysUser",sysUser);
                logger.info("请求的用户是：\n\t"+sysUser);
                return true;
            }else{
                httpServletResponse.sendRedirect("/home/toLogin");
                return false;
            }
        }else{
            httpServletResponse.sendRedirect("/home/toLogin");
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
