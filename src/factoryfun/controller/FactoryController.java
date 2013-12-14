package factoryfun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import factoryfun.donnees.JoueurProvider;

@Controller
public class FactoryController
{
	
	@Autowired
	JoueurProvider init;

	
	@RequestMapping("/factoryfun")
	public String test(Model model)
	{
		
		model.addAttribute("plateau", init.getJoueur().getPlateau());
		
		return "factory/index2";
	}

	@RequestMapping("/test")
	public String testTest(Model model)
	{
		
		//model.addAttribute("plateau", init.getJoueur().getPlateau());
		
		return "factory/test";
	}
	
}
