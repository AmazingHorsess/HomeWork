package com.example.myapplication.presentation.lab5.task_three

import android.annotation.SuppressLint
import android.content.Intent
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.input.KeyboardType.Companion.Uri
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavHostController
import com.example.myapplication.presentation.components.GitHubButton
import com.example.myapplication.presentation.lab_2.task_one.components.ArrowButton
import com.example.myapplication.presentation.navigation.NavigationRoute
import com.example.myapplication.util.Constants

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LabFiveTaskThreeScreen(navController: NavHostController) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()


    Scaffold(

        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(NavigationRoute.LabFive.TaskTwoLabFive.route) }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Home",
                            Modifier.size(36.dp))

                    } },
                title = { Text(text = "Лабораторная работа 5") },
                scrollBehavior = scrollBehavior,
                actions = {
                    GitHubButton(url = Constants.urls.LabFive.THIRD_URL)
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
                    text = "Задание 3", textAlign = TextAlign.Center
                )

                Spacer(
                    modifier = Modifier.padding(vertical = 6.dp)
                )
                Text(
                    text = "Разработать интерфейс карточки.", textAlign = TextAlign.Center
                )
                Spacer(
                    modifier = Modifier.padding(vertical = 6.dp)
                )
                Card(
                    modifier = Modifier
                        .height(150.dp)
                        .width(350.dp),
                    colors = CardDefaults.cardColors(contentColor = Color.DarkGray)) {
                    Column(
                        Modifier.padding(16.dp)
                    ) {
                        Text(text = "ProductName: iPhone 14", color = Color.White)
                        Spacer(
                            modifier = Modifier.padding(vertical = 4.dp)
                        )
                        Text(text = "Price 790,0$", color = Color.White)
                        Spacer(
                            modifier = Modifier.padding(vertical = 15.dp)
                        )

                        val uriHandler = LocalUriHandler.current

                        Button(colors = ButtonDefaults.buttonColors(containerColor =  Color.Green),
                            shape = ShapeDefaults.ExtraSmall,
                            onClick = {
                            uriHandler.openUri("https://www.apple.com/iphone-14/")

                        }) {
                            Text(text = "View", color = Color.White)

                        }

                    }

                }





                Spacer(
                    modifier = Modifier.padding(vertical = 16.dp)
                )
                val context = LocalContext.current





                ArrowButton(text = "Вернуться на главную",
                    icon = Icons.Default.ArrowForward,
                    onClick = { navController.navigate(NavigationRoute.Main.route) })
                Spacer(
                    modifier = Modifier.padding(vertical = 16.dp)
                )





            }

        }
    )


}