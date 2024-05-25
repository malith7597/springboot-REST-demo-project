package org.mobitel.springrest.User;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static int userCount=0;
    private static  List<User> users = new ArrayList<>();



    static{
        users.add(new User(++userCount,"User1", LocalDate.now().minusYears(20)));
        users.add(new User(++userCount,"User2", LocalDate.now().minusYears(10)));
        users.add(new User(++userCount ,"User3", LocalDate.now().minusYears(5)));

    }
    public List<User> findAll(){
        return users;
    }

    public User save(User user){
          user.setId(++userCount);
          users.add(user);
          return user;
    }

    public User findOne(int id){
        Predicate<? super User> predicate= user-> user.getId().equals(id);
        return   users.stream().filter(predicate).findFirst().get();
    }


}
