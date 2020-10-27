package com.jxd.emp.service.impl;

import com.jxd.emp.mapper.IEmpMapper;
import com.jxd.emp.model.Emp;
import com.jxd.emp.service.IEmpservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName EmpServiceImpl
 * @Description TODO
 * @Author caibaobiao
 * @Date 2020/10/23
 * @Version 1.0
 */
@Service
public class EmpServiceImpl implements IEmpservice {

    @Autowired
    private IEmpMapper empMapper;

    @Override
    public List<Emp> getAll() {
        return empMapper.getAll();
    }
}
