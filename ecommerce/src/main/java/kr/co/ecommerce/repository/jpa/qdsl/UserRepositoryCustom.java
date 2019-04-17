package kr.co.ecommerce.repository.jpa.qdsl;

import java.util.List;

import kr.co.ecommerce.dao.table.User;

public interface UserRepositoryCustom {
	List<User> findByName(String name);
}
