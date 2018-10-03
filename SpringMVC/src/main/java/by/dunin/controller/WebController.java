package by.dunin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController
{
	@RequestMapping(value = "/*", method = RequestMethod.GET)
	public String getAllEmployees(Model model)
	{
		model.addAttribute("message", "Hello World");
		return "index";
	}
}