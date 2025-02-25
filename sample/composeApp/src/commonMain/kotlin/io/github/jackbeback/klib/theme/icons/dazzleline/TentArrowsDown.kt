package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TentArrowsDown: ImageVector
    get() {
        if (_TentArrowsDown != null) {
            return _TentArrowsDown!!
        }
        _TentArrowsDown = ImageVector.Builder(
            name = "TentArrowsDown",
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
                moveTo(6f, 3f)
                verticalLineTo(9f)
                moveTo(6f, 9f)
                lineTo(4f, 7f)
                moveTo(6f, 9f)
                lineTo(8f, 7f)
                moveTo(18f, 3f)
                verticalLineTo(9f)
                moveTo(18f, 9f)
                lineTo(16f, 7f)
                moveTo(18f, 9f)
                lineTo(20f, 7f)
                moveTo(12f, 9f)
                lineTo(7.261f, 13.308f)
                curveTo(6.978f, 13.565f, 6.837f, 13.693f, 6.724f, 13.843f)
                curveTo(6.624f, 13.975f, 6.541f, 14.12f, 6.477f, 14.273f)
                curveTo(6.405f, 14.446f, 6.365f, 14.632f, 6.285f, 15.006f)
                lineTo(5.415f, 19.065f)
                curveTo(5.273f, 19.727f, 5.202f, 20.058f, 5.289f, 20.318f)
                curveTo(5.365f, 20.545f, 5.521f, 20.738f, 5.728f, 20.861f)
                curveTo(5.963f, 21f, 6.302f, 21f, 6.979f, 21f)
                horizontalLineTo(17.021f)
                curveTo(17.698f, 21f, 18.037f, 21f, 18.272f, 20.861f)
                curveTo(18.479f, 20.738f, 18.635f, 20.545f, 18.711f, 20.318f)
                curveTo(18.798f, 20.058f, 18.727f, 19.727f, 18.585f, 19.065f)
                lineTo(17.715f, 15.006f)
                curveTo(17.635f, 14.632f, 17.596f, 14.446f, 17.523f, 14.273f)
                curveTo(17.459f, 14.12f, 17.376f, 13.975f, 17.276f, 13.843f)
                curveTo(17.163f, 13.693f, 17.022f, 13.565f, 16.739f, 13.308f)
                lineTo(12f, 9f)
                close()
                moveTo(12f, 9f)
                verticalLineTo(21f)
                moveTo(12f, 15f)
                lineTo(16f, 21f)
            }
        }.build()

        return _TentArrowsDown!!
    }

@Suppress("ObjectPropertyName")
private var _TentArrowsDown: ImageVector? = null
