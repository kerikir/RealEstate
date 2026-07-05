package com.kerikir.realestate.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kerikir.realestate.core.model.Property


@Composable
fun PropertyCard(
    item: Property
) {
    Column(

    ) { }
}



@Composable
@Preview
fun PropertyCardPreview() {
    val property = Property(
        type = "Apartment",
        title = "Royal Apartment",
        address = "LosAngles LA",
        picPath = "pic_1",
        price = 1500,
        bed = 2,
        bath = 3,
        size = 350,
        isGarage = true,
        score = 4.5,
        description = "This 2 bed /3 bath home boasts an enormous, open-living plan..."
    )
    PropertyCard(property)
}