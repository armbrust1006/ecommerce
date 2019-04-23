package kr.co.ecommerce.repository.jpa.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ecommerce.dao.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long>, AuthorityRepositoryCustom {

}
