package kr.co.ecommerce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ecommerce.dao.table.Authority;
import kr.co.ecommerce.dao.table.Member;
import kr.co.ecommerce.repository.jpa.qdsl.AuthorityRepository;
import kr.co.ecommerce.repository.jpa.qdsl.MemberRepository;

@Service
public class LoginAndLogoutMapperService {
	private final Logger log = LoggerFactory.getLogger(LoginAndLogoutMapperService.class);

	@Autowired
	private MemberRepository UserRepository;

	@Autowired
	private AuthorityRepository permissionJpaRepository;

	public Member getLoginState(Long loginId) {
		log.info("------ getLoginState start");
		return null;
	}

	public Authority getLoginState1(Long loginId) {
		log.info("------ getLoginState1 start");
		return permissionJpaRepository.findById(loginId).get();
	}

}
