package kr.co.ecommerce.repository.hibernate;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ecommerce.dao.Member;

/**
 * @author HAA
 *
 */
public interface HomeJpa extends JpaRepository<Member, Long> {

}
