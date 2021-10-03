package com.rest.api.service;

import com.rest.api.model.User;

import java.util.List;

public interface ApiService {

    public List<User> getUsers(Integer limit);
}
