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


