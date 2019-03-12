package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.DemoVo;


@Mapper
@Repository
public interface DemoRepository {
	List<DemoVo> getUserList();
}
