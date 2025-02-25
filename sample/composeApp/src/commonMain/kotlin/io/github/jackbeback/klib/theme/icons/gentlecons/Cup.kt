package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Cup: ImageVector
    get() {
        if (_Cup != null) {
            return _Cup!!
        }
        _Cup = ImageVector.Builder(
            name = "Cup",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 4f)
                curveTo(5f, 2.343f, 6.343f, 1f, 8f, 1f)
                horizontalLineTo(16f)
                curveTo(17.657f, 1f, 19f, 2.343f, 19f, 4f)
                horizontalLineTo(20f)
                curveTo(21.657f, 4f, 23f, 5.343f, 23f, 7f)
                verticalLineTo(7.646f)
                curveTo(23f, 8.873f, 22.253f, 9.976f, 21.114f, 10.431f)
                lineTo(18.031f, 11.665f)
                curveTo(17.597f, 12.464f, 16.958f, 13.271f, 16.023f, 13.895f)
                curveTo(15.211f, 14.436f, 14.212f, 14.813f, 13f, 14.947f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                curveTo(16.657f, 17f, 18f, 18.343f, 18f, 20f)
                verticalLineTo(21f)
                curveTo(18f, 22.105f, 17.105f, 23f, 16f, 23f)
                horizontalLineTo(8f)
                curveTo(6.895f, 23f, 6f, 22.105f, 6f, 21f)
                verticalLineTo(20f)
                curveTo(6f, 18.343f, 7.343f, 17f, 9f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(14.947f)
                curveTo(9.788f, 14.813f, 8.789f, 14.436f, 7.977f, 13.894f)
                curveTo(7.042f, 13.271f, 6.403f, 12.464f, 5.969f, 11.665f)
                lineTo(2.886f, 10.431f)
                curveTo(1.747f, 9.976f, 1f, 8.873f, 1f, 7.646f)
                verticalLineTo(7f)
                curveTo(1f, 5.343f, 2.343f, 4f, 4f, 4f)
                horizontalLineTo(5f)
                close()
                moveTo(5f, 6f)
                horizontalLineTo(4f)
                curveTo(3.448f, 6f, 3f, 6.448f, 3f, 7f)
                verticalLineTo(7.646f)
                curveTo(3f, 8.055f, 3.249f, 8.423f, 3.629f, 8.574f)
                lineTo(5.119f, 9.171f)
                curveTo(5.052f, 8.786f, 5.001f, 8.392f, 5f, 8.001f)
                lineTo(5f, 6f)
                close()
                moveTo(19f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                curveTo(20.552f, 6f, 21f, 6.448f, 21f, 7f)
                verticalLineTo(7.646f)
                curveTo(21f, 8.055f, 20.751f, 8.423f, 20.371f, 8.574f)
                lineTo(18.881f, 9.171f)
                curveTo(18.947f, 8.784f, 19f, 8.393f, 19f, 8f)
                close()
                moveTo(8f, 3f)
                curveTo(7.448f, 3f, 7f, 3.448f, 7f, 4f)
                verticalLineTo(7.997f)
                lineTo(7f, 7.998f)
                curveTo(7f, 8f, 7f, 8.001f, 7f, 7.998f)
                curveTo(7.005f, 8.258f, 7.038f, 8.518f, 7.08f, 8.773f)
                curveTo(7.163f, 9.27f, 7.327f, 9.918f, 7.644f, 10.553f)
                curveTo(7.96f, 11.184f, 8.418f, 11.785f, 9.086f, 12.231f)
                curveTo(9.748f, 12.672f, 10.675f, 13f, 12f, 13f)
                curveTo(13.325f, 13f, 14.252f, 12.672f, 14.914f, 12.23f)
                curveTo(15.582f, 11.785f, 16.04f, 11.184f, 16.355f, 10.553f)
                curveTo(16.673f, 9.917f, 16.837f, 9.27f, 16.92f, 8.773f)
                curveTo(16.962f, 8.517f, 16.993f, 8.258f, 17f, 7.999f)
                verticalLineTo(4f)
                curveTo(17f, 3.448f, 16.552f, 3f, 16f, 3f)
                horizontalLineTo(8f)
                close()
                moveTo(9f, 19f)
                curveTo(8.448f, 19f, 8f, 19.448f, 8f, 20f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                curveTo(16f, 19.448f, 15.552f, 19f, 15f, 19f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _Cup!!
    }

@Suppress("ObjectPropertyName")
private var _Cup: ImageVector? = null
