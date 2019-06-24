package com.wangzefeng.pojo.model;

/**
 * Created by wangzefeng on 2019/6/24 0024.
 */
public class Page {

    private int pageNo;

    private int pageSize;

    private Object obj;

    public Page(int page,int pageSize,Object obj){
        this.pageNo=page;
        this.pageSize=pageSize;
        this.obj=obj;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
