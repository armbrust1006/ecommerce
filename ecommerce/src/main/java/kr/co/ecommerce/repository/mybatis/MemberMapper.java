package kr.co.ecommerce.repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

import kr.co.ecommerce.dao.table.Authority;
import kr.co.ecommerce.dao.table.Member;

@Mapper
@Repository
public interface MemberMapper {

	Member findByLoginInfo(String account, String password);

	@Options(useGeneratedKeys = true, keyProperty = "id")
	void insertMemberInfo(Member member);

	void insertAuthority(Authority authority);
}
