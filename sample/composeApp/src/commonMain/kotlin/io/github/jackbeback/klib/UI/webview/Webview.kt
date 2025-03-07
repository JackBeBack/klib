package io.github.jackbeback.klib.UI.webview

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.mohamedrejeb.calf.ui.web.WebView
import com.mohamedrejeb.calf.ui.web.rememberWebViewState

@Composable
fun WebviewSample() {
    val state = rememberWebViewState(
        url = "https://github.com/JackBeBack"
    )

    LaunchedEffect(state.isLoading) {
        // Get the current loading state
    }

    WebView(
        state = state,
        modifier = Modifier
            .fillMaxSize()
    )
}