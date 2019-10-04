package entity;

import java.sql.Date;
import java.util.List;

public class User {
    private String avatar;
    private String nickname;
    private String account;
    private String password;
    private String address;

    public User(String avatar, String nickname, String account, String password, String address) {
        this.avatar = avatar;
        this.nickname = nickname;
        this.account = account;
        this.password = password;
        this.address = address;
    }


    public User() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "avatar='" + avatar + '\'' +
                ", nickname='" + nickname + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", address='"+address+'\''+
                '}';
    }
}
