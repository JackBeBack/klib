package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.FullScreenExit: ImageVector
    get() {
        if (_FullScreenExit != null) {
            return _FullScreenExit!!
        }
        _FullScreenExit = ImageVector.Builder(
            name = "FullScreenExit",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7f, 16f)
                lineTo(2f, 16f)
                curveTo(1.448f, 16f, 1f, 15.552f, 1f, 15f)
                curveTo(1f, 14.448f, 1.448f, 14f, 2f, 14f)
                lineTo(7f, 14f)
                curveTo(8.657f, 14f, 10f, 15.343f, 10f, 17f)
                verticalLineTo(22f)
                curveTo(10f, 22.552f, 9.552f, 23f, 9f, 23f)
                curveTo(8.448f, 23f, 8f, 22.552f, 8f, 22f)
                verticalLineTo(17f)
                curveTo(8f, 16.448f, 7.552f, 16f, 7f, 16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10f, 2f)
                curveTo(10f, 1.448f, 9.552f, 1f, 9f, 1f)
                curveTo(8.448f, 1f, 8f, 1.448f, 8f, 2f)
                lineTo(8f, 7f)
                curveTo(8f, 7.552f, 7.552f, 8f, 7f, 8f)
                lineTo(2f, 8f)
                curveTo(1.448f, 8f, 1f, 8.448f, 1f, 9f)
                curveTo(1f, 9.552f, 1.448f, 10f, 2f, 10f)
                lineTo(7f, 10f)
                curveTo(8.657f, 10f, 10f, 8.657f, 10f, 7f)
                lineTo(10f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14f, 22f)
                curveTo(14f, 22.552f, 14.448f, 23f, 15f, 23f)
                curveTo(15.552f, 23f, 16f, 22.552f, 16f, 22f)
                verticalLineTo(17f)
                curveTo(16f, 16.448f, 16.448f, 16f, 17f, 16f)
                horizontalLineTo(22f)
                curveTo(22.552f, 16f, 23f, 15.552f, 23f, 15f)
                curveTo(23f, 14.448f, 22.552f, 14f, 22f, 14f)
                horizontalLineTo(17f)
                curveTo(15.343f, 14f, 14f, 15.343f, 14f, 17f)
                verticalLineTo(22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14f, 7f)
                curveTo(14f, 8.657f, 15.343f, 10f, 17f, 10f)
                lineTo(22f, 10f)
                curveTo(22.552f, 10f, 23f, 9.552f, 23f, 9f)
                curveTo(23f, 8.448f, 22.552f, 8f, 22f, 8f)
                lineTo(17f, 8f)
                curveTo(16.448f, 8f, 16f, 7.552f, 16f, 7f)
                lineTo(16f, 2f)
                curveTo(16f, 1.448f, 15.552f, 1f, 15f, 1f)
                curveTo(14.448f, 1f, 14f, 1.448f, 14f, 2f)
                lineTo(14f, 7f)
                close()
            }
        }.build()

        return _FullScreenExit!!
    }

@Suppress("ObjectPropertyName")
private var _FullScreenExit: ImageVector? = null
