package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MenorahAlt: ImageVector
    get() {
        if (_MenorahAlt != null) {
            return _MenorahAlt!!
        }
        _MenorahAlt = ImageVector.Builder(
            name = "MenorahAlt",
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
                moveTo(4f, 9f)
                verticalLineTo(13.8f)
                curveTo(4f, 14.92f, 4f, 15.48f, 4.218f, 15.908f)
                curveTo(4.41f, 16.284f, 4.716f, 16.59f, 5.092f, 16.782f)
                curveTo(5.52f, 17f, 6.08f, 17f, 7.2f, 17f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 17f, 18.48f, 17f, 18.908f, 16.782f)
                curveTo(19.284f, 16.59f, 19.59f, 16.284f, 19.782f, 15.908f)
                curveTo(20f, 15.48f, 20f, 14.92f, 20f, 13.8f)
                verticalLineTo(9f)
                moveTo(12f, 21f)
                verticalLineTo(7f)
                moveTo(16f, 17f)
                verticalLineTo(9f)
                moveTo(8f, 17f)
                verticalLineTo(9f)
                moveTo(20f, 6f)
                verticalLineTo(5f)
                moveTo(4f, 6f)
                verticalLineTo(5f)
                moveTo(12f, 4f)
                verticalLineTo(3f)
                moveTo(16f, 6f)
                verticalLineTo(5f)
                moveTo(8f, 6f)
                verticalLineTo(5f)
                moveTo(8f, 21f)
                horizontalLineTo(16f)
            }
        }.build()

        return _MenorahAlt!!
    }

@Suppress("ObjectPropertyName")
private var _MenorahAlt: ImageVector? = null
