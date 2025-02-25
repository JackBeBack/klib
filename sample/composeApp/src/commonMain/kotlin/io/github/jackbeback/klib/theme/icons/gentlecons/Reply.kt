package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Reply: ImageVector
    get() {
        if (_Reply != null) {
            return _Reply!!
        }
        _Reply = ImageVector.Builder(
            name = "Reply",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.4f, 3.804f)
                curveTo(7.553f, 2.267f, 10f, 3.082f, 10f, 5.003f)
                verticalLineTo(8.009f)
                curveTo(14.677f, 7.861f, 17.777f, 9.507f, 19.78f, 11.766f)
                curveTo(21.861f, 14.114f, 22.663f, 17.018f, 22.978f, 18.903f)
                curveTo(23.116f, 19.728f, 22.581f, 20.324f, 22.015f, 20.528f)
                curveTo(21.471f, 20.723f, 20.747f, 20.628f, 20.275f, 20.053f)
                curveTo(18.694f, 18.126f, 15.5f, 15.488f, 10f, 15.488f)
                verticalLineTo(18.997f)
                curveTo(10f, 20.918f, 7.553f, 21.733f, 6.4f, 20.197f)
                lineTo(1.6f, 13.799f)
                curveTo(0.8f, 12.733f, 0.8f, 11.267f, 1.6f, 10.201f)
                lineTo(6.4f, 3.804f)
                close()
                moveTo(8f, 5.003f)
                lineTo(3.2f, 11.4f)
                curveTo(2.933f, 11.756f, 2.933f, 12.244f, 3.2f, 12.6f)
                lineTo(8f, 18.997f)
                verticalLineTo(14.5f)
                curveTo(8f, 13.948f, 8.448f, 13.5f, 9f, 13.5f)
                horizontalLineTo(10f)
                curveTo(17f, 13.5f, 20.601f, 17.462f, 20.601f, 17.462f)
                curveTo(20.183f, 16.036f, 19.475f, 14.437f, 18.283f, 13.092f)
                curveTo(16.718f, 11.327f, 14.5f, 10f, 10f, 10f)
                horizontalLineTo(9f)
                curveTo(8.448f, 10f, 8f, 9.552f, 8f, 9f)
                verticalLineTo(5.003f)
                close()
            }
        }.build()

        return _Reply!!
    }

@Suppress("ObjectPropertyName")
private var _Reply: ImageVector? = null
