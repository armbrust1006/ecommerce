package kr.co.ecommerce.repository.jpa.qdsl;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ecommerce.dao.table.Member;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {

}
