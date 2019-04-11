package kr.co.ecommerce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ecommerce.dao.join.SessionInfo;
import kr.co.ecommerce.dao.table.MemberTable;
import kr.co.ecommerce.dao.table.PermissionTable;
import kr.co.ecommerce.repository.hibernate.MemberJpa;
import kr.co.ecommerce.repository.hibernate.PermissionJpa;
import kr.co.ecommerce.repository.hibernate.SessionInfoJpa;

/**
 * @author kim.gh
 * @version 0.1
 * @see Login processing service
 */
@Service
public class LoginService {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginService.class);

	@Autowired
	private MemberJpa MemberJpaRepository;

	@Autowired
	private PermissionJpa permissionJpaRepository;

	@Autowired
	private SessionInfoJpa sessionInfoJpaRepository;

	public MemberTable getLoginState(int loginId) {
		LOGGER.info("getLoginState processing start");
		return MemberJpaRepository.findById(loginId).get();
	}

	public PermissionTable getLoginState1(int loginId) {
		LOGGER.info("getLoginState1 processing start");
		return permissionJpaRepository.findById(loginId).get();
	}

	public SessionInfo getLoginState2(int loginId) {
		LOGGER.info("getLoginState2 processing start");
		return sessionInfoJpaRepository.findById(loginId).get();
	}
}
