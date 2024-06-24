package com.cydeo;

import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("--------------------REGION---------------------");

        System.out.println("findByCountry: " + regionRepository.findByCountry("Canada"));
        System.out.println("findByCountry: " + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountry: " + regionRepository.findByCountryContainsOrderByRegion("United"));
        System.out.println(regionRepository.findTopByCountry("United States"));
        System.out.println(regionRepository.findTop2ByCountry("United States"));
        System.out.println(regionRepository.findTopByCountryContainsOrderByRegion("United States"));


        System.out.println("---------------------Department-------------------");

        System.out.println("Find by departments: " + departmentRepository.findByDepartment("Furniture"));
        System.out.println("Find by division: " + departmentRepository.findByDivision("Health"));
        System.out.println("Find by division: " + departmentRepository.findByDivisionEndingWith("ics"));
        System.out.println("Find by division: " + departmentRepository.findDistinctTopByDivisionContains("Hea"));


        System.out.println("---------------------Employee-----------------------");

        System.out.println("Find employees with email address: " + employeeRepository.findEmployeeByEmail("bmanueau0@dion.ne.jp"));

        //System.out.println("Find by firstname, lastname, or email: " + employeeRepository.findByFirstNameAndLastNameOrEmail());

        System.out.println("All employees but the excluded name: " + employeeRepository.findByFirstNameIsNot("Seline"));

        System.out.println("----------------------------Query--------------------------");

        System.out.println(employeeRepository.retrieveEmployeeDetail());
        System.out.println("Employee salary is: " + employeeRepository.retrieveEmployeeSalary() + "$");

    }

}
