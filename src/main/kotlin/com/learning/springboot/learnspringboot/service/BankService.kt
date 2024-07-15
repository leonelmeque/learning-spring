package com.learning.springboot.learnspringboot.service

import com.learning.springboot.learnspringboot.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService {
 fun getBanks(): Collection<Bank> {
     return emptyList()
 }

}