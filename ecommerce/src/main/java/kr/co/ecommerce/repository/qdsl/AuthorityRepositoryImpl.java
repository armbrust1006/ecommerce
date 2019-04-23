package kr.co.ecommerce.repository.qdsl;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import kr.co.ecommerce.dao.Authority;
import kr.co.ecommerce.repository.jpa.interfaces.AuthorityRepositoryCustom;

public class AuthorityRepositoryImpl extends QuerydslRepositorySupport implements AuthorityRepositoryCustom {

	public AuthorityRepositoryImpl() {
		super(Authority.class);
	}

}
