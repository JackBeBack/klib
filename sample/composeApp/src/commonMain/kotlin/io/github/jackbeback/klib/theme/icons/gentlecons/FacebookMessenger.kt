package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.FacebookMessenger: ImageVector
    get() {
        if (_FacebookMessenger != null) {
            return _FacebookMessenger!!
        }
        _FacebookMessenger = ImageVector.Builder(
            name = "FacebookMessenger",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(17.3f, 9.6f)
                curveTo(17.631f, 9.158f, 17.542f, 8.531f, 17.1f, 8.2f)
                curveTo(16.658f, 7.869f, 16.031f, 7.958f, 15.7f, 8.4f)
                lineTo(13.392f, 11.478f)
                lineTo(11.207f, 9.293f)
                curveTo(11.002f, 9.088f, 10.718f, 8.982f, 10.429f, 9.003f)
                curveTo(10.14f, 9.023f, 9.874f, 9.168f, 9.7f, 9.4f)
                lineTo(6.7f, 13.4f)
                curveTo(6.369f, 13.842f, 6.458f, 14.469f, 6.9f, 14.8f)
                curveTo(7.342f, 15.131f, 7.969f, 15.042f, 8.3f, 14.6f)
                lineTo(10.608f, 11.522f)
                lineTo(12.793f, 13.707f)
                curveTo(12.998f, 13.912f, 13.282f, 14.018f, 13.571f, 13.998f)
                curveTo(13.86f, 13.977f, 14.126f, 13.832f, 14.3f, 13.6f)
                lineTo(17.3f, 9.6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 23f)
                curveTo(10.776f, 23f, 10.099f, 22.869f, 9f, 22.5f)
                lineTo(6.894f, 23.553f)
                curveTo(5.565f, 24.218f, 4f, 23.251f, 4f, 21.764f)
                verticalLineTo(19.5f)
                curveTo(1.847f, 17.492f, 1f, 15.177f, 1f, 12f)
                curveTo(1f, 5.925f, 5.925f, 1f, 12f, 1f)
                curveTo(18.075f, 1f, 23f, 5.925f, 23f, 12f)
                curveTo(23f, 18.075f, 18.075f, 23f, 12f, 23f)
                close()
                moveTo(6f, 18.63f)
                lineTo(5.364f, 18.037f)
                curveTo(3.691f, 16.477f, 3f, 14.733f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(11.014f, 21f, 10.552f, 20.911f, 9.636f, 20.604f)
                lineTo(8.848f, 20.34f)
                lineTo(6f, 21.764f)
                verticalLineTo(18.63f)
                close()
            }
        }.build()

        return _FacebookMessenger!!
    }

@Suppress("ObjectPropertyName")
private var _FacebookMessenger: ImageVector? = null
