package com.zbc.hospital.service;

import com.zbc.hospital.pojo.Dept;

import java.util.List;

public interface DeptService {

    List<Dept> getList();

    List<Dept> getListByGrade(Integer grade);



}
