package es.israeldelamo.openwebinar1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import es.israeldelamo.openwebinar1.ui.theme.OpenWebinar1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        // crear una instancia
        super.onCreate(savedInstanceState)
        //asociarl el xml
        setContentView(R.layout.activity_main)

    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OpenWebinar1Theme {
    }
}