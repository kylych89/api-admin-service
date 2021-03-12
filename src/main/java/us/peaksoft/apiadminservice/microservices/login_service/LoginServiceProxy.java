package us.peaksoft.apiadminservice.microservices.login_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import us.peaksoft.apiadminservice.models.SessionInfo;
import us.peaksoft.apiadminservice.models.User;

/**
 * Created by Sayfullah on 12.03.2021.
 */
@FeignClient(url = "${microservice.login-service-url}", value = "${microservice.login-service-name}")
public interface LoginServiceProxy {

    @GetMapping("/api/v1/session/auth")
    SessionInfo auth(@RequestParam String login, @RequestParam String password);

    @PostMapping("/api/v1/user/save")
    User saveUser(@RequestHeader("auth") String auth, @RequestBody User user);

    @GetMapping("/api/v1/session/check")
    boolean checkSession(@RequestHeader("auth") String auth);
}
