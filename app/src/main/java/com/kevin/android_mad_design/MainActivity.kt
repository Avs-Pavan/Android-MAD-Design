package com.kevin.android_mad_design

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview


// Inherit ComponentActivity to support compose UI in the activity
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        // Set the content view using the ComposeView for full screen
//        setContent {
//            MaterialTheme{
//                Greeting("Android")
//            }
//        }

        // Set the content view to the ComposeView used in parts of screen
        findViewById<ComposeView>(R.id.compose_view).setContent {
            MaterialTheme{
                Greeting("Compose")
            }
        }

    }
}


// Composable function to display a greeting
@Composable
fun Greeting(name: String) {
    Text(
        modifier = Modifier
            .fillMaxSize(),
        text = "Hello $name!",
        color = Color.Red,
        style = MaterialTheme.typography.h3
    )
}



// Preview function to show the composable preview
@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Greeting("Android")
    }
}