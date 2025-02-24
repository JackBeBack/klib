package io.github.jackbeback.klib

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import io.github.jackbeback.klib.UI.Gauge
import io.github.jackbeback.klib.UI.GaugeDisplay
import io.github.jackbeback.klib.UI.text.AppTextSample
import io.github.jackbeback.klib.composeapp.generated.resources.*
import io.github.jackbeback.klib.theme.AppTheme
import io.github.jackbeback.klib.theme.LocalThemeIsDark
import kotlinx.coroutines.isActive
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.resources.vectorResource

@Composable
internal fun App() = AppTheme {
    UICatalog()
}

@Composable
fun UICatalog(){
    var currentSelection by remember { mutableStateOf<Pair<UIComponents, @Composable () -> Unit>?>(null) }

    if (currentSelection == null){
        LazyColumn(horizontalAlignment = Alignment.CenterHorizontally) {
            Catalog.forEach { (key, value) ->
                item {
                    Text(
                        text = key.name,
                        modifier = Modifier.fillMaxWidth().clickable { currentSelection = key to value }.padding(16.dp),
                        style = MaterialTheme.typography.titleMedium)
                }
            }
        }
    }else{
        Box(modifier = Modifier.fillMaxSize().background(Color.White), contentAlignment = Alignment.Center){

            currentSelection?.second?.invoke()
            Button(onClick = { currentSelection = null }, modifier = Modifier.align(Alignment.TopStart)) {
                Text("Back")
            }
        }
    }
}


enum class UIComponents{
    GAUGE,
    TEXT
}

val Catalog: Map<UIComponents, @Composable () -> Unit> = mapOf(
    UIComponents.GAUGE to {
        var value by remember{ mutableStateOf(0f) }
        GaugeDisplay(value = value)
        Button(onClick = {value = (value + 10) % 100}){
            Text("Increase")
        }
    },
    UIComponents.TEXT to {
        AppTextSample()
    }
)