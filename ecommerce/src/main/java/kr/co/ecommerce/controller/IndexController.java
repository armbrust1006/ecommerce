package kr.co.ecommerce.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ecommerce.utility.VariablesUtil;

@Controller
public class IndexController {
	private final Logger log = LoggerFactory.getLogger(IndexController.class);

	/**
	 * 기본 페이지 이동
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String defualtIndex(Model model) {
		log.info("### index Page ###");
		return "redirect:/index";
	}

	/**
	 * 기본 페이지 이동
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		log.info("### index Page ###");
		return "index";
	}

	/**
	 * 빈 페이지 이동
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/blank", method = RequestMethod.GET)
	public String blank(Model model) {
		log.info("### blank Page ###");
		return "blank";
	}

	/**
	 * 차트 페이지 이동
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/charts", method = RequestMethod.GET)
	public String charts(Model model) {
		log.info("### charts Page ###");
		return "charts";
	}

	/**
	 * 테이블 페이지 이동(게시판)
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/tables", method = RequestMethod.GET)
	public String tables(Model model) {
		log.info("### tables Page ###");
		return "tables";
	}

	/**
	 * 테이블 페이지 이동(게시판)
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/change", method = RequestMethod.GET)
	public String changer(HttpSession session, Model model) {
		log.info("### change Page ###");
		String tempSessionKey = VariablesUtil.PAGING_MESSAGE;
		String message = (String) session.getAttribute(tempSessionKey);
		if (!StringUtils.isEmpty(message)) {
			model.addAttribute(tempSessionKey, message);
			session.removeAttribute(tempSessionKey);
		}
		return "page-changer";
	}

}
