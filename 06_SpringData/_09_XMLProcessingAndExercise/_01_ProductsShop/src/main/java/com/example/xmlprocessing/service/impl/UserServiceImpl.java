package com.example.xmlprocessing.service.impl;

import com.example.xmlprocessing.model.dto.binding.jsonBindingModel.UsersBindingModel;

import com.example.xmlprocessing.model.dto.binding.xmlBindingModel.seedUsersBindingModels.UserSeedDataWrapper;
import com.example.xmlprocessing.model.dto.view.jsonViewModels.UserViewModel;
import com.example.xmlprocessing.model.dto.view.jsonViewModels.usersAndProducts.ProductModels;
import com.example.xmlprocessing.model.dto.view.jsonViewModels.usersAndProducts.SoldProducts;
import com.example.xmlprocessing.model.dto.view.jsonViewModels.usersAndProducts.UsersViewModelWrapper;
import com.example.xmlprocessing.model.dto.view.jsonViewModels.usersAndProducts.UserViewModels;
import com.example.xmlprocessing.model.entity.User;
import com.example.xmlprocessing.repository.UserRepository;
import com.example.xmlprocessing.service.UserService;
import com.example.xmlprocessing.util.modelMapper.DTOConverter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository,
                           ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void persist(UsersBindingModel userDto) {
        User user = DTOConverter.convert(userDto, User.class);
        this.userRepository.saveAndFlush(user);
    }

    @Override
    public UserViewModel getUserById(Long sellerID) {
        User user = this.userRepository.getOne(sellerID);
        return DTOConverter.convert(user, UserViewModel.class);
    }

    @Override
    public com.example.xmlprocessing.model.dto.view.usersAndProducts.UsersViewModelWrapper getAllUsersWithSoldProduct() {
        List<User> users = this.userRepository.usersWithSoldProduct();
        com.example.xmlprocessing.model.dto.view.usersAndProducts.UsersViewModelWrapper uvw = new com.example.xmlprocessing.model.dto.view.usersAndProducts.UsersViewModelWrapper();

        uvw.setUsersCount((long)users.size());
        List<UserViewModels> userViewModels = new ArrayList<>();
        users.forEach(u -> setUserViewModels(u, userViewModels));
        uvw.setUsers(userViewModels);

        return uvw;
    }

    @Override
    public void persistAllUsers(UserSeedDataWrapper userWrapper) {
        List<User> users =
                userWrapper.getUserDTOs()
                        .stream()
                        .map(u -> DTOConverter.convert(u, User.class))
                        .collect(Collectors.toList());
        this.userRepository.saveAll(users);
    }

    @Override
    public User userById(long id) {
        return this.userRepository.getOne(id);
    }

    private void setUserViewModels(User u, List<UserViewModels> userViewModels) {
        UserViewModels uvmq = new UserViewModels();
        uvmq.setAge(u.getAge());
        uvmq.setFirstName(u.getFirstName());
        uvmq.setLastName(u.getLastName());

        SoldProducts sp = new SoldProducts();
        sp.setCount((long)u.getSellingProducts().size());
        List<ProductModels> productModels =
                u.getSellingProducts().stream()
                        .map(p -> {
                            ProductModels pm = new ProductModels();
                            pm.setName(p.getName());
                            pm.setPrice(p.getPrice());
                            return pm;
                        }).collect(Collectors.toList());
        sp.setProducts(productModels);
        uvmq.setSoldProducts(sp);

        userViewModels.add(uvmq);
    }
}
