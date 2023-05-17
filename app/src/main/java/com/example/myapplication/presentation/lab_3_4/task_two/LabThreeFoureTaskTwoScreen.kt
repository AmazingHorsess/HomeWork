package com.example.myapplication.presentation.lab_3_4.task_two

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myapplication.presentation.components.GitHubButton
import com.example.myapplication.presentation.lab_2.task_one.components.ArrowButton
import com.example.myapplication.presentation.lab_3_4.task_two.components.ListViewComponent
import com.example.myapplication.presentation.navigation.NavigationRoute
import com.example.myapplication.util.Constants

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LabThreeFoureTaskTwoScreen(navController: NavHostController) {

    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    Scaffold(

        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(NavigationRoute.LabThree.TaskOneLabThree.route) }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Home",Modifier.size(36.dp))

                    } },
                title = { Text(text = "Лабораторная работа 3-4")  } ,scrollBehavior = scrollBehavior, actions = {
                    GitHubButton(url = Constants.urls.FIRST_URL)
                })
        },


        content = {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .fillMaxSize()
            ) {
                Text(
                    text = "Задание 2",
                    textAlign = TextAlign.Center
                )
                Spacer(
                    modifier = Modifier.padding(vertical = 6.dp)
                )
                Text(
                    text = "Разработать компонент списка ListView",
                    textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.padding(vertical = 12.dp))
                LazyColumn(


                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .weight(1f)


                ) {
                    item {
                        Text(
                            text = "Задание 2", textAlign = TextAlign.Center
                        )
                        Spacer(
                            modifier = Modifier.padding(vertical = 6.dp)
                        )
                        Text(
                            text = "Разработать компонент списка ListView", textAlign = TextAlign.Center
                        )
                    }
                    items(10) {
                        ListViewComponent(fullName = "Alvin")

                    }


                }

                Spacer(
                    modifier = Modifier.padding(vertical = 16.dp)
                )



                ArrowButton(
                    text = "Перейти к третьему заданию",
                    icon = Icons.Default.ArrowForward,
                    onClick = { navController.navigate(NavigationRoute.LabThree.TaskThreeLabThree.route) }
                )
                Spacer(
                    modifier = Modifier.padding(vertical = 16.dp)
                )




            }

        })

}