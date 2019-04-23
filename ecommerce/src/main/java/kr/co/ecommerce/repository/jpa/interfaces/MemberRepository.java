package kr.co.ecommerce.repository.jpa.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ecommerce.dao.Member;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {

}
