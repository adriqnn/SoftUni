package com.example.jsonprocessing.entities.users;

import java.util.ArrayList;
import java.util.List;

public class UserSalesStatsFinalJSON {

    private Long usersCount;

    private List<UsersViewQ4> users;

    public UserSalesStatsFinalJSON(){
        users = new ArrayList<>();
    }

    public UserSalesStatsFinalJSON(Long usersCount, List<UsersViewQ4> users) {
        this.usersCount = usersCount;
        this.users = users;
    }

    public Long getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(Long usersCount) {
        this.usersCount = usersCount;
    }

    public List<UsersViewQ4> getUsers() {
        return users;
    }

    public void setUsers(List<UsersViewQ4> users) {
        this.users = users;
    }
}
