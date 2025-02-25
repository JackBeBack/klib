package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Mail: ImageVector
    get() {
        if (_Mail != null) {
            return _Mail!!
        }
        _Mail = ImageVector.Builder(
            name = "Mail",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 4f)
                curveTo(21.657f, 4f, 23f, 5.343f, 23f, 7f)
                verticalLineTo(17f)
                curveTo(23f, 18.657f, 21.657f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(2.343f, 20f, 1f, 18.657f, 1f, 17f)
                verticalLineTo(7f)
                curveTo(1f, 5.343f, 2.343f, 4f, 4f, 4f)
                horizontalLineTo(20f)
                close()
                moveTo(19.253f, 6f)
                horizontalLineTo(4.747f)
                lineTo(11.38f, 11.237f)
                curveTo(11.744f, 11.524f, 12.256f, 11.524f, 12.62f, 11.237f)
                lineTo(19.253f, 6f)
                close()
                moveTo(3f, 7.169f)
                verticalLineTo(17f)
                curveTo(3f, 17.552f, 3.448f, 18f, 4f, 18f)
                horizontalLineTo(20f)
                curveTo(20.552f, 18f, 21f, 17.552f, 21f, 17f)
                verticalLineTo(7.169f)
                lineTo(13.859f, 12.807f)
                curveTo(12.769f, 13.667f, 11.231f, 13.667f, 10.141f, 12.807f)
                lineTo(3f, 7.169f)
                close()
            }
        }.build()

        return _Mail!!
    }

@Suppress("ObjectPropertyName")
private var _Mail: ImageVector? = null
