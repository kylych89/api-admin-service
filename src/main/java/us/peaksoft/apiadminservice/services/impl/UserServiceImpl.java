package us.peaksoft.apiadminservice.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.peaksoft.apiadminservice.exceptions.CreateNotSupported;
import us.peaksoft.apiadminservice.microservices.login_service.LoginServiceProxy;
import us.peaksoft.apiadminservice.models.User;
import us.peaksoft.apiadminservice.services.SessionService;
import us.peaksoft.apiadminservice.services.UserService;

/**
 * Created by Sayfullah on 12.03.2021.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SessionService sessionService;


    @Autowired
    private LoginServiceProxy loginServiceProxy;

    @Override
    public User saveUser(String token, User user) {
        User naviUser = sessionService.getUserByToken(token);
        if (naviUser.getRoleDto().getId() != 1) {
            throw new CreateNotSupported("Только администратор может создавать пользователя");
        }

        user = loginServiceProxy.saveUser(naviUser.getName(), user);

        return user;
    }
}
