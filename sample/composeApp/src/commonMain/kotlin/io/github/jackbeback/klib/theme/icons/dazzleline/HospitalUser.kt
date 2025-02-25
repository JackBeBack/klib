package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HospitalUser: ImageVector
    get() {
        if (_HospitalUser != null) {
            return _HospitalUser!!
        }
        _HospitalUser = ImageVector.Builder(
            name = "HospitalUser",
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
                moveTo(14f, 8.5f)
                verticalLineTo(6.2f)
                curveTo(14f, 5.08f, 14f, 4.52f, 13.782f, 4.092f)
                curveTo(13.59f, 3.716f, 13.284f, 3.41f, 12.908f, 3.218f)
                curveTo(12.48f, 3f, 11.92f, 3f, 10.8f, 3f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 3f, 5.52f, 3f, 5.092f, 3.218f)
                curveTo(4.716f, 3.41f, 4.41f, 3.716f, 4.218f, 4.092f)
                curveTo(4f, 4.52f, 4f, 5.08f, 4f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(4f, 18.92f, 4f, 19.48f, 4.218f, 19.908f)
                curveTo(4.41f, 20.284f, 4.716f, 20.59f, 5.092f, 20.782f)
                curveTo(5.52f, 21f, 6.08f, 21f, 7.2f, 21f)
                horizontalLineTo(9.5f)
                moveTo(4f, 13f)
                horizontalLineTo(9f)
                moveTo(4f, 17f)
                horizontalLineTo(9f)
                moveTo(11f, 8f)
                lineTo(7f, 8f)
                moveTo(9f, 6f)
                verticalLineTo(10f)
                moveTo(18.2f, 13.5f)
                curveTo(18.2f, 14.328f, 17.528f, 15f, 16.7f, 15f)
                curveTo(15.872f, 15f, 15.2f, 14.328f, 15.2f, 13.5f)
                curveTo(15.2f, 12.672f, 15.872f, 12f, 16.7f, 12f)
                curveTo(17.528f, 12f, 18.2f, 12.672f, 18.2f, 13.5f)
                close()
                moveTo(20f, 21f)
                verticalLineTo(20.5f)
                curveTo(20f, 19.119f, 18.881f, 18f, 17.5f, 18f)
                horizontalLineTo(16f)
                curveTo(14.619f, 18f, 13.5f, 19.119f, 13.5f, 20.5f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _HospitalUser!!
    }

@Suppress("ObjectPropertyName")
private var _HospitalUser: ImageVector? = null
