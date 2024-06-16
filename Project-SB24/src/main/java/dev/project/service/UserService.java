package dev.project.service;

import dev.project.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
