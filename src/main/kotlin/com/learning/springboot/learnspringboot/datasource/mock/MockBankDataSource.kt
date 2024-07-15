package com.learning.springboot.learnspringboot.datasource.mock

import com.learning.springboot.learnspringboot.datasource.BankDataSource
import com.learning.springboot.learnspringboot.model.Bank
import org.springframework.stereotype.Repository

// Marks our datasource as a Spring boot Bean
@Repository
class MockBankDataSource: BankDataSource() {
  val banks = listOf(
    Bank("1234", 3.14, 1),
    Bank("1010", 17.0, 0),
    Bank("5678", 0.0, 100))

  override fun retrieveBanks(): Collection<Bank> = banks
}