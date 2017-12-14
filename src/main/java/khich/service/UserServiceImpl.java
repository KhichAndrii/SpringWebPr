package khich.service;

import khich.dao.UserDAO;
import khich.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDAOImpl1")
    private UserDAO userDAO;
    @Override
    public void save(String name, String email) {

        userDAO.save( new  User(name,email));


    }
}
