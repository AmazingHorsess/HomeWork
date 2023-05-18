package com.example.myapplication.presentation.lab_2.task_one

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myapplication.ValidationActivity
import com.example.myapplication.presentation.components.GitHubButton

import com.example.myapplication.presentation.navigation.NavigationRoute
import com.example.myapplication.presentation.lab_2.task_one.components.ArrowButton
import com.example.myapplication.presentation.lab_2.task_one.components.CustomAlertDialog
import com.example.myapplication.util.Constants

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LabTwoTaskOneScreen(navController: NavHostController) {
    var showDialog by remember { mutableStateOf(false) }
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

   Scaffold(

       topBar = {
           TopAppBar(
               navigationIcon = {
                   IconButton(onClick = { navController.navigate(NavigationRoute.Main.route) }) {
                       Icon(imageVector = Icons.Default.Home, contentDescription = "Home",Modifier.size(36.dp))

                   } },

               title = { Text(text = "Лабораторная работа 2")  } ,scrollBehavior = scrollBehavior, actions = {
               GitHubButton(url = Constants.urls.LabTwo.FIRST_URL)
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
                   text = "Задание 1",
                   textAlign = TextAlign.Center
               )
               Spacer(
                   modifier = Modifier.padding(vertical = 6.dp)
               )
               Text(
                   text = "Разработать кнопку и модальное окно. При нажатии на кнопку вывести модальное окно",
                   textAlign = TextAlign.Center)
               Spacer(modifier = Modifier.padding(vertical = 12.dp))
               Button(
                   onClick = { showDialog = true }
               ) {
                   Text(
                       text = "Показать диалоговое окно"
                   )
               }

               CustomAlertDialog(
                   showDialog = showDialog,
                   onDismiss = { showDialog = false },
                   title = "Заголовок",
                   message = "Текст сообщения",
                   confirmButtonText = "ОК",
                   dismissButtonText = "Отменить"
               )
               Spacer(
                   modifier = Modifier.padding(vertical = 16.dp)
               )
               val context = LocalContext.current
               Button(onClick = { val intent = Intent(context, ValidationActivity::class.java)

                   context.startActivity(intent) }) {
                   
               }



               ArrowButton(
                   text = "Перейти к второму заданию",
                   icon = Icons.Default.ArrowForward,
                   onClick = { navController.navigate(NavigationRoute.LabTwo.TaskTwoLabTwo.route) }
               )




           }

       })

       }




