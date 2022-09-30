package com.design.patterns.structural.facade.impl

import com.design.patterns.structural.facade.Role
import com.design.patterns.structural.facade.User
import com.design.patterns.structural.facade.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl: UserService {
    override fun getById(userId: Long): User {
        return User(
            id = userId,
            name = "mock",
            age = 19,
            roles = mutableListOf()
        )
    }

    override fun updateUser(userId: Long, user: User): User {
        return User(
            id = userId,
            name = "mock",
            age = 19,
            roles = listOf(
                Role(
                    id = 1,
                    role = "mock_role",
                    action = "mock_action"
                )
            )
        )
    }


}