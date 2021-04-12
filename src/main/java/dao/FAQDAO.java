package dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.FAQVO;

public class FAQDAO {

	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<FAQVO> viewTop10() {
		List<FAQVO> list = sqlSession.selectList("faq.viewTop10");
		return list;
	}

	public List<FAQVO> viewNotice(HashMap<String, Integer> map) {
		List<FAQVO> list = sqlSession.selectList("faq.viewNotice", map);
		return list;
	}

	public List<FAQVO> viewMember() {
		List<FAQVO> list = sqlSession.selectList("faq.viewMember");
		return list;
	}

	public List<FAQVO> viewDelivery() {
		List<FAQVO> list = sqlSession.selectList("faq.viewDelivery");
		return list;
	}

	public List<FAQVO> viewOrder() {
		List<FAQVO> list = sqlSession.selectList("faq.viewOrder");
		return list;
	}

	public List<FAQVO> viewRefund() {
		List<FAQVO> list = sqlSession.selectList("faq.viewRefund");
		return list;
	}

	public int updateReadhit(int idx) {
		int res = sqlSession.update("faq.updateReadhit", idx);
		return res;
	}

	public int getNoticeTotal() {
		int res = sqlSession.selectOne("faq.getNoticeTotal");
		return res;
	}

	public int getSearchResult(String text) {
		int res = sqlSession.selectOne("faq.getSearchResult", text);
		return res;
	}

	public List<FAQVO> getSearch(HashMap<String, Object> map) {
		List<FAQVO> list = sqlSession.selectList("faq.getSearch", map);
		return list;
	}

}
