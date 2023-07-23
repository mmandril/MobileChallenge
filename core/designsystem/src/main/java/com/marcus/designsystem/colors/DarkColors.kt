package com.marcus.designsystem.colors

import androidx.compose.material3.darkColorScheme
import com.marcus.designsystem.colors.CompanyColors.BackgroundDark
import com.marcus.designsystem.colors.CompanyColors.ErrorContainerDark
import com.marcus.designsystem.colors.CompanyColors.ErrorDark
import com.marcus.designsystem.colors.CompanyColors.OnBackgroundDark
import com.marcus.designsystem.colors.CompanyColors.OnErrorContainerDark
import com.marcus.designsystem.colors.CompanyColors.OnErrorDark
import com.marcus.designsystem.colors.CompanyColors.OnPrimaryContainerDark
import com.marcus.designsystem.colors.CompanyColors.OnPrimaryDark
import com.marcus.designsystem.colors.CompanyColors.OnSecondaryContainerDark
import com.marcus.designsystem.colors.CompanyColors.OnSecondaryDark
import com.marcus.designsystem.colors.CompanyColors.OnSurfaceVariantDark
import com.marcus.designsystem.colors.CompanyColors.OnTertiaryContainerDark
import com.marcus.designsystem.colors.CompanyColors.OnTertiaryDark
import com.marcus.designsystem.colors.CompanyColors.OutlineDark
import com.marcus.designsystem.colors.CompanyColors.PrimaryContainerDark
import com.marcus.designsystem.colors.CompanyColors.PrimaryDark
import com.marcus.designsystem.colors.CompanyColors.SecondaryContainerDark
import com.marcus.designsystem.colors.CompanyColors.SecondaryDark
import com.marcus.designsystem.colors.CompanyColors.SurfaceDark
import com.marcus.designsystem.colors.CompanyColors.SurfaceVariantDark
import com.marcus.designsystem.colors.CompanyColors.TertiaryContainerDark
import com.marcus.designsystem.colors.CompanyColors.TertiaryDark

object DarkColors {
    val DarkColorScheme = darkColorScheme(
        primary = PrimaryDark,
        onPrimary = OnPrimaryDark,
        primaryContainer = PrimaryContainerDark,
        onPrimaryContainer = OnPrimaryContainerDark,
        secondary = SecondaryDark,
        onSecondary = OnSecondaryDark,
        secondaryContainer = SecondaryContainerDark,
        onSecondaryContainer = OnSecondaryContainerDark,
        tertiary = TertiaryDark,
        onTertiary = OnTertiaryDark,
        tertiaryContainer = TertiaryContainerDark,
        onTertiaryContainer = OnTertiaryContainerDark,
        error = ErrorDark,
        onError = OnErrorDark,
        errorContainer = ErrorContainerDark,
        onErrorContainer = OnErrorContainerDark,
        background = BackgroundDark,
        onBackground = OnBackgroundDark,
        surface = SurfaceDark,
        outline = OutlineDark,
        surfaceVariant = SurfaceVariantDark,
        onSurfaceVariant = OnSurfaceVariantDark,
    )
}
