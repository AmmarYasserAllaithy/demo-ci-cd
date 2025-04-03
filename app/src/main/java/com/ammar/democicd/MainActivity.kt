package com.ammar.democicd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ammar.democicd.ui.screen.MainScreen
import com.ammar.democicd.ui.theme.DemoCICDTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            DemoCICDTheme {
                MainScreen()
            }
        }
    }
}