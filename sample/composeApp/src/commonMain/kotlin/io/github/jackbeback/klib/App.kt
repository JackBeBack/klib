package io.github.jackbeback.klib

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.jackbeback.klib.UI.GaugeDisplay
import io.github.jackbeback.klib.UI.searchbar.SearchBarSample
import io.github.jackbeback.klib.UI.avatar.AvatarSample
import io.github.jackbeback.klib.UI.badge.AppPillBadgeSample
import io.github.jackbeback.klib.UI.button.*
import io.github.jackbeback.klib.UI.chips.ChipSample
import io.github.jackbeback.klib.UI.inlineedit.InlineEditTextAreaSample
import io.github.jackbeback.klib.UI.inlineedit.InlineEditTextSample
import io.github.jackbeback.klib.UI.navigationbar.BottomNavigationBarSample
import io.github.jackbeback.klib.UI.sheet.BottomSheetSample
import io.github.jackbeback.klib.UI.snackbar.CustomSnackbarSample
import io.github.jackbeback.klib.UI.text.TextSample
import io.github.jackbeback.klib.UI.textfield.OutlinedTextFieldSample
import io.github.jackbeback.klib.UI.webview.WebviewSample
import io.github.jackbeback.klib.theme.AppTheme
import io.github.jackbeback.klib.theme.LocalThemeIsDark
import io.github.jackbeback.klib.theme.icons.Moon
import io.github.jackbeback.klib.theme.icons.Sun

@Composable
internal fun App() = AppTheme {
    var isDark by LocalThemeIsDark.current
    Box(modifier = Modifier.fillMaxSize()) {
        UICatalog()
        SmallFloatingActionButton(
            modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp),
            icon = if (isDark) Moon else Sun
        ) {
            isDark = !isDark
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
        Box(
            modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background),
            contentAlignment = Alignment.Center
        ) {

            currentSelection?.second?.invoke()
            SmallFloatingActionButton(
                modifier = Modifier.align(Alignment.BottomEnd).padding(end = 64.dp, bottom = 16.dp),
                icon = Icons.AutoMirrored.Default.ArrowBack,
            ) {
                currentSelection = null
            }
        }
    }
}


enum class UIComponents {
    GAUGE,
    TEXT,
    TEXTFIELD,
    SNACKBAR,
    BUTTONS,
    AVATAR,
    BADGE,
    CHIP,
    SEARCHBAR,
    INLINEEDIT,
    BOTTOMSHEET,
    WEBVIEW,
    BOTTOMNAVIGATION
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
    },
    UIComponents.BUTTONS to {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            FilledButtonSample()
            SampleIconButton()
            OutlinedButtonWithIconSample()
            SegmentedControlSample()
            ActionButtonsSample()
        }
    },
    UIComponents.AVATAR to {
        AvatarSample()
    },
    UIComponents.BADGE to {
        AppPillBadgeSample()
    },
    UIComponents.CHIP to {
        Column {
            AppPillBadgeSample()
            ChipSample()
        }
    },
    UIComponents.SEARCHBAR to {
        SearchBarSample()
    },
    UIComponents.INLINEEDIT to {
        Column {
            InlineEditTextSample()
            InlineEditTextAreaSample()
        }
    },
    UIComponents.BOTTOMSHEET to {
        BottomSheetSample()
    },
    UIComponents.WEBVIEW to {
        WebviewSample()
    },
    UIComponents.BOTTOMNAVIGATION to {
        BottomNavigationBarSample()
    }
)