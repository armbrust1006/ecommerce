package kr.co.ecommerce.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ecommerce.dao.table.PermissionTable;

/**
 * @author HAA
 *
 */
public interface PermissionJpa extends JpaRepository<PermissionTable, Integer> {

}
