package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DocumentLayoutCenter: ImageVector
    get() {
        if (_DocumentLayoutCenter != null) {
            return _DocumentLayoutCenter!!
        }
        _DocumentLayoutCenter = ImageVector.Builder(
            name = "DocumentLayoutCenter",
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
                moveTo(5f, 7f)
                horizontalLineTo(3f)
                moveTo(5f, 11f)
                horizontalLineTo(3f)
                moveTo(20f, 15f)
                horizontalLineTo(3f)
                moveTo(15f, 19f)
                horizontalLineTo(3f)
                moveTo(21f, 7f)
                horizontalLineTo(19f)
                moveTo(21f, 11f)
                horizontalLineTo(19f)
                moveTo(10.6f, 11f)
                horizontalLineTo(13.4f)
                curveTo(13.96f, 11f, 14.24f, 11f, 14.454f, 10.891f)
                curveTo(14.642f, 10.795f, 14.795f, 10.642f, 14.891f, 10.454f)
                curveTo(15f, 10.24f, 15f, 9.96f, 15f, 9.4f)
                verticalLineTo(6.6f)
                curveTo(15f, 6.04f, 15f, 5.76f, 14.891f, 5.546f)
                curveTo(14.795f, 5.358f, 14.642f, 5.205f, 14.454f, 5.109f)
                curveTo(14.24f, 5f, 13.96f, 5f, 13.4f, 5f)
                horizontalLineTo(10.6f)
                curveTo(10.04f, 5f, 9.76f, 5f, 9.546f, 5.109f)
                curveTo(9.358f, 5.205f, 9.205f, 5.358f, 9.109f, 5.546f)
                curveTo(9f, 5.76f, 9f, 6.04f, 9f, 6.6f)
                verticalLineTo(9.4f)
                curveTo(9f, 9.96f, 9f, 10.24f, 9.109f, 10.454f)
                curveTo(9.205f, 10.642f, 9.358f, 10.795f, 9.546f, 10.891f)
                curveTo(9.76f, 11f, 10.04f, 11f, 10.6f, 11f)
                close()
            }
        }.build()

        return _DocumentLayoutCenter!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentLayoutCenter: ImageVector? = null
