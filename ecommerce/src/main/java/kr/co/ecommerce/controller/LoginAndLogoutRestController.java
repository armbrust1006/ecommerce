package kr.co.ecommerce.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ecommerce.dao.table.Member;
import kr.co.ecommerce.dto.LoginDto;
import kr.co.ecommerce.service.LoginAndLogoutService;

@RestController
@RequestMapping("/json/user")
public class LoginAndLogoutRestController {
	private final Logger log = LoggerFactory.getLogger(IndexRestController.class);

	@Autowired
	private LoginAndLogoutService loginAndLogoutService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public boolean login(@RequestBody LoginDto loginDto) {
		log.info("login posessing start");
		log.info("test Dto" + loginDto.toString());
		loginAndLogoutService.getLoginState(1L);
		return true;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public Member logout(HttpSession session, Model model) {
		log.info("logout posessing start");
		return loginAndLogoutService.getLoginState(1L);
	}

}
