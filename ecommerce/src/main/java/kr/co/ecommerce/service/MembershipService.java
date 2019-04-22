package kr.co.ecommerce.service;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.ecommerce.dao.table.Authority;
import kr.co.ecommerce.dao.table.Member;
import kr.co.ecommerce.repository.jpa.qdsl.MemberRepository;
import kr.co.ecommerce.repository.mybatis.MemberMapper;

@Service
public class MembershipService {
	private final Logger log = LoggerFactory.getLogger(MembershipService.class);

	@Autowired
	private MemberRepository UserRepository;

	@Autowired
	private MemberMapper memberMapper;

	@Transactional
	public void insertMemberInfo(Member member) {
		log.info("### insertMemberInfo ###");
		memberMapper.insertMemberInfo(member);
		long memberId = member.getMemberId();
		insertAuthority(Authority.builder()
				.memberId(memberId)
				.authorityChar("a")
				.authorityNumber(1)
				.createDate(LocalDateTime.now())
				.createUserId(memberId)
				.build());
	}

	public void insertAuthority(Authority authority) {
		log.info("### insertAuthority ###");
		memberMapper.insertAuthority(authority);
	}

}
