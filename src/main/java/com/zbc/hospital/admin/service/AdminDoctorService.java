package com.zbc.hospital.admin.service;

import com.zbc.hospital.pojo.Doctor;

import java.util.List;

public interface AdminDoctorService {

    List<Doctor> getDoctorList();

    Doctor selectDoctorById(Long id);

    void addDoctor(Doctor doctor);

    void updateDoctor(Doctor doctor);

    void deleteDoctor(Long id);

}
