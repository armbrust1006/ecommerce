package kr.co.ecommerce.controller;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ecommerce.dao.Member;
import kr.co.ecommerce.dto.RegisterDto;
import kr.co.ecommerce.service.RegisterService;
import kr.co.ecommerce.utility.CustomUtil;

@Controller
public class RegisterController {
	private final Logger log = LoggerFactory.getLogger(RegisterController.class);

	@Autowired
	private RegisterService registerService;

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/regist", method = RequestMethod.GET)
	public String registerPage() {
		log.info("### register Page ###");
		return "register";
	}

	/**
	 * 
	 * @param registerDto
	 * @return
	 */
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public ModelAndView register(@RequestBody RegisterDto registerDto) {
		log.info("### register processing ###");
		ModelAndView modelAndView = new ModelAndView();
		try {
			// 이메일 검증
			String email = registerDto.getEmail();
			if (!CustomUtil.isValidEmail(email)) {
				log.info("### register failed ###");
				modelAndView.addObject("failMessage", "이메일 주소를 다시 한번 확인해주세요.");
				return modelAndView;
			}
			// 회원등록 처리
			registerService.insertMember(Member.builder()
					.name(registerDto.getName())
					.birthdayYear(Integer.parseInt(registerDto.getBirthdayYear()))
					.birthdayMonth(Integer.parseInt(registerDto.getBirthdayMonth()))
					.birthdayDate(Integer.parseInt(registerDto.getBirthdayDate()))
					.account(email)
					.password(registerDto.getPassword())
					.address(registerDto.getAddress()).email(email)
					.createDate(LocalDateTime.now())
					.build());
		} catch (DuplicateKeyException e) {
			// 중복되는 회원아이디가 존재하면 에러 반환
			log.info("### register failed ###");
			modelAndView.addObject("failMessage", "이미 존재하는 이메일 주소 입니다.");
			return modelAndView;
		}
		// 등록 완료 로그인 페이지 이동
		log.info("### register succeed ###");
		modelAndView.setViewName("rediret:/login");
		return modelAndView;
	}

}
