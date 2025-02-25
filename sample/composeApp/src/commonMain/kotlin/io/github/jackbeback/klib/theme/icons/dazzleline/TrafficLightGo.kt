package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TrafficLightGo: ImageVector
    get() {
        if (_TrafficLightGo != null) {
            return _TrafficLightGo!!
        }
        _TrafficLightGo = ImageVector.Builder(
            name = "TrafficLightGo",
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
                moveTo(12f, 16.5f)
                horizontalLineTo(12.01f)
                moveTo(12f, 21f)
                curveTo(9.239f, 21f, 7f, 18.761f, 7f, 16f)
                verticalLineTo(6.2f)
                curveTo(7f, 5.08f, 7f, 4.52f, 7.218f, 4.092f)
                curveTo(7.41f, 3.716f, 7.716f, 3.41f, 8.092f, 3.218f)
                curveTo(8.52f, 3f, 9.08f, 3f, 10.2f, 3f)
                horizontalLineTo(13.8f)
                curveTo(14.92f, 3f, 15.48f, 3f, 15.908f, 3.218f)
                curveTo(16.284f, 3.41f, 16.59f, 3.716f, 16.782f, 4.092f)
                curveTo(17f, 4.52f, 17f, 5.08f, 17f, 6.2f)
                verticalLineTo(16f)
                curveTo(17f, 18.761f, 14.761f, 21f, 12f, 21f)
                close()
                moveTo(12.5f, 6.5f)
                curveTo(12.5f, 6.776f, 12.276f, 7f, 12f, 7f)
                curveTo(11.724f, 7f, 11.5f, 6.776f, 11.5f, 6.5f)
                curveTo(11.5f, 6.224f, 11.724f, 6f, 12f, 6f)
                curveTo(12.276f, 6f, 12.5f, 6.224f, 12.5f, 6.5f)
                close()
                moveTo(12.5f, 11.5f)
                curveTo(12.5f, 11.776f, 12.276f, 12f, 12f, 12f)
                curveTo(11.724f, 12f, 11.5f, 11.776f, 11.5f, 11.5f)
                curveTo(11.5f, 11.224f, 11.724f, 11f, 12f, 11f)
                curveTo(12.276f, 11f, 12.5f, 11.224f, 12.5f, 11.5f)
                close()
                moveTo(12.5f, 16.5f)
                curveTo(12.5f, 16.776f, 12.276f, 17f, 12f, 17f)
                curveTo(11.724f, 17f, 11.5f, 16.776f, 11.5f, 16.5f)
                curveTo(11.5f, 16.224f, 11.724f, 16f, 12f, 16f)
                curveTo(12.276f, 16f, 12.5f, 16.224f, 12.5f, 16.5f)
                close()
            }
        }.build()

        return _TrafficLightGo!!
    }

@Suppress("ObjectPropertyName")
private var _TrafficLightGo: ImageVector? = null
