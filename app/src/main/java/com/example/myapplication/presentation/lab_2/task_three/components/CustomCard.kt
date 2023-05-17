package com.example.myapplication.presentation.lab_2.task_three.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomCard(){
    Card(
        modifier = Modifier

            .height(300.dp)
    
    ) {
        Column(


        ) {
            Text(text = "Тут может быть любой контент.")
            
        }

    }
}