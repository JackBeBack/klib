package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudUpArrow: ImageVector
    get() {
        if (_CloudUpArrow != null) {
            return _CloudUpArrow!!
        }
        _CloudUpArrow = ImageVector.Builder(
            name = "CloudUpArrow",
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
                moveTo(12f, 21f)
                verticalLineTo(11f)
                moveTo(12f, 11f)
                lineTo(9f, 14f)
                moveTo(12f, 11f)
                lineTo(15f, 14f)
                moveTo(7f, 16.818f)
                curveTo(4.696f, 16.207f, 3f, 14.125f, 3f, 11.649f)
                curveTo(3f, 9.2f, 4.8f, 6.938f, 7.5f, 6.5f)
                curveTo(8.347f, 4.486f, 10.351f, 3f, 12.689f, 3f)
                curveTo(15.684f, 3f, 18.132f, 5.323f, 18.3f, 8.25f)
                curveTo(19.889f, 8.945f, 21f, 10.65f, 21f, 12.497f)
                curveTo(21f, 14.815f, 19.25f, 16.724f, 17f, 16.972f)
            }
        }.build()

        return _CloudUpArrow!!
    }

@Suppress("ObjectPropertyName")
private var _CloudUpArrow: ImageVector? = null
