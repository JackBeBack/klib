package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.EqualSign: ImageVector
    get() {
        if (_EqualSign != null) {
            return _EqualSign!!
        }
        _EqualSign = ImageVector.Builder(
            name = "EqualSign",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(3f, 8f)
                curveTo(2.448f, 8f, 2f, 8.448f, 2f, 9f)
                curveTo(2f, 9.552f, 2.448f, 10f, 3f, 10f)
                horizontalLineTo(21f)
                curveTo(21.552f, 10f, 22f, 9.552f, 22f, 9f)
                curveTo(22f, 8.448f, 21.552f, 8f, 21f, 8f)
                horizontalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(3f, 14f)
                curveTo(2.448f, 14f, 2f, 14.448f, 2f, 15f)
                curveTo(2f, 15.552f, 2.448f, 16f, 3f, 16f)
                horizontalLineTo(21f)
                curveTo(21.552f, 16f, 22f, 15.552f, 22f, 15f)
                curveTo(22f, 14.448f, 21.552f, 14f, 21f, 14f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _EqualSign!!
    }

@Suppress("ObjectPropertyName")
private var _EqualSign: ImageVector? = null
