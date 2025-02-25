package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BluetoothSignal: ImageVector
    get() {
        if (_BluetoothSignal != null) {
            return _BluetoothSignal!!
        }
        _BluetoothSignal = ImageVector.Builder(
            name = "BluetoothSignal",
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
                moveTo(19.528f, 6.5f)
                curveTo(20.464f, 8.118f, 21f, 9.996f, 21f, 12f)
                curveTo(21f, 14.004f, 20.464f, 15.882f, 19.528f, 17.5f)
                moveTo(16.326f, 9f)
                curveTo(16.758f, 9.909f, 17f, 10.926f, 17f, 12f)
                curveTo(17f, 13.074f, 16.758f, 14.091f, 16.326f, 15f)
                moveTo(3f, 17f)
                lineTo(8f, 12f)
                moveTo(8f, 12f)
                lineTo(13f, 7f)
                lineTo(8f, 2f)
                verticalLineTo(12f)
                close()
                moveTo(8f, 12f)
                verticalLineTo(22f)
                lineTo(13f, 17f)
                lineTo(8f, 12f)
                close()
                moveTo(8f, 12f)
                lineTo(3f, 7f)
            }
        }.build()

        return _BluetoothSignal!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothSignal: ImageVector? = null
