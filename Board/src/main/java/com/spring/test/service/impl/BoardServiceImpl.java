package com.spring.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.test.dao.BoardDAO;
import com.spring.test.domain.BoardVO;
import com.spring.test.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public List<BoardVO> getBoardList() {
		return boardDAO.getBoardList();
	}
	
	@Override
	public BoardVO getContent(int idx) {
		System.out.println("in Service Implement idx : "+idx);
		return boardDAO.getContent(idx);
	}
}
