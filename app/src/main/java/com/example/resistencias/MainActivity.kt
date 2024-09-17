package com.example.resistencias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.resistencias.ui.theme.RESISTENCIASTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.resistencias.Menu.ColorBandMenuExample

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RESISTENCIASTheme {
                ResistanceApp()
            }
        }
    }
}

@Composable
fun ResistanceApp() {
    Column {
        ColorBandMenuExample()
    }
}