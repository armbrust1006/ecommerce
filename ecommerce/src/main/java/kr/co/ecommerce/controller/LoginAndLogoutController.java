package kr.co.ecommerce.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ecommerce.dao.Member;
import kr.co.ecommerce.dto.LoginDto;
import kr.co.ecommerce.dto.SessionInfoDto;
import kr.co.ecommerce.service.LoginAndLogoutService;

@Controller
public class LoginAndLogoutController {
	private final Logger log = LoggerFactory.getLogger(LoginAndLogoutController.class);

	@Autowired
	private LoginAndLogoutService loginAndLogoutService;

	/**
	 * 로그인 페이지로 이동
	 * 
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(HttpSession session, Model model) {
		log.info("### login Page ###");
		if (session.getAttribute("login") != null) {
			model.addAttribute("loginChecker", "You are already signed in.\r\n" + "Do you want to re-login?");
		}
		return "login";
	}

	/**
	 * 로그인 버튼 클릭 시 로그인 처리
	 * 
	 * @param loginDto
	 * @param session
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginProcess(@ModelAttribute("loginDto") LoginDto loginDto, HttpSession session) {
		log.info("### login Process ###");

		// 로그인 정보 습득
		Member loginInfo = loginAndLogoutService.getMemberLogin(
				Member.builder().account(loginDto.getAccount()).password(loginDto.getPassword()).build());

		// 로그인 정보가 존재하지 않으면 로그인 실패
		if (!Optional.ofNullable(loginInfo).isPresent()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("failMessage", "Please checking your Email address and password.");
			log.info("### login failed ###");
			return modelAndView;
		}

		// 로그인 세션 존재 체크
		if (session.getAttribute("login") != null) {
			// 로그인 세션 삭제
			session.removeAttribute("login");
		}

		// 세션 정보 등록
		SessionInfoDto sessionInfo = SessionInfoDto.builder().account(loginInfo.getAccount()).name(loginInfo.getName())
				.build();
		session.setAttribute("login", sessionInfo);

		log.info("### login succeed ###");
		return new ModelAndView("redirect:/index");
	}

}
