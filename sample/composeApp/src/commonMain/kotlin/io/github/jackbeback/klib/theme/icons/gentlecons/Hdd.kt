package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Hdd: ImageVector
    get() {
        if (_Hdd != null) {
            return _Hdd!!
        }
        _Hdd = ImageVector.Builder(
            name = "Hdd",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18f, 20f)
                curveTo(18.552f, 20f, 19f, 19.552f, 19f, 19f)
                curveTo(19f, 18.448f, 18.552f, 18f, 18f, 18f)
                curveTo(17.448f, 18f, 17f, 18.448f, 17f, 19f)
                curveTo(17f, 19.552f, 17.448f, 20f, 18f, 20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.683f, 3.371f)
                curveTo(2.951f, 6.788f, 1.46f, 13.829f, 1.086f, 15.593f)
                curveTo(1.029f, 15.865f, 1f, 16.14f, 1f, 16.419f)
                verticalLineTo(20f)
                curveTo(1f, 21.657f, 2.343f, 23f, 4f, 23f)
                horizontalLineTo(20f)
                curveTo(21.657f, 23f, 23f, 21.657f, 23f, 20f)
                verticalLineTo(16.419f)
                curveTo(23f, 16.14f, 22.971f, 15.865f, 22.914f, 15.593f)
                curveTo(22.54f, 13.829f, 21.049f, 6.788f, 20.317f, 3.371f)
                curveTo(20.02f, 1.988f, 18.798f, 1f, 17.383f, 1f)
                horizontalLineTo(6.617f)
                curveTo(5.202f, 1f, 3.98f, 1.988f, 3.683f, 3.371f)
                close()
                moveTo(6.617f, 3f)
                curveTo(6.145f, 3f, 5.738f, 3.329f, 5.639f, 3.79f)
                lineTo(3.237f, 15f)
                horizontalLineTo(20.763f)
                lineTo(18.361f, 3.79f)
                curveTo(18.262f, 3.329f, 17.855f, 3f, 17.383f, 3f)
                horizontalLineTo(6.617f)
                close()
                moveTo(21f, 18f)
                curveTo(21f, 17.448f, 20.552f, 17f, 20f, 17f)
                horizontalLineTo(4f)
                curveTo(3.448f, 17f, 3f, 17.448f, 3f, 18f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _Hdd!!
    }

@Suppress("ObjectPropertyName")
private var _Hdd: ImageVector? = null
