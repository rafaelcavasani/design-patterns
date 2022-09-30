package com.design.patterns.structural.facade

interface UserService {
    fun getById(userId: Long): User
    fun updateUser(userId: Long, user: User): User
}