package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.GoogleChrome: ImageVector
    get() {
        if (_GoogleChrome != null) {
            return _GoogleChrome!!
        }
        _GoogleChrome = ImageVector.Builder(
            name = "GoogleChrome",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 12f)
                curveTo(23f, 18.075f, 18.075f, 23f, 12f, 23f)
                curveTo(5.925f, 23f, 1f, 18.075f, 1f, 12f)
                curveTo(1f, 5.925f, 5.925f, 1f, 12f, 1f)
                curveTo(18.075f, 1f, 23f, 5.925f, 23f, 12f)
                close()
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(11.807f, 21f, 11.616f, 20.994f, 11.427f, 20.982f)
                lineTo(15.352f, 14.184f)
                curveTo(15.762f, 13.556f, 16f, 12.806f, 16f, 12f)
                curveTo(16f, 11.271f, 15.805f, 10.588f, 15.465f, 10f)
                horizontalLineTo(20.777f)
                curveTo(20.923f, 10.643f, 21f, 11.313f, 21f, 12f)
                close()
                moveTo(3f, 12f)
                curveTo(3f, 16.044f, 5.667f, 19.465f, 9.338f, 20.6f)
                lineTo(11.994f, 16f)
                curveTo(10.437f, 15.998f, 9.089f, 15.106f, 8.43f, 13.806f)
                lineTo(4.508f, 7.012f)
                curveTo(3.555f, 8.44f, 3f, 10.155f, 3f, 12f)
                close()
                moveTo(5.884f, 5.397f)
                curveTo(7.49f, 3.909f, 9.639f, 3f, 12f, 3f)
                curveTo(15.534f, 3f, 18.592f, 5.037f, 20.065f, 8f)
                horizontalLineTo(12f)
                curveTo(10.522f, 8f, 9.231f, 8.802f, 8.539f, 9.994f)
                lineTo(5.884f, 5.397f)
                close()
                moveTo(10.263f, 12.993f)
                lineTo(10.268f, 12.99f)
                lineTo(10.197f, 12.866f)
                curveTo(10.071f, 12.604f, 10f, 12.31f, 10f, 12f)
                curveTo(10f, 10.895f, 10.895f, 10f, 12f, 10f)
                curveTo(13.105f, 10f, 14f, 10.895f, 14f, 12f)
                curveTo(14f, 12.361f, 13.904f, 12.7f, 13.737f, 12.992f)
                lineTo(13.732f, 12.989f)
                lineTo(13.653f, 13.126f)
                curveTo(13.293f, 13.654f, 12.687f, 14f, 12f, 14f)
                curveTo(11.257f, 14f, 10.608f, 13.594f, 10.263f, 12.993f)
                close()
            }
        }.build()

        return _GoogleChrome!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleChrome: ImageVector? = null
