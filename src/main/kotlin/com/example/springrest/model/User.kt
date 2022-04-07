package com.example.springrest.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
public class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id: Int,
    private var name: String,
    private var email: String
) {
    fun getId(): Int {
        return id
    }
    fun setId(id: Int) {
        this.id = id
    }
    fun getName(): String {
        return name
    }
    fun setName(name: String) {
        this.name = name
    }
    fun getEmail(): String {
        return email
    }
    fun setEmail(email: String) {
        this.email = email
    }
}

