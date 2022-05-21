package com.zbc.hospital.admin.service;

import com.zbc.hospital.pojo.Notice;

import java.util.List;

public interface AdminNoticeService {

    List<Notice> selectNoticeList();

    Notice findNoticeById(Integer id);

    void modifyNotice(Notice notice);

    void addNotice(Notice notice);

    public void removeNoticeById(Integer id);


}
