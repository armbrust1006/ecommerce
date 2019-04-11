package kr.co.ecommerce.repository.hibernate;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ecommerce.dao.table.MemberTable;

/**
 * @author HAA
 *
 */
public interface MemberJpa extends JpaRepository<MemberTable, Integer> {

}
