package vn.insurance.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by thangnguyen-imac on 4/21/16.
 */
@Controller
@RequestMapping("/")
public class IndexController {


    @RequestMapping(method = RequestMethod.GET)
    public String getIndexPage(){

        return "UserManagement";
    }
}
