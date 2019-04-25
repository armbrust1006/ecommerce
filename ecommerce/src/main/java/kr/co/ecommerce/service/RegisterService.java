package kr.co.ecommerce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.ecommerce.dao.Member;
import kr.co.ecommerce.repository.MemberMapper;
import kr.co.ecommerce.repository.jpa.interfaces.MemberRepository;

@Service
public class RegisterService {
	private final Logger log = LoggerFactory.getLogger(RegisterService.class);

	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	private MemberMapper memberMapper;

	/**
	 * 회원 등록
	 * @param member 회원 정보
	 * @throws DuplicateKeyException 
	 */
	@Transactional
	public void insertMember(Member member) throws DuplicateKeyException {
		log.info("### insertMember ###");
		memberMapper.insert(member);
		long memberId = member.getMemberId();
		log.info(Long.toString(memberId));
	}

}
