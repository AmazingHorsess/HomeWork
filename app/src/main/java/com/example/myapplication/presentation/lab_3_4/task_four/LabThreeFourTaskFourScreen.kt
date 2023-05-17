package com.example.myapplication.presentation.lab_3_4.task_four

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myapplication.presentation.components.GitHubButton
import com.example.myapplication.presentation.lab_2.task_one.components.ArrowButton
import com.example.myapplication.presentation.navigation.NavigationRoute
import com.example.myapplication.util.Constants
import com.marosseleng.compose.material3.datetimepickers.date.ui.dialog.DatePickerDialog
import java.time.LocalDate

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LabThreeFoureTaskFourScreen(navController: NavHostController) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    var isDialogShown: Boolean by rememberSaveable {
        mutableStateOf(false)
    }
    var date: LocalDate? by remember {
        mutableStateOf(null)
    }



    Scaffold(

        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(NavigationRoute.LabThree.TaskThreeLabThree.route) }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Home",Modifier.size(36.dp))

                    } },
                title = { Text(text = "Лабораторная работа 3-4") },
                scrollBehavior = scrollBehavior,
                actions = {
                    GitHubButton(url = Constants.urls.THIRD_URL)
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


                    text = "Задание 4",
                    textAlign = TextAlign.Center

                )

                Text(
                    text = "Разработать компонент DateTime",
                    textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.padding(vertical = 12.dp))
                Button(onClick = { isDialogShown = true }) {
                    Text(text = "Показать календарь")

                }
                    if (isDialogShown) {
                        DatePickerDialog(
                            onDismissRequest = { isDialogShown = false },
                            onDateChange = {
                                date = it
                                isDialogShown = false
                            },
                            title = { Text(text = "Выберите дату") })
                    }
                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Text(text = date.toString())










                Spacer(
                    modifier = Modifier.padding(vertical = 16.dp)
                )

                ArrowButton(
                    text = "Перейти к пятому заданию",
                    icon = Icons.Default.ArrowForward,
                    onClick = { navController.navigate(NavigationRoute.LabThree.TaskFiveLabThree.route) }
                )





            }

        }
    )

}