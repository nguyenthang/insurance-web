package vn.insurance.core.service;


import vn.insurance.core.domain.User;
import vn.insurance.core.exception.UserNotFoundException;

import java.util.List;

/**
 * Created by thangnguyen-imac on 4/24/16.
 */
public interface IUserService {

    User findById(long id) throws UserNotFoundException;


    User findByName(String name) throws UserNotFoundException;

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    public boolean isUserExists(User user);
}
