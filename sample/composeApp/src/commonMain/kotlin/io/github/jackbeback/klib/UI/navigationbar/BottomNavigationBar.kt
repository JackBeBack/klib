package io.github.jackbeback.klib.UI.navigationbar

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.jackbeback.klib.UI.button.IconButton
import io.github.jackbeback.klib.UI.text.dpToPx
import io.github.jackbeback.klib.theme.icons.dazzleline.*

data class BottomNavigationProperties(
    val edgePadding: Dp = 48.dp,
    val elevation: Float = 10f,
    val height: Dp = 75.dp,
    val options: List<Pair<ImageVector, String>>
)

@Composable
fun getDefaultsBottomNavigationProperties(): BottomNavigationProperties {
    return BottomNavigationProperties(
        options = listOf(
            DazzleLine.CubeAlt to "Cube",
            DazzleLine.Cloud to "Cloud",
            DazzleLine.Fingerprint to "Fingerprint",
            DazzleLine.CakeChristmas to "Cakeeeeeeeee",
        )
    )
}

@Composable
fun BottomNavigationBar(properties: BottomNavigationProperties = getDefaultsBottomNavigationProperties()) {
    var selectedOption: Int by remember { mutableStateOf(0) }
    val buttonSize = 64.dp

    Card(modifier = Modifier.padding(2.dp), shape = RoundedCornerShape(25.dp, 25.dp, 0.dp, 0.dp)) {
        BoxWithConstraints (modifier = Modifier.fillMaxWidth().height(properties.height).background(MaterialTheme.colorScheme.surface)) {
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(start = properties.edgePadding, end = properties.edgePadding),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                properties.options.forEachIndexed { index, option ->
                    IconButton(
                        icon = option.first,
                        text = option.second,
                        iconSize = buttonSize*0.7f,
                        containerSize = buttonSize,
                        iconColor = if (selectedOption == properties.options.indexOf(option)) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onBackground,
                        textColor = MaterialTheme.colorScheme.primary,
                        onClick = { selectedOption = index }
                    )
                }
            }

            val barLength = this.maxWidth.dpToPx() / properties.options.size
            val width = this.maxWidth.dpToPx() - (properties.edgePadding.dpToPx()+buttonSize.dpToPx()/2)*2
            val gap = width / (properties.options.size-1)

            val x by animateFloatAsState(properties.edgePadding.dpToPx()+selectedOption*gap)

            Canvas(modifier = Modifier.fillMaxWidth().height(4.dp).align(Alignment.BottomCenter), onDraw = {
                drawLine(Color.Green, Offset(x, 0f), Offset(x + buttonSize.toPx(), 0F), strokeWidth = 8f, cap = StrokeCap.Round)
            })
        }
    }
}


@Composable
fun BottomNavigationBarSample() {
    BottomNavigationBar()
}