package com.zbc.hospital.dao;

import com.zbc.hospital.dto.DoctorPage;
import com.zbc.hospital.pojo.Doctor;
import com.zbc.hospital.pojo.DoctorExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DoctorMapper {
    int countByExample(DoctorExample example);

    int deleteByExample(DoctorExample example);

    int deleteByPrimaryKey(Long did);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    List<Doctor> selectByExample(DoctorExample example);

    Doctor selectByPrimaryKey(Long did);

    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);

    List<Doctor> selectToPage(DoctorPage doctorPage);

    Integer selectToPageTotalCount(DoctorPage doctorPage);

    Doctor selectById(Long id);

    List <Doctor> getListByTop4();

    List<Doctor> selectDoctorList();
}