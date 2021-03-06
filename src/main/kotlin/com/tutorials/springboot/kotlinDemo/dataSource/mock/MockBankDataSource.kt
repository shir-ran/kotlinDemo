package com.tutorials.springboot.kotlinDemo.dataSource.mock

import com.tutorials.springboot.kotlinDemo.dataSource.BankDataSource
import com.tutorials.springboot.kotlinDemo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("12-655-125478", 0.5,1),
        Bank("12-655-125859", 0.7,3),
        Bank("12-655-125839", 0.7,3),
        Bank("12-655-125566", 0.8,6)
    )

    override fun retrieveBanks(): Collection<Bank> = banks

}