package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.KnifeKitchen: ImageVector
    get() {
        if (_KnifeKitchen != null) {
            return _KnifeKitchen!!
        }
        _KnifeKitchen = ImageVector.Builder(
            name = "KnifeKitchen",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.724f, 11.275f)
                lineTo(16f, 12.5f)
                lineTo(10.013f, 17.822f)
                curveTo(8.051f, 19.566f, 5.605f, 20.674f, 3f, 21f)
                lineTo(3.794f, 19.544f)
                curveTo(4.62f, 18.03f, 5.032f, 17.274f, 5.507f, 16.558f)
                curveTo(5.928f, 15.922f, 6.385f, 15.311f, 6.876f, 14.728f)
                curveTo(7.428f, 14.071f, 8.038f, 13.462f, 9.256f, 12.243f)
                lineTo(12f, 9.498f)
                moveTo(11.5f, 8.998f)
                lineTo(17.45f, 3.05f)
                curveTo(18.07f, 2.43f, 19.028f, 2.302f, 19.789f, 2.737f)
                curveTo(20.903f, 3.373f, 21.106f, 4.894f, 20.2f, 5.8f)
                lineTo(19.841f, 6.158f)
                curveTo(19.623f, 6.377f, 19.326f, 6.5f, 19.017f, 6.5f)
                horizontalLineTo(18f)
                lineTo(16f, 8.5f)
                verticalLineTo(8.674f)
                curveTo(16f, 9.164f, 16f, 9.408f, 15.945f, 9.638f)
                curveTo(15.896f, 9.842f, 15.815f, 10.038f, 15.705f, 10.217f)
                curveTo(15.582f, 10.418f, 15.409f, 10.591f, 15.063f, 10.937f)
                lineTo(14.25f, 11.75f)
                lineTo(11.5f, 8.998f)
                close()
            }
        }.build()

        return _KnifeKitchen!!
    }

@Suppress("ObjectPropertyName")
private var _KnifeKitchen: ImageVector? = null
