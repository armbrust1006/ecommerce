package kr.co.ecommerce.repository.hibernate;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ecommerce.dao.MemberTable;

/**
 * @author HAA
 *
 */
public interface HomeJpaRepository extends JpaRepository<MemberTable, Long> {

}
