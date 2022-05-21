package com.zbc.hospital.service;

import com.zbc.hospital.pojo.Appointment;

import java.util.List;

public interface AppointmentService {

    Integer selectTimesFromHospital(Long hid);

    Boolean save(Appointment appointment);

    List<Appointment> listAll();

    void deleteAppointment(Long id);

    void updateStatus(Appointment appointment);

}
