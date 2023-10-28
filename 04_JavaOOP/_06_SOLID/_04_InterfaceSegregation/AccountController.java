package _04_JavaOOP._06_SOLID._04_InterfaceSegregation;

import _04_JavaOOP._06_SOLID._04_InterfaceSegregation.interfaces.Account;

public class AccountController {
    private final Account manager;

    public AccountController(Account manager) {
        this.manager = manager;
    }
    
    public void changePassword(String oldPass, String newPass){
        this.manager.changePassword(oldPass, newPass);
    }
}
