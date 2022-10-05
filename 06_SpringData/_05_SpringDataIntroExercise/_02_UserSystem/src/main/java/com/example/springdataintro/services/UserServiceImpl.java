package com.example.springdataintro.services;

import com.example.springdataintro.entity.User;
import com.example.springdataintro.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void persist(User user) {
        this.userRepository.save(user);
    }

    @Override
    public List<User> findAllUsersByEmailProvider(String provider) {
        return this.userRepository.findAllByEmailContains(provider);
    }

    @Override
    public List<User> usersLastTimeLoggedInAfter(Date date) {
        return this.userRepository.findAllByLastTimeLoggedInAfter(date);
    }

    @Override
    public void removeAllUnActiveUsersAfterDate(Date date) {
        this.userRepository.removeAllUnActiveUsersAfterDate(date);
    }

}
