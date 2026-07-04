package com.kerikir.realestate.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kerikir.realestate.R

@Composable
@Preview
fun SearchRow() {
    var q by remember { mutableStateOf("") }

    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        TextField(
            value = q,
            onValueChange = { q = it },
            singleLine = true,
            placeholder = {
                Text(
                    text = "Street, Address, City...",
                    color = colorResource(R.color.grey)
                )
            }
        )
    }
}