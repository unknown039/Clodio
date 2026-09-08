package app.clodio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import app.clodio.screens.Home
import app.clodio.screens.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    val appController = rememberNavController()

    NavHost(
        navController = appController,
        startDestination = Routes.HOME
    ) {
        composable(Routes.HOME) {
            Home()
        }
    }
}