package com.bignerdranch.android.geoquiz

import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ActivityScenario.launch
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CheatActivityTest {
    private lateinit var scenario: ActivityScenario<CheatActivity>

    @Before
    fun setUp() {
        scenario = launch(CheatActivity::class.java)
    }

    @After
    fun tearDown() {
        scenario.close()
    }

    // # 3
    @Test
    fun handlesActivityRecreation() {
        onView(withId(R.id.cheat_button)).perform(click())
        scenario.recreate()
        onView(withId(R.id.answer_text_view)).check(matches(withText("True")))
    }

    // # 4
    @Test
    fun handlesShowAnswerClick() {
        onView(withId(R.id.cheat_button)).perform(click())
        onView(withId(R.id.answer_text_view)).check(matches(withText("True")))
    }
}