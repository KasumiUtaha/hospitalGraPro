package com.zbc.hospital.admin.service;

import com.zbc.hospital.pojo.Hospital;

import java.util.List;

public interface AdminHospitalService {

    List<Hospital> findHospitalList();

    void updateHospital(Hospital hospital);

    void addHospital(Hospital hospital);

    void removeHospital(Long hid);
}
