package com.example.recepiceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.material3.Surface

import com.example.recepiceapp.ui.theme.RecepiceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecepiceAppTheme {
                Surface {
                    RecipeScreen()

                }
            }
        }
    }
}

