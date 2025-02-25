package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Forward: ImageVector
    get() {
        if (_Forward != null) {
            return _Forward!!
        }
        _Forward = ImageVector.Builder(
            name = "Forward",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.6f, 3.804f)
                curveTo(16.447f, 2.267f, 14f, 3.082f, 14f, 5.003f)
                verticalLineTo(8.009f)
                curveTo(9.323f, 7.861f, 6.223f, 9.507f, 4.22f, 11.766f)
                curveTo(2.139f, 14.114f, 1.337f, 17.018f, 1.022f, 18.903f)
                curveTo(0.884f, 19.728f, 1.419f, 20.324f, 1.985f, 20.528f)
                curveTo(2.529f, 20.723f, 3.253f, 20.628f, 3.725f, 20.053f)
                curveTo(5.306f, 18.126f, 8.5f, 15.488f, 14f, 15.488f)
                verticalLineTo(18.997f)
                curveTo(14f, 20.918f, 16.447f, 21.733f, 17.6f, 20.197f)
                lineTo(22.4f, 13.799f)
                curveTo(23.2f, 12.733f, 23.2f, 11.267f, 22.4f, 10.201f)
                lineTo(17.6f, 3.804f)
                close()
                moveTo(16f, 5.003f)
                lineTo(20.8f, 11.4f)
                curveTo(21.067f, 11.756f, 21.067f, 12.244f, 20.8f, 12.6f)
                lineTo(16f, 18.997f)
                verticalLineTo(14.5f)
                curveTo(16f, 13.948f, 15.552f, 13.5f, 15f, 13.5f)
                horizontalLineTo(14f)
                curveTo(7f, 13.5f, 3.399f, 17.462f, 3.399f, 17.462f)
                curveTo(3.817f, 16.036f, 4.525f, 14.437f, 5.717f, 13.092f)
                curveTo(7.282f, 11.327f, 9.5f, 10f, 14f, 10f)
                horizontalLineTo(15f)
                curveTo(15.552f, 10f, 16f, 9.552f, 16f, 9f)
                verticalLineTo(5.003f)
                close()
            }
        }.build()

        return _Forward!!
    }

@Suppress("ObjectPropertyName")
private var _Forward: ImageVector? = null
