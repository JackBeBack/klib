package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HeadphonesAlt2: ImageVector
    get() {
        if (_HeadphonesAlt2 != null) {
            return _HeadphonesAlt2!!
        }
        _HeadphonesAlt2 = ImageVector.Builder(
            name = "HeadphonesAlt2",
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
                moveTo(3f, 11.3f)
                curveTo(3f, 6.329f, 7.029f, 2.3f, 12f, 2.3f)
                curveTo(16.971f, 2.3f, 21f, 6.329f, 21f, 11.3f)
                moveTo(3f, 11.3f)
                horizontalLineTo(5f)
                curveTo(6.105f, 11.3f, 7f, 12.196f, 7f, 13.3f)
                verticalLineTo(15.3f)
                curveTo(7f, 16.405f, 6.105f, 17.3f, 5f, 17.3f)
                moveTo(3f, 11.3f)
                verticalLineTo(16.3f)
                curveTo(3f, 16.852f, 3.448f, 17.3f, 4f, 17.3f)
                horizontalLineTo(5f)
                moveTo(21f, 11.3f)
                horizontalLineTo(19f)
                curveTo(17.895f, 11.3f, 17f, 12.196f, 17f, 13.3f)
                verticalLineTo(15.3f)
                curveTo(17f, 16.405f, 17.895f, 17.3f, 19f, 17.3f)
                horizontalLineTo(20f)
                curveTo(20.552f, 17.3f, 21f, 16.852f, 21f, 16.3f)
                verticalLineTo(11.3f)
                close()
                moveTo(5f, 17.3f)
                verticalLineTo(18.3f)
                curveTo(5f, 19.405f, 5.895f, 20.3f, 7f, 20.3f)
                horizontalLineTo(9f)
                moveTo(9f, 20.3f)
                curveTo(9f, 21.128f, 9.672f, 21.8f, 10.5f, 21.8f)
                horizontalLineTo(11.5f)
                curveTo(12.328f, 21.8f, 13f, 21.128f, 13f, 20.3f)
                curveTo(13f, 19.472f, 12.328f, 18.8f, 11.5f, 18.8f)
                horizontalLineTo(10.5f)
                curveTo(9.672f, 18.8f, 9f, 19.472f, 9f, 20.3f)
                close()
            }
        }.build()

        return _HeadphonesAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _HeadphonesAlt2: ImageVector? = null
