package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Bank: ImageVector
    get() {
        if (_Bank != null) {
            return _Bank!!
        }
        _Bank = ImageVector.Builder(
            name = "Bank",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.832f, 1.248f)
                curveTo(11.578f, 0.917f, 12.422f, 0.917f, 13.168f, 1.248f)
                lineTo(21.799f, 5.075f)
                curveTo(23.775f, 5.951f, 23.17f, 9f, 21.021f, 9f)
                horizontalLineTo(2.979f)
                curveTo(0.83f, 9f, 0.225f, 5.951f, 2.2f, 5.075f)
                lineTo(10.832f, 1.248f)
                close()
                moveTo(12.389f, 3.128f)
                curveTo(12.141f, 3.017f, 11.859f, 3.017f, 11.611f, 3.128f)
                lineTo(3.411f, 6.764f)
                curveTo(3.312f, 6.807f, 3.343f, 6.955f, 3.451f, 6.955f)
                horizontalLineTo(20.549f)
                curveTo(20.657f, 6.955f, 20.688f, 6.807f, 20.589f, 6.764f)
                lineTo(12.389f, 3.128f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(2f, 22f)
                curveTo(2f, 21.448f, 2.448f, 21f, 3f, 21f)
                horizontalLineTo(21f)
                curveTo(21.552f, 21f, 22f, 21.448f, 22f, 22f)
                curveTo(22f, 22.552f, 21.552f, 23f, 21f, 23f)
                horizontalLineTo(3f)
                curveTo(2.448f, 23f, 2f, 22.552f, 2f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 19f)
                curveTo(11f, 19.552f, 11.448f, 20f, 12f, 20f)
                curveTo(12.552f, 20f, 13f, 19.552f, 13f, 19f)
                verticalLineTo(11f)
                curveTo(13f, 10.448f, 12.552f, 10f, 12f, 10f)
                curveTo(11.448f, 10f, 11f, 10.448f, 11f, 11f)
                verticalLineTo(19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6f, 20f)
                curveTo(5.448f, 20f, 5f, 19.552f, 5f, 19f)
                lineTo(5f, 11f)
                curveTo(5f, 10.448f, 5.448f, 10f, 6f, 10f)
                curveTo(6.552f, 10f, 7f, 10.448f, 7f, 11f)
                lineTo(7f, 19f)
                curveTo(7f, 19.552f, 6.552f, 20f, 6f, 20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(17f, 19f)
                curveTo(17f, 19.552f, 17.448f, 20f, 18f, 20f)
                curveTo(18.552f, 20f, 19f, 19.552f, 19f, 19f)
                verticalLineTo(11f)
                curveTo(19f, 10.448f, 18.552f, 10f, 18f, 10f)
                curveTo(17.448f, 10f, 17f, 10.448f, 17f, 11f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _Bank!!
    }

@Suppress("ObjectPropertyName")
private var _Bank: ImageVector? = null
