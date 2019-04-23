package kr.co.ecommerce.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

import kr.co.ecommerce.dao.Authority;
import kr.co.ecommerce.dao.Member;

@Mapper
@Repository
public interface AuthorityMapper {

	Authority findByLoginInfo(String account, String password);

	@Options(useGeneratedKeys = true, keyProperty = "memberId")
	void insertMemberInfo(Member member);

	void insertAuthority(Authority authority);
}
