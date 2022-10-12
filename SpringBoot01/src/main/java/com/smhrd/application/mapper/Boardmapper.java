package com.smhrd.application.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@Mapper
public interface Boardmapper {

	@Autowired
	Boardmapper mapper;
	
	@RequestMapping("/boardList.do")
	public int boardCount() {
		System.out.println(mapper.boardCount());
		
		return "ex01";
	}
	
}
