package com.design.patterns.structural.facade

interface UserFacade {
    fun updateUserRoles(userId: Long): User
}