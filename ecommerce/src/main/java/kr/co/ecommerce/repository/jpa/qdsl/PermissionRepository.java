package kr.co.ecommerce.repository.jpa.qdsl;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ecommerce.dao.table.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long>, PermissionRepositoryCustom {

}
