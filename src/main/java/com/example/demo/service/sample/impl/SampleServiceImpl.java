package com.example.demo.service.sample.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.DemoVO;
import com.example.demo.repository.sample.DemoRepository;
import com.example.demo.service.sample.SampleService;

@Service
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class SampleServiceImpl implements SampleService {
	
	@Autowired
	private DemoRepository demo;

	@Override
	public List<DemoVO> getUserList() throws Exception {
		return demo.getUserList();
	}
	
	
}
