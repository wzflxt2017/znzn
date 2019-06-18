package com.wangzefeng.controller;

import com.wangzefeng.pojo.AllFile;
import com.wangzefeng.pojo.SysUser;
import com.wangzefeng.service.FileService;
import com.wangzefeng.service.UserService;
import com.wangzefeng.tools.Constants;
import com.wangzefeng.tools.FileUtil;
import com.wangzefeng.tools.PropertyUtil;
import com.wangzefeng.tools.ValidateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by wangzefeng on 2019/6/13 0013.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @Autowired
    private FileService fileService;

    @ResponseBody
    @RequestMapping("/modifyInfo")
    public String modifyInfo(SysUser sysUser){
        int update = userService.update(sysUser,session);
        return ""+update;
    }

    @ResponseBody
    @RequestMapping("/modifyPhoto")
    public AllFile modifyPhoto(@RequestParam(required = false) CommonsMultipartFile userPhotoFile){
        if (!userPhotoFile.isEmpty()) {
            String type = userPhotoFile.getOriginalFilename().substring(
                    userPhotoFile.getOriginalFilename().indexOf("."));// 取文件格式后缀名
            String filename = System.currentTimeMillis() + type;// 取当前时间戳作为文件名
            String path = session.getServletContext().getRealPath("/")+PropertyUtil.getProperty("webUploadPath")+File.separatorChar+ filename;// 存放位置
            File destFile = new File(path);
            try {
                // FileUtils.copyInputStreamToFile()这个方法里对IO进行了自动操作，不需要额外的再去关闭IO流
                FileUtil.copyInputStreamToFile(userPhotoFile.getInputStream(), destFile);// 复制临时文件到指定目录下
            } catch (IOException e) {
                e.printStackTrace();
            }
            String uUid = ValidateUtil.getUUid();
            AllFile allFile=new AllFile();
            allFile.setFileId(uUid);
            allFile.setFileName(filename);
            allFile.setFilePath(File.separator+PropertyUtil.getProperty("webUploadPath")+File.separatorChar+ filename);
            allFile.setFileType(type);
            allFile.setUploadDate(new Date());
            allFile.setUploadUserId(getSysUser().getSysUserId());
            String insert = fileService.insert(allFile);
            if(insert!=null){
                SysUser sysUser = userService.selectById(getSysUser().getSysUserId());
                sysUser.setUserPhoto(uUid);
                userService.updatePhoto(sysUser,session);
            }
            return  allFile;
        }
        return null;
    }

}
