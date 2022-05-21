package com.zbc.hospital.service.impl;

import com.zbc.hospital.dao.AppointmentMapper;
import com.zbc.hospital.pojo.Appointment;
import com.zbc.hospital.pojo.AppointmentExample;
import com.zbc.hospital.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private AppointmentMapper appointmentMapper;
    @Override
    public Integer selectTimesFromHospital(Long hid) {
        Integer integer = appointmentMapper.selectTimesFromHospital(hid);
        return integer;
    }

    @Override
    public Boolean save(Appointment appointment) {
        try{
            appointmentMapper.insert(appointment);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Appointment> listAll() {
        List<Appointment> appointments = appointmentMapper.selectByExample(new AppointmentExample());
        return appointments;
    }

    @Override
    public void deleteAppointment(Long id) {
        appointmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateStatus(Appointment appointment) {
        appointmentMapper.updateStatus(appointment);
    }


}
