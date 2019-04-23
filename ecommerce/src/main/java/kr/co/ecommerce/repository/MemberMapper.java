package kr.co.ecommerce.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.ecommerce.dao.Member;

@Mapper
@Repository
public interface MemberMapper {

	Member getMemberLogin(String account, String password);

	List<Member> selectAllByBrithday(int birthdayYear, int birthdayMonth, int birthdayDate);

	Member selectById(Long memberId);

	void insert(Member member);

	void update(Member member);

	void delete(Long memberId);

}
