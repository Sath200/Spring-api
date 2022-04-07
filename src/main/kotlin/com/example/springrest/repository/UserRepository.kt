package com.example.springrest.repository

import com.example.springrest.model.User
import org.springframework.data.repository.CrudRepository

public interface UserRepository: CrudRepository<User, Int> {
}