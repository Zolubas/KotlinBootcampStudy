package com.usp.jetpackcomposecrashcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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

//ctrl+shift+f5 -> build UI Screen
//Alt+shift+Enter -> Import lacking commands.
//use ctrl+p to see the options of a Composable

@Composable
fun Greeting(name: String) {
    Box( //<- is a Layout command. Equivalent to Frame Layout in XML
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(400.dp)
    ) {
        Text(
            text = "Hello $name!",
            color = Color.Blue,      //use ctrl+p to see the options (inside text)
            fontSize = 20.sp
        )
        Text(
            text = "Nice to meet you!",
            color = Color.Blue,      //use ctrl+p to see the options (inside text)
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.BottomEnd)
        )
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeCrashCourseTheme {
        Greeting("CITI-USP")
    }
}
