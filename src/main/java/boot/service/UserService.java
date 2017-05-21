package boot.service;

import boot.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eivind on 21.05.2017.
 */
@Service
public class UserService {

    public User getUser(String id) {
        if (id.equals("1")) {
            return new User("påsan@gmail.com", "påsan", 1);
        } else {
            return new User("hansen@gmail.com", "hansen", 2);
        }
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User("påsan@gmail.com", "påsan", 1));
        users.add(new User("hansen@gmail.com", "hansen", 2));

        return users;
    }
}
