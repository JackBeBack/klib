package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LaptopDollar: ImageVector
    get() {
        if (_LaptopDollar != null) {
            return _LaptopDollar!!
        }
        _LaptopDollar = ImageVector.Builder(
            name = "LaptopDollar",
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
                moveTo(21f, 4.5f)
                curveTo(20.5f, 4.376f, 19.685f, 4.371f, 19f, 4.376f)
                curveTo(18.771f, 4.377f, 18.909f, 4.368f, 18.6f, 4.376f)
                curveTo(17.793f, 4.401f, 17.002f, 4.737f, 17f, 5.687f)
                curveTo(16.998f, 6.7f, 18f, 7f, 19f, 7f)
                curveTo(20f, 7f, 21f, 7.231f, 21f, 8.312f)
                curveTo(21f, 9.125f, 20.192f, 9.481f, 19.186f, 9.599f)
                curveTo(18.386f, 9.599f, 18f, 9.625f, 17f, 9.5f)
                moveTo(19f, 10f)
                verticalLineTo(11f)
                moveTo(19f, 3f)
                verticalLineTo(4f)
                moveTo(13f, 3f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 3f, 5.52f, 3f, 5.092f, 3.218f)
                curveTo(4.716f, 3.41f, 4.41f, 3.716f, 4.218f, 4.092f)
                curveTo(4f, 4.52f, 4f, 5.08f, 4f, 6.2f)
                verticalLineTo(11.8f)
                curveTo(4f, 12.92f, 4f, 13.48f, 4.218f, 13.908f)
                curveTo(4.41f, 14.284f, 4.716f, 14.59f, 5.092f, 14.782f)
                curveTo(5.52f, 15f, 6.08f, 15f, 7.2f, 15f)
                horizontalLineTo(20f)
                moveTo(10f, 18f)
                horizontalLineTo(14f)
                moveTo(4.589f, 21f)
                horizontalLineTo(19.411f)
                curveTo(20.268f, 21f, 20.697f, 21f, 20.955f, 20.819f)
                curveTo(21.181f, 20.662f, 21.331f, 20.418f, 21.371f, 20.146f)
                curveTo(21.417f, 19.834f, 21.226f, 19.451f, 20.842f, 18.684f)
                lineTo(20.327f, 17.653f)
                curveTo(19.845f, 16.69f, 19.604f, 16.209f, 19.245f, 15.857f)
                curveTo(18.927f, 15.546f, 18.545f, 15.309f, 18.124f, 15.164f)
                curveTo(17.649f, 15f, 17.11f, 15f, 16.034f, 15f)
                horizontalLineTo(7.967f)
                curveTo(6.89f, 15f, 6.351f, 15f, 5.876f, 15.164f)
                curveTo(5.456f, 15.309f, 5.073f, 15.546f, 4.755f, 15.857f)
                curveTo(4.396f, 16.209f, 4.155f, 16.69f, 3.673f, 17.653f)
                lineTo(3.158f, 18.684f)
                curveTo(2.774f, 19.451f, 2.583f, 19.834f, 2.629f, 20.146f)
                curveTo(2.669f, 20.418f, 2.82f, 20.662f, 3.045f, 20.819f)
                curveTo(3.303f, 21f, 3.732f, 21f, 4.589f, 21f)
                close()
            }
        }.build()

        return _LaptopDollar!!
    }

@Suppress("ObjectPropertyName")
private var _LaptopDollar: ImageVector? = null
