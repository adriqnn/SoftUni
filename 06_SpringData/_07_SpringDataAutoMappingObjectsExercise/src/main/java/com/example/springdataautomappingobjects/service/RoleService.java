package com.example.springdataautomappingobjects.service;

import com.example.springdataautomappingobjects.model.entity.Role;

public interface RoleService {

    Role getRoleByName(Roles role);

    void updateRole(Role role);

    enum Roles {
        ADMIN, USER
    }
}
