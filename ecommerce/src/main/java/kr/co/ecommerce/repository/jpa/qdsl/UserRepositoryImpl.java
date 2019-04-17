package kr.co.ecommerce.repository.jpa.qdsl;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import kr.co.ecommerce.dao.table.QUser;
import kr.co.ecommerce.dao.table.User;

@Repository
public class UserRepositoryImpl extends QuerydslRepositorySupport implements UserRepositoryCustom {

	public UserRepositoryImpl() {
		super(User.class);
	}

	@Override
	public List<User> findByName(String name) {
		QUser user = QUser.user;
		return from(user).where(user.account.eq(name)).fetch();
	}

}
