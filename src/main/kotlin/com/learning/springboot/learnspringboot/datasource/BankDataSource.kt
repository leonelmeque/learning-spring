package com.learning.springboot.learnspringboot.datasource

import com.learning.springboot.learnspringboot.model.Bank

abstract class BankDataSource {
    abstract fun retrieveBanks(): Collection<Bank>
}