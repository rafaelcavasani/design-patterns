package com.design.patterns.structural.facade

data class User(
    val id: Long,
    val name: String,
    val age: Int,
    val roles: List<Role>
)
