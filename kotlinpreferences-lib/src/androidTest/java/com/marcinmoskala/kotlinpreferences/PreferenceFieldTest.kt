package com.marcinmoskala.kotlinpreferences

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.reflect.KMutableProperty0

@RunWith(AndroidJUnit4::class)
class PreferenceFieldTest {

    init {
        PreferenceHolder.setContext(InstrumentationRegistry.getTargetContext())
        PreferenceHolder.clear()
    }

    @Test
    fun booleanDefaultChangeTest() {
        testValues(TestPreferences::canEatPie, true, false, true, false)
    }

    @Test
    fun intDefaultChangeTest() {
        testValues(TestPreferences::pieBaked, 5, 10, 0, 10, -19)
    }

    @Test
    fun longDefaultChangeTest() {
        testValues(TestPreferences::allPieInTheWorld, -1L, 10L, 0L, 100L)
    }

    @Test
    fun floatDefaultChangeTest() {
        testValues(TestPreferences::pieEaten, 0.0F, 10F, 0.06F, 100F)
    }

    @Test
    fun stringDefaultChangeTest() {
        testValues(TestPreferences::bestPieName, "Pie", "BlueberryPie", "SuperPie")
    }
}