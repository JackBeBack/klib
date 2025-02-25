package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Refresh: ImageVector
    get() {
        if (_Refresh != null) {
            return _Refresh!!
        }
        _Refresh = ImageVector.Builder(
            name = "Refresh",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.369f, 13.583f)
                curveTo(21.414f, 13.31f, 21.231f, 13.053f, 20.958f, 13.007f)
                curveTo(20.686f, 12.961f, 20.428f, 13.145f, 20.382f, 13.417f)
                lineTo(21.369f, 13.583f)
                close()
                moveTo(12f, 20.5f)
                curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
                horizontalLineTo(2.5f)
                curveTo(2.5f, 17.247f, 6.753f, 21.5f, 12f, 21.5f)
                verticalLineTo(20.5f)
                close()
                moveTo(3.5f, 12f)
                curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
                verticalLineTo(2.5f)
                curveTo(6.753f, 2.5f, 2.5f, 6.753f, 2.5f, 12f)
                horizontalLineTo(3.5f)
                close()
                moveTo(12f, 3.5f)
                curveTo(15.337f, 3.5f, 18.225f, 5.423f, 19.617f, 8.223f)
                lineTo(20.512f, 7.777f)
                curveTo(18.958f, 4.651f, 15.731f, 2.5f, 12f, 2.5f)
                verticalLineTo(3.5f)
                close()
                moveTo(20.382f, 13.417f)
                curveTo(19.708f, 17.437f, 16.211f, 20.5f, 12f, 20.5f)
                verticalLineTo(21.5f)
                curveTo(16.708f, 21.5f, 20.615f, 18.076f, 21.369f, 13.583f)
                lineTo(20.382f, 13.417f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.472f, 2.422f)
                verticalLineTo(8.078f)
                horizontalLineTo(14.815f)
            }
        }.build()

        return _Refresh!!
    }

@Suppress("ObjectPropertyName")
private var _Refresh: ImageVector? = null
