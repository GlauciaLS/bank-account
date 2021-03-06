package com.example.bankaccount.repository

import com.example.bankaccount.model.Account
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface AccountRepository : MongoRepository<Account, String> {

    fun findByDocument(document: String): Optional<Account>
}