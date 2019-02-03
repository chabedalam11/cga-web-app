package com.mpc.cga.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mpc.cga.api.entity.C001sec;
import com.mpc.cga.api.service.C001secService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
public class C001secController {
	
	private static final Logger log = LoggerFactory.getLogger(C001secController.class);
	private static final String TAG ="C001secController :: {} ";
	
	@Autowired
	C001secService c001secService;
	
	@RequestMapping(value={"/", "/c001sec"}, method = RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("status",  "page");
		passingParam(modelAndView);
		return modelAndView;
	}
	
	@RequestMapping(value = "/section/save", method = RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute C001sec section) {
		ModelAndView modelAndView = new ModelAndView();
		log.info(TAG,"section save param : "+section.getId());
		c001secService.saveC001sec(section);
		modelAndView.addObject("status",  "save");
		passingParam(modelAndView);
		return modelAndView;
	}
	
	
	@RequestMapping(value="/section/edit", method=RequestMethod.POST, params="action=Update")
	public ModelAndView updateEmployee(@ModelAttribute C001sec section) {
		ModelAndView modelAndView = new ModelAndView();
		log.info(TAG,"section update param : "+section.getId());
		c001secService.saveC001sec(section);
		modelAndView.addObject("status",  "update");
		passingParam(modelAndView);
		return modelAndView;
	}
	
	@RequestMapping(value="/section/edit", method=RequestMethod.POST, params="action=Delete")
	public ModelAndView deleteProduct(@ModelAttribute C001sec section) {
		ModelAndView modelAndView = new ModelAndView();
		log.info(TAG,"section delete param : "+section.getId());
		c001secService.deleteC001sec(section);
		modelAndView.addObject("status",  "delete");
		passingParam(modelAndView);
		return modelAndView;
	}
	
	private void passingParam(ModelAndView modelAndView) {
		modelAndView.addObject("section",  new C001sec());
		modelAndView.addObject("sectionList",  c001secService.findAllC001sec());
		modelAndView.addObject("mode",  "c001sec");
		modelAndView.setViewName("c001sec");
	}
}
