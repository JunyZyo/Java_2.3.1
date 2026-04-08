//package web.dao;
//
//import web.model.User;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import javax.transaction.Transactional;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Repository
//public class UserDaoImp implements UserDao {
//    private static Map<Integer, User> users = new HashMap<>();
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Transactional
//    public void add(User user) {
//        entityManager.persist(user);
//    }
//
//    @Override
//    public void delete(User user) {
//
//    }
//
//    @Override
//    public void edit(User user) {
//
//    }
//
//    @Override
//    public User getById(int id) {
//        return users.get(id);
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public List<User> listUsers() {
//        return entityManager.createQuery("SELECT u from User u", User.class).getResultList();
//    }
//
//}
