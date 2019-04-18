package kr.co.ecommerce.repository.jpa.qdsl;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import kr.co.ecommerce.dao.table.Authority;

public class AuthorityRepositoryImpl extends QuerydslRepositorySupport implements AuthorityRepositoryCustom {

	public AuthorityRepositoryImpl() {
		super(Authority.class);
	}

}
