package kr.co.ecommerce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ecommerce.dao.table.Member;
import kr.co.ecommerce.repository.jpa.qdsl.MemberRepository;

@Service
public class IndexService {
	private final Logger log = LoggerFactory.getLogger(IndexService.class);

	@Autowired
	private MemberRepository userRepository;

	public Member getUserInfo(Long userId) {
		log.info("------ controller getMemberInfo start");
		return null;
	}

}
