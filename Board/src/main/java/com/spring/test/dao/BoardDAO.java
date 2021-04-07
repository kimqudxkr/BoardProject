package com.spring.test.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.test.domain.BoardVO;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSessionTemplate mybatis;

	public List<BoardVO> getBoardList() {
		System.out.println("===> Mybatis로 getBoardList() 기능 처리");
		return mybatis.selectList("test.mappers.BoardMapper.getBoardList");
	}
}
