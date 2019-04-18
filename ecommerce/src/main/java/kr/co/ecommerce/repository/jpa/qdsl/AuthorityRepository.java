package kr.co.ecommerce.repository.jpa.qdsl;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ecommerce.dao.table.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long>, AuthorityRepositoryCustom {

}
