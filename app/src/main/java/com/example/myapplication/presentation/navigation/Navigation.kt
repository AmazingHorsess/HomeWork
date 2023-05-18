package com.example.myapplication.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.presentation.MainScreen
import com.example.myapplication.presentation.lab5.task_four.LabFiveTaskFourScreen
import com.example.myapplication.presentation.lab5.task_one.LabFiveTaskOneScreen
import com.example.myapplication.presentation.lab5.task_three.LabFiveTaskThreeScreen

import com.example.myapplication.presentation.lab5.task_two.LabFiveTaskTwoScreen
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
    
    object LabThreeFour {
        object TaskOneLabThree : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB_3_4_TASK1)
        object TaskTwoLabThree : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB_3_4_TASK2)
        object TaskThreeLabThree : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB_3_4_TASK3)
        object TaskFourLabThree : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB_3_4_TASK4)
        object TaskFiveLabThree : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB_3_4_TASK5)
        object TaskSixLabThree : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB_3_4_TASK6)
    }
    object LabFive {
        object TaskOneLabFive : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB5_TASK1)
        object TaskTwoLabFive : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB5_TASK2)
        object TaskThreeLabFive : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB5_TASK3)
        object TaskFourLabFive : NavigationRoute(Constants.Screens.TaskScreens.TASK_LAB5_TASK4)


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
        composable(NavigationRoute.LabThreeFour.TaskOneLabThree.route){
            LabThreeFoureTaskOneScreen(navController = navController)
           
        }
        composable(NavigationRoute.LabThreeFour.TaskTwoLabThree.route){
            LabThreeFoureTaskTwoScreen(navController = navController)
           
        }
        composable(NavigationRoute.LabThreeFour.TaskThreeLabThree.route){
            LabThreeFoureTaskThreeScreen(navController = navController)

        }
        composable(NavigationRoute.LabThreeFour.TaskFourLabThree.route){
            LabThreeFoureTaskFourScreen(navController = navController)
        }
        composable(NavigationRoute.LabThreeFour.TaskFiveLabThree.route){
            LabThreeFoureTaskFiveScreen(navController = navController)
        }
        composable(NavigationRoute.LabThreeFour.TaskSixLabThree.route){
            LabThreeFoureTaskSixScreen(navController = navController)
        }
        //Lab Five
        composable(NavigationRoute.LabFive.TaskOneLabFive.route){
            LabFiveTaskOneScreen(navController = navController)
        }
        composable(NavigationRoute.LabFive.TaskTwoLabFive.route){
            LabFiveTaskTwoScreen(navController = navController)
        }
        composable(NavigationRoute.LabFive.TaskThreeLabFive.route){
            LabFiveTaskThreeScreen(navController = navController)
        }





        






    }



}