package kr.co.ecommerce.repository.jpa.qdsl;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import kr.co.ecommerce.dao.table.Permission;

public class PermissionRepositoryImpl extends QuerydslRepositorySupport implements PermissionRepositoryCustom {

	public PermissionRepositoryImpl() {
		super(Permission.class);
	}

}
