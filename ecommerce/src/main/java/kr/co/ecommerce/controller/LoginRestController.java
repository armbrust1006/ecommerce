package kr.co.ecommerce.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ecommerce.service.LoginService;

@RestController
@RequestMapping("/login/json")
public class LoginRestController {

	Logger logger = LoggerFactory.getLogger(LoginRestController.class);

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(HttpSession session, Model model) {
		String loginId = (String) session.getAttribute("loginId");
		logger.info(loginService.getLoginState("1").toString());
		return "login";
	}

}
