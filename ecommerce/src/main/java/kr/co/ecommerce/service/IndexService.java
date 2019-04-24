package kr.co.ecommerce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ecommerce.dao.Member;
import kr.co.ecommerce.repository.jpa.interfaces.MemberRepository;

@Service
public class IndexService {
	private final Logger log = LoggerFactory.getLogger(IndexService.class);

	@Autowired
	private MemberRepository memberRepository;

	public Member getUserInfo(Long userId) {
		log.info("------ controller getMemberInfo start");
		return null;
	}

}
