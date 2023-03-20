package com.usp.jetpackcomposecrashcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.usp.jetpackcomposecrashcourse.ui.theme.JetpackComposeCrashCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCrashCourseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        color = Color.Blue,      //use ctrl+p to see the options (inside text)
        fontSize = 20.sp,
        modifier = Modifier
                //First Example
            //.background(Color.Red)
            //.padding(16.dp)
            //.background(Color.Green)
                //Explanation
                    //This modifiers are sequential. First we define a red background.
                    //After that, we define a "padding", i.e., a margin with width=16 dp. And
                    //then we define other background with color equals green that fill the
                    //original space of the rede background but not the padding space because the
                    //padding command is expanding the red area and not the green one.
                //Secound Example
                    //Build a screen with blue letters with inner white rectangle followed by yellow one,
            //followed by green and with a blue outer rectangle.
            .background(Color.Blue)
            .padding(35.dp)
            .background(Color.Green)
            .padding(25.dp)
            .background(Color.Yellow)
            .padding(15.dp)
            .background(Color.White)
            .padding(7.dp)
    )

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeCrashCourseTheme {
        Greeting("CITI-USP")
    }
}
