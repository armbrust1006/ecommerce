package kr.co.ecommerce.controller;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.ecommerce.dao.Member;
import kr.co.ecommerce.dto.RegisterDto;
import kr.co.ecommerce.service.ForgotPasswordService;

@Controller
public class ForgotPasswordController {
	private final Logger log = LoggerFactory.getLogger(ForgotPasswordController.class);

	@Autowired
	private ForgotPasswordService forgotPasswordService;

	@RequestMapping(value = "/forgot", method = RequestMethod.GET)
	public String forgotPassword(Model model) {
		log.info("### forgot-password Page ###");
		return "forgot-password";
	}

	@RequestMapping(value = "/forgot", method = RequestMethod.POST)
	public @ResponseBody boolean forgot(@RequestBody RegisterDto registerDto) {
		log.info("### forgot processing ###");
		try {
			forgotPasswordService.insertMember(Member.builder().name(registerDto.getName())
					.birthdayYear(Integer.parseInt(registerDto.getBirthdayYear()))
					.birthdayMonth(Integer.parseInt(registerDto.getBirthdayMonth()))
					.birthdayDate(Integer.parseInt(registerDto.getBirthdayDate())).account(registerDto.getEmail())
					.password(registerDto.getPassword()).address(registerDto.getAddress()).email(registerDto.getEmail())
					.createDate(LocalDateTime.now()).build());
		} catch (DuplicateKeyException e) {
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("### forgot succeed ###");
		return true;
	}
}
