package kr.co.ecommerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	@RequestMapping(value = "/tables", method = RequestMethod.GET)
	public String tables(Model model) {
		log.info("index.jsp Paging");
		return "tables";
	}

}
