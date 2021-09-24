package com.test.apple

import org.springframework.data.repository.CrudRepository
import java.util.*

interface UserRepository:CrudRepository<User, Long> {
}