package com.example.utslagi.Model

import java.io.Serializable

data class ModelListOrder(
    var image : Int,
    var Nama : String,
    var Tanggal : String,
    var Harga : String,
    var Item : String
) : Serializable