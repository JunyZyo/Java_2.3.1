package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import web.model.User;
//import web.service.UserService;
//import web.service.UserServiceImpl;

import java.util.List;


@Controller
public class UserController {

//    private UserService userService = new UserServiceImpl();

//    @Autowired
//    public UserController(UserService userService){
//        this.userService = userService;
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showUser() {
//        List<User> users = userService.listUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
//        modelAndView.addObject("usersList", users);
        return modelAndView;
    }

//    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
//    public ModelAndView editUser(@RequestParam(value = "id", required = false) Integer id) {
////        User user = userService.getById(id);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("editPage");
////        modelAndView.addObject("user", user);
//        return modelAndView;
//    }
}
