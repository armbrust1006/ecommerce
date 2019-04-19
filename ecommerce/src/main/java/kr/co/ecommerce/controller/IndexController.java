package kr.co.ecommerce.controller;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	private final Logger log = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String defualtIndex(Model model) {
		log.info("index.jsp Paging");
		return "index";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		log.info("index.jsp Paging");
		return "index";
	}

	@RequestMapping(value = "/blank", method = RequestMethod.GET)
	public String blank(Model model) {
		log.info("index.jsp Paging");
		return "blank";
	}

	@RequestMapping(value = "/charts", method = RequestMethod.GET)
	public String charts(Model model) {
		log.info("index.jsp Paging");
		return "charts";
	}

	@RequestMapping(value = "/forgot-password", method = RequestMethod.GET)
	public String forgotPassword(Model model) {
		log.info("index.jsp Paging");
		return "forgot-password";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(Model model) {
		log.info("register.jsp Paging");
		Map<String, Integer> brithday = new HashMap<>();
		brithday.put("year", Calendar.getInstance().get(Calendar.YEAR));
		return new ModelAndView("register", brithday);
	}

	@RequestMapping(value = "/tables", method = RequestMethod.GET)
	public String tables(Model model) {
		log.info("index.jsp Paging");
		return "tables";
	}

}
