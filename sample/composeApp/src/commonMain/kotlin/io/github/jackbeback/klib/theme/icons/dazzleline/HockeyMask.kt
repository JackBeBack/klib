package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HockeyMask: ImageVector
    get() {
        if (_HockeyMask != null) {
            return _HockeyMask!!
        }
        _HockeyMask = ImageVector.Builder(
            name = "HockeyMask",
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
                moveTo(10.5f, 15f)
                lineTo(10.507f, 15.007f)
                moveTo(10.5f, 18f)
                lineTo(10.507f, 18.007f)
                moveTo(13.5f, 18f)
                lineTo(13.507f, 18.007f)
                moveTo(13.5f, 15f)
                lineTo(13.507f, 15.007f)
                moveTo(19.965f, 12.237f)
                lineTo(19.408f, 15.994f)
                curveTo(19.278f, 16.874f, 19.213f, 17.313f, 19.063f, 17.712f)
                curveTo(18.85f, 18.281f, 18.509f, 18.793f, 18.068f, 19.211f)
                curveTo(17.758f, 19.504f, 17.378f, 19.735f, 16.618f, 20.196f)
                curveTo(15.162f, 21.08f, 14.434f, 21.522f, 13.67f, 21.744f)
                curveTo(12.579f, 22.06f, 11.421f, 22.06f, 10.33f, 21.744f)
                curveTo(9.566f, 21.522f, 8.838f, 21.08f, 7.381f, 20.196f)
                curveTo(6.622f, 19.735f, 6.242f, 19.504f, 5.932f, 19.211f)
                curveTo(5.491f, 18.793f, 5.15f, 18.281f, 4.937f, 17.712f)
                curveTo(4.787f, 17.313f, 4.722f, 16.874f, 4.592f, 15.994f)
                lineTo(4.035f, 12.237f)
                curveTo(4.012f, 12.079f, 4f, 11.92f, 4f, 11.76f)
                verticalLineTo(10f)
                curveTo(4f, 5.582f, 7.582f, 2f, 12f, 2f)
                curveTo(16.418f, 2f, 20f, 5.582f, 20f, 10f)
                verticalLineTo(11.76f)
                curveTo(20f, 11.92f, 19.988f, 12.079f, 19.965f, 12.237f)
                close()
                moveTo(7.5f, 9f)
                horizontalLineTo(9.5f)
                curveTo(10.052f, 9f, 10.5f, 9.448f, 10.5f, 10f)
                curveTo(10.5f, 11.105f, 9.605f, 12f, 8.5f, 12f)
                curveTo(7.395f, 12f, 6.5f, 11.105f, 6.5f, 10f)
                curveTo(6.5f, 9.448f, 6.948f, 9f, 7.5f, 9f)
                close()
                moveTo(14.5f, 9f)
                horizontalLineTo(16.5f)
                curveTo(17.052f, 9f, 17.5f, 9.448f, 17.5f, 10f)
                curveTo(17.5f, 11.105f, 16.605f, 12f, 15.5f, 12f)
                curveTo(14.395f, 12f, 13.5f, 11.105f, 13.5f, 10f)
                curveTo(13.5f, 9.448f, 13.948f, 9f, 14.5f, 9f)
                close()
            }
        }.build()

        return _HockeyMask!!
    }

@Suppress("ObjectPropertyName")
private var _HockeyMask: ImageVector? = null
