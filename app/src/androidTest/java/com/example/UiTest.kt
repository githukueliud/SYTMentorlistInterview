package com.example

import androidx.compose.ui.test.assertCountEquals
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onNodeWithText
import com.example.sytmentorlistinterview.CardComponent
import com.example.sytmentorlistinterview.HomeScreen
import org.junit.Rule
import org.junit.Test

class UiTest {


    @get: Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testHomeScreen() {
        //to launch the HomeScreen
        composeTestRule.setContent {
            HomeScreen()
        }

        //check if "Upcoming Trips" is displayed
        composeTestRule.onNodeWithText("Upcoming Trips")
            .assertIsDisplayed()

        //check if both cards are displayed
        composeTestRule.onAllNodesWithTag("CardComponent")
            .assertCountEquals(1)
    }

    @Test
    fun testCardComponent() {
        //launch the card component
        composeTestRule.setContent {
            CardComponent(text = "Test Card")
        }

        //test whether card component with given text is displayed
        composeTestRule.onNodeWithText("Test Card")
            .assertIsDisplayed()
    }
}