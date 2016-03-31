package org.acn.controller;



import org.acn.domain.Employee;
import org.acn.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	private final EmployeeRepository employeeRepository;

    @Autowired
    EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
	
    @Transactional
    @RequestMapping(method = RequestMethod.POST, value = "/populate")
	public void populateEmployees(){
    	Employee employee1	= new Employee("1001", "X,Y");
    	employeeRepository.save(employee1);
    	Employee employee2	= new Employee("1002", "Test,Test");
    	employeeRepository.save(employee2);
		
	}
    @RequestMapping(method = RequestMethod.GET, value = "/getList/{id}")
	public String getEmployeeName(@PathVariable String id){
		Employee emp	= employeeRepository.findOne(id);
		return emp.getEmployeeName();
	}

}
