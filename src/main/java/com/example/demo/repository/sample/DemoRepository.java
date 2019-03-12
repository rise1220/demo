package com.example.demo.repository.sample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.DemoVO;


@Mapper
@Repository
public interface DemoRepository {
	List<DemoVO> getUserList() throws Exception;
}
