package gihwan.spring.web.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import gihwan.spring.web.board.impl.BoardDAO;

@Controller
public class GetBoardListController {

	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 목록 검색 처리");
		mav.addObject("boardList", boardDAO.getBoardList(vo)); // Model 정보저당
		mav.setViewName("getBoardList.jsp"); // View 정보저장
		return mav;
	}
}