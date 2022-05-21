package com.zbc.hospital.dao;

import com.zbc.hospital.dto.HospitalPage;
import com.zbc.hospital.pojo.Hospital;
import com.zbc.hospital.pojo.HospitalExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HospitalMapper {
    int countByExample(HospitalExample example);

    int deleteByExample(HospitalExample example);

    int deleteByPrimaryKey(Long hid);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    List<Hospital> selectByExample(HospitalExample example);

    Hospital selectByPrimaryKey(Long hid);

    int updateByExampleSelective(@Param("record") Hospital record, @Param("example") HospitalExample example);

    int updateByExample(@Param("record") Hospital record, @Param("example") HospitalExample example);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);

    List<Hospital> selectToPage(HospitalPage hospitalPage);

    Integer selectToPageTotalCount(HospitalPage hospitalPage);

   List<Hospital> getListByTop3();

   List<Hospital> findHospitalList();
}