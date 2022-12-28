package web.service;

import web.model.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUser(long id);

    void deleteUser(long id);

    void updateUser(long id, User user);

    void addUser(User user);

}
