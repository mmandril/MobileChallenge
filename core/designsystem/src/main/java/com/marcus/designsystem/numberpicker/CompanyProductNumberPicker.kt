package com.marcus.designsystem.numberpicker

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marcus.designsystem.MainTheme
import com.marcus.designsystem.icons.CompanyIcons
import com.marcus.designsystem.text.CompanyTextStyles

@Composable
fun CompanyProductNumberPicker(
    code: String = "",
    name: String = "",
    quantity: Int = 0,
    onQuantityChange: (String, Int) -> Unit
) {
    var currentValue by remember { mutableStateOf(TextFieldValue(quantity.toString())) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(
            text = name,
            style = CompanyTextStyles.Primary.textStyle()
        )

        Row() {
            Icon(
                CompanyIcons.RoundedMinusBtn,
                contentDescription = "Add Product",
                modifier = Modifier
                    .padding(8.dp)
                    .size(24.dp)
                    .clickable {
                        currentValue = removeValue(currentValue)
                        onQuantityChange(code, currentValue.text.toInt())
                    },
                tint = MainTheme.colors.primary
            )

            BasicTextField(
                value = currentValue,
                onValueChange = { newText ->
                    currentValue = newText
                },
                textStyle = CompanyTextStyles.PrimaryCenter.textStyle(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.width(30.dp),
            )

            Icon(
                CompanyIcons.RoundedAddBtn,
                contentDescription = "Add Product",
                modifier = Modifier
                    .padding(8.dp)
                    .size(24.dp)
                    .clickable {
                        currentValue = addValue(currentValue)
                        onQuantityChange(code, currentValue.text.toInt())
                    },
                tint = MainTheme.colors.primary
            )
        }
    }
}

fun addValue(currentValue: TextFieldValue): TextFieldValue {
    var quantity = currentValue.text.toInt()
    quantity += 1
    return currentValue.copy(text = quantity.toString())
}

fun removeValue(currentValue: TextFieldValue): TextFieldValue {
    var quantity = currentValue.text.toInt()
    if (quantity > 0) {
        quantity -= 1
    }
    return currentValue.copy(text = quantity.toString())
}


@Preview(showBackground = true)
@Composable
fun NumberPickerPreview() {
    MainTheme() {
        CompanyProductNumberPicker(
            name = "T-SHIRT",
            onQuantityChange = { _, _ -> }
        )
    }
}