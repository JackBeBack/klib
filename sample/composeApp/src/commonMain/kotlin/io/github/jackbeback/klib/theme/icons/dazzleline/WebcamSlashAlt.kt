package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WebcamSlashAlt: ImageVector
    get() {
        if (_WebcamSlashAlt != null) {
            return _WebcamSlashAlt!!
        }
        _WebcamSlashAlt = ImageVector.Builder(
            name = "WebcamSlashAlt",
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
                moveTo(8.5f, 3.936f)
                curveTo(9.53f, 3.341f, 10.725f, 3f, 12f, 3f)
                curveTo(15.866f, 3f, 19f, 6.134f, 19f, 10f)
                curveTo(19f, 11.231f, 18.683f, 12.387f, 18.125f, 13.392f)
                moveTo(6f, 6.392f)
                curveTo(5.365f, 7.446f, 5f, 8.68f, 5f, 10f)
                curveTo(5f, 13.866f, 8.134f, 17f, 12f, 17f)
                curveTo(13.32f, 17f, 14.554f, 16.635f, 15.608f, 16f)
                moveTo(11.5f, 7.041f)
                curveTo(11.663f, 7.014f, 11.83f, 7f, 12f, 7f)
                curveTo(13.657f, 7f, 15f, 8.343f, 15f, 10f)
                curveTo(15f, 10.17f, 14.986f, 10.337f, 14.958f, 10.5f)
                moveTo(7f, 21f)
                horizontalLineTo(12f)
                moveTo(12f, 21f)
                horizontalLineTo(17f)
                moveTo(12f, 21f)
                verticalLineTo(18f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
            }
        }.build()

        return _WebcamSlashAlt!!
    }

@Suppress("ObjectPropertyName")
private var _WebcamSlashAlt: ImageVector? = null
