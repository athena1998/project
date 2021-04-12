package dao;

import org.apache.ibatis.session.SqlSession;

import vo.FAQVO;

public class ManageCSCenterDAO {
	
	// SqlSession
	SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	// faq 게시글 idx로 불러오기
	public FAQVO faq_selectone(int idx) {
		FAQVO vo= sqlSession.selectOne("managecscenter.faq_selectone",idx);
		return vo;
	}
	
	// faq 게시글 update
	public int faq_update(FAQVO vo) {
		int res = 0;
		res = sqlSession.update("managecscenter.faq_update",vo);
		return res;
	}
	
	// faq 게시글 insert
	public int faq_insert(FAQVO vo) {
		int res = 0;
		res = sqlSession.update("managecscenter.faq_insert",vo);
		return res;
	}
}
