package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GripDots: ImageVector
    get() {
        if (_GripDots != null) {
            return _GripDots!!
        }
        _GripDots = ImageVector.Builder(
            name = "GripDots",
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
                moveTo(6f, 15f)
                horizontalLineTo(6.01f)
                moveTo(6f, 9f)
                horizontalLineTo(6.01f)
                moveTo(12f, 9f)
                horizontalLineTo(12.01f)
                moveTo(18f, 9f)
                horizontalLineTo(18.01f)
                moveTo(18f, 15f)
                horizontalLineTo(18.01f)
                moveTo(12f, 15f)
                horizontalLineTo(12.01f)
                moveTo(7f, 9f)
                curveTo(7f, 9.552f, 6.552f, 10f, 6f, 10f)
                curveTo(5.448f, 10f, 5f, 9.552f, 5f, 9f)
                curveTo(5f, 8.448f, 5.448f, 8f, 6f, 8f)
                curveTo(6.552f, 8f, 7f, 8.448f, 7f, 9f)
                close()
                moveTo(7f, 15f)
                curveTo(7f, 15.552f, 6.552f, 16f, 6f, 16f)
                curveTo(5.448f, 16f, 5f, 15.552f, 5f, 15f)
                curveTo(5f, 14.448f, 5.448f, 14f, 6f, 14f)
                curveTo(6.552f, 14f, 7f, 14.448f, 7f, 15f)
                close()
                moveTo(13f, 9f)
                curveTo(13f, 9.552f, 12.552f, 10f, 12f, 10f)
                curveTo(11.448f, 10f, 11f, 9.552f, 11f, 9f)
                curveTo(11f, 8.448f, 11.448f, 8f, 12f, 8f)
                curveTo(12.552f, 8f, 13f, 8.448f, 13f, 9f)
                close()
                moveTo(13f, 15f)
                curveTo(13f, 15.552f, 12.552f, 16f, 12f, 16f)
                curveTo(11.448f, 16f, 11f, 15.552f, 11f, 15f)
                curveTo(11f, 14.448f, 11.448f, 14f, 12f, 14f)
                curveTo(12.552f, 14f, 13f, 14.448f, 13f, 15f)
                close()
                moveTo(19f, 9f)
                curveTo(19f, 9.552f, 18.552f, 10f, 18f, 10f)
                curveTo(17.448f, 10f, 17f, 9.552f, 17f, 9f)
                curveTo(17f, 8.448f, 17.448f, 8f, 18f, 8f)
                curveTo(18.552f, 8f, 19f, 8.448f, 19f, 9f)
                close()
                moveTo(19f, 15f)
                curveTo(19f, 15.552f, 18.552f, 16f, 18f, 16f)
                curveTo(17.448f, 16f, 17f, 15.552f, 17f, 15f)
                curveTo(17f, 14.448f, 17.448f, 14f, 18f, 14f)
                curveTo(18.552f, 14f, 19f, 14.448f, 19f, 15f)
                close()
            }
        }.build()

        return _GripDots!!
    }

@Suppress("ObjectPropertyName")
private var _GripDots: ImageVector? = null
