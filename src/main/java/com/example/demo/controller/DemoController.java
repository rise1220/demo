package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.DemoVo;
import com.example.demo.repository.DemoRepository;

@Controller
public class DemoController {
	
	@Autowired
	private DemoRepository demo;

	@ResponseBody
	@RequestMapping(value = "/ajax/demo")
	public List<DemoVo> ajaxTest() {
		
		List<DemoVo> list = demo.getUserList();
		System.out.println("list.toString(): " + list.toString());
		
		return list;
	}
}
