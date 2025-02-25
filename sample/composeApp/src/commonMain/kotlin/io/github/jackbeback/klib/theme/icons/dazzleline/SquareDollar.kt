package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SquareDollar: ImageVector
    get() {
        if (_SquareDollar != null) {
            return _SquareDollar!!
        }
        _SquareDollar = ImageVector.Builder(
            name = "SquareDollar",
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
                moveTo(15f, 10f)
                verticalLineTo(9.917f)
                curveTo(15f, 8.858f, 14.142f, 8f, 13.083f, 8f)
                horizontalLineTo(11f)
                curveTo(9.895f, 8f, 9f, 8.895f, 9f, 10f)
                curveTo(9f, 11.105f, 9.895f, 12f, 11f, 12f)
                horizontalLineTo(13f)
                curveTo(14.105f, 12f, 15f, 12.895f, 15f, 14f)
                curveTo(15f, 15.105f, 14.105f, 16f, 13f, 16f)
                horizontalLineTo(10.958f)
                curveTo(9.877f, 16f, 9f, 15.123f, 9f, 14.042f)
                verticalLineTo(14f)
                moveTo(12f, 17.5f)
                verticalLineTo(6.5f)
                moveTo(7.2f, 20f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 20f, 18.48f, 20f, 18.908f, 19.782f)
                curveTo(19.284f, 19.59f, 19.59f, 19.284f, 19.782f, 18.908f)
                curveTo(20f, 18.48f, 20f, 17.92f, 20f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(20f, 6.08f, 20f, 5.52f, 19.782f, 5.092f)
                curveTo(19.59f, 4.716f, 19.284f, 4.41f, 18.908f, 4.218f)
                curveTo(18.48f, 4f, 17.92f, 4f, 16.8f, 4f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 4f, 5.52f, 4f, 5.092f, 4.218f)
                curveTo(4.716f, 4.41f, 4.41f, 4.716f, 4.218f, 5.092f)
                curveTo(4f, 5.52f, 4f, 6.08f, 4f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(4f, 17.92f, 4f, 18.48f, 4.218f, 18.908f)
                curveTo(4.41f, 19.284f, 4.716f, 19.59f, 5.092f, 19.782f)
                curveTo(5.52f, 20f, 6.08f, 20f, 7.2f, 20f)
                close()
            }
        }.build()

        return _SquareDollar!!
    }

@Suppress("ObjectPropertyName")
private var _SquareDollar: ImageVector? = null
