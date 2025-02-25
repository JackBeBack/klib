package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Truck: ImageVector
    get() {
        if (_Truck != null) {
            return _Truck!!
        }
        _Truck = ImageVector.Builder(
            name = "Truck",
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
                moveTo(18.5f, 18f)
                curveTo(18.5f, 19.105f, 17.605f, 20f, 16.5f, 20f)
                curveTo(15.395f, 20f, 14.5f, 19.105f, 14.5f, 18f)
                moveTo(18.5f, 18f)
                curveTo(18.5f, 16.895f, 17.605f, 16f, 16.5f, 16f)
                curveTo(15.395f, 16f, 14.5f, 16.895f, 14.5f, 18f)
                moveTo(18.5f, 18f)
                horizontalLineTo(21.5f)
                moveTo(14.5f, 18f)
                horizontalLineTo(13.5f)
                moveTo(8.5f, 18f)
                curveTo(8.5f, 19.105f, 7.605f, 20f, 6.5f, 20f)
                curveTo(5.395f, 20f, 4.5f, 19.105f, 4.5f, 18f)
                moveTo(8.5f, 18f)
                curveTo(8.5f, 16.895f, 7.605f, 16f, 6.5f, 16f)
                curveTo(5.395f, 16f, 4.5f, 16.895f, 4.5f, 18f)
                moveTo(8.5f, 18f)
                horizontalLineTo(13.5f)
                moveTo(4.5f, 18f)
                curveTo(3.395f, 18f, 2.5f, 17.105f, 2.5f, 16f)
                verticalLineTo(7.2f)
                curveTo(2.5f, 6.08f, 2.5f, 5.52f, 2.718f, 5.092f)
                curveTo(2.91f, 4.716f, 3.216f, 4.41f, 3.592f, 4.218f)
                curveTo(4.02f, 4f, 4.58f, 4f, 5.7f, 4f)
                horizontalLineTo(10.3f)
                curveTo(11.42f, 4f, 11.98f, 4f, 12.408f, 4.218f)
                curveTo(12.784f, 4.41f, 13.09f, 4.716f, 13.282f, 5.092f)
                curveTo(13.5f, 5.52f, 13.5f, 6.08f, 13.5f, 7.2f)
                verticalLineTo(18f)
                moveTo(13.5f, 18f)
                verticalLineTo(8f)
                horizontalLineTo(17.5f)
                lineTo(20.5f, 12f)
                moveTo(20.5f, 12f)
                verticalLineTo(18f)
                moveTo(20.5f, 12f)
                horizontalLineTo(13.5f)
            }
        }.build()

        return _Truck!!
    }

@Suppress("ObjectPropertyName")
private var _Truck: ImageVector? = null
