package com.spring.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.test.domain.BoardVO;
import com.spring.test.service.BoardService;

@Controller
@SessionAttributes("board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	//�� ��� �˻�
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, Model model) {
		System.out.println("getBoardingList()");
		 List<BoardVO> boardList = boardService.getBoardList();
		 
		// Model ���� ����
		model.addAttribute("boardList",boardList);
		return "boardList"; // View �̸� ����
	}
}
