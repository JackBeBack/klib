package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GamingPadAlt1: ImageVector
    get() {
        if (_GamingPadAlt1 != null) {
            return _GamingPadAlt1!!
        }
        _GamingPadAlt1 = ImageVector.Builder(
            name = "GamingPadAlt1",
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
                moveTo(6f, 11f)
                horizontalLineTo(10f)
                moveTo(8f, 9f)
                verticalLineTo(13f)
                moveTo(15f, 12f)
                horizontalLineTo(15.01f)
                moveTo(18f, 10f)
                horizontalLineTo(18.01f)
                moveTo(10.449f, 5f)
                horizontalLineTo(13.551f)
                curveTo(16.176f, 5f, 17.489f, 5f, 18.519f, 5.497f)
                curveTo(19.426f, 5.935f, 20.179f, 6.637f, 20.681f, 7.511f)
                curveTo(21.25f, 8.503f, 21.344f, 9.812f, 21.531f, 12.43f)
                lineTo(21.777f, 15.875f)
                curveTo(21.897f, 17.563f, 20.56f, 19f, 18.867f, 19f)
                curveTo(18.001f, 19f, 17.18f, 18.615f, 16.625f, 17.95f)
                lineTo(16.25f, 17.5f)
                curveTo(15.907f, 17.088f, 15.735f, 16.882f, 15.54f, 16.716f)
                curveTo(15.13f, 16.367f, 14.635f, 16.135f, 14.104f, 16.044f)
                curveTo(13.852f, 16f, 13.584f, 16f, 13.048f, 16f)
                horizontalLineTo(10.953f)
                curveTo(10.417f, 16f, 10.149f, 16f, 9.896f, 16.044f)
                curveTo(9.366f, 16.135f, 8.87f, 16.367f, 8.46f, 16.716f)
                curveTo(8.265f, 16.882f, 8.093f, 17.088f, 7.75f, 17.5f)
                lineTo(7.375f, 17.95f)
                curveTo(6.821f, 18.615f, 5.999f, 19f, 5.134f, 19f)
                curveTo(3.44f, 19f, 2.103f, 17.563f, 2.223f, 15.875f)
                lineTo(2.469f, 12.43f)
                curveTo(2.656f, 9.812f, 2.75f, 8.503f, 3.32f, 7.511f)
                curveTo(3.821f, 6.637f, 4.575f, 5.935f, 5.482f, 5.497f)
                curveTo(6.512f, 5f, 7.824f, 5f, 10.449f, 5f)
                close()
            }
        }.build()

        return _GamingPadAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _GamingPadAlt1: ImageVector? = null
