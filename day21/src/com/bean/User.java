package com.bean;

import java.io.Serializable;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/8 14:51
 */
public class User implements Serializable {
    // 私有字段
    private int id;
    private String username;
    private String password;
    private String nickname;

    // 构造方法
    public User() {
    }

    public User(int id, String username, String password, String nickname) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }

    // set\get
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {// name
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {// password
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {// nickname
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
