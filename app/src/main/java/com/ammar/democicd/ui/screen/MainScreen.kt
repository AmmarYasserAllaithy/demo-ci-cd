package com.ammar.democicd.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ammar.democicd.R
import com.ammar.democicd.ui.component.Greeting
import com.ammar.democicd.ui.theme.DemoCICDTheme


@Composable
fun MainScreen() {
    Scaffold(
        modifier = Modifier
            .background(
                Brush.linearGradient(
                    listOf(
                        Color.White,
                        Color(0xFFf5f4f7),
                        Color(0xFFefedee),
                        Color(0xFFe9e9e9)
                    )
                )
            )
            .fillMaxSize()
    ) { innerPadding ->

        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onPrimary,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp))
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(32.dp)
            )

            Greeting(
                name = "Android",
                modifier = Modifier.padding(innerPadding)
            )

            Image(
                imageVector = Icons.Default.Build,
                contentScale = ContentScale.Fit,
                contentDescription = "",
                alpha = .5f,
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .clip(RoundedCornerShape(200.dp))
                    .background(MaterialTheme.colorScheme.primary.copy(.1f))
                    .padding(32.dp)
            )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DemoCICDTheme {
        MainScreen()
    }
}