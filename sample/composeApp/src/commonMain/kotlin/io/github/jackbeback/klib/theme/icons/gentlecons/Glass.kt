package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Glass: ImageVector
    get() {
        if (_Glass != null) {
            return _Glass!!
        }
        _Glass = ImageVector.Builder(
            name = "Glass",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.161f, 1f)
                curveTo(3.938f, 1f, 3.002f, 2.087f, 3.183f, 3.297f)
                lineTo(5.756f, 20.445f)
                curveTo(5.976f, 21.914f, 7.237f, 23f, 8.722f, 23f)
                horizontalLineTo(15.278f)
                curveTo(16.763f, 23f, 18.024f, 21.914f, 18.244f, 20.445f)
                lineTo(20.817f, 3.297f)
                curveTo(20.998f, 2.087f, 20.062f, 1f, 18.839f, 1f)
                horizontalLineTo(5.161f)
                close()
                moveTo(5.161f, 3f)
                horizontalLineTo(18.839f)
                lineTo(18.239f, 7f)
                horizontalLineTo(5.761f)
                lineTo(5.161f, 3f)
                close()
                moveTo(6.061f, 9f)
                lineTo(7.733f, 20.148f)
                curveTo(7.807f, 20.638f, 8.227f, 21f, 8.722f, 21f)
                horizontalLineTo(15.278f)
                curveTo(15.773f, 21f, 16.193f, 20.638f, 16.267f, 20.148f)
                lineTo(17.939f, 9f)
                horizontalLineTo(6.061f)
                close()
            }
        }.build()

        return _Glass!!
    }

@Suppress("ObjectPropertyName")
private var _Glass: ImageVector? = null
