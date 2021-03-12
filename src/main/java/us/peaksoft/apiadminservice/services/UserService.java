package us.peaksoft.apiadminservice.services;

import us.peaksoft.apiadminservice.models.User;

/**
 * Created by Sayfullah on 12.03.2021.
 */
public interface UserService {
    User saveUser(String token, User user);
}
