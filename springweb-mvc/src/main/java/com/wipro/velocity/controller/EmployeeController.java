package com.wipro.velocity.controller;

import com.wipro.velocity.model.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

	// model is used to pass data/object to view
	@RequestMapping("/employeeForm")
	public String showFormForAdd(Model theModel) {
		Employee theEmp = new Employee();
		theModel.addAttribute("emp", theEmp);
		return "registerEmployee"; // view with emp obj.
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String submit(@ModelAttribute("emp") Employee employee, ModelMap model) {
		model.addAttribute("name", employee.getName());
		model.addAttribute("contactNumber", employee.getContactNumber());
		model.addAttribute("id", employee.getId());
		return "viewEmployee"; // view has 3 attributes
	}
}
