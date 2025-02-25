package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Refresh2: ImageVector
    get() {
        if (_Refresh2 != null) {
            return _Refresh2!!
        }
        _Refresh2 = ImageVector.Builder(
            name = "Refresh2",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.5f, 12f)
                curveTo(2.5f, 12.276f, 2.724f, 12.5f, 3f, 12.5f)
                curveTo(3.276f, 12.5f, 3.5f, 12.276f, 3.5f, 12f)
                horizontalLineTo(2.5f)
                close()
                moveTo(3.5f, 12f)
                curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
                verticalLineTo(2.5f)
                curveTo(6.753f, 2.5f, 2.5f, 6.753f, 2.5f, 12f)
                horizontalLineTo(3.5f)
                close()
                moveTo(12f, 3.5f)
                curveTo(15.337f, 3.5f, 18.225f, 5.423f, 19.617f, 8.223f)
                lineTo(20.512f, 7.777f)
                curveTo(18.958f, 4.651f, 15.731f, 2.5f, 12f, 2.5f)
                verticalLineTo(3.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.472f, 2.422f)
                verticalLineTo(8.078f)
                horizontalLineTo(14.815f)
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.5f, 12f)
                curveTo(21.5f, 11.724f, 21.276f, 11.5f, 21f, 11.5f)
                curveTo(20.724f, 11.5f, 20.5f, 11.724f, 20.5f, 12f)
                lineTo(21.5f, 12f)
                close()
                moveTo(20.5f, 12f)
                curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
                lineTo(12f, 21.5f)
                curveTo(17.247f, 21.5f, 21.5f, 17.247f, 21.5f, 12f)
                lineTo(20.5f, 12f)
                close()
                moveTo(12f, 20.5f)
                curveTo(8.663f, 20.5f, 5.775f, 18.577f, 4.383f, 15.778f)
                lineTo(3.488f, 16.222f)
                curveTo(5.042f, 19.349f, 8.269f, 21.5f, 12f, 21.5f)
                lineTo(12f, 20.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.528f, 21.578f)
                lineTo(3.528f, 15.922f)
                lineTo(9.185f, 15.922f)
            }
        }.build()

        return _Refresh2!!
    }

@Suppress("ObjectPropertyName")
private var _Refresh2: ImageVector? = null
