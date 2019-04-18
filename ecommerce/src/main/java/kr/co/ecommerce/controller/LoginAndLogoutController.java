package kr.co.ecommerce.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.ecommerce.dto.LoginDto;

@Controller
public class LoginAndLogoutController {
	private final Logger log = LoggerFactory.getLogger(LoginAndLogoutController.class);

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(HttpSession session, Model model) {
		log.info("------ loginPage Paging");
		String loginId = (String) session.getAttribute("loginId");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody String loginProcess(@RequestBody LoginDto login, HttpSession session, Model model) {
		log.info("------ loginPage Paging");
		
		String loginId = (String) session.getAttribute("loginId");
		return "login";
	}

}
