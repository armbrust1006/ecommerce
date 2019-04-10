package kr.co.ecommerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ecommerce.dto.MemberDto;

@RestController
@RequestMapping("/home/json")
public class HomeRestController {

	@RequestMapping(value = "/getMemberInfo", method = RequestMethod.POST)
	public MemberDto getMemberInfo() {
		return new MemberDto();
	}

}
