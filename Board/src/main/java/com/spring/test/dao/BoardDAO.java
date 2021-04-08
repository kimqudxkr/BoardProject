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
		System.out.println("===> Mybatis�� getBoardList()");
		return mybatis.selectList("test.mappers.BoardMapper.getBoardList");
	}
	
	public BoardVO getContent(int idx) {
		System.out.println("in BoardDAO idx : "+idx);
		return mybatis.selectOne("test.mappers.BoardMapper.getContent", idx);
	}
}
