package com.bignerdranch.android.geoquiz

import org.junit.Assert.*
import androidx.lifecycle.SavedStateHandle
import org.junit.Assert.assertEquals
import org.junit.Test

// for #3
class CheatViewModelTest {
    @Test
    fun isCheaterProperty_changesValue() {
        val savedStateHandle = SavedStateHandle(mapOf(IS_CHEATER_KEY to true))
        val quizViewModel = CheatViewModel(savedStateHandle)
        assertEquals(true, quizViewModel.isCheater)
        quizViewModel.isCheater = false
        assertEquals(false, quizViewModel.isCheater)
    }

}