package com.example.myapplication.presentation.lab5.task_two

import android.annotation.SuppressLint
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

import androidx.navigation.NavHostController
import com.example.myapplication.presentation.components.GitHubButton
import com.example.myapplication.presentation.lab_2.task_one.components.ArrowButton
import com.example.myapplication.presentation.navigation.NavigationRoute
import com.example.myapplication.util.Constants

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LabFiveTaskTwoScreen(navController: NavHostController) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()


    Scaffold(

        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(NavigationRoute.LabFive.TaskOneLabFive.route) }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Home",
                            Modifier.size(36.dp))

                    } },
                title = { Text(text = "Лабораторная работа 5") },
                scrollBehavior = scrollBehavior,
                actions = {
                    GitHubButton(url = Constants.urls.LabFive.SECOND_URL)
                })
        },


        content = {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,


                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .fillMaxSize()

            ) {

                Text(
                    text = "Задание 2", textAlign = TextAlign.Center
                )

                Spacer(
                    modifier = Modifier.padding(vertical = 6.dp)
                )
                Text(
                    text = "Разработать таблицу.", textAlign = TextAlign.Center
                )
                Spacer(
                    modifier = Modifier.padding(vertical = 6.dp)
                )
                Column() {
                    Row(horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "Name", Modifier.weight(1f))
                        Text(text = "Item Name", Modifier.weight(1f))
                        Text(text = "Item Price", Modifier.weight(1f))

                    }
                    Spacer(
                        modifier = Modifier.padding(vertical = 3.dp)
                    )
                    Divider()
                    Spacer(
                        modifier = Modifier.padding(vertical = 3.dp)
                    )
                    Row(horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "Alan", Modifier.weight(1f))
                        Text(text = "Jellybean", Modifier.weight(1f))
                        Text(text = "$0.76", Modifier.weight(1f))

                    }
                    Spacer(
                        modifier = Modifier.padding(vertical = 3.dp)
                    )
                    Divider()
                    Spacer(
                        modifier = Modifier.padding(vertical = 3.dp)
                    )
                    Row(horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "Jonathan", Modifier.weight(1f))
                        Text(text = "Lollipop", Modifier.weight(1f))
                        Text(text = "$3.76", Modifier.weight(1f))

                    }
                    Spacer(
                        modifier = Modifier.padding(vertical = 3.dp)
                    )
                    Divider()
                    Spacer(
                        modifier = Modifier.padding(vertical = 3.dp)
                    )
                    Row(horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "Alvin", Modifier.weight(1f))
                        Text(text = "Eclair", Modifier.weight(1f))
                        Text(text = "$0.87", Modifier.weight(1f))

                    }
                    Spacer(
                        modifier = Modifier.padding(vertical = 3.dp)
                    )
                    Divider()
                    Spacer(
                        modifier = Modifier.padding(vertical = 3.dp)
                    )
                    Row(horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "Shannon", Modifier.weight(1f))
                        Text(text = "KitKat", Modifier.weight(1f))
                        Text(text = "$9.99", Modifier.weight(1f))

                    }


                }





                Spacer(
                    modifier = Modifier.padding(vertical = 16.dp)
                )




                ArrowButton(text = "Перейти к третьему заданию",
                    icon = Icons.Default.ArrowForward,
                    onClick = { navController.navigate(NavigationRoute.LabFive.TaskThreeLabFive.route) })
                Spacer(
                    modifier = Modifier.padding(vertical = 16.dp)
                )





            }

        }
    )


}