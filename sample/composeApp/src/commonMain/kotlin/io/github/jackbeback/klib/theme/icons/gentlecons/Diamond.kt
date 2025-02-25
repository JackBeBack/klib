package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Diamond: ImageVector
    get() {
        if (_Diamond != null) {
            return _Diamond!!
        }
        _Diamond = ImageVector.Builder(
            name = "Diamond",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.236f, 1f)
                curveTo(5.1f, 1f, 4.061f, 1.642f, 3.553f, 2.658f)
                lineTo(1.148f, 7.468f)
                curveTo(0.648f, 8.468f, 0.746f, 9.663f, 1.402f, 10.569f)
                lineTo(9.57f, 21.85f)
                curveTo(10.768f, 23.503f, 13.232f, 23.503f, 14.43f, 21.85f)
                lineTo(22.598f, 10.569f)
                curveTo(23.254f, 9.663f, 23.352f, 8.468f, 22.852f, 7.468f)
                lineTo(20.447f, 2.658f)
                curveTo(19.939f, 1.642f, 18.9f, 1f, 17.764f, 1f)
                horizontalLineTo(6.236f)
                close()
                moveTo(5.342f, 3.553f)
                curveTo(5.511f, 3.214f, 5.857f, 3f, 6.236f, 3f)
                horizontalLineTo(8.674f)
                lineTo(7.246f, 8f)
                horizontalLineTo(3.118f)
                lineTo(5.342f, 3.553f)
                close()
                moveTo(9.326f, 8f)
                lineTo(10.754f, 3f)
                horizontalLineTo(13.246f)
                lineTo(14.674f, 8f)
                horizontalLineTo(9.326f)
                close()
                moveTo(14.646f, 10f)
                horizontalLineTo(9.354f)
                lineTo(12f, 18.6f)
                lineTo(14.646f, 10f)
                close()
                moveTo(13.929f, 19.131f)
                lineTo(16.739f, 10f)
                horizontalLineTo(20.541f)
                lineTo(13.929f, 19.131f)
                close()
                moveTo(16.754f, 8f)
                lineTo(15.326f, 3f)
                horizontalLineTo(17.764f)
                curveTo(18.143f, 3f, 18.489f, 3.214f, 18.658f, 3.553f)
                lineTo(20.882f, 8f)
                horizontalLineTo(16.754f)
                close()
                moveTo(3.459f, 10f)
                horizontalLineTo(7.261f)
                lineTo(10.071f, 19.131f)
                lineTo(3.459f, 10f)
                close()
            }
        }.build()

        return _Diamond!!
    }

@Suppress("ObjectPropertyName")
private var _Diamond: ImageVector? = null
