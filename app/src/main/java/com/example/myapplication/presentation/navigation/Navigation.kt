package com.example.myapplication.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.presentation.task_five.FiveScreen


import com.example.myapplication.presentation.task_four.FourScreen
import com.example.myapplication.presentation.task_one.OneScreen
import com.example.myapplication.presentation.task_three.ThreeScreen
import com.example.myapplication.presentation.task_two.TwoScreen

sealed class NavigationRoute(val route: String){
    object TaskOne: NavigationRoute("task_one")
    object TaskTwo: NavigationRoute("task_two")
    object TaskThree: NavigationRoute("task_three")
    object TaskFour: NavigationRoute("task_four")
    object TaskFive: NavigationRoute("task_five")
}

@Composable
fun TasksNavHost(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavigationRoute.TaskOne.route
    ){
        composable(NavigationRoute.TaskOne.route){
            OneScreen(navController = navController)
        }
        composable(NavigationRoute.TaskTwo.route){
            TwoScreen(navController = navController)
        }
        composable(NavigationRoute.TaskThree.route){
            ThreeScreen(navController = navController)
        }
        composable(NavigationRoute.TaskFour.route){
            FourScreen(navController = navController)
        }
        composable(NavigationRoute.TaskFive.route){
            FiveScreen(navController = navController)
        }





    }



}