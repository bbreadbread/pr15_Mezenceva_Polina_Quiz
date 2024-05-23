package com.example.pract_15_16

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pract_15_16.ui.theme.Pract_15_16Theme

class MainActivity : ComponentActivity() {
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextButton: Button
    private lateinit var backButton: Button
    private lateinit var questionTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
        nextButton=findViewById(R.id.next_button)
        backButton=findViewById(R.id.back_button)
        questionTextView= findViewById(R.id.question_text_view)

        trueButton.setOnClickListener{view: View ->}
        falseButton.setOnClickListener{view: View ->}
        val questionTextResId = questionBank[currentIndex].textResId
        questionTextView.setText(questionTextResId)

        super.onCreate(savedInstanceState)
        setContent {
            Pract_15_16Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
            /*setContentView(R.layout.activity_main)
            trueButton = findViewById(R.id.true_button)*/
        }
    }

    private  val questionBank = listOf(
        Question(R.string.qest1,false),
        Question(R.string.qest2,true),
        Question(R.string.qest3,false),
        Question(R.string.qest4,true),
        Question(R.string.qest5,false))
    private var currentIndex = 0;
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pract_15_16Theme {
        Greeting("Android")
    }
}