package com.agile.birlasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.agile.birlasoft.model.Specification;
import com.agile.birlasoft.service.SpecificationService;

@Controller
public class SpecificationController {

	@Autowired
	private SpecificationService service; 
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Specification> listSpecifications = service.listAll();
		model.addAttribute("listSpecifications", listSpecifications);
		
		return "list_specification";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		Specification specification = new Specification();
		model.addAttribute("specification", specification);
		
		return "create_specification";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("specification") Specification specification) {
		service.save(specification);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{Specification_Id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "Specification_Id") long Specification_Id) {
		ModelAndView mav = new ModelAndView("edit_specification");
		Specification specification = service.get(Specification_Id);
		mav.addObject("specification", specification);
		return mav;
	}
	
	@RequestMapping("/delete/{Specification_Id}")
	public String deleteProduct(@PathVariable(name = "Specification_Id") long Specification_Id) {
		service.delete(Specification_Id);
		return "redirect:/";		
	}
}
