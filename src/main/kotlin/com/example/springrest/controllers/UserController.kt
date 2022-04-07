package com.example.springrest.controllers

import com.example.springrest.model.User
import com.example.springrest.service.UserServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
public class UserController(private var userServices: UserServices) {

    //@Autowired
    //private var userServices: UserServices? = null
    @PostMapping("/add")
    fun addNewUser(@RequestParam name: String, @RequestParam email: String): String{
        userServices.add(name,email)
        return "Saved"
    }

    @GetMapping("/all")
    fun getUsers() : MutableIterable<User>? {
        return userServices.get()

    }

    @DeleteMapping("/delete")
    fun deleteUser(@RequestParam id:Int){
        userServices.delete(id)
    }
}