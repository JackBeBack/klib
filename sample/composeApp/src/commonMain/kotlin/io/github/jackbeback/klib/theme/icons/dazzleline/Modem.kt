package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Modem: ImageVector
    get() {
        if (_Modem != null) {
            return _Modem!!
        }
        _Modem = ImageVector.Builder(
            name = "Modem",
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
                moveTo(12f, 15f)
                verticalLineTo(9f)
                moveTo(7.416f, 11f)
                curveTo(7.148f, 10.388f, 7f, 9.712f, 7f, 9f)
                curveTo(7f, 7.875f, 7.372f, 6.836f, 8f, 6f)
                moveTo(16.584f, 11f)
                curveTo(16.852f, 10.388f, 17f, 9.712f, 17f, 9f)
                curveTo(17f, 7.875f, 16.628f, 6.836f, 16f, 6f)
                moveTo(18.708f, 3f)
                curveTo(20.133f, 4.592f, 21f, 6.695f, 21f, 9f)
                curveTo(21f, 9.687f, 20.923f, 10.357f, 20.777f, 11f)
                moveTo(5.292f, 3f)
                curveTo(3.867f, 4.592f, 3f, 6.695f, 3f, 9f)
                curveTo(3f, 9.687f, 3.077f, 10.357f, 3.223f, 11f)
                moveTo(6f, 18f)
                horizontalLineTo(6.01f)
                moveTo(9f, 18f)
                horizontalLineTo(9.01f)
                moveTo(12f, 18f)
                horizontalLineTo(12.01f)
                moveTo(18f, 15f)
                curveTo(18.932f, 15f, 19.398f, 15f, 19.765f, 15.152f)
                curveTo(20.255f, 15.355f, 20.645f, 15.745f, 20.848f, 16.235f)
                curveTo(21f, 16.602f, 21f, 17.068f, 21f, 18f)
                curveTo(21f, 18.932f, 21f, 19.398f, 20.848f, 19.765f)
                curveTo(20.645f, 20.255f, 20.255f, 20.645f, 19.765f, 20.848f)
                curveTo(19.398f, 21f, 18.932f, 21f, 18f, 21f)
                horizontalLineTo(6f)
                curveTo(5.068f, 21f, 4.602f, 21f, 4.235f, 20.848f)
                curveTo(3.745f, 20.645f, 3.355f, 20.255f, 3.152f, 19.765f)
                curveTo(3f, 19.398f, 3f, 18.932f, 3f, 18f)
                curveTo(3f, 17.068f, 3f, 16.602f, 3.152f, 16.235f)
                curveTo(3.355f, 15.745f, 3.745f, 15.355f, 4.235f, 15.152f)
                curveTo(4.599f, 15.002f, 5.059f, 15f, 5.973f, 15f)
                curveTo(9.982f, 15f, 13.991f, 15f, 18f, 15f)
                close()
            }
        }.build()

        return _Modem!!
    }

@Suppress("ObjectPropertyName")
private var _Modem: ImageVector? = null
