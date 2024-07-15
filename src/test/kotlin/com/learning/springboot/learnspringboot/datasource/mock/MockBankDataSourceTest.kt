package com.learning.springboot.learnspringboot.datasource.mock

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {
    private val mockDataSource: MockBankDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
      // given
      // when
      val banks = mockDataSource.retrieveBanks()

      // then
        assertThat(banks).isNotEmpty
   }

    @Test
    fun `should provide some mock data`() {
        // give
        //when
        val banks = mockDataSource.retrieveBanks()

        // then
        assertThat(banks).allSatisfy { it.accountNumber.isNotBlank() }
        assertThat(banks).allSatisfy { it.trust != 0.0 }
        assertThat(banks).allSatisfy { it.transactionFee != 0 }
    }
}