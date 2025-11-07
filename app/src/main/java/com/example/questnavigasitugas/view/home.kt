package com.example.questnavigasitugas.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigasitugas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun home(
    modifier: Modifier = Modifier,
    OnToFormBtnClick : () -> Unit){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF000000))
    ){
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(top = 200.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        )