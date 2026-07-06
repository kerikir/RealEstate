package com.kerikir.realestate.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun OptionRow(
    title: String,
    onClick: () -> Unit = {},
) {

}



@Composable
@Preview
fun OptionRowPreview() {
    OptionRow(title = "Personal")
}