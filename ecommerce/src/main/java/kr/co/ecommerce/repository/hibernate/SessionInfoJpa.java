package kr.co.ecommerce.repository.hibernate;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ecommerce.dao.join.SessionInfo;

/**
 * @author HAA
 *
 */
public interface SessionInfoJpa extends JpaRepository<SessionInfo, Integer> {

}
