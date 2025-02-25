package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Bag: ImageVector
    get() {
        if (_Bag != null) {
            return _Bag!!
        }
        _Bag = ImageVector.Builder(
            name = "Bag",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 9f)
                horizontalLineTo(6.847f)
                curveTo(6.358f, 9f, 5.941f, 9.353f, 5.861f, 9.836f)
                lineTo(4.194f, 19.836f)
                curveTo(4.092f, 20.445f, 4.563f, 21f, 5.18f, 21f)
                horizontalLineTo(18.819f)
                curveTo(19.438f, 21f, 19.907f, 20.445f, 19.806f, 19.836f)
                lineTo(18.139f, 9.836f)
                curveTo(18.059f, 9.353f, 17.642f, 9f, 17.153f, 9f)
                horizontalLineTo(15f)
                moveTo(9f, 9f)
                horizontalLineTo(15f)
                moveTo(9f, 9f)
                curveTo(8.667f, 7.667f, 8f, 3f, 12f, 3f)
                curveTo(16f, 3f, 15.333f, 7.667f, 15f, 9f)
            }
        }.build()

        return _Bag!!
    }

@Suppress("ObjectPropertyName")
private var _Bag: ImageVector? = null
