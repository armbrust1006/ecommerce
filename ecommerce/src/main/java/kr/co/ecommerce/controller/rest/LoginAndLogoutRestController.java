package kr.co.ecommerce.controller.rest;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ecommerce.dao.Member;

@RestController
@RequestMapping("/json/member")
public class LoginAndLogoutRestController {
	private final Logger log = LoggerFactory.getLogger(IndexRestController.class);

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public Member logout(HttpSession session, Model model) {
		log.info("logout posessing start");
		return null;
	}

}
