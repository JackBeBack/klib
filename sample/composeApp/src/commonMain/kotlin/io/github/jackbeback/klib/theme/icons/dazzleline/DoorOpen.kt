package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DoorOpen: ImageVector
    get() {
        if (_DoorOpen != null) {
            return _DoorOpen!!
        }
        _DoorOpen = ImageVector.Builder(
            name = "DoorOpen",
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
                moveTo(3f, 21f)
                lineTo(14f, 21f)
                verticalLineTo(5.989f)
                curveTo(14f, 4.625f, 14f, 3.943f, 13.719f, 3.47f)
                curveTo(13.472f, 3.056f, 13.084f, 2.745f, 12.626f, 2.594f)
                curveTo(12.103f, 2.422f, 11.437f, 2.57f, 10.106f, 2.865f)
                lineTo(7.506f, 3.443f)
                curveTo(6.612f, 3.642f, 6.165f, 3.741f, 5.831f, 3.982f)
                curveTo(5.537f, 4.194f, 5.305f, 4.482f, 5.162f, 4.815f)
                curveTo(5f, 5.193f, 5f, 5.651f, 5f, 6.567f)
                verticalLineTo(21f)
                moveTo(13.994f, 5f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 5f, 17.48f, 5f, 17.908f, 5.218f)
                curveTo(18.284f, 5.41f, 18.59f, 5.716f, 18.782f, 6.092f)
                curveTo(19f, 6.52f, 19f, 7.08f, 19f, 8.2f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                moveTo(11f, 12f)
                horizontalLineTo(11.01f)
            }
        }.build()

        return _DoorOpen!!
    }

@Suppress("ObjectPropertyName")
private var _DoorOpen: ImageVector? = null
