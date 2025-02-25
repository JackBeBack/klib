package io.github.jackbeback.klib.UI.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonElevation
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Contains the default values used by all button types in the project.
 */
object ButtonDefaults {

    // Default size for icons used in buttons
    val IconSize = 24.dp

    // Default size for buttons
    val ButtonSize = 40.dp

    // Default horizontal padding used for text buttons
    val TextHorizontalPadding = 5.dp

    /**
     * The default content padding used by filled and tonal buttons.
     * - See [TextButtonContentPadding] for content padding specifically for text buttons.
     */
    val ContentPadding = PaddingValues(horizontal = 24.dp)

    /** The default content padding used specifically by text buttons */
    val TextButtonContentPadding = PaddingValues(horizontal = 12.dp)

    // Default opacity for disabled buttons
    const val DisabledContainerOpacity = 0.12f

    // Default shape for small Floating Action Buttons (FAB)
    val FabSmallShape = RoundedCornerShape(12.dp)

    // Default shape for large Floating Action Buttons (FAB)
    val FabLargeShape = RoundedCornerShape(16.dp)

    // Default icon size for FABs
    val FabIconSize = 30.dp

}

fun Modifier.largeBtnSize() = this.then(wrapContentSize().height(40.dp))
fun Modifier.mediumBtnSize() = this.then(wrapContentSize().height(36.dp))
fun Modifier.smallBtnSize() = this.then(wrapContentSize().height(30.dp))

fun Modifier.smallFabSize() = this.then(size(40.dp))
fun Modifier.largeFabSize() = this.then(size(56.dp))