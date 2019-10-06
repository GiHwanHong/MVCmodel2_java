package gihwan.spring.web.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import gihwan.spring.web.board.impl.BoardDAO;

@Controller
public class InsertBoardController {
	
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 등록 처리");
		
		// 1. 사용자 입력 정보 추출 : 커맨드 객체가 자동으로 처리해 줌.
		// request.setCharacterEncoding("UTF-8");
		
		// 2. 데이터베이스 연동 처리
		boardDAO.insertBoard(vo);
		
		// 3. 화면 네비게이션
		return "getBoardList.do";

	}
}
