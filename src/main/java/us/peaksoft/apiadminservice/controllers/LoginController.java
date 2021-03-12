package us.peaksoft.apiadminservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import us.peaksoft.apiadminservice.models.SessionInfo;
import us.peaksoft.apiadminservice.services.SessionService;

/**
 * Created by Sayfullah on 12.03.2021.
 */
@RestController
@RequestMapping(value = "/api/v1/auth")
public class LoginController {

    @Autowired
    private SessionService sessionService;

    @GetMapping("/login")
    public SessionInfo auth(@RequestParam String login, @RequestParam String password) {
        return sessionService.auth(login, password);
    }
}
