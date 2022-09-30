package com.design.patterns.structural.facade

interface RoleService {
    fun getRoleById(roleId: Long): Role
    fun saveRole(role: Role, user: User): Role
}