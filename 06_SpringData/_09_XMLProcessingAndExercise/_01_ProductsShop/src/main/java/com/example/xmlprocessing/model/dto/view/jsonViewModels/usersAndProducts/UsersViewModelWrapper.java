package com.example.xmlprocessing.model.dto.view.jsonViewModels.usersAndProducts;

import com.google.gson.annotations.Expose;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "users")
@XmlAccessorType(XmlAccessType.FIELD)
public class UsersViewModelWrapper {

    @Expose
    @XmlAttribute(name = "count")
    private Long usersCount;

    @Expose
    @XmlElement(name = "user")
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
