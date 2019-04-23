package kr.co.ecommerce.controller.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ecommerce.dao.Member;
import kr.co.ecommerce.service.IndexService;

@RestController
@RequestMapping("/json/index")
public class IndexRestController {
	private final Logger log = LoggerFactory.getLogger(IndexRestController.class);

	@Autowired
	private IndexService indexService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public Member getLoginInfo() {
		log.info("------ getMemberInfo start");
		Member user = indexService.getUserInfo(1L);
		return user;
	}

}
