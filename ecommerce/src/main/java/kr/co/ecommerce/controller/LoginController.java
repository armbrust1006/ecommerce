package kr.co.ecommerce.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ecommerce.dao.Member;
import kr.co.ecommerce.dto.LoginDto;
import kr.co.ecommerce.dto.SessionInfoDto;
import kr.co.ecommerce.service.LoginService;
import kr.co.ecommerce.utility.VariablesUtil;

@Controller
@RequestMapping("/login")
public class LoginController {
	private final Logger log = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService;

	/**
	 * 로그인 페이지로 이동
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String loginPage(HttpSession session, Model model) {
		log.info("### login Page ###");
		String tempSessionKey = VariablesUtil.LOGIN_CONFIRM_KEY;
		String message = (String) session.getAttribute(tempSessionKey);
		if (!StringUtils.isEmpty(message)) {
			model.addAttribute(tempSessionKey, message);
			session.removeAttribute(tempSessionKey);
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
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView loginProcess(@ModelAttribute("loginDto") LoginDto loginDto, HttpSession session) {
		log.info("### login Process ###");
		ModelAndView modelAndView = new ModelAndView();

		// 로그인 정보 습득
		Member loginInfo = loginService.getMemberLogin(
				Member.builder().account(loginDto.getAccount()).password(loginDto.getPassword()).build());

		// 로그인 정보가 존재하지 않으면 로그인 실패
		if (!Optional.ofNullable(loginInfo).isPresent()) {
			modelAndView.addObject("failMessage", "아이디와 비밀번호를 다시 한번 확인해주세요.");
			log.info("### login failed ###");
			return modelAndView;
		}

		// 로그인 세션 존재하면 삭제
		if (session.getAttribute("login") != null) {
			session.removeAttribute("login");
		}

		// 세션 정보 등록
		SessionInfoDto sessionInfo = SessionInfoDto.builder().account(loginInfo.getAccount()).name(loginInfo.getName())
				.build();
		session.setAttribute("login", sessionInfo);

		log.info("### login succeed ###");
		modelAndView.setViewName("redirect:/index");
		return modelAndView;
	}

	/**
	 * 현재 로그인 상태 가져오기
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public @ResponseBody String loginCheck(HttpSession session) {
		log.info("### loginCheck posessing ###");
		if (session.getAttribute("login") != null) {
			return "이미 로그인 되어 있습니다.\r\n그래도 다시 로그인 하시겠습니까?";
		}
		return "";
	}
}
