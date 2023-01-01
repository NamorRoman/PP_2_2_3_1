package web.service;

import web.model.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUser(Long id);

    void deleteUser(Long id);

    void updateUser(Long id, User user);

    void addUser(User user);

}
