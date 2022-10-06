package com.example.jsonprocessing.entities.users;

import java.util.List;

public class UserSalesStats {
    private int usersCount;
    private List<UserSalesDTO> users;

    public UserSalesStats(int count, List<UserSalesDTO> users) {
        this.usersCount = count;
        this.users = users;
    }

}
