package khich.dao;

import khich.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserDAOImpl1 implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public User findOne(int id) {
        return entityManager.find(User.class,id);
    }

    @Override
    public List<User> findAll() {
        return entityManager.createQuery("from User u",User.class).getResultList();
    }
}
