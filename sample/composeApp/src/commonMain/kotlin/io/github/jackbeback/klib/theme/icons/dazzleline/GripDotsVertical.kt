package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GripDotsVertical: ImageVector
    get() {
        if (_GripDotsVertical != null) {
            return _GripDotsVertical!!
        }
        _GripDotsVertical = ImageVector.Builder(
            name = "GripDotsVertical",
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
                moveTo(9f, 6f)
                horizontalLineTo(9.01f)
                moveTo(15f, 6f)
                horizontalLineTo(15.01f)
                moveTo(15f, 12f)
                horizontalLineTo(15.01f)
                moveTo(9f, 12f)
                horizontalLineTo(9.01f)
                moveTo(9f, 18f)
                horizontalLineTo(9.01f)
                moveTo(15f, 18f)
                horizontalLineTo(15.01f)
                moveTo(10f, 6f)
                curveTo(10f, 6.552f, 9.552f, 7f, 9f, 7f)
                curveTo(8.448f, 7f, 8f, 6.552f, 8f, 6f)
                curveTo(8f, 5.448f, 8.448f, 5f, 9f, 5f)
                curveTo(9.552f, 5f, 10f, 5.448f, 10f, 6f)
                close()
                moveTo(16f, 6f)
                curveTo(16f, 6.552f, 15.552f, 7f, 15f, 7f)
                curveTo(14.448f, 7f, 14f, 6.552f, 14f, 6f)
                curveTo(14f, 5.448f, 14.448f, 5f, 15f, 5f)
                curveTo(15.552f, 5f, 16f, 5.448f, 16f, 6f)
                close()
                moveTo(10f, 12f)
                curveTo(10f, 12.552f, 9.552f, 13f, 9f, 13f)
                curveTo(8.448f, 13f, 8f, 12.552f, 8f, 12f)
                curveTo(8f, 11.448f, 8.448f, 11f, 9f, 11f)
                curveTo(9.552f, 11f, 10f, 11.448f, 10f, 12f)
                close()
                moveTo(16f, 12f)
                curveTo(16f, 12.552f, 15.552f, 13f, 15f, 13f)
                curveTo(14.448f, 13f, 14f, 12.552f, 14f, 12f)
                curveTo(14f, 11.448f, 14.448f, 11f, 15f, 11f)
                curveTo(15.552f, 11f, 16f, 11.448f, 16f, 12f)
                close()
                moveTo(10f, 18f)
                curveTo(10f, 18.552f, 9.552f, 19f, 9f, 19f)
                curveTo(8.448f, 19f, 8f, 18.552f, 8f, 18f)
                curveTo(8f, 17.448f, 8.448f, 17f, 9f, 17f)
                curveTo(9.552f, 17f, 10f, 17.448f, 10f, 18f)
                close()
                moveTo(16f, 18f)
                curveTo(16f, 18.552f, 15.552f, 19f, 15f, 19f)
                curveTo(14.448f, 19f, 14f, 18.552f, 14f, 18f)
                curveTo(14f, 17.448f, 14.448f, 17f, 15f, 17f)
                curveTo(15.552f, 17f, 16f, 17.448f, 16f, 18f)
                close()
            }
        }.build()

        return _GripDotsVertical!!
    }

@Suppress("ObjectPropertyName")
private var _GripDotsVertical: ImageVector? = null
