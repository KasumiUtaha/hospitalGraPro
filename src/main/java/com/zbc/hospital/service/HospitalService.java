package com.zbc.hospital.service;

import com.zbc.hospital.dto.HospitalPage;
import com.zbc.hospital.pojo.Hospital;
import com.zbc.hospital.pojo.Page;

import java.util.List;

public interface HospitalService {

    Page getPageData(Integer times,Integer insurance,String name ,Integer grade,Integer pageNum,Integer pageSize);

    Integer totalCount();

    Integer selectToPageTotalCount(HospitalPage hospitalPage);

    Hospital getHospitalById(Long hid);

    List<Hospital> getList();

    List<Hospital> getListByTop3();
}
