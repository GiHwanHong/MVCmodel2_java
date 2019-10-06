package gihwan.spring.web.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import gihwan.spring.web.board.impl.BoardDAO;

@Controller
public class UpdateBoardController {
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 수정 기능 처리");
		boardDAO.updateBoard(vo);
		return "getBoardList.do";
	}
}