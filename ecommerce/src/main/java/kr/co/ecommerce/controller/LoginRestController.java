package kr.co.ecommerce.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ecommerce.dao.join.jpa.SessionInfo;
import kr.co.ecommerce.dao.table.MemberTable;
import kr.co.ecommerce.dao.table.PermissionTable;
import kr.co.ecommerce.service.LoginService;

@RestController
@RequestMapping("/login/json")
public class LoginRestController {
	private final Logger log = LoggerFactory.getLogger(HomeRestController.class);

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/a", method = RequestMethod.GET)
	public MemberTable login(HttpSession session, Model model) {
		log.info("------ login start");
		return loginService.getLoginState(1);
	}

	@RequestMapping(value = "/b", method = RequestMethod.GET)
	public PermissionTable login1(HttpSession session, Model model) {
		log.info("------ login1 start");
		return loginService.getLoginState1(1);
	}

	@RequestMapping(value = "/c", method = RequestMethod.GET)
	public SessionInfo login2(HttpSession session, Model model) {
		log.info("------ login2 start");
		return loginService.getLoginState2(1);
	}

}
