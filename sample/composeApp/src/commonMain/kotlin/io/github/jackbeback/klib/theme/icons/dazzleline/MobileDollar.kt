package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MobileDollar: ImageVector
    get() {
        if (_MobileDollar != null) {
            return _MobileDollar!!
        }
        _MobileDollar = ImageVector.Builder(
            name = "MobileDollar",
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
                moveTo(17f, 15f)
                verticalLineTo(17.8f)
                curveTo(17f, 18.92f, 17f, 19.48f, 16.782f, 19.908f)
                curveTo(16.59f, 20.284f, 16.284f, 20.59f, 15.908f, 20.782f)
                curveTo(15.48f, 21f, 14.92f, 21f, 13.8f, 21f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 21f, 6.52f, 21f, 6.092f, 20.782f)
                curveTo(5.716f, 20.59f, 5.41f, 20.284f, 5.218f, 19.908f)
                curveTo(5f, 19.48f, 5f, 18.92f, 5f, 17.8f)
                verticalLineTo(5.571f)
                curveTo(5f, 5.04f, 5f, 4.775f, 5.05f, 4.555f)
                curveTo(5.221f, 3.806f, 5.806f, 3.221f, 6.555f, 3.05f)
                curveTo(6.775f, 3f, 7.04f, 3f, 7.571f, 3f)
                horizontalLineTo(11f)
                moveTo(10f, 18f)
                horizontalLineTo(12f)
                moveTo(19f, 4.5f)
                curveTo(18.5f, 4.376f, 17.685f, 4.371f, 17f, 4.376f)
                moveTo(17f, 4.376f)
                curveTo(16.771f, 4.378f, 16.909f, 4.368f, 16.6f, 4.376f)
                curveTo(15.793f, 4.401f, 15.002f, 4.737f, 15f, 5.688f)
                curveTo(14.998f, 6.7f, 16f, 7f, 17f, 7f)
                curveTo(18f, 7f, 19f, 7.231f, 19f, 8.313f)
                curveTo(19f, 9.125f, 18.192f, 9.481f, 17.186f, 9.599f)
                curveTo(16.386f, 9.599f, 16f, 9.625f, 15f, 9.5f)
                moveTo(17f, 4.376f)
                lineTo(17f, 3f)
                moveTo(17f, 9.599f)
                verticalLineTo(11f)
            }
        }.build()

        return _MobileDollar!!
    }

@Suppress("ObjectPropertyName")
private var _MobileDollar: ImageVector? = null
