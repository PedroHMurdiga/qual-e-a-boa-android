package br.edu.ifsp.qualeaboa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

private val Laranja = Color(0xFFFF8A00)
private val Vermelho = Color(0xFFE9433A)
private val Bege = Color(0xFFFFF7E6)
private val Marrom = Color(0xFF3B2A20)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme(
                colorScheme = lightColorScheme(
                    primary = Vermelho,
                    onPrimary = Color.White,
                    secondary = Laranja,
                    onSecondary = Marrom,
                    background = Bege,
                    surface = Color.White,
                    onSurface = Marrom
                )
            ) {
                App(Store(this))
            }
        }
    }
}
