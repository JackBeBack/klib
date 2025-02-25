package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Moleskine: ImageVector
    get() {
        if (_Moleskine != null) {
            return _Moleskine!!
        }
        _Moleskine = ImageVector.Builder(
            name = "Moleskine",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 3f)
                curveTo(3f, 1.895f, 3.895f, 1f, 5f, 1f)
                horizontalLineTo(17f)
                curveTo(19.209f, 1f, 21f, 2.791f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 21.209f, 19.209f, 23f, 17f, 23f)
                horizontalLineTo(5f)
                curveTo(3.895f, 23f, 3f, 22.105f, 3f, 21f)
                verticalLineTo(3f)
                close()
                moveTo(6f, 3f)
                curveTo(5.448f, 3f, 5f, 3.448f, 5f, 4f)
                verticalLineTo(20f)
                curveTo(5f, 20.552f, 5.448f, 21f, 6f, 21f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                close()
                moveTo(10f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                curveTo(18.105f, 21f, 19f, 20.105f, 19f, 19f)
                verticalLineTo(5f)
                curveTo(19f, 3.895f, 18.105f, 3f, 17f, 3f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _Moleskine!!
    }

@Suppress("ObjectPropertyName")
private var _Moleskine: ImageVector? = null
