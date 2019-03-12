package com.example.demo.controller.sample;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.DemoVO;
import com.example.demo.service.sample.SampleService;
import com.example.demo.util.ResponseVO;

@RestController
@RequestMapping("/api")
public class DemoController {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoController.class); 
	
	@Autowired
	private SampleService demo;

	@GetMapping(value = "/demo")
	public ResponseVO<List<DemoVO>> ajaxTest() throws Exception{
		
		ResponseVO<List<DemoVO>> responsVO = new ResponseVO<>();
		List<DemoVO> list = demo.getUserList();
		responsVO.setResponse(list);
		
		if(list.size() == 0) responsVO.setCheck(false);
		
		logger.info("responsVO: {} ", responsVO.toString());
		
		return responsVO;
	}
}
