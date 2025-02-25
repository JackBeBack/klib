package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Hurricane: ImageVector
    get() {
        if (_Hurricane != null) {
            return _Hurricane!!
        }
        _Hurricane = ImageVector.Builder(
            name = "Hurricane",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(18f, 16.374f)
                curveTo(16.123f, 16.779f, 14.104f, 17f, 12f, 17f)
                curveTo(9.896f, 17f, 7.877f, 16.779f, 6f, 16.374f)
                moveTo(16f, 20.667f)
                curveTo(14.71f, 20.885f, 13.372f, 21f, 12f, 21f)
                curveTo(10.628f, 21f, 9.29f, 20.885f, 8f, 20.667f)
                moveTo(19f, 12.064f)
                curveTo(16.941f, 12.659f, 14.55f, 13f, 12f, 13f)
                curveTo(9.45f, 13f, 7.059f, 12.659f, 5f, 12.064f)
                moveTo(21f, 6f)
                curveTo(21f, 7.657f, 16.971f, 9f, 12f, 9f)
                curveTo(7.029f, 9f, 3f, 7.657f, 3f, 6f)
                curveTo(3f, 4.343f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 4.343f, 21f, 6f)
                close()
            }
        }.build()

        return _Hurricane!!
    }

@Suppress("ObjectPropertyName")
private var _Hurricane: ImageVector? = null
