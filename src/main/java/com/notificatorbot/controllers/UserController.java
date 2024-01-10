package com.notificatorbot.controllers;

import com.notificatorbot.model.AccessRequest;
import com.notificatorbot.model.UserAccount;
import com.notificatorbot.services.AccessRequestService;
import com.notificatorbot.services.UserAccountService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private final UserAccountService userAccountService;
    private final AccessRequestService accessRequestService;

    public UserController(UserAccountService userAccountService, AccessRequestService accessRequestService) {
        this.userAccountService = userAccountService;
        this.accessRequestService = accessRequestService;
    }

    public UserAccount addUserAccount(AccessRequest request) {
        UserAccount user = new UserAccount();
        user.setActive(false);
        user.setChatId(request.getChatId());
        user.setEmail(request.getEmail());
        user.setName(request.getName());
        user.setLastname(request.getLastname());

        UserAccount result = this.userAccountService.updateUserAccount(user);
        
        this.accessRequestService.deleteByChatId(request.getChatId());

        return result;
    }

    public UserAccount getUserAccountByChatId(Long chatid) {

        UserAccount result = this.userAccountService.getByChatId(chatid);

        return result;
    }
}
