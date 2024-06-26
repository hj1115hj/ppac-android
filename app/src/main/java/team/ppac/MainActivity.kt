package team.ppac

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import team.ppac.designsystem.FarmemeTheme
import team.ppac.designsystem.component.scaffold.FarmemeScaffold
import team.ppac.navigation.FarmemeNavHost
import team.ppac.navigation.component.FarmemeBottomBar
import team.ppac.navigation.navigateToTopLevelDestination

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            FarmemeTheme {
                val navController = rememberNavController()
                FarmemeScaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        FarmemeBottomBar(
                            navigateToDestination = { navController.navigateToTopLevelDestination(it) },
                            currentDestination = navController.currentBackStackEntryAsState().value?.destination
                        )
                    }
                ) {
                    FarmemeNavHost(
                        navController = navController,
                        onShowSnackBar = { _, _ -> false }
                    )
                }
            }
        }
    }
}