package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.FolderLock: ImageVector
    get() {
        if (_FolderLock != null) {
            return _FolderLock!!
        }
        _FolderLock = ImageVector.Builder(
            name = "FolderLock",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(7.764f)
                curveTo(8.9f, 1f, 9.939f, 1.642f, 10.447f, 2.658f)
                lineTo(11.342f, 4.447f)
                curveTo(11.511f, 4.786f, 11.857f, 5f, 12.236f, 5f)
                horizontalLineTo(20f)
                curveTo(21.657f, 5f, 23f, 6.343f, 23f, 8f)
                verticalLineTo(20f)
                curveTo(23f, 21.657f, 21.657f, 23f, 20f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(4f)
                close()
                moveTo(4f, 3f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                verticalLineTo(8f)
                curveTo(21f, 7.448f, 20.552f, 7f, 20f, 7f)
                horizontalLineTo(12.236f)
                curveTo(11.1f, 7f, 10.061f, 6.358f, 9.553f, 5.342f)
                lineTo(8.658f, 3.553f)
                curveTo(8.489f, 3.214f, 8.143f, 3f, 7.764f, 3f)
                horizontalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.962f, 13.001f)
                curveTo(8.962f, 12.993f, 8.961f, 12.985f, 8.961f, 12.977f)
                curveTo(8.952f, 12.603f, 8.969f, 12.081f, 9.085f, 11.54f)
                curveTo(9.199f, 11.008f, 9.426f, 10.377f, 9.9f, 9.866f)
                curveTo(10.404f, 9.324f, 11.112f, 9f, 12f, 9f)
                curveTo(12.888f, 9f, 13.596f, 9.324f, 14.1f, 9.866f)
                curveTo(14.574f, 10.377f, 14.801f, 11.008f, 14.915f, 11.54f)
                curveTo(15.031f, 12.081f, 15.048f, 12.603f, 15.039f, 12.977f)
                curveTo(15.039f, 12.985f, 15.038f, 12.993f, 15.038f, 13.001f)
                curveTo(15.573f, 13.021f, 16f, 13.46f, 16f, 14f)
                verticalLineTo(18f)
                curveTo(16f, 18.552f, 15.552f, 19f, 15f, 19f)
                horizontalLineTo(9f)
                curveTo(8.448f, 19f, 8f, 18.552f, 8f, 18f)
                verticalLineTo(14f)
                curveTo(8f, 13.46f, 8.427f, 13.021f, 8.962f, 13.001f)
                close()
                moveTo(13.037f, 13f)
                curveTo(13.038f, 12.977f, 13.039f, 12.954f, 13.039f, 12.929f)
                curveTo(13.046f, 12.647f, 13.031f, 12.294f, 12.96f, 11.96f)
                curveTo(12.886f, 11.617f, 12.77f, 11.373f, 12.634f, 11.227f)
                curveTo(12.529f, 11.113f, 12.362f, 11f, 12f, 11f)
                curveTo(11.638f, 11f, 11.471f, 11.113f, 11.366f, 11.227f)
                curveTo(11.23f, 11.373f, 11.114f, 11.617f, 11.04f, 11.96f)
                curveTo(10.969f, 12.294f, 10.954f, 12.647f, 10.961f, 12.929f)
                curveTo(10.961f, 12.954f, 10.962f, 12.977f, 10.963f, 13f)
                horizontalLineTo(13.037f)
                close()
            }
        }.build()

        return _FolderLock!!
    }

@Suppress("ObjectPropertyName")
private var _FolderLock: ImageVector? = null
