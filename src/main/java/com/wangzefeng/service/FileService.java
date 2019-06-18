package com.wangzefeng.service;

import com.wangzefeng.pojo.AllFile;

/**
 * Created by wangzefeng on 2019/6/14 0014.
 */
public interface FileService {

    String insert(AllFile allFile);
    AllFile selectById(String fileId);
}
