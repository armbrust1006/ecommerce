package kr.co.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ecommerce.dao.table.MemberTable;
import kr.co.ecommerce.dto.MemberDto;
import kr.co.ecommerce.service.HomeService;

@RestController
@RequestMapping("/home/json")
public class HomeRestController {

	@Autowired
	private HomeService homeService;

	@RequestMapping(value = "/getMemberInfo", method = RequestMethod.POST)
	public MemberDto getMemberInfo() {
		return new MemberDto();
	}

	@RequestMapping(value = "/a", method = RequestMethod.GET)
	public MemberTable getMemberInfo1() {
		return homeService.getMemberInfo(1);
	}

}
