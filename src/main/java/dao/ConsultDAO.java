package dao;

import org.apache.ibatis.session.SqlSession;

import vo.EstimateVO;

public class ConsultDAO {
	
	// sqlsession
	SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	// 견적 서류 등록
	public int insert_consult(EstimateVO vo) {
		int res = sqlSession.insert("consult.insert_consult",vo);
		return res;
	}
	
	// 견적 서류 내용 불러오기
	public EstimateVO selectone_consult(EstimateVO vo) {
		EstimateVO res_vo = sqlSession.selectOne("consult.selectone_consult",vo);
		return res_vo;
	}
}
