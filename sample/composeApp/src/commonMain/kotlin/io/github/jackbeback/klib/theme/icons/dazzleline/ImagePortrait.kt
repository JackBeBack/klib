package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ImagePortrait: ImageVector
    get() {
        if (_ImagePortrait != null) {
            return _ImagePortrait!!
        }
        _ImagePortrait = ImageVector.Builder(
            name = "ImagePortrait",
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
                moveTo(15f, 15.5f)
                curveTo(14.716f, 14.359f, 13.481f, 13.5f, 12f, 13.5f)
                curveTo(10.519f, 13.5f, 9.284f, 14.359f, 9f, 15.5f)
                moveTo(12f, 9.5f)
                horizontalLineTo(12.01f)
                moveTo(13f, 9.5f)
                curveTo(13f, 10.052f, 12.552f, 10.5f, 12f, 10.5f)
                curveTo(11.448f, 10.5f, 11f, 10.052f, 11f, 9.5f)
                curveTo(11f, 8.948f, 11.448f, 8.5f, 12f, 8.5f)
                curveTo(12.552f, 8.5f, 13f, 8.948f, 13f, 9.5f)
                close()
                moveTo(7f, 21f)
                horizontalLineTo(17f)
                curveTo(18.105f, 21f, 19f, 20.105f, 19f, 19f)
                verticalLineTo(5f)
                curveTo(19f, 3.895f, 18.105f, 3f, 17f, 3f)
                horizontalLineTo(7f)
                curveTo(5.895f, 3f, 5f, 3.895f, 5f, 5f)
                verticalLineTo(19f)
                curveTo(5f, 20.105f, 5.895f, 21f, 7f, 21f)
                close()
            }
        }.build()

        return _ImagePortrait!!
    }

@Suppress("ObjectPropertyName")
private var _ImagePortrait: ImageVector? = null
