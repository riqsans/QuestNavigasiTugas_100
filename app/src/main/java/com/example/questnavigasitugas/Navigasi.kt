package com.example.questnavigasitugas

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigasitugas.view.FormulirPendaftaran
import com.example.questnavigasitugas.view.TampilData
import com.example.questnavigasitugas.view.home

enum class Navigasi{
    Formulirku,
    Detail,
    Home
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){
    Scaffold { isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Home.name,
            modifier = Modifier.padding(isiRuang))
        {

            composable(route = Navigasi.Home.name){
                home(
                    OnToFormBtnClick = {
                        navController.navigate(Navigasi.Formulirku.name)
                    }
                )
            }
            composable(route = Navigasi.Formulirku.name){
                FormulirPendaftaran(
                    onSubmitButtonClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name) {
                TampilData(
                    onToFormBtnClick = {
                        navController.popBackStack()
                    },
                    onToHomeBtnClick = {
                        navController.navigate(Navigasi.Home.name) {
                            popUpTo(Navigasi.Home.name) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                    }
                )
            }

        }
    }
}
