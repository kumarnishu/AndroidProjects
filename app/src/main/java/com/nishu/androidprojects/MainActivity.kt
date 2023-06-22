package com.nishu.androidprojects

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard("Nishu kumar")
        }
    }
}

@Composable
fun MessageCard(name:String){
    Text(text="Hello $name")
}


@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard("Nishu kumarr")
}
