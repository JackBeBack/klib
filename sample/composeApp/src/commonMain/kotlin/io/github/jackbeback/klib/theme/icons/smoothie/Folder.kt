package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Folder: ImageVector
    get() {
        if (_Folder != null) {
            return _Folder!!
        }
        _Folder = ImageVector.Builder(
            name = "Folder",
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
                moveTo(3f, 6.472f)
                curveTo(3f, 6.162f, 3.072f, 5.855f, 3.211f, 5.578f)
                lineTo(4f, 4f)
                horizontalLineTo(9f)
                lineTo(10f, 6f)
                horizontalLineTo(20f)
                curveTo(20.552f, 6f, 21f, 6.448f, 21f, 7f)
                verticalLineTo(9f)
                verticalLineTo(19f)
                curveTo(21f, 19.552f, 20.552f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(3.448f, 20f, 3f, 19.552f, 3f, 19f)
                verticalLineTo(9f)
                verticalLineTo(6.472f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 20f)
                horizontalLineTo(20f)
                curveTo(20.552f, 20f, 21f, 19.552f, 21f, 19f)
                verticalLineTo(11f)
                curveTo(21f, 9.895f, 20.105f, 9f, 19f, 9f)
                horizontalLineTo(5f)
                curveTo(3.895f, 9f, 3f, 9.895f, 3f, 11f)
                verticalLineTo(19f)
                curveTo(3f, 19.552f, 3.448f, 20f, 4f, 20f)
                close()
            }
        }.build()

        return _Folder!!
    }

@Suppress("ObjectPropertyName")
private var _Folder: ImageVector? = null
