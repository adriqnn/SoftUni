package com.example.xmlprocessing.model.dto.binding.xmlBindingModel.seedUsersBindingModels;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "users")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserSeedDataWrapper {

    @XmlElement(name = "user")
    List<UserSeedDataDTO> userDTOs;

    public UserSeedDataWrapper() {
    }

    public List<UserSeedDataDTO> userDTOs() {
        return userDTOs;
    }

    public void setUserDTOs(List<UserSeedDataDTO> userDTOs) {
        this.userDTOs = userDTOs;
    }

    public List<UserSeedDataDTO> getUserDTOs() {
        return userDTOs;
    }
}
