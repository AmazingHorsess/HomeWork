package com.example.myapplication.presentation.lab_2.task_five

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myapplication.presentation.components.GitHubButton
import com.example.myapplication.presentation.lab_2.task_one.components.ArrowButton
import com.example.myapplication.presentation.navigation.NavigationRoute
import com.example.myapplication.util.Constants


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LabTwoTaskFiveScreen(
    navController: NavHostController
){
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    Scaffold(

        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(NavigationRoute.LabTwo.TaskFourLabTwo.route) }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Home",Modifier.size(36.dp))

                    } },

                title = { Text(text = "Лабораторная работа 2") },
                scrollBehavior = scrollBehavior,
                actions = {
                    GitHubButton(url = Constants.urls.LabTwo.FIFTH_URL)
                })
        },
        bottomBar = {
            Row(
                modifier = Modifier.fillMaxWidth()
                .background(Color.DarkGray),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                IconButton(onClick = { /* Handle item click */ }) {
                    Box(
                        modifier = Modifier
                            .size(96.dp)
                            .background(Color.Blue, shape = RoundedCornerShape(30.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Home,
                            contentDescription = "Home",
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
                IconButton(onClick = { /* Handle item click */ }) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .background(Color.Red, shape = RoundedCornerShape(30.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = "Search",
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }

                IconButton(onClick = { /* Handle item click */ }) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .background(Color.Green, shape = RoundedCornerShape(30.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Favorite,
                            contentDescription = "Favorites",
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }

                IconButton(onClick = { /* Handle item click */ }) {
                    Box(
                        modifier = Modifier
                            .size(96.dp)
                            .background(Color.Yellow, shape = RoundedCornerShape(30.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ShoppingCart,
                            contentDescription = "Cart",
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }

                IconButton(onClick = { /* Handle item click */ }) {
                    Box(
                        modifier = Modifier
                            .size(96.dp)
                            .background(Color.Cyan, shape = RoundedCornerShape(30.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Person,
                            contentDescription = "Cart",
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }

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
                text = "Задание 5",
                textAlign = TextAlign.Center
            )
            Spacer(
                modifier = Modifier.padding(vertical = 6.dp)
            )
            Text(
                text = "Реализовать кнопку-меню. Расположить кнопку снизу и справа",
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.padding(vertical = 12.dp))

                ArrowButton(
                    text = "Вернуться на главную",
                    icon = Icons.Default.Home,
                    onClick = { navController.navigate(NavigationRoute.Main.route) }
                )

            Spacer(
                modifier = Modifier.padding(vertical = 16.dp)
            )


        }

        }
    )


}

