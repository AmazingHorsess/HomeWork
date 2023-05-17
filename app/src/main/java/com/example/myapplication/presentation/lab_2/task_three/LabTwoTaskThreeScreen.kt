package com.example.myapplication.presentation.lab_2.task_three

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
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
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myapplication.presentation.components.GitHubButton
import com.example.myapplication.presentation.navigation.NavigationRoute
import com.example.myapplication.presentation.lab_2.task_one.components.ArrowButton
import com.example.myapplication.presentation.lab_2.task_three.components.CustomCard
import com.example.myapplication.util.Constants

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@Composable
fun LabTwoTaskThreeScreen(navController: NavHostController) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    Scaffold(

        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(NavigationRoute.LabTwo.TaskTwoLabTwo.route) }) {
                        Icon(imageVector = Icons.Default.Home, contentDescription = "Home",Modifier.size(36.dp))

                    } },

                title = { Text(text = "Лабораторная работа 2") },
                scrollBehavior = scrollBehavior,
                actions = {
                    GitHubButton(url = Constants.urls.LabTwo.THIRD_URL)
                })
        },


        content = {Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(horizontal = 12.dp)
                .fillMaxSize()
        ) {
            Text(
                modifier = Modifier
                    .weight(1f, true),
                text = "Задание 3",
                textAlign = TextAlign.Center

            )

            Text(
                text = "Задание 3 + \n  Разработать интерфейс слайдера"
                       ,

                textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.padding(vertical = 12.dp))





            val pageCount = 10
            val pagerState = rememberPagerState()

            HorizontalPager(
                modifier = Modifier
                    .weight(1f, true),
                pageCount = pageCount,
                state = pagerState
            ) { page ->
                CustomCard()
                // Our page content

            }
            Row(
                Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(pageCount) { iteration ->
                    val color = if (pagerState.currentPage == iteration) Color.Green else Color.LightGray
                    Box(
                        modifier = Modifier
                            .padding(2.dp)
                            .clip(CircleShape)
                            .background(color)
                            .size(20.dp)

                    )
                }
            }




            ArrowButton(
                text = "Перейти к четвертому заданию",
                icon = Icons.Default.ArrowForward,
                onClick = { navController.navigate(NavigationRoute.LabTwo.TaskFourLabTwo.route) }
            )
            Spacer(
                modifier = Modifier.padding(vertical = 16.dp)
            )




        }

        }
    )


}