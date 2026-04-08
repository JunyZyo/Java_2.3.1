//package web.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import web.dao.UserDao;
//import web.model.User;
//
//import javax.transaction.Transactional;
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    private UserDao userDao;
//
//    @Transactional
//    @Override
//    public void add(User user) {
//        userDao.add(user);
//    }
//
//    @Override
//    public void delete(User user) {
//        userDao.delete(user);
//    }
//
//    @Override
//    public void edit(User user) {
//        userDao.edit(user);
//    }
//
//    @Override
//    public User getById(int id) {
//        return userDao.getById(id);
//    }
//
//    @Transactional
//    @Override
//    public List<User> listUsers() {
//        return userDao.listUsers();
//    }
//
//
//}
//
