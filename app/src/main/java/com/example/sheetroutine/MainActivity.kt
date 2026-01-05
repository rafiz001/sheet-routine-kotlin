package com.example.sheetroutine

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sheetroutine.ui.theme.SheetRoutineTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SheetRoutineTheme {
                Scaffold(

                    topBar = {
                        TopAppBar(title = {
                            Text("Rafiz")
                        },
                            navigationIcon = {
                                IconButton(onClick = {
                                    Toast.makeText(this, "This is Rafiz", Toast.LENGTH_SHORT).show()
                                }) {
                                    Icon(
                                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                        contentDescription = "Back"
                                    )
                                }
                            },
                            actions = {
                                IconButton(onClick = {

                                }) {
                                    Icon(
                                        imageVector = Icons.Filled.MoreVert,
                                        contentDescription = "More"
                                    )
                                }
                            }
                        )

                    },
                    ) { innerPadding ->

                    Greeting(
                        name = "Androiaaa",
                        modifier = Modifier.padding(top = innerPadding.calculateTopPadding(), bottom = 0.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val fiz = remember{
        List(100){index ->
            "Rafiz $index"
        }
    }
    LazyColumn(
        modifier = modifier
    ) {
        items(fiz.size){ index ->
            Text(
                text = "Hello ${fiz[index]} ",
                modifier = Modifier.padding(bottom = 10.dp, top = 10.dp)
            )
            HorizontalDivider()
        }
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SheetRoutineTheme {
        Greeting("Android")
    }
}