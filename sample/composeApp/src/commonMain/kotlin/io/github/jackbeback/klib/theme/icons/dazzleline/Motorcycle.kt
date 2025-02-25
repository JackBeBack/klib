package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Motorcycle: ImageVector
    get() {
        if (_Motorcycle != null) {
            return _Motorcycle!!
        }
        _Motorcycle = ImageVector.Builder(
            name = "Motorcycle",
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
                moveTo(16.747f, 10.239f)
                curveTo(14.009f, 11.004f, 12f, 13.518f, 12f, 16.5f)
                curveTo(12f, 12.91f, 9.09f, 10f, 5.5f, 10f)
                horizontalLineTo(2f)
                moveTo(5.5f, 16.5f)
                horizontalLineTo(5.51f)
                moveTo(18.5f, 16.5f)
                lineTo(15f, 4f)
                horizontalLineTo(13f)
                moveTo(15.563f, 6f)
                horizontalLineTo(19f)
                moveTo(19f, 5f)
                verticalLineTo(7f)
                moveTo(15.5f, 6f)
                lineTo(9f, 11f)
                moveTo(22f, 16.5f)
                curveTo(22f, 18.433f, 20.433f, 20f, 18.5f, 20f)
                curveTo(16.567f, 20f, 15f, 18.433f, 15f, 16.5f)
                curveTo(15f, 14.567f, 16.567f, 13f, 18.5f, 13f)
                curveTo(20.433f, 13f, 22f, 14.567f, 22f, 16.5f)
                close()
                moveTo(9f, 16.5f)
                curveTo(9f, 18.433f, 7.433f, 20f, 5.5f, 20f)
                curveTo(3.567f, 20f, 2f, 18.433f, 2f, 16.5f)
                curveTo(2f, 14.567f, 3.567f, 13f, 5.5f, 13f)
                curveTo(7.433f, 13f, 9f, 14.567f, 9f, 16.5f)
                close()
                moveTo(6f, 16.5f)
                curveTo(6f, 16.776f, 5.776f, 17f, 5.5f, 17f)
                curveTo(5.224f, 17f, 5f, 16.776f, 5f, 16.5f)
                curveTo(5f, 16.224f, 5.224f, 16f, 5.5f, 16f)
                curveTo(5.776f, 16f, 6f, 16.224f, 6f, 16.5f)
                close()
            }
        }.build()

        return _Motorcycle!!
    }

@Suppress("ObjectPropertyName")
private var _Motorcycle: ImageVector? = null
