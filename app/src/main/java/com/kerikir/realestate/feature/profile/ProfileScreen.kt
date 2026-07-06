package com.kerikir.realestate.feature.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kerikir.realestate.R
import com.kerikir.realestate.ui.components.TopBar


@Composable
fun ProfileScreen(
    navController: NavController,
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.light_grey)),
        contentPadding = PaddingValues(bottom = 100.dp),
    ) {
        item { TopBar(onBack = { navController.navigateUp() }) }
    }
}