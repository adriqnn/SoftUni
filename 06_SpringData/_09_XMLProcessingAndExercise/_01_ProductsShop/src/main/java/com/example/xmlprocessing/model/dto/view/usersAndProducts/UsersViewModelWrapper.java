package com.example.xmlprocessing.model.dto.view.usersAndProducts;

import com.example.xmlprocessing.model.dto.view.jsonViewModels.usersAndProducts.UserViewModels;
import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class UsersViewModelWrapper {

    @Expose
    private Long usersCount;

    @Expose
    private List<UserViewModels> users;

    public UsersViewModelWrapper() {
        users = new ArrayList<>();
    }

    public UsersViewModelWrapper(Long usersCount, List<UserViewModels> userViewModel) {
        this.usersCount = usersCount;
        this.users = userViewModel;
    }

    public Long getUsersCount() {
        this.usersCount = (long)this.users.size();
        return usersCount;
    }

    public void setUsersCount(Long usersCount) {
        this.usersCount = usersCount;
    }

    public List<UserViewModels> getUsers() {
        return users;
    }

    public void setUsers(List<UserViewModels> users) {
        this.users = users;
    }
}
