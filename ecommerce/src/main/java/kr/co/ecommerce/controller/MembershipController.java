package kr.co.ecommerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.ecommerce.dto.RegisterDto;
import kr.co.ecommerce.service.MembershipService;

@Controller
public class MembershipController {
	private final Logger log = LoggerFactory.getLogger(MembershipController.class);

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerPage(Model model) {
		log.info("register.jsp Paging");
		return "register";
	}

	@RequestMapping(value = "/forgot-password", method = RequestMethod.GET)
	public String forgotPassword(Model model) {
		log.info("forgot-password.jsp Paging");
		return "forgot-password";
	}
}
