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
	
	//글 목록 보기 요청 시
	@RequestMapping("/")
	public String getBoardList(BoardVO vo, Model model) {
		return "index"; // View �̸� ����
	}
		
	@RequestMapping("/list")
	public String getMain(BoardVO vo, Model model) {
		 List<BoardVO> boardList = boardService.getBoardList();
		 
		// Model에 데이터 전달.
		model.addAttribute("boardList",boardList);
		return "list"; // View �̸� ����
	}
	
	@RequestMapping("/write")
	public String write() {
		return "write";
	}
}
