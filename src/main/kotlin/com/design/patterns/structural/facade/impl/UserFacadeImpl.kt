package com.design.patterns.structural.facade.impl

import com.design.patterns.structural.facade.RoleService
import com.design.patterns.structural.facade.User
import com.design.patterns.structural.facade.UserFacade
import com.design.patterns.structural.facade.UserService
import org.springframework.stereotype.Component

@Component
class UserFacadeImpl(
    private val userService: UserService,
    private val roleService: RoleService
): UserFacade {

    override fun updateUserRoles(userId: Long): User {
        val user = userService.getById(userId)
        val role = roleService.getRoleById(1L)
        roleService.saveRole(role, user)
        val updatedUser = userService.updateUser(user.id, user)
        return updatedUser
    }

}