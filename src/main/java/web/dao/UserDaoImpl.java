package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User getUser(Long id) {
        return entityManager.find(User.class,id);
    }

//    @Override
//    public void updateUser(Long id, User user) {
//        User updatedUser = getUser(id);
//        updatedUser.setName(user.getName());
//        updatedUser.setLastName(user.getLastName());
//        updatedUser.setAge(user.getAge());
//    }
    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(Long id) {
        entityManager.remove(getUser(id));
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }
}
