package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.NotificationBellOff: ImageVector
    get() {
        if (_NotificationBellOff != null) {
            return _NotificationBellOff!!
        }
        _NotificationBellOff = ImageVector.Builder(
            name = "NotificationBellOff",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(-24f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFFFFFFFF))) {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(-24f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(6f, 15f)
                    curveTo(6f, 15f, 6f, 13f, 6f, 11f)
                    curveTo(6f, 9f, 7f, 5f, 12f, 5f)
                    curveTo(13.572f, 5f, 14.749f, 5.396f, 15.623f, 6f)
                    moveTo(9.5f, 19f)
                    curveTo(9.5f, 21f, 10.5f, 22f, 12f, 22f)
                    curveTo(13.5f, 22f, 14.5f, 21f, 14.5f, 19f)
                    moveTo(9.5f, 19f)
                    curveTo(11.062f, 19f, 14.5f, 19f, 14.5f, 19f)
                    moveTo(9.5f, 19f)
                    curveTo(9.149f, 19f, 8.367f, 19f, 7.5f, 19f)
                    moveTo(14.5f, 19f)
                    horizontalLineTo(18.382f)
                    curveTo(19.125f, 19f, 19.609f, 18.218f, 19.276f, 17.553f)
                    lineTo(18f, 15f)
                    curveTo(18f, 15f, 18f, 13f, 18f, 11f)
                    curveTo(18f, 10.375f, 17.903f, 9.556f, 17.616f, 8.724f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(12f, 5f)
                    verticalLineTo(3f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(21f, 3f)
                    lineTo(3f, 21f)
                }
            }
        }.build()

        return _NotificationBellOff!!
    }

@Suppress("ObjectPropertyName")
private var _NotificationBellOff: ImageVector? = null
