package com.jxd.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.emp.mapper.IDeptMapper;
import com.jxd.emp.model.Dept;
import com.jxd.emp.service.IDeptService;
import org.springframework.stereotype.Service;

/**
 * @ClassName DeptServiceImpl
 * @Description TODO
 * @Author caibaobiao
 * @Date 2020/10/23
 * @Version 1.0
 */
@Service
public class DeptServiceImpl extends ServiceImpl<IDeptMapper, Dept> implements IDeptService {
}
