package com.example.myapplication.presentation.lab_3_4.task_one

import android.annotation.SuppressLint
import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myapplication.presentation.components.GitHubButton
import com.example.myapplication.presentation.lab_2.task_one.components.ArrowButton
import com.example.myapplication.presentation.lab_3_4.task_one.components.PostComponent
import com.example.myapplication.presentation.navigation.NavigationRoute
import com.example.myapplication.util.Constants

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LabThreeFoureTaskOneScreen(navController: NavHostController) {

    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    Scaffold(

        topBar = {
            TopAppBar(
                navigationIcon = {
                IconButton(onClick = { navController.navigate(NavigationRoute.Main.route) }) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "Home",Modifier.size(36.dp))

                } },
                title = {

                    Text(text = "Лабораторная работа 3-4", textAlign = TextAlign.Center)
                        },
                scrollBehavior = scrollBehavior,
                actions = {
                    GitHubButton(url = Constants.urls.LabThreeFour.FIRST_URL)
                }
            )
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
                    text = "Разработать компонент карточку PostComponent",
                    textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.padding(vertical = 12.dp))
                PostComponent(postHeadText = "First", postText ="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vel odio ex. Nulla ut lectus eget lacus maximus imperdiet. Donec vestibulum mi mi, sit amet iaculis quam ornare vel. Ut molestie eleifend felis pharetra hendrerit. Donec libero orci, consequat eu sodales pellentesque, porta et nulla. Morbi nec ornare purus, ut volutpat mauris. Fusce quis urna venenatis, fringilla dolor vel, porttitor leo. Integer dictum sodales lacus, in gravida orci sollicitudin vitae. Donec ut aliquet turpis, at fermentum orci.\n" +
                        "\n" +
                        "Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec non luctus ex. Curabitur interdum velit quis neque varius, at sodales neque varius. Suspendisse fringilla dictum libero, vel placerat leo luctus a. Nullam luctus convallis lorem id aliquam. Vivamus pharetra sem vitae enim maximus, sed fringilla diam viverra. Nulla dignissim tellus vel quam interdum, at porta sapien pharetra. Ut ac rutrum lectus. Nam vulputate dolor id justo blandit dapibus. Fusce pulvinar venenatis diam, vel feugiat neque feugiat eget. Etiam tristique vitae justo luctus blandit. Morbi accumsan malesuada nulla vitae aliquet. Sed porttitor commodo dui eu consequat." )

                Spacer(
                    modifier = Modifier.padding(vertical = 16.dp)
                )



                ArrowButton(
                    text = "Перейти к второму заданию",
                    icon = Icons.Default.ArrowForward,
                    onClick = { navController.navigate(NavigationRoute.LabThree.TaskTwoLabThree.route) }
                )




            }

        })

}