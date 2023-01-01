package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUser(Long id);

//    void updateUser(Long id, User user);

    void updateUser( User user);

    void deleteUser(Long id);

    void addUser(User user);



}
