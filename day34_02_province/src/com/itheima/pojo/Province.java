package com.itheima.pojo;

import java.io.Serializable;

/**
 * 包名:com.itheima.pojo
 *
 * @author Leevi
 * 日期2020-10-26  15:59
 */
public class Province implements Serializable {
    private Integer pid;
    private String pname;

    @Override
    public String toString() {
        return "Province{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                '}';
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
