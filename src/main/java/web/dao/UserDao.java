package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUser(long id);

    void updateUser(long id, User user);

    void deleteUser(long id);

    void addUser(User user);



}
