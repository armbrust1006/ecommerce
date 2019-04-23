package kr.co.ecommerce.repository.jpa.interfaces;

import java.util.List;

import kr.co.ecommerce.dao.Member;

public interface MemberRepositoryCustom {
	Member selectLoginInfo(String userId, String passWord);

	List<Member> findByName(String name);
}
