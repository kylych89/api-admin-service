package us.peaksoft.apiadminservice.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.peaksoft.apiadminservice.microservices.login_service.LoginServiceProxy;
import us.peaksoft.apiadminservice.models.SessionInfo;
import us.peaksoft.apiadminservice.models.User;
import us.peaksoft.apiadminservice.services.SessionService;

/**
 * Created by Sayfullah on 12.03.2021.
 */
@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private LoginServiceProxy loginServiceProxy;

    @Override
    public SessionInfo auth(String login, String password) {
        return loginServiceProxy.auth(login, password);
    }

    @Override
    public boolean getUserByToken(String token) {
        return loginServiceProxy.checkSession(token);
    }
}
