package us.peaksoft.apiadminservice.services;

import us.peaksoft.apiadminservice.models.SessionInfo;
import us.peaksoft.apiadminservice.models.User;

/**
 * Created by Sayfullah on 12.03.2021.
 */
public interface SessionService {
    SessionInfo auth(String login, String password);

    User getUserByToken(String token);
}
