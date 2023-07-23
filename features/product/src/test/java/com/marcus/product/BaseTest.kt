package com.marcus.product

import com.marcus.product.helpers.MainDispatcherRule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Rule

@OptIn(ExperimentalCoroutinesApi::class)
open class BaseTest {

    @get:Rule
    val mainDispatcher = MainDispatcherRule()
}