package service;

import entity.User;
import util.Md5Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {
    private List<User> userList;

    public UserService(){
        init();
    }

    public List<User> init(){
         userList = new ArrayList<>();
        User [] users = {
                new User("3.jpg","大爱谭松韵","14752191369","698d51a19d8a121ce581499d7b701668","南京"),
                new User("最美的风景.jpg","最美的风景","1244353765","bcbe3365e6ac95ea2c0343a2395834dd","上海")
        };
        userList = Arrays.asList(users);
        return userList;
    }

    /**
     * 登录功能
     * @param  account
     * @param password
     * @return user
     * */
    public User signIn(String account,String password){
        for(User user :userList){
            if(user.getAccount().equals(account)&& user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        User user = new UserService().signIn("aaa", Md5Util.crypt("111"));
        System.out.println(user);
    }
}
