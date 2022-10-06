package com.example.springdataautomappingobjects.seed;

import com.example.springdataautomappingobjects.model.entity.Role;
import com.example.springdataautomappingobjects.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class RoleSeed {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleSeed(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @PostConstruct
    /** After the creation of instance from this class @PostConstruct will be called auto
     * and this method will insert automatically the  roles*/
    public void insertRole() {
        if (this.roleRepository.count() == 0L) {
            Role adminRole = new Role();
            adminRole.setName("ADMIN");
            Role userRole = new Role();
            userRole.setName("USER");

            this.roleRepository.saveAll(Arrays.asList(adminRole, userRole));
        }
    }
}
