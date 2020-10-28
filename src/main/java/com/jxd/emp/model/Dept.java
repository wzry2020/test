package com.jxd.emp.model;

import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @ClassName Dept
 * @Description TODO
 * @Author caibaobiao
 * @Date 2020/10/23
 * @Version 1.0
 */
public class Dept {

    @TableId
    private int deptno;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    private String dname;


}
