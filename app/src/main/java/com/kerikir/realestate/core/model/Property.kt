package com.kerikir.realestate.core.model

data class Property(
    val type: String,
    val title: String,
    val address: String,
    val picPath: String,
    val price: Int,
    val bed: Int,
    val bath: Int,
    val size: Int,
    val isGarage: Boolean,
    val score: Double,
    val description: String,
)
