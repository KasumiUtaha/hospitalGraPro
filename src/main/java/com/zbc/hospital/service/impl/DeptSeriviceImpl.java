package com.zbc.hospital.service.impl;

import com.zbc.hospital.dao.DeptMapper;
import com.zbc.hospital.pojo.Dept;
import com.zbc.hospital.pojo.DeptExample;
import com.zbc.hospital.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptSeriviceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> getList() {
        List<Dept> depts = deptMapper.selectByExample(new DeptExample());
        return depts;
    }

    @Override
    public List<Dept> getListByGrade(Integer grade) {
        DeptExample deptExample = new DeptExample();
        deptExample.createCriteria().andDegradeEqualTo(grade);
        List<Dept> depts = deptMapper.selectByExample(deptExample);
        return depts;
    }
}
