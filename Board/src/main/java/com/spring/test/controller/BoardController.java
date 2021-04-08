package com.spring.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
		return "index";
	}
		
	@RequestMapping("/list")
	public String getMain(BoardVO vo, Model model) {
		 List<BoardVO> boardList = boardService.getBoardList();
		 
		// Model에 데이터 전달.
		model.addAttribute("boardList",boardList);
		System.out.println("After DB data : "+boardList);
		
		return "list"; 
	}
	
	@RequestMapping("/write")
	public String write() {
		return "write";
	}
	
	@RequestMapping("/content")
	public String getContent(HttpServletRequest request, BoardVO vo, Model model) {
		 String s_idx = request.getParameter("idx");
		 int idx = Integer.parseInt(s_idx);
		 System.out.println("in Controller idx : "+idx);
		 
		 BoardVO boardList = boardService.getContent(idx);
		 System.out.println("After DB data : "+boardList);
		 
		// Model에 데이터 전달.
		model.addAttribute("boardList",boardList);
		return "content"; 
	}
}
