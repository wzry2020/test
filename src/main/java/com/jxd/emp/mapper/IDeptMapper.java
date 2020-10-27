package com.jxd.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.emp.model.Dept;

import java.util.List;

public interface IDeptMapper extends BaseMapper<Dept> {
    //多表操作还得自己写
    List<Dept> selectDeptWith();
}
