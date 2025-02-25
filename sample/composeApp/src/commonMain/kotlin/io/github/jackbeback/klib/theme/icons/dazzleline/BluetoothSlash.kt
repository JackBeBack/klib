package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BluetoothSlash: ImageVector
    get() {
        if (_BluetoothSlash != null) {
            return _BluetoothSlash!!
        }
        _BluetoothSlash = ImageVector.Builder(
            name = "BluetoothSlash",
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
                lineTo(12f, 12f)
                moveTo(17f, 17f)
                lineTo(12f, 22f)
                verticalLineTo(12f)
                moveTo(3f, 3f)
                lineTo(12f, 12f)
                moveTo(21f, 21f)
                lineTo(12f, 12f)
                moveTo(14.825f, 9.175f)
                lineTo(17f, 7f)
                lineTo(12f, 2f)
                verticalLineTo(6.35f)
            }
        }.build()

        return _BluetoothSlash!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothSlash: ImageVector? = null
