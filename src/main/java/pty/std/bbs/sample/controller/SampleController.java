package pty.std.bbs.sample.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
	Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value="/sample/openSampleList.do")
	public ModelAndView openSampleList(Map<String, Object> commandMap) {
		ModelAndView mv = new ModelAndView("");
		log.debug("Intercept TEST!!!");
		System.out.println("Intercept TEST!!!");
		
		return mv;
	}
}
