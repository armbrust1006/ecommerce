package kr.co.ecommerce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ecommerce.dao.Member;
import kr.co.ecommerce.repository.MemberMapper;
import kr.co.ecommerce.repository.jpa.interfaces.AuthorityRepository;
import kr.co.ecommerce.repository.jpa.interfaces.MemberRepository;

@Service
public class LoginAndLogoutService {
	private final Logger log = LoggerFactory.getLogger(LoginAndLogoutService.class);

	@Autowired
	private MemberMapper memberMapper;

	@Autowired
	private MemberRepository UserRepository;

	@Autowired
	private AuthorityRepository permissionJpaRepository;

	// 이하 모든 메소드는 Mybatis Service
	public Member getMemberLogin(Member member) {
		log.info("### getMemberLogin ###");
		return memberMapper.getMemberLogin(member.getAccount(), member.getPassword());
	}

	// 이하 모든 메소드는 Jpa Service

}
