package com.example.springdataautomappingobjects.service.impl;

import com.example.springdataautomappingobjects.model.entity.Role;
import com.example.springdataautomappingobjects.repository.RoleRepository;
import com.example.springdataautomappingobjects.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role getRoleByName(Roles role) {
        return this.roleRepository.findByName(role.name());
    }

    @Override
    public void updateRole(Role role) {
        this.roleRepository.saveAndFlush(role);
    }
}
