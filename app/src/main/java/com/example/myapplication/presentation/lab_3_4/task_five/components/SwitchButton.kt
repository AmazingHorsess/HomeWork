package com.example.myapplication.presentation.lab_3_4.task_five.components

import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun SwitchButton(
    checkedState: Boolean,
    onCheckedChange: (Boolean) -> Unit

){
    val isChecked = remember { mutableStateOf(checkedState) }
    Switch(
        checked = isChecked.value ,
        onCheckedChange = {
            isChecked.value = it
            onCheckedChange(it)
                          },
    )

}