package com.example.composeintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeintro.ui.theme.ComposeIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeIntroTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = MaterialTheme.colors.primary) {
        Text(text = "Hello $name!",Modifier.padding(24.dp))
    }
}

@Composable
private fun MyApp(){
    Surface(color = MaterialTheme.colors.background){
        Greeting("Compose")
    }

}

@Preview(showBackground = true, name = "Text Preview")
@Composable
fun DefaultPreview() {
    ComposeIntroTheme {
        MyApp()
    }
}