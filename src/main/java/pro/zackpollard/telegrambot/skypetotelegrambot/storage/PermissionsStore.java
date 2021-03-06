package pro.zackpollard.telegrambot.skypetotelegrambot.storage;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zack Pollard
 */
public class PermissionsStore {

    @Getter
    private final Map<Long, UserRole> userRoles;

    public PermissionsStore() {

        this.userRoles = new HashMap<>();
    }

    public UserRole getRole(long user) {

        UserRole role = userRoles.get(user);

        if(role == null) role = UserRole.USER;

        return role;
    }

    public void setRole(long user, UserRole userRole) {

        userRoles.put(user, userRole);
    }

    public enum UserRole {

        USER,
        SUPERUSER
    }
}