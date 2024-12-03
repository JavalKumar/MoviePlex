package com.example.movieplexproject.dao;

import com.example.movieplexproject.pojo.User;

import java.util.ArrayList;

public interface UserDAO {
    public ArrayList<User> getAllUsers();
    public User getUser(int id);
}
