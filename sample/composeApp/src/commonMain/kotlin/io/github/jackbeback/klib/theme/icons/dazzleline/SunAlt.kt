package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SunAlt: ImageVector
    get() {
        if (_SunAlt != null) {
            return _SunAlt!!
        }
        _SunAlt = ImageVector.Builder(
            name = "SunAlt",
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
                moveTo(15f, 12f)
                curveTo(15f, 13.657f, 13.657f, 15f, 12f, 15f)
                curveTo(10.343f, 15f, 9f, 13.657f, 9f, 12f)
                curveTo(9f, 10.343f, 10.343f, 9f, 12f, 9f)
                curveTo(13.657f, 9f, 15f, 10.343f, 15f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.643f, 5.189f)
                lineTo(7.567f, 6.105f)
                curveTo(7.527f, 6.585f, 7.507f, 6.824f, 7.404f, 7.012f)
                curveTo(7.313f, 7.177f, 7.177f, 7.313f, 7.012f, 7.404f)
                curveTo(6.824f, 7.507f, 6.585f, 7.527f, 6.105f, 7.567f)
                lineTo(5.189f, 7.643f)
                curveTo(4.163f, 7.729f, 3.649f, 7.772f, 3.396f, 8.006f)
                curveTo(3.176f, 8.21f, 3.059f, 8.502f, 3.078f, 8.802f)
                curveTo(3.1f, 9.146f, 3.442f, 9.531f, 4.126f, 10.301f)
                lineTo(4.692f, 10.937f)
                curveTo(5.026f, 11.313f, 5.193f, 11.501f, 5.256f, 11.714f)
                curveTo(5.312f, 11.9f, 5.312f, 12.1f, 5.256f, 12.287f)
                curveTo(5.193f, 12.499f, 5.026f, 12.687f, 4.692f, 13.063f)
                lineTo(4.126f, 13.699f)
                curveTo(3.442f, 14.469f, 3.1f, 14.854f, 3.078f, 15.198f)
                curveTo(3.059f, 15.498f, 3.176f, 15.79f, 3.396f, 15.994f)
                curveTo(3.649f, 16.228f, 4.163f, 16.271f, 5.189f, 16.357f)
                lineTo(6.105f, 16.433f)
                curveTo(6.585f, 16.473f, 6.824f, 16.493f, 7.012f, 16.596f)
                curveTo(7.177f, 16.688f, 7.313f, 16.823f, 7.404f, 16.988f)
                curveTo(7.507f, 17.176f, 7.527f, 17.415f, 7.567f, 17.895f)
                lineTo(7.643f, 18.811f)
                curveTo(7.729f, 19.837f, 7.772f, 20.351f, 8.006f, 20.604f)
                curveTo(8.21f, 20.824f, 8.502f, 20.941f, 8.802f, 20.922f)
                curveTo(9.146f, 20.9f, 9.531f, 20.558f, 10.301f, 19.874f)
                lineTo(10.937f, 19.309f)
                curveTo(11.313f, 18.974f, 11.501f, 18.807f, 11.714f, 18.744f)
                curveTo(11.9f, 18.688f, 12.1f, 18.688f, 12.287f, 18.744f)
                curveTo(12.499f, 18.807f, 12.687f, 18.974f, 13.063f, 19.309f)
                lineTo(13.699f, 19.874f)
                curveTo(14.469f, 20.558f, 14.854f, 20.9f, 15.198f, 20.922f)
                curveTo(15.498f, 20.941f, 15.79f, 20.824f, 15.994f, 20.604f)
                curveTo(16.228f, 20.351f, 16.271f, 19.837f, 16.357f, 18.811f)
                lineTo(16.433f, 17.895f)
                curveTo(16.473f, 17.415f, 16.493f, 17.176f, 16.596f, 16.988f)
                curveTo(16.688f, 16.823f, 16.823f, 16.688f, 16.988f, 16.596f)
                curveTo(17.176f, 16.493f, 17.415f, 16.473f, 17.895f, 16.433f)
                lineTo(18.811f, 16.357f)
                curveTo(19.837f, 16.271f, 20.351f, 16.228f, 20.604f, 15.994f)
                curveTo(20.824f, 15.79f, 20.941f, 15.498f, 20.922f, 15.198f)
                curveTo(20.9f, 14.854f, 20.558f, 14.469f, 19.874f, 13.699f)
                lineTo(19.309f, 13.063f)
                curveTo(18.974f, 12.687f, 18.807f, 12.499f, 18.744f, 12.287f)
                curveTo(18.688f, 12.1f, 18.688f, 11.9f, 18.744f, 11.714f)
                curveTo(18.807f, 11.501f, 18.974f, 11.313f, 19.309f, 10.937f)
                lineTo(19.874f, 10.301f)
                curveTo(20.558f, 9.531f, 20.9f, 9.146f, 20.922f, 8.802f)
                curveTo(20.941f, 8.502f, 20.824f, 8.21f, 20.604f, 8.006f)
                curveTo(20.351f, 7.772f, 19.837f, 7.729f, 18.811f, 7.643f)
                lineTo(17.895f, 7.567f)
                curveTo(17.415f, 7.527f, 17.176f, 7.507f, 16.988f, 7.404f)
                curveTo(16.823f, 7.313f, 16.688f, 7.177f, 16.596f, 7.012f)
                curveTo(16.493f, 6.824f, 16.473f, 6.585f, 16.433f, 6.105f)
                lineTo(16.357f, 5.189f)
                curveTo(16.271f, 4.163f, 16.228f, 3.649f, 15.994f, 3.396f)
                curveTo(15.79f, 3.176f, 15.498f, 3.059f, 15.198f, 3.078f)
                curveTo(14.854f, 3.1f, 14.469f, 3.442f, 13.699f, 4.126f)
                lineTo(13.063f, 4.692f)
                curveTo(12.687f, 5.026f, 12.499f, 5.193f, 12.287f, 5.256f)
                curveTo(12.1f, 5.312f, 11.9f, 5.312f, 11.714f, 5.256f)
                curveTo(11.501f, 5.193f, 11.313f, 5.026f, 10.937f, 4.692f)
                lineTo(10.301f, 4.126f)
                curveTo(9.531f, 3.442f, 9.146f, 3.1f, 8.802f, 3.078f)
                curveTo(8.502f, 3.059f, 8.21f, 3.176f, 8.006f, 3.396f)
                curveTo(7.772f, 3.649f, 7.729f, 4.163f, 7.643f, 5.189f)
                close()
            }
        }.build()

        return _SunAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SunAlt: ImageVector? = null
