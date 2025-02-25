package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BluetoothOn: ImageVector
    get() {
        if (_BluetoothOn != null) {
            return _BluetoothOn!!
        }
        _BluetoothOn = ImageVector.Builder(
            name = "BluetoothOn",
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
                moveTo(7f, 17f)
                lineTo(17f, 7f)
                lineTo(12f, 2f)
                verticalLineTo(22f)
                lineTo(17f, 17f)
                lineTo(7f, 7f)
            }
        }.build()

        return _BluetoothOn!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothOn: ImageVector? = null
