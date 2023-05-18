package com.example.myapplication.presentation

import android.annotation.SuppressLint
import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.presentation.navigation.NavigationRoute
import com.example.myapplication.util.Constants

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        content = {

            Surface(
                color = MaterialTheme.colorScheme.background
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()

                        .padding(6.dp)
                ) {
                    Spacer(modifier = Modifier.padding(vertical =10.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "Лабораторная работа 2")
                        Spacer(modifier = Modifier.padding(horizontal = 1.dp))
                        Button(onClick = { navController.navigate(Constants.Screens.TaskScreens.TASK_LAB2_TASK1) }) {
                            Text(text = "Перейти")

                        }

                    }
                    Spacer(modifier = Modifier.padding(vertical = 10.dp))
                    Divider()
                    Spacer(modifier = Modifier.padding(vertical = 10.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "Лабораторная работа 3-4")
                        Spacer(modifier = Modifier.padding(horizontal = 1.dp))
                        Button(onClick = { navController.navigate(Constants.Screens.TaskScreens.TASK_LAB_3_4_TASK1) }) {
                            Text(text = "Перейти")

                        }

                    }
                    Spacer(modifier = Modifier.padding(vertical = 10.dp))
                    Divider()
                    Spacer(modifier = Modifier.padding(vertical = 10.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "Лабораторная работа 5")
                        Spacer(modifier = Modifier.padding(horizontal = 1.dp))
                        Button(onClick = { navController.navigate(Constants.Screens.TaskScreens.TASK_LAB5_TASK1) }) {
                            Text(text = "Перейти")

                        }

                    }

                }


            }

        }
    )


}