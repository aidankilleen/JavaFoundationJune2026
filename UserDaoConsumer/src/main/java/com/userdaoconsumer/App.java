package com.userdaoconsumer;

import ie.pt.User;
import ie.pt.UserDao;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "UserDao Consumer" );
        UserDao dao = new UserDao();
        List<User> users = dao.getUsers();

        for (User u : users) {
            System.out.println(u);
        }
        dao.close();
    }
}
