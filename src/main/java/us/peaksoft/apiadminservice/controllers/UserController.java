package us.peaksoft.apiadminservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import us.peaksoft.apiadminservice.models.User;
import us.peaksoft.apiadminservice.services.UserService;

/**
 * Created by Sayfullah on 12.03.2021.
 */
@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User saveUser(@RequestHeader("auth") String auth, @RequestBody User user) {
        return userService.saveUser(auth, user);
    }
}
