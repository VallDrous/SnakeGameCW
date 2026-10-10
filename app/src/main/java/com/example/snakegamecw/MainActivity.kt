package com.example.snakegamecw

import View.GamePageForm
import View.MainForm
import View.ProfileForm
import View.SettingForm
import View.ShopForm
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.snakegamecw.ui.theme.SnakeGameCWTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var navController = rememberNavController()

            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                NavHost(navController = navController, startDestination = "main"){
                    composable("main") {
                        BackHandler(enabled = true) {
                        }
                        Column(
                            modifier = Modifier.padding(innerPadding).background(Color(0xFF151B16)).fillMaxSize()
                        ) {
                            MainForm(navController)
                        }
                    }
                    composable("setting"){
                        BackHandler(enabled = true) {
                        }
                        Column(
                            modifier = Modifier.padding(innerPadding).background(Color(0xFF151B16)).fillMaxSize()
                        ) {
                            SettingForm(navController)
                        }
                    }
                    composable("profile"){
                        BackHandler(enabled = true) {
                        }
                        Column(
                            modifier = Modifier.padding(innerPadding).background(Color(0xFF151B16)).fillMaxSize()
                        ) {
                            ProfileForm(navController)
                        }
                    }
                    composable("shop"){
                        BackHandler(enabled = true) {
                        }
                        Column(
                            modifier = Modifier.padding(innerPadding).background(Color(0xFF151B16)).fillMaxSize()
                        ) {
                            ShopForm(navController)
                        }
                    }
                    composable("game"){
                        BackHandler(enabled = true) {
                        }
                        Column(
                            modifier = Modifier.padding(innerPadding).background(Color(0xFF151B16)).fillMaxSize()
                        ) {
                            GamePageForm()
                        }
                    }
                }

            }
        }
    }
}
