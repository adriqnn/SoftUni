package com.example.springdataautomappingobjects;

import com.example.springdataautomappingobjects.entities.Employee;
import com.example.springdataautomappingobjects.entities.dto.CustomDTO;
import com.example.springdataautomappingobjects.services.EmployeeService;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class ConsoleRunner implements CommandLineRunner {


    private final EmployeeService employeeService;

    @Autowired
    public ConsoleRunner(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void run(String... args) throws Exception {

        this.employeeService.findEmployeesBornBefore(2023).forEach(System.out::println);

        List<Employee> all = this.employeeService.findAll();


        ModelMapper mapper = new ModelMapper();
        TypeMap<Employee, CustomDTO> employeeToCustom = mapper.createTypeMap(Employee.class,CustomDTO.class);
        //employeeToCustom.<Integer>addMapping(source -> source.getManager().getLastName().length(),((destination,value) -> destination.setManagerLastNameLength(value)));
        //employeeToCustom.addMapping(source -> source.getManager().getLastName().length(),(CustomDTO::setManagerLastNameLength));
        /*employeeToCustom.addMappings(m -> m.map(source -> {
            Employee manager = source.getManager();
            if(manager == null){
                return 0;
            }
            return manager.getLastName().length();
        },CustomDTO::setManagerLastNameLength));*/

        Converter<Employee,Integer> getLastNameLength = ctx -> ctx.getSource() == null ? null : ctx.getSource().getLastName().length();
        employeeToCustom.addMappings(mapping -> mapping.when(Objects::nonNull).using(getLastNameLength).map(Employee::getManager,CustomDTO::setManagerLastNameLength));


        all.stream().map(employeeToCustom::map).forEach(System.out::println);


        //list.stream().map(e -> mapper.map(e,EmployeeSpringDTO.class)).forEach(System.out::println);

        /*this.persist();
        Optional<Employee> managerOp = this.employeeService.findOneById(1);
        Employee manager = managerOp.get();

        ModelMapper mapper = new ModelMapper();
        EmployeeSpringDTO  dto = mapper.map(manager,EmployeeSpringDTO.class);
        System.out.println(dto);*/
    }

    private void persist() {
        Employee manager = new Employee("Mrs.","Manager", BigDecimal.ONE, LocalDate.now(),null);

        Employee firstE = new Employee("First","Last", BigDecimal.TEN, LocalDate.now(),manager);

        //manager = this.employeeService.findOneById(firstE.getManager().getId()).get();
        Employee secondE = new Employee("Second","Last", BigDecimal.TEN, LocalDate.now(),manager);

        this.employeeService.save(firstE);
        //this.employeeService.save(secondE);
    }
}
