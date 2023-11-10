package com.example.quickmart.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.quickmart.data.repository.ProductRepository
import com.example.quickmart.ui.home.HomeScreen
import com.example.quickmart.ui.theme.QuickMartTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuickMartTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
//                    this will initialize the list of products
                    ProductRepository.initProducts(this)
                    HomeScreen()
                }
            }
        }
    }
}
