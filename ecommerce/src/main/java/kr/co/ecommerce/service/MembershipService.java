package kr.co.ecommerce.service;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.ecommerce.dao.Authority;
import kr.co.ecommerce.dao.Member;
import kr.co.ecommerce.repository.MemberMapper;
import kr.co.ecommerce.repository.jpa.interfaces.MemberRepository;

@Service
public class MembershipService {
	private final Logger log = LoggerFactory.getLogger(MembershipService.class);

	@Autowired
	private MemberRepository UserRepository;

	@Autowired
	private MemberMapper memberMapper;

	@Transactional
	public void insertMember(Member member) {
		log.info("### insertMember ###");
		memberMapper.insert(member);
		long memberId = member.getMemberId();
		log.info(Long.toString(memberId));
//		insertAuthority(Authority.builder()
//				.memberId(memberId)
//				.authorityChar("a")
//				.authorityNumber(1)
//				.createDate(LocalDateTime.now())
//				.createUserId(memberId)
//				.build());
	}

}
