package com.spring.test.service;

import java.util.List;

import com.spring.test.domain.BoardVO;

public interface BoardService {
	List<BoardVO> getBoardList();
}
