package com.example.resistencias.Screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier

@Preview(showBackground = true)
@Composable
fun textos() {
    Column(
        modifier = Modifier.fillMaxSize()

    ) {
        Text(
            text = "Hola mundo 1"
        )
        Text(
            text = "Hola mundo 2"
        )
    }
}