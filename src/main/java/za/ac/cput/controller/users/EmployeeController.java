package za.ac.cput.controller.users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import za.ac.cput.domain.users.Employee;
import za.ac.cput.exception.RecordNotFoundException;
import za.ac.cput.service.users.impl.EmployeeServiceImpl;


@Controller
@RequestMapping("/")
public class EmployeeController
{
	@Autowired
	EmployeeServiceImpl service;

	@RequestMapping
	public String getAllEmployees(Model model) 
	{
		List<Employee> list = service.getAllEmployees();

		model.addAttribute("employees", list);
		return "list-employees";
	}

	@RequestMapping(path = {"/edit", "/edit/{id}"})
	public String editEmployeeById(Model model, @PathVariable("id") Optional<Long> id) 
							throws RecordNotFoundException
	{
		if (id.isPresent()) {
			Employee entity = service.getEmployeeById(id.get());
			model.addAttribute("employee", entity);
		} else {
			model.addAttribute("employee", new Employee());
		}
		return "add-edit-employee";
	}
	
	@RequestMapping(path = "/delete/{id}")
	public String deleteEmployeeById(Model model, @PathVariable("id") Long id) 
							throws RecordNotFoundException 
	{
		service.deleteEmployeeById(id);
		return "redirect:/";
	}

	@RequestMapping(path = "/createEmployee", method = RequestMethod.POST)
	public String createOrUpdateEmployee(Employee employee)
	{
		service.createOrUpdateEmployee(employee);
		return "redirect:/";
	}
}
