package kr.co.ecommerce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ecommerce.dao.table.MemberTable;
import kr.co.ecommerce.repository.mybatis.MemberMapper;

@Service
public class HomeService {
	private final Logger log = LoggerFactory.getLogger(HomeService.class);

	@Autowired
	private MemberMapper memberMapper;

	public MemberTable getMemberInfo(int memberId) {
		log.info("------ getMemberInfo start");
		return memberMapper.selectMember(memberId);
	}

}
