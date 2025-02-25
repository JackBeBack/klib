package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WebcamAlt: ImageVector
    get() {
        if (_WebcamAlt != null) {
            return _WebcamAlt!!
        }
        _WebcamAlt = ImageVector.Builder(
            name = "WebcamAlt",
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
                moveTo(12f, 17f)
                curveTo(15.866f, 17f, 19f, 13.866f, 19f, 10f)
                curveTo(19f, 6.134f, 15.866f, 3f, 12f, 3f)
                curveTo(8.134f, 3f, 5f, 6.134f, 5f, 10f)
                curveTo(5f, 13.866f, 8.134f, 17f, 12f, 17f)
                close()
                moveTo(12f, 17f)
                verticalLineTo(21f)
                moveTo(7f, 21f)
                horizontalLineTo(12f)
                moveTo(12f, 21f)
                horizontalLineTo(17f)
                moveTo(15f, 10f)
                curveTo(15f, 11.657f, 13.657f, 13f, 12f, 13f)
                curveTo(10.343f, 13f, 9f, 11.657f, 9f, 10f)
                curveTo(9f, 8.343f, 10.343f, 7f, 12f, 7f)
                curveTo(13.657f, 7f, 15f, 8.343f, 15f, 10f)
                close()
            }
        }.build()

        return _WebcamAlt!!
    }

@Suppress("ObjectPropertyName")
private var _WebcamAlt: ImageVector? = null
