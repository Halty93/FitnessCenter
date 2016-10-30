package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//import cz.uhk.ppro.kf.shop.model.Zbozi;

@Controller
public class HomeController {

	@RequestMapping({"/Home/Index","/"})
	public ModelAndView Index(){
		ModelAndView m = new ModelAndView("Index");
		//List<Zbozi> seznam = sluzba.getAllZbozi();
		//m.addObject("seznam", seznam);
		return m;
	}
}
