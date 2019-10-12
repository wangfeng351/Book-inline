package service;

import entity.User;
import util.Md5Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {
    private List<User> userList;

    public void setUserList(List<User> userList) {
        this.userList = userList;
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
