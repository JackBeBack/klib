package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.AddEllipse: ImageVector
    get() {
        if (_AddEllipse != null) {
            return _AddEllipse!!
        }
        _AddEllipse = ImageVector.Builder(
            name = "AddEllipse",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 8f)
                curveTo(11f, 7.448f, 11.448f, 7f, 12f, 7f)
                curveTo(12.552f, 7f, 13f, 7.448f, 13f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                curveTo(16.552f, 11f, 17f, 11.448f, 17f, 12f)
                curveTo(17f, 12.552f, 16.552f, 13f, 16f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                curveTo(13f, 16.552f, 12.552f, 17f, 12f, 17f)
                curveTo(11.448f, 17f, 11f, 16.552f, 11f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                curveTo(7.448f, 13f, 7f, 12.552f, 7f, 12f)
                curveTo(7f, 11.448f, 7.448f, 11f, 8f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 12f)
                curveTo(23f, 18.075f, 18.075f, 23f, 12f, 23f)
                curveTo(5.925f, 23f, 1f, 18.075f, 1f, 12f)
                curveTo(1f, 5.925f, 5.925f, 1f, 12f, 1f)
                curveTo(18.075f, 1f, 23f, 5.925f, 23f, 12f)
                close()
                moveTo(3.007f, 12f)
                curveTo(3.007f, 16.967f, 7.033f, 20.993f, 12f, 20.993f)
                curveTo(16.967f, 20.993f, 20.993f, 16.967f, 20.993f, 12f)
                curveTo(20.993f, 7.033f, 16.967f, 3.007f, 12f, 3.007f)
                curveTo(7.033f, 3.007f, 3.007f, 7.033f, 3.007f, 12f)
                close()
            }
        }.build()

        return _AddEllipse!!
    }

@Suppress("ObjectPropertyName")
private var _AddEllipse: ImageVector? = null
