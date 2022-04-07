package com.example.springrest.service

import com.example.springrest.model.User
import com.example.springrest.repository.UserRepository
import org.springframework.stereotype.Service

@Service
public class UserServices (private val userRepository: UserRepository){

    //@Autowired
    //private val userRepository: UserRepository? = null
    public fun add(name:String,email:String){
        val n= User(0, "", "")
        n.setName(name)
        n.setEmail(email)
        userRepository.save(n)
    }

    public fun get(): MutableIterable<User>? {
        return userRepository.findAll()
    }

    public fun delete(id: Int) {
         userRepository.deleteById(id)
    }
}