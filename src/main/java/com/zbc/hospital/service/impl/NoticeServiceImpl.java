package com.zbc.hospital.service.impl;


import com.zbc.hospital.dao.NoticeDao;
import com.zbc.hospital.pojo.Notice;
import com.zbc.hospital.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;
	@Override
	public List<Notice> findNoticeByType() {
		// TODO Auto-generated method stub
		return noticeDao.findNoticeByType();
	}
	@Override
	public int findNoticeByTypeNum() {
		// TODO Auto-generated method stub
		return noticeDao.findNoticeByTypeNum();
	}
	@Override
	public Notice findNoticeById(int id) {
		// TODO Auto-generated method stub
		return noticeDao.findNoticeById(id);
	}

}
