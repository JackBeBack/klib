package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Bat: ImageVector
    get() {
        if (_Bat != null) {
            return _Bat!!
        }
        _Bat = ImageVector.Builder(
            name = "Bat",
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
                moveTo(22.001f, 12f)
                curveTo(22.001f, 8.715f, 20.417f, 5.8f, 17.971f, 3.977f)
                curveTo(17.991f, 4.148f, 18f, 4.323f, 18f, 4.5f)
                curveTo(18f, 6.816f, 16.25f, 8.724f, 14f, 8.973f)
                verticalLineTo(5f)
                lineTo(13f, 7f)
                horizontalLineTo(11f)
                lineTo(10f, 5f)
                verticalLineTo(8.973f)
                curveTo(7.75f, 8.724f, 6f, 6.816f, 6f, 4.5f)
                curveTo(6f, 4.323f, 6.01f, 4.148f, 6.03f, 3.977f)
                curveTo(3.584f, 5.8f, 2f, 8.715f, 2f, 12f)
                curveTo(2f, 13.178f, 2.204f, 14.308f, 2.578f, 15.358f)
                curveTo(3.001f, 15.13f, 3.486f, 15f, 4f, 15f)
                curveTo(5.58f, 15f, 6.875f, 16.222f, 6.992f, 17.772f)
                curveTo(7.524f, 17.292f, 8.228f, 17f, 9.001f, 17f)
                curveTo(10.658f, 17f, 12.001f, 18.343f, 12.001f, 20f)
                curveTo(12.001f, 18.343f, 13.343f, 17f, 15f, 17f)
                curveTo(15.773f, 17f, 16.477f, 17.292f, 17.009f, 17.772f)
                curveTo(17.125f, 16.222f, 18.421f, 15f, 20.001f, 15f)
                curveTo(20.516f, 15f, 21f, 15.13f, 21.423f, 15.358f)
                curveTo(21.797f, 14.308f, 22.001f, 13.178f, 22.001f, 12f)
                close()
            }
        }.build()

        return _Bat!!
    }

@Suppress("ObjectPropertyName")
private var _Bat: ImageVector? = null
