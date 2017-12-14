package khich.dao;

import khich.entity.User;

import java.util.List;

public interface UserDAO {

    void save(User user);

    User findOne(int id);

    List<User> findAll();
}
