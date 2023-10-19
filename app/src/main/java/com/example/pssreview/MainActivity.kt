package com.example.pssreview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pssreview.ui.theme.PssReviewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PssReviewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}



@Composable
fun NumberGuessingGame() {
    var minRange by remember { mutableStateOf(-50) }
    var maxRange by remember { mutableStateOf(50) }
    var sliderValue by remember { mutableStateOf((minRange + maxRange) / 2) }
    var targetValue by remember { mutableStateOf((minRange + maxRange) / 2) }

    var score by remember { mutableStateOf(0) }
    var message by remember { mutableStateOf("Score: ") }

    Column {
        Text("Number Guessing Game", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text("Guessing the number between $minRange and $maxRange", fontSize = 16.sp)
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }
}

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        NumberGuessingGame()
    }
