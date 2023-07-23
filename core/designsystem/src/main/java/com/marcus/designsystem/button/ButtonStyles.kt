package com.marcus.designsystem.button

import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.marcus.designsystem.MainTheme

object ButtonStyles {

    val Primary = object : ButtonStyle {
        @Composable
        override fun colors(): ButtonColors = ButtonDefaults.buttonColors(
            containerColor = MainTheme.colors.primaryContainer,
            contentColor = MainTheme.colors.secondary
        )

        @Composable
        override fun textStyle(): TextStyle = TextStyle(
            fontSize = 20.sp,
            color = MainTheme.colors.primary
        )
    }
}

interface ButtonStyle {
    @Composable
    fun colors(): ButtonColors

    @Composable
    fun textStyle(): TextStyle
}