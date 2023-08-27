package com.curso.android.app.practica.comprarar

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainViewModelUnitTest {
    private lateinit var mainViewModel: MainViewModel

    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()
    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup(){
        Dispatchers.setMain(dispatcher)
        mainViewModel = MainViewModel()
    }

    @After
    fun tearDown()
    {
        Dispatchers.resetMain()
    }

    @Test
    fun mainViewModel_checkInitialValues() = runTest {
        val values = mainViewModel.texts.value
        assertEquals(values?.text1,"")
        assertEquals(values?.text2,"")
    }
}