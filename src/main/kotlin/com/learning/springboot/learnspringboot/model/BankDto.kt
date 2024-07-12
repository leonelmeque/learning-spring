package com.learning.springboot.learnspringboot.model

data class BankDto(
    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int
) {


}