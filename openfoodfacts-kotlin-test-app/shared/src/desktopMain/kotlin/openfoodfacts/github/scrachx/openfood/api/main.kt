package openfoodfacts.github.scrachx.openfood.api

import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import openfoodfacts.github.scrachx.openfood.api.service.impl.OpenFoodFactsKtorClient

fun main() {
    application {
        Window(
            title = "Open Food Facts Kotlin Dev App",
            onCloseRequest = ::exitApplication,
        ) {
            val scope = rememberCoroutineScope()
            MainView(viewModel = MainViewModel(scope, OpenFoodFactsKtorClient()))
        }
    }
}
