package factoryfun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import factoryfun.donnees.JoueurProvider;
import factoryfun.donnees.Machine;
import factoryfun.donnees.*;
import org.json.*;

@Controller
public class FactoryController
{
	
	@Autowired
	JoueurProvider init;

	
	@RequestMapping("/factoryfun")
	public String test(Model model)
	{
		
		model.addAttribute("plateau", init.getPartie().getJoueur().getPlateau());
		
		return "factory/index";
	}

	@RequestMapping("/test")
	public String testTest(Model model)
	{
		//model.addAttribute("plateau", init.getJoueur().getPlateau());
		
		return "factory/test";
	}
	
	@RequestMapping("factoryfun/action")
	@ResponseBody
	public String action(Model model, @RequestParam("name") String name, @RequestParam("type") String type, @RequestParam("x") int x, @RequestParam("y") int y, @RequestParam("direction") String direction)
	{
		Plateau p = init.getPartie().getJoueur().getPlateau();
		
		if (type.equals("machine"))
		{
			System.out.println("machine");
			
			Machine m = Machine.createMachine(name);
			m.setDirection(direction);
			
			p.setComposant(m, y, x);
			Message msg = p.check(x, y);
			
			return new JSONObject().put("isValid", (msg.getMsg().equals("v")) ? true : false).toString();
		}
		
		/*p.setComposant(m, y, x);
		Message msg = p.isValid(x, y);*/
		
		//return new JSONObject().put("isValid", (msg.getMsg().equals("v")) ? true : false).toString();
		
		return name + " " + x + " " + y + " " + direction;
	}
	
	@RequestMapping("factoryfun/extractmachine")
	@ResponseBody
	public String extractMachine(Model model)
	{
		return init.getPartie().extractMachine();
	}
	
}