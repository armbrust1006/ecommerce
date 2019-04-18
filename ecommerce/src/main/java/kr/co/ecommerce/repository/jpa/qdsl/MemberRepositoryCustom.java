package kr.co.ecommerce.repository.jpa.qdsl;

import java.util.List;

import kr.co.ecommerce.dao.table.Member;

public interface MemberRepositoryCustom {
	Member selectLoginInfo(String userId, String passWord);

	List<Member> findByName(String name);
}
