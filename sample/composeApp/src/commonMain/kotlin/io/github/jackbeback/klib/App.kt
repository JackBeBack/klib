package io.github.jackbeback.klib

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.jackbeback.klib.UI.GaugeDisplay
import io.github.jackbeback.klib.UI.sample.ToggleSwitch
import io.github.jackbeback.klib.UI.snackbar.CustomSnackbarSample
import io.github.jackbeback.klib.UI.text.TextSample
import io.github.jackbeback.klib.UI.textfield.OutlinedTextFieldSample
import io.github.jackbeback.klib.Utility.log
import io.github.jackbeback.klib.theme.AppTheme
import io.github.jackbeback.klib.theme.LocalThemeIsDark

@Composable
internal fun App() = AppTheme {
    var isDark by LocalThemeIsDark.current
    Box(modifier = Modifier.fillMaxSize()) {
        UICatalog()
        Button(onClick = {
            isDark = !isDark
            log.i("Theme is now -> isDark = $isDark")
        }, modifier = Modifier.align(Alignment.BottomEnd)) {
            Text("isDark = $isDark")
        }
    }
}

@Composable
fun UICatalog() {
    var currentSelection by remember { mutableStateOf<Pair<UIComponents, @Composable () -> Unit>?>(null) }

    if (currentSelection == null) {
        LazyColumn(horizontalAlignment = Alignment.CenterHorizontally) {
            Catalog.forEach { (key, value) ->
                item {
                    Text(
                        text = key.name,
                        modifier = Modifier.fillMaxWidth().clickable { currentSelection = key to value }.padding(16.dp),
                        style = MaterialTheme.typography.titleMedium
                    )
                }
            }
        }
    } else {
        Box(modifier = Modifier.fillMaxSize().background(Color.White), contentAlignment = Alignment.Center) {

            currentSelection?.second?.invoke()
            Button(onClick = { currentSelection = null }, modifier = Modifier.align(Alignment.TopStart)) {
                Text("Back")
            }
        }
    }
}


enum class UIComponents {
    GAUGE,
    TEXT,
    TEXTFIELD,
    SNACKBAR
}

val Catalog: Map<UIComponents, @Composable () -> Unit> = mapOf(
    UIComponents.GAUGE to {
        var value by remember { mutableStateOf(0f) }
        GaugeDisplay(value = value)
        Button(onClick = { value = (value + 10) % 100 }) {
            Text("Increase")
        }
    },
    UIComponents.TEXT to {
        TextSample()
    },
    UIComponents.TEXTFIELD to {
        OutlinedTextFieldSample()
    },
    UIComponents.SNACKBAR to {
        CustomSnackbarSample()
    }
)