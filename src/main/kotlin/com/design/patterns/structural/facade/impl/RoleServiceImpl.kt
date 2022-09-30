package com.design.patterns.structural.facade.impl

import com.design.patterns.structural.facade.Role
import com.design.patterns.structural.facade.RoleService
import com.design.patterns.structural.facade.User
import org.springframework.stereotype.Service

@Service
class RoleServiceImpl : RoleService {

    override fun getRoleById(roleId: Long): Role {
        return Role(
            id = 1,
            role = "mock_role",
            action = "mock_action"
        )
    }

    override fun saveRole(role: Role, user: User): Role {
        return Role(
            id = 1,
            role = "mock_role",
            action = "mock_action"
        )
    }

}