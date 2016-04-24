package vn.insurance.core.service;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.insurance.core.constants.ConfigConstants;
import vn.insurance.core.domain.User;
import vn.insurance.core.exception.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/**
 * Created by thangnguyen-imac on 4/24/16.
 */
@Service("userService")
@Transactional
@Repository
public class UserServiceImpl implements IUserService {

    private static Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

    @Autowired
    MongoTemplate mongoTemplate;

    private static final AtomicLong counter = new AtomicLong();

    static List<User> users = new ArrayList<User>();

    static{

        users = populateUserLists();
        logger.info("Populated user data completed");
    }

    private static List<User> populateUserLists() {
        List<User> users = new ArrayList<User>();
        users.add(new User(counter.decrementAndGet(), "Thang", "Nguyen", "thang@gmail.com", "Le Van Sy"));
        users.add(new User(counter.decrementAndGet(), "Thang1", "Nguyen1", "thang@gmail1.com", "Le Van Sy1"));
        logger.info("Size of user list is: " + users.size());
        return users;
    }

    public User findById(long id) throws UserNotFoundException {

        return mongoTemplate.findById(id, User.class, ConfigConstants.DATA_NAME);
    }

    public User findByName(String name) throws UserNotFoundException {
        return null;
    }

    public void saveUser(User user) {

    }

    public void updateUser(User user) {

    }

    public void deleteUserById(long id) {

    }

    public List<User> findAllUsers() {
        /*return mongoTemplate.findAll(User.class);*/
        logger.info("load list of the users");
        return users;
    }

    public boolean isUserExists(User user) {
        return false;
    }
}
