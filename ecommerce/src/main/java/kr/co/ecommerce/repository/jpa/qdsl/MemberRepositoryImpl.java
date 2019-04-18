package kr.co.ecommerce.repository.jpa.qdsl;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import kr.co.ecommerce.dao.table.Member;

@Repository
public class MemberRepositoryImpl extends QuerydslRepositorySupport implements MemberRepositoryCustom {

	public MemberRepositoryImpl() {
		super(Member.class);
	}

	@Override
	public Member selectLoginInfo(String userId, String passWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
