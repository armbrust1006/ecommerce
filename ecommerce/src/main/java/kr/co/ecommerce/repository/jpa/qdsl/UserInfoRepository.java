package kr.co.ecommerce.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ecommerce.dao.join.jpa.SessionInfo;

/**
 * @author HAA
 *
 */
public interface SessionInfoJpa extends JpaRepository<SessionInfo, Integer> {

}
