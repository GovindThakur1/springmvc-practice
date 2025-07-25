package com.govind.dao;

import com.govind.model.User;
import lombok.Setter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;


/*
    UserDao acts as the repository layer of the project which interacts with the database and
    assists the service layer in various operations.
 */
@Setter
public class UserDao implements IUserDao {

    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public void saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
        System.out.println("saved user with id: " + user.getId());
    }
}
