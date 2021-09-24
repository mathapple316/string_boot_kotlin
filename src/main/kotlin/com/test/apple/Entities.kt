package com.test.apple

import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Entity
public class User
    (
    @Id
    var userId: String,
    var password: String,
)