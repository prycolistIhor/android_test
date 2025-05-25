package com.example.danylovihor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.danylovihor.ui.theme.DanylovIhorTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DanylovIhorTheme {
                    Scaffold(
                        modifier = Modifier.fillMaxSize().background(Color(0x99EDC3FF)),
                        containerColor = Color.Transparent
                    ) { innerPadding ->
                        Greeting(
                            name = "Danylov Ihor",
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hi, my name is $name!",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.DarkGray,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DanylovIhorTheme {
        Greeting("Android")
    }
}