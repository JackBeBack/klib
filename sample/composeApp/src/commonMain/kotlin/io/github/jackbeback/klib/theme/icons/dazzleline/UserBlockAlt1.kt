package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserBlockAlt1: ImageVector
    get() {
        if (_UserBlockAlt1 != null) {
            return _UserBlockAlt1!!
        }
        _UserBlockAlt1 = ImageVector.Builder(
            name = "UserBlockAlt1",
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
                moveTo(14.809f, 19.705f)
                lineTo(19.127f, 16.347f)
                moveTo(4f, 21f)
                curveTo(4f, 17.134f, 7.134f, 14f, 11f, 14f)
                moveTo(20f, 18f)
                curveTo(20f, 19.657f, 18.657f, 21f, 17f, 21f)
                curveTo(15.343f, 21f, 14f, 19.657f, 14f, 18f)
                curveTo(14f, 16.343f, 15.343f, 15f, 17f, 15f)
                curveTo(18.657f, 15f, 20f, 16.343f, 20f, 18f)
                close()
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserBlockAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _UserBlockAlt1: ImageVector? = null
