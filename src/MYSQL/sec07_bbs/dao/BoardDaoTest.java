package MYSQL.sec07_bbs.dao;

import java.util.List;

import MYSQL.sec07_bbs.entity.Board;

public class BoardDaoTest {
	
	public static void main(String[] args) {
		BoardDao bDao = new BoardDao();
		String sessionUid = "james";	//제임스가 로그인한 것으로 가정 
		
		Board b = bDao.getBoard(12);
		if ( !b.getUid().equals(sessionUid))		//	제임스가 작성한 글이 아니면 실행못하게 만들어
			bDao.increaseCount("view",  12);
		System.out.println(b);
		
//		b = new Board("제목2", "본문 2", "admin");
//		bDao.insertBoard(b);
//		b = new Board("제목3", "본문 3", "james");
//		bDao.insertBoard(b);
//		b = new Board("제목4", "본문 4", "maria");
//		bDao.insertBoard(b);
//		b = new Board("제목5", "본문 5", "sarah");
//		bDao.insertBoard(b);
//		b = new Board("제목6", "본문 6", "brian");
//		bDao.insertBoard(b);
		
		List<Board> list = bDao.getBoardList("title", "%", 10, 0);
		list.forEach(x -> System.out.println(x.listFrom()));
		System.out.println("================================================");
//		list = bDao.getBoardList("b.uid", "james", 10, 0);
//		list.forEach(x -> System.out.println(x.listForm()));
//		System.out.println("================================================");
//		list = bDao.getBoardList("uname", "마리아", 10, 0);
//		list.forEach(x -> System.out.println(x.listForm()));
		
		bDao.close();
		
	}

}
