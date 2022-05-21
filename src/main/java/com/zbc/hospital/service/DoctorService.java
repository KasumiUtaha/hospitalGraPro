package com.zbc.hospital.service;

import com.zbc.hospital.dto.DoctorPage;
import com.zbc.hospital.pojo.Doctor;
import com.zbc.hospital.pojo.Page;

import java.util.List;

public interface DoctorService {

    List<Doctor> getListByGrade(Integer grade);

    List<Doctor> getListByDept(Long dept);

    List<Doctor> getList();

    Page<Doctor> selectToPage(DoctorPage doctorPage);

    Doctor  selectById(Long id);

    List<Doctor> getListByTop4();
}
