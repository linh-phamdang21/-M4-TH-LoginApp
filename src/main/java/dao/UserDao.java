package dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(24);
        u1.setName("Linh");
        u1.setAccount("LinhPham");
        u1.setEmail("phdanglinh214@gmail.com");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(20);
        u2.setName("Phuong Linh");
        u2.setAccount("PhuongLinh");
        u2.setEmail("linhmo2808@gmail.com");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(24);
        u3.setName("Nguyen");
        u3.setAccount("nguyenvu");
        u2.setEmail("nguyenvu2308@gmaill.com");
        u3.setPassword("123456");
        users.add(u3);
    }

    public static User checkLogin(Login login){
        for (User user : users){
            if (user.getAccount().equals(login.getAccount())
                && user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
