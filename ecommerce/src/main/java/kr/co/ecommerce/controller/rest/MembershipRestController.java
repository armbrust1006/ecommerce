package kr.co.ecommerce.controller.rest;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ecommerce.dao.Member;
import kr.co.ecommerce.dto.RegisterDto;
import kr.co.ecommerce.service.MembershipService;

@RestController
@RequestMapping("/json/membership")
public class MembershipRestController {
	private final Logger log = LoggerFactory.getLogger(MembershipRestController.class);

	@Autowired
	MembershipService membershipService;

	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public boolean register(@RequestBody RegisterDto registerDto) {
		log.info("register processing");
		try {
			membershipService.insertMember(
					Member.builder()
					.name(registerDto.getName())
					.birthdayYear(Integer.parseInt(registerDto.getBirthdayYear()))
					.birthdayMonth(Integer.parseInt(registerDto.getBirthdayMonth()))
					.birthdayDate(Integer.parseInt(registerDto.getBirthdayDate()))
					.account(registerDto.getEmail())
					.password(registerDto.getPassword())
					.address(registerDto.getAddress())
					.email(registerDto.getEmail())
					.createDate(LocalDateTime.now())
					.build());
		} catch (DuplicateKeyException e) {
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
