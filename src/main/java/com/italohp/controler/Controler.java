package com.italohp.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class Controler {
	
@RequestMapping("/home")
	public ModelAndView Home()
	{
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping("/projetos")
	public ModelAndView Projetos()
	{
		ModelAndView mv = new ModelAndView("projetos");
		return mv;
	}
	@RequestMapping("/contato")
	public ModelAndView Contato()
	{
		ModelAndView mv = new ModelAndView("contato");
		return mv;
	}
	@RequestMapping("/habilidades")
	public ModelAndView Habilidades()
	{
		ModelAndView mv = new ModelAndView("habilidades");
		return mv;
	}
}
