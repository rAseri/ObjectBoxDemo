package com.example.myapplication.data

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import io.objectbox.annotation.Unique

@Entity
data class Company(
    @Id
    var id: Long = 0,
    @Unique
    var name: String? = null
)