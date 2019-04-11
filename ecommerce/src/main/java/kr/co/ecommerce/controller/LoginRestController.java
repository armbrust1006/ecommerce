package kr.co.ecommerce.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ecommerce.dao.join.SessionInfo;
import kr.co.ecommerce.dao.table.MemberTable;
import kr.co.ecommerce.dao.table.PermissionTable;
import kr.co.ecommerce.service.LoginService;

@RestController
@RequestMapping("/login/json")
public class LoginRestController {
	private static final Marker MESSAGE_MARKER = MarkerFactory.getMarker("MESSAGE");
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginRestController.class);

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/a", method = RequestMethod.GET)
	public MemberTable login(HttpSession session, Model model) {
		return loginService.getLoginState(1);
	}

	@RequestMapping(value = "/b", method = RequestMethod.GET)
	public PermissionTable login1(HttpSession session, Model model) {
		return loginService.getLoginState1(1);
	}

	@RequestMapping(value = "/c", method = RequestMethod.GET)
	public SessionInfo login2(HttpSession session, Model model) {
		return loginService.getLoginState2(1);
	}

}
