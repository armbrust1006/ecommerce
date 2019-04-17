package kr.co.ecommerce.repository.jpa.qdsl;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ecommerce.dao.table.User;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {

}
