package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Pause: ImageVector
    get() {
        if (_Pause != null) {
            return _Pause!!
        }
        _Pause = ImageVector.Builder(
            name = "Pause",
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
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 18f)
                horizontalLineTo(9.5f)
                curveTo(10.052f, 18f, 10.5f, 17.552f, 10.5f, 17f)
                verticalLineTo(7f)
                curveTo(10.5f, 6.448f, 10.052f, 6f, 9.5f, 6f)
                horizontalLineTo(8.5f)
                curveTo(7.948f, 6f, 7.5f, 6.448f, 7.5f, 7f)
                verticalLineTo(17f)
                curveTo(7.5f, 17.552f, 7.948f, 18f, 8.5f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 18f)
                horizontalLineTo(15.5f)
                curveTo(16.052f, 18f, 16.5f, 17.552f, 16.5f, 17f)
                verticalLineTo(7f)
                curveTo(16.5f, 6.448f, 16.052f, 6f, 15.5f, 6f)
                horizontalLineTo(14.5f)
                curveTo(13.948f, 6f, 13.5f, 6.448f, 13.5f, 7f)
                verticalLineTo(17f)
                curveTo(13.5f, 17.552f, 13.948f, 18f, 14.5f, 18f)
                close()
            }
        }.build()

        return _Pause!!
    }

@Suppress("ObjectPropertyName")
private var _Pause: ImageVector? = null
