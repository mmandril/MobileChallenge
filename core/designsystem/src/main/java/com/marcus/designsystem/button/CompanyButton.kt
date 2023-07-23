package com.marcus.designsystem.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.marcus.designsystem.MainTheme

@Composable
fun CompanyButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    buttonStyle: ButtonStyle,
    onButtonClick: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { onButtonClick() },
            enabled = enabled,
            colors = buttonStyle.colors(),
            modifier = modifier
        ) {
            Text(
                text = text,
                style = buttonStyle.textStyle()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CompanyButtonPreview() {
    MainTheme() {
        CompanyButton(
            text = "Checkout",
            buttonStyle = ButtonStyles.Primary,
            onButtonClick = { },
        )
    }
}