package com.zbc.hospital.admin.service.impl;

import com.zbc.hospital.admin.service.AdminDoctorService;
import com.zbc.hospital.dao.DoctorMapper;
import com.zbc.hospital.pojo.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service
public class AdminDoctorServiceImpl implements AdminDoctorService{

    @Autowired
    private DoctorMapper doctorMapper;


    @Override
    public List<Doctor> getDoctorList() {
        return doctorMapper.selectDoctorList();
    }

    @Override
    public Doctor selectDoctorById(Long id) {
        return doctorMapper.selectById(id);
    }

    @Override
    public void addDoctor(Doctor doctor) {
        doctorMapper.insert(doctor);
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        doctorMapper.updateByPrimaryKeySelective(doctor);
    }

    @Override
    public void deleteDoctor(Long id) {
        doctorMapper.deleteByPrimaryKey(id);
    }


}
