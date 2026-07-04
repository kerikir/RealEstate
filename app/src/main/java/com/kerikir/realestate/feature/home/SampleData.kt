package com.kerikir.realestate.feature.home

import com.kerikir.realestate.core.model.Property

fun sampleProperties(): List<Property> = listOf(
    Property(
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
    ),
    Property(
        type = "House",
        title = "House with Great View",
        address = "NewYork NY",
        picPath = "pic_2",
        price = 800,
        bed = 1,
        bath = 2,
        size = 500,
        isGarage = false,
        score = 4.9,
        description = "This 1 bed /2 bath home boasts an enormous, open-living plan..."
    ),
    Property(
        type = "Villa",
        title = "Royal Villa",
        address = "LosAngles LA",
        picPath = "pic_3",
        price = 999,
        bed = 2,
        bath = 1,
        size = 400,
        isGarage = true,
        score = 4.7,
        description = "This 2 bed /1 bath home boasts an enormous, open-living plan..."
    ),
    Property(
        type = "House",
        title = "beauty house",
        address = "NewYork NY",
        picPath = "pic_4",
        price = 1750,
        bed = 3,
        bath = 2,
        size = 1100,
        isGarage = true,
        score = 4.3,
        description = "This 3 bed /2 bath home boasts an enormous, open-living plan..."
    )
)
