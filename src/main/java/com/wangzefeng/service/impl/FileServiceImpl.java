package com.wangzefeng.service.impl;

import com.wangzefeng.dao.AllFileMapper;
import com.wangzefeng.pojo.AllFile;
import com.wangzefeng.service.FileService;
import com.wangzefeng.tools.ValidateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangzefeng on 2019/6/14 0014.
 */
@Service("fileService")
public class FileServiceImpl implements FileService {

    @Autowired
    private AllFileMapper allFileMapper;

    @Override
    public String insert(AllFile allFile) {
        if(!ValidateUtil.validateString(allFile.getFileId())){
            allFile.setFileId(ValidateUtil.getUUid());
        }
        int insert = allFileMapper.insert(allFile);
        if(insert==1){
            return allFile.getFileId();
        }
        return null;
    }

    @Override
    public AllFile selectById(String fileId) {
        return allFileMapper.selectByPrimaryKey(fileId);
    }
}
