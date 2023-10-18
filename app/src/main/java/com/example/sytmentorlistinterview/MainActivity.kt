package com.example.sytmentorlistinterview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sytmentorlistinterview.ui.theme.SYTMentorlistInterviewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SYTMentorlistInterviewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //app entry comes here
                    Column(
                        verticalArrangement = Arrangement.Center
                    ){
                        Text(
                            text = "Upcoming Trips"
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            CardComponent(text = "Dates & Dinner")
                            CardComponent(text = "Beach & Sand")
                        }
                    }
                }
            }
        }
    }
}



@Composable
fun CardComponent(
    modifier: Modifier = Modifier,
    text: String
) {


        Card(
            modifier = Modifier
                .height(250.dp)
                .width(150.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(100, 70, 69)
            )
        ) {
            Column(
                modifier =  Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = text,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(20.dp),
                    maxLines = 1,
                    fontSize = 14.sp
                )
            }

        }

}


@Preview(showBackground = true)
@Composable
fun CardComponent() {
    SYTMentorlistInterviewTheme{
        CardComponent(text = "Sample Text")
    }
}