package com.example.taller1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class PantallaConfiguracion : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PantallaConfiguracionScreen { navigateToMain() }
        }
    }

    private fun navigateToMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}

@Composable
fun PantallaConfiguracionScreen(onNavigate: () -> Unit) {
    var backgroundColor by remember { mutableStateOf(Color.LightGray) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        Button(onClick = {
            backgroundColor = Color.Red // Cambia el color de fondo
        }) {
            Text(text = "Cambiar color de fondo")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { onNavigate() }) {
            Text(text = "Volver a Inicio")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaConfiguracionScreenPreview() {
    PantallaConfiguracionScreen(onNavigate = {}) // No hace nada en el preview
}