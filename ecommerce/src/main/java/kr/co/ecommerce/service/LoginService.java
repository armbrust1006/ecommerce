package kr.co.ecommerce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ecommerce.dao.table.Permission;
import kr.co.ecommerce.dao.table.User;
import kr.co.ecommerce.repository.jpa.qdsl.PermissionRepository;
import kr.co.ecommerce.repository.jpa.qdsl.UserRepository;

@Service
public class LoginService {
	private final Logger log = LoggerFactory.getLogger(LoginService.class);

	@Autowired
	private UserRepository UserRepository;

	@Autowired
	private PermissionRepository permissionJpaRepository;

	public User getLoginState(Long loginId) {
		log.info("------ getLoginState start");
		return UserRepository.findById(loginId).get();
	}

	public Permission getLoginState1(Long loginId) {
		log.info("------ getLoginState1 start");
		return permissionJpaRepository.findById(loginId).get();
	}

}
