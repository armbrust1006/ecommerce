package kr.co.ecommerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ecommerce.dto.MemberDto;
import kr.co.ecommerce.service.IndexService;

@RestController
@RequestMapping("/home/json")
public class IndexRestController {
	private final Logger log = LoggerFactory.getLogger(IndexRestController.class);

	@Autowired
	private IndexService homeService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public MemberDto getLoginInfo() {
		log.info("------ getMemberInfo start");
		return new MemberDto();
	}

}
