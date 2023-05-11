package com.example.myapplication.presentation.task_four

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.myapplication.R


import com.example.myapplication.presentation.components.GitHubButton
import com.example.myapplication.presentation.navigation.NavigationRoute


import com.example.myapplication.presentation.task_four.components.MessageItem

import com.example.myapplication.presentation.task_one.components.ArrowButton
import com.example.myapplication.presentation.task_one.components.CustomAlertDialog
import com.example.myapplication.presentation.task_three.components.CustomCard
import com.example.myapplication.util.Constants

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FourScreen(navController: NavHostController) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    Scaffold(

        topBar = {
            TopAppBar(
                title = { Text(text = "Лабораторная работа 2") },
                scrollBehavior = scrollBehavior,
                actions = {
                    GitHubButton(url = Constants.urls.FIRST_URL)
                })
        },


        content = {
            Column(
            horizontalAlignment = Alignment.CenterHorizontally,


            modifier = Modifier
                .padding(horizontal = 12.dp)
                .fillMaxSize()

        ) {

            Text(
                text = "Задание 4", textAlign = TextAlign.Center
            )
            Spacer(
                modifier = Modifier.padding(vertical = 6.dp)
            )
            Text(
                text = "Разработать интерфейс мессенджера.", textAlign = TextAlign.Center
            )
            Spacer(
                modifier = Modifier.padding(vertical = 6.dp)
            )

            LazyColumn(


                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .weight(1f)


            ) {
                item {
                    Text(
                        text = "Задание 4", textAlign = TextAlign.Center
                    )
                    Spacer(
                        modifier = Modifier.padding(vertical = 6.dp)
                    )
                    Text(
                        text = "Разработать интерфейс мессенджера.", textAlign = TextAlign.Center
                    )
                }
                items(10) { item ->
                    MessageItem(
                        avatarResId = R.drawable.ic_launcher_background,
                        username = "Horse",
                        fullName = "GASGA",
                        date = "12312321",
                        isFavorite = true
                    )

                }


            }



            Spacer(
                modifier = Modifier.padding(vertical = 16.dp)
            )




            ArrowButton(text = "Перейти к пятому заданию",
                icon = Icons.Default.ArrowForward,
                onClick = { navController.navigate(NavigationRoute.TaskFive.route) })
            Spacer(
                modifier = Modifier.padding(vertical = 16.dp)
            )





        }

        }
    )


}