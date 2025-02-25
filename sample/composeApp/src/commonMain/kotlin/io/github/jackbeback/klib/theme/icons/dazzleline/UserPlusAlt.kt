package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserPlusAlt: ImageVector
    get() {
        if (_UserPlusAlt != null) {
            return _UserPlusAlt!!
        }
        _UserPlusAlt = ImageVector.Builder(
            name = "UserPlusAlt",
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
                moveTo(20f, 18f)
                lineTo(14f, 18f)
                moveTo(17f, 15f)
                verticalLineTo(21f)
                moveTo(7.682f, 14f)
                curveTo(8.632f, 14.632f, 9.773f, 15f, 11f, 15f)
                curveTo(11.701f, 15f, 12.374f, 14.88f, 13f, 14.659f)
                moveTo(10.5f, 21f)
                horizontalLineTo(5.6f)
                curveTo(5.04f, 21f, 4.76f, 21f, 4.546f, 20.891f)
                curveTo(4.358f, 20.795f, 4.205f, 20.642f, 4.109f, 20.454f)
                curveTo(4f, 20.24f, 4f, 19.96f, 4f, 19.4f)
                verticalLineTo(17f)
                curveTo(4f, 15.343f, 5.343f, 14f, 7f, 14f)
                horizontalLineTo(7.5f)
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserPlusAlt!!
    }

@Suppress("ObjectPropertyName")
private var _UserPlusAlt: ImageVector? = null
