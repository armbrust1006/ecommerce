package kr.co.ecommerce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ecommerce.dao.join.jpa.SessionInfo;
import kr.co.ecommerce.dao.table.MemberTable;
import kr.co.ecommerce.dao.table.PermissionTable;
import kr.co.ecommerce.repository.jpa.MemberJpa;
import kr.co.ecommerce.repository.jpa.PermissionJpa;
import kr.co.ecommerce.repository.jpa.SessionInfoJpa;

/**
 * @author kim.gh
 * @version 0.1
 * @see Login processing service
 */
@Service
public class LoginService {
	private final Logger log = LoggerFactory.getLogger(LoginService.class);

	@Autowired
	private MemberJpa MemberJpaRepository;

	@Autowired
	private PermissionJpa permissionJpaRepository;

	@Autowired
	private SessionInfoJpa sessionInfoJpaRepository;

	public MemberTable getLoginState(int loginId) {
		log.info("------ getLoginState start");
		return MemberJpaRepository.findById(loginId).get();
	}

	public PermissionTable getLoginState1(int loginId) {
		log.info("------ getLoginState1 start");
		return permissionJpaRepository.findById(loginId).get();
	}

	public SessionInfo getLoginState2(int loginId) {
		log.info("------ getLoginState2 start");
		return sessionInfoJpaRepository.findById(loginId).get();
	}
}
