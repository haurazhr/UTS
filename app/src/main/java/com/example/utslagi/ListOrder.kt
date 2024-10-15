package com.example.utslagi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.utslagi.Adapter.OrderAdapter
import com.example.utslagi.Model.ModelListOrder

class ListOrder : AppCompatActivity() {

    private lateinit var RecyclerViewMakanan : RecyclerView
    private lateinit var AdapterMakanan : OrderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_order)

        val menuMakanan = listOf(
            ModelListOrder(
                R.drawable.chickencurry,
                "Chicken Curry",
                "29 nov, 01.20 pm",
                "$50.00",
                "2 Items"
            ),
            ModelListOrder(R.drawable.beanburger, "Bean burger", "10 mei, 06.10 pm", "$50.00", "2 Items"),
            ModelListOrder(R.drawable.latte, "Coffe latte", "06 nov, 02.09 pm", "$50.00", "2 Items"),
            ModelListOrder(R.drawable.chickencurry, "Chicken Curry", "07 nov, 07.45 pm", "$50.00", "2 Items"),
            ModelListOrder(R.drawable.cheesecake, "Cheesecake Strawberry", "24 june, 07.00 pm", "$50.00", "2 Items")

        )


        RecyclerViewMakanan = findViewById(R.id.RvMakanan)
        RecyclerViewMakanan.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        AdapterMakanan = OrderAdapter(menuMakanan)
        RecyclerViewMakanan.adapter = AdapterMakanan
    }
}