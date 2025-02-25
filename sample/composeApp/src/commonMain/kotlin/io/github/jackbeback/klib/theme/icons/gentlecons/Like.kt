package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Like: ImageVector
    get() {
        if (_Like != null) {
            return _Like!!
        }
        _Like = ImageVector.Builder(
            name = "Like",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.444f, 1.354f)
                curveTo(11.647f, 0.956f, 10.681f, 1.335f, 10.369f, 2.169f)
                lineTo(7.807f, 9f)
                lineTo(4f, 9f)
                curveTo(2.343f, 9f, 1f, 10.343f, 1f, 12f)
                verticalLineTo(20f)
                curveTo(1f, 21.657f, 2.343f, 23f, 4f, 23f)
                horizontalLineTo(18.374f)
                curveTo(19.795f, 23f, 21.021f, 22.003f, 21.311f, 20.612f)
                lineTo(22.977f, 12.612f)
                curveTo(23.365f, 10.749f, 21.943f, 9f, 20.04f, 9f)
                horizontalLineTo(14.887f)
                lineTo(15.626f, 6.785f)
                curveTo(16.255f, 4.896f, 15.401f, 2.832f, 13.62f, 1.942f)
                lineTo(12.444f, 1.354f)
                close()
                moveTo(9.68f, 9.702f)
                lineTo(12.046f, 3.391f)
                lineTo(12.726f, 3.731f)
                curveTo(13.616f, 4.176f, 14.043f, 5.208f, 13.729f, 6.152f)
                lineTo(12.99f, 8.368f)
                curveTo(12.558f, 9.663f, 13.522f, 11f, 14.887f, 11f)
                horizontalLineTo(20.04f)
                curveTo(20.675f, 11f, 21.149f, 11.583f, 21.019f, 12.204f)
                lineTo(20.854f, 13f)
                horizontalLineTo(17f)
                curveTo(16.448f, 13f, 16f, 13.448f, 16f, 14f)
                curveTo(16f, 14.552f, 16.448f, 15f, 17f, 15f)
                horizontalLineTo(20.437f)
                lineTo(20.02f, 17f)
                horizontalLineTo(17f)
                curveTo(16.448f, 17f, 16f, 17.448f, 16f, 18f)
                curveTo(16f, 18.552f, 16.448f, 19f, 17f, 19f)
                horizontalLineTo(19.604f)
                lineTo(19.353f, 20.204f)
                curveTo(19.256f, 20.668f, 18.847f, 21f, 18.374f, 21f)
                horizontalLineTo(8f)
                verticalLineTo(10.991f)
                curveTo(8.754f, 10.918f, 9.41f, 10.422f, 9.68f, 9.702f)
                close()
                moveTo(6f, 11f)
                horizontalLineTo(4f)
                curveTo(3.448f, 11f, 3f, 11.448f, 3f, 12f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _Like!!
    }

@Suppress("ObjectPropertyName")
private var _Like: ImageVector? = null
