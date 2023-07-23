package com.marcus.designsystem.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.marcus.designsystem.MainTheme

object CompanyTextStyles {

    val Primary = object : CompanyTextStyle {
        @Composable
        override fun textStyle(): TextStyle = TextStyle(
            fontSize = 24.sp,
            color = MainTheme.colors.primary
        )
    }

    val PrimaryCenter = object : CompanyTextStyle {
        @Composable
        override fun textStyle(): TextStyle = TextStyle(
            fontSize = 24.sp,
            color = MainTheme.colors.primary,
            textAlign = TextAlign.Center
        )
    }
}

interface CompanyTextStyle {
    @Composable
    fun textStyle(): TextStyle
}