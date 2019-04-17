package kr.co.ecommerce.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ecommerce.dao.table.User;
import kr.co.ecommerce.repository.jpa.qdsl.UserRepository;
import kr.co.ecommerce.repository.mybatis.MemberMapper;

@Service
public class IndexService {
	private final Logger log = LoggerFactory.getLogger(IndexService.class);

	@Autowired
	private MemberMapper memberMapper;

	@Autowired
	private UserRepository memberRepository;

	public User getMemberInfo(int memberId) {
		log.info("------ controller getMemberInfo start");
		return memberMapper.selectMember(memberId);
	}

	public List<User> getMemberInfo1(String name) {
		log.info("------ controller getMemberInfo start");
		return memberRepository.findByName(name);
	}

}
