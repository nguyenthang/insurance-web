package vn.insurance.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vn.insurance.core.domain.User;
import vn.insurance.core.service.IUserRepository;
import vn.insurance.core.service.IUserService;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by thangnguyen-imac on 4/21/16.
 */
@RestController
public class UserRestController {

    private Logger logger = Logger.getLogger(UserRestController.class.getName());

    @Autowired
    private IUserService userService;

    @RequestMapping(name = "/users/", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllUsers(){

        logger.info("Loading list of users page");

        List<User> users = userService.findAllUsers();

        for (User u : users) {
            logger.info(u.getLastName());
        }

        if(users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<User>>(HttpStatus.OK);
    }

}
