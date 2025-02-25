package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GlobeDollar: ImageVector
    get() {
        if (_GlobeDollar != null) {
            return _GlobeDollar!!
        }
        _GlobeDollar = ImageVector.Builder(
            name = "GlobeDollar",
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
                moveTo(21f, 14.5f)
                curveTo(20.5f, 14.376f, 19.685f, 14.371f, 19f, 14.376f)
                curveTo(18.771f, 14.377f, 18.909f, 14.368f, 18.6f, 14.376f)
                curveTo(17.793f, 14.401f, 17.002f, 14.737f, 17f, 15.688f)
                curveTo(16.998f, 16.7f, 18f, 17f, 19f, 17f)
                curveTo(20f, 17f, 21f, 17.231f, 21f, 18.313f)
                curveTo(21f, 19.125f, 20.192f, 19.481f, 19.186f, 19.599f)
                curveTo(18.386f, 19.599f, 18f, 19.625f, 17f, 19.5f)
                moveTo(19f, 20f)
                verticalLineTo(21f)
                moveTo(19f, 13f)
                verticalLineTo(14f)
                moveTo(3f, 12f)
                horizontalLineTo(14f)
                moveTo(3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                moveTo(3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                moveTo(12f, 21f)
                curveTo(12.338f, 21f, 12.672f, 20.981f, 13f, 20.945f)
                moveTo(12f, 21f)
                curveTo(4.756f, 13.08f, 8.982f, 5.7f, 12f, 3f)
                moveTo(12f, 3f)
                curveTo(15.919f, 3f, 19.252f, 5.504f, 20.488f, 9f)
                moveTo(12f, 3f)
                curveTo(13.34f, 4.199f, 14.918f, 6.319f, 15.625f, 9f)
            }
        }.build()

        return _GlobeDollar!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeDollar: ImageVector? = null
