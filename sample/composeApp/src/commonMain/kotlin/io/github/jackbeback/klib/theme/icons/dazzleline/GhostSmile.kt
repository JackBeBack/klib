package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GhostSmile: ImageVector
    get() {
        if (_GhostSmile != null) {
            return _GhostSmile!!
        }
        _GhostSmile = ImageVector.Builder(
            name = "GhostSmile",
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
                moveTo(9.17f, 14f)
                curveTo(9.582f, 15.165f, 10.693f, 16f, 11.999f, 16f)
                curveTo(13.305f, 16f, 14.417f, 15.165f, 14.828f, 14f)
                moveTo(9f, 10f)
                horizontalLineTo(9.009f)
                moveTo(15f, 10f)
                horizontalLineTo(15.009f)
                moveTo(5f, 10f)
                curveTo(5f, 6.134f, 8.134f, 3f, 12f, 3f)
                curveTo(15.866f, 3f, 19f, 6.134f, 19f, 10f)
                verticalLineTo(21f)
                lineTo(18.183f, 20.455f)
                curveTo(17.405f, 19.937f, 17.017f, 19.678f, 16.605f, 19.604f)
                curveTo(16.242f, 19.54f, 15.868f, 19.577f, 15.525f, 19.711f)
                curveTo(15.136f, 19.864f, 14.806f, 20.194f, 14.145f, 20.855f)
                verticalLineTo(20.855f)
                curveTo(14.065f, 20.935f, 13.935f, 20.935f, 13.855f, 20.855f)
                curveTo(13.404f, 20.405f, 13.155f, 20.169f, 12.888f, 20.036f)
                curveTo(12.328f, 19.759f, 11.672f, 19.759f, 11.112f, 20.036f)
                curveTo(10.845f, 20.169f, 10.596f, 20.405f, 10.145f, 20.855f)
                curveTo(10.065f, 20.935f, 9.935f, 20.935f, 9.855f, 20.855f)
                verticalLineTo(20.855f)
                curveTo(9.194f, 20.194f, 8.864f, 19.864f, 8.475f, 19.711f)
                curveTo(8.132f, 19.577f, 7.758f, 19.54f, 7.395f, 19.604f)
                curveTo(6.984f, 19.678f, 6.595f, 19.937f, 5.817f, 20.455f)
                lineTo(5f, 21f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _GhostSmile!!
    }

@Suppress("ObjectPropertyName")
private var _GhostSmile: ImageVector? = null
