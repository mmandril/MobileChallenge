package com.marcus.product.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.marcus.designsystem.button.ButtonStyles
import com.marcus.designsystem.button.CompanyButton
import com.marcus.designsystem.dialog.CompanyDialog
import com.marcus.designsystem.numberpicker.CompanyProductNumberPicker
import com.marcus.designsystem.text.CompanyTextStyles
import com.marcus.product.R

@Composable
internal fun ProductScreen(
    productListState: ProductListState,
    onQuantityChange: (String, Int) -> Unit,
    onCheckoutClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column() {
        TopAppBar(
            title = {
                Text(stringResource(id = R.string.app_name))
            }
        )

        LazyColumn() {
            items(productListState.productList) { product ->
                CompanyProductNumberPicker(
                    code = product.code.toString(),
                    name = product.name,
                    quantity = product.quantity,
                    onQuantityChange = onQuantityChange
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = "Total",
                style = CompanyTextStyles.Primary.textStyle()
            )

            Text(
                text = productListState.totalPrice.toString(),
                style = CompanyTextStyles.Primary.textStyle()
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = "Total with discount",
                style = CompanyTextStyles.Primary.textStyle()
            )

            Text(
                text = productListState.totalPriceWithDiscount.toString(),
                style = CompanyTextStyles.Primary.textStyle()
            )
        }

        val showDialog = remember { mutableStateOf(false) }

        CompanyButton(
            text = "Checkout",
            buttonStyle = ButtonStyles.Primary,
            onButtonClick = {
                onCheckoutClick()
                showDialog.value = true
            }
        )

        if (showDialog.value) {
            CompanyDialog(setShowDialog = { showDialog.value = it }) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = stringResource(id = R.string.product)
                    )
                    Row() {
                        Text(
                            text = stringResource(id = R.string.quantity),
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.size(16.dp))
                        Text(
                            text = stringResource(id = R.string.price),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                LazyColumn() {
                    items(productListState.productList) { product ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                        ) {
                            Text(
                                text = product.name
                            )
                            Row(
                            ) {
                                Text(
                                    text = product.quantity.toString(),
                                    textAlign = TextAlign.Center
                                )
                                Spacer(modifier = Modifier.size(16.dp))
                                Text(
                                    text = product.priceWithDiscount.toString(),
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}