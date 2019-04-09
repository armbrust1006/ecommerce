package kr.co.ecommerce.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(HttpSession session, Model model) {
		String loginId = (String) session.getAttribute("loginId");
		return "login";
	}

}
