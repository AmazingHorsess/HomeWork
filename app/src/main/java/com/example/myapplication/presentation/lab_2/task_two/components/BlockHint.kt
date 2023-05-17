package com.example.myapplication.presentation.lab_2.task_two.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup


@Composable
fun HintBlockWithAnimatedPopup(hintText: String) {
    var showPopup by remember { mutableStateOf(false) }


        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { showPopup = !showPopup }) {
                Text(text = "Нажмите для подсказки")
            }

            AnimatedVisibility(
                visible = showPopup,
                enter = slideInVertically(initialOffsetY = { it }),
                exit = slideOutVertically(targetOffsetY = { -it }, animationSpec = tween(durationMillis = 250))
            ) {
                Popup(
                    alignment = Alignment.Center,
                    onDismissRequest = { showPopup = false }
                ) {
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .padding(16.dp)
                            .clickable { showPopup = !showPopup },
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 10.dp
                        )
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Text(text = hintText, )
                            Button(onClick = { showPopup = false }) {
                                Text(text = "Закрыть")
                            }
                        }
                    }
                }
            }
        }
}