package com.zbc.hospital.admin.service.impl;

import com.zbc.hospital.admin.service.AdminHospitalService;
import com.zbc.hospital.dao.HospitalMapper;
import com.zbc.hospital.pojo.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service
public class AdminHospitalServiceImpl implements AdminHospitalService {

    @Autowired
    private HospitalMapper hospitalMapper;

    @Override
    public List<Hospital> findHospitalList() {
        return hospitalMapper.findHospitalList();
    }

    @Override
    public void updateHospital(Hospital hospital) {
        hospitalMapper.updateByPrimaryKey(hospital);
    }

    @Override
    public void addHospital(Hospital hospital) {
        hospitalMapper.insert(hospital);
    }

    @Override
    public void removeHospital(Long hid) {
        hospitalMapper.deleteByPrimaryKey(hid);
    }
}
