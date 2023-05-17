package com.example.myapplication.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.presentation.MainScreen
import com.example.myapplication.presentation.lab_2.task_five.LabTwoTaskFiveScreen
import com.example.myapplication.presentation.lab_2.task_four.LabTwoTaskFourScreen
import com.example.myapplication.presentation.lab_2.task_one.LabTwoTaskOneScreen
import com.example.myapplication.presentation.lab_2.task_three.LabTwoTaskThreeScreen
import com.example.myapplication.presentation.lab_2.task_two.LabTwoTaskTwoScreen
import com.example.myapplication.presentation.lab_3_4.task_five.LabThreeFoureTaskFiveScreen
import com.example.myapplication.presentation.lab_3_4.task_four.LabThreeFoureTaskFourScreen
import com.example.myapplication.presentation.lab_3_4.task_one.LabThreeFoureTaskOneScreen
import com.example.myapplication.presentation.lab_3_4.task_six.LabThreeFoureTaskSixScreen
import com.example.myapplication.presentation.lab_3_4.task_three.LabThreeFoureTaskThreeScreen
import com.example.myapplication.presentation.lab_3_4.task_two.LabThreeFoureTaskTwoScreen
import com.example.myapplication.util.Constants

sealed class NavigationRoute(val route: String){
    object Main: NavigationRoute(Constants.Screens.MAIN)
    object LabTwo {
        object TaskOneLabTwo : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB2_TASK1)
        object TaskTwoLabTwo : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB2_TASK2)
        object TaskThreeLabTwo : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB2_TASK3)
        object TaskFourLabTwo : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB2_TASK4)
        object TaskFiveLabTwo : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB2_TASK5)
    }
    
    object LabThree {
        object TaskOneLabThree : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB_3_4_TASK1)
        object TaskTwoLabThree : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB_3_4_TASK2)
        object TaskThreeLabThree : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB_3_4_TASK3)
        object TaskFourLabThree : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB_3_4_TASK4)
        object TaskFiveLabThree : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB_3_4_TASK5)
        object TaskSixLabThree : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB_3_4_TASK6)
    }
}

@Composable
fun TasksNavHost(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavigationRoute.Main.route
    ){
        composable(NavigationRoute.Main.route){
            MainScreen(navController = navController)
        }
        //Lab Two
        composable(NavigationRoute.LabTwo.TaskOneLabTwo.route){
            LabTwoTaskOneScreen(navController = navController)
        }
        composable(NavigationRoute.LabTwo.TaskTwoLabTwo.route){
            LabTwoTaskTwoScreen(navController = navController)
        }
        composable(NavigationRoute.LabTwo.TaskThreeLabTwo.route){
            LabTwoTaskThreeScreen(navController = navController)
        }
        composable(NavigationRoute.LabTwo.TaskFourLabTwo.route){
            LabTwoTaskFourScreen(navController = navController)
        }
        composable(NavigationRoute.LabTwo.TaskFiveLabTwo.route){
            LabTwoTaskFiveScreen(navController = navController)
        }
        //Lab Three-Four
        composable(NavigationRoute.LabThree.TaskOneLabThree.route){
            LabThreeFoureTaskOneScreen(navController = navController)
           
        }
        composable(NavigationRoute.LabThree.TaskTwoLabThree.route){
            LabThreeFoureTaskTwoScreen(navController = navController)
           
        }
        composable(NavigationRoute.LabThree.TaskThreeLabThree.route){
            LabThreeFoureTaskThreeScreen(navController = navController)

        }
        composable(NavigationRoute.LabThree.TaskFourLabThree.route){
            LabThreeFoureTaskFourScreen(navController = navController)
        }
        composable(NavigationRoute.LabThree.TaskFiveLabThree.route){
            LabThreeFoureTaskFiveScreen(navController = navController)
        }
        composable(NavigationRoute.LabThree.TaskSixLabThree.route){
            LabThreeFoureTaskSixScreen(navController = navController)
        }
        






    }



}