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

val Smoothie.NotificationBellOn: ImageVector
    get() {
        if (_NotificationBellOn != null) {
            return _NotificationBellOn!!
        }
        _NotificationBellOn = ImageVector.Builder(
            name = "NotificationBellOn",
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
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(9.5f, 19f)
                    curveTo(8.896f, 19f, 7.012f, 19f, 5.617f, 19f)
                    curveTo(4.874f, 19f, 4.391f, 18.218f, 4.724f, 17.553f)
                    lineTo(5.578f, 15.845f)
                    curveTo(5.855f, 15.289f, 6f, 14.677f, 6f, 14.056f)
                    curveTo(6f, 13.287f, 6f, 12.143f, 6f, 11f)
                    curveTo(6f, 9f, 7f, 5f, 12f, 5f)
                    curveTo(17f, 5f, 18f, 9f, 18f, 11f)
                    curveTo(18f, 12.143f, 18f, 13.287f, 18f, 14.056f)
                    curveTo(18f, 14.677f, 18.145f, 15.289f, 18.422f, 15.845f)
                    lineTo(19.276f, 17.553f)
                    curveTo(19.609f, 18.218f, 19.125f, 19f, 18.382f, 19f)
                    horizontalLineTo(14.5f)
                    moveTo(9.5f, 19f)
                    curveTo(9.5f, 21f, 10.5f, 22f, 12f, 22f)
                    curveTo(13.5f, 22f, 14.5f, 21f, 14.5f, 19f)
                    moveTo(9.5f, 19f)
                    curveTo(11.062f, 19f, 14.5f, 19f, 14.5f, 19f)
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
            }
        }.build()

        return _NotificationBellOn!!
    }

@Suppress("ObjectPropertyName")
private var _NotificationBellOn: ImageVector? = null
