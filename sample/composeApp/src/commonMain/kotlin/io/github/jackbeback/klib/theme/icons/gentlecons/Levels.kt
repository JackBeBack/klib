package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Levels: ImageVector
    get() {
        if (_Levels != null) {
            return _Levels!!
        }
        _Levels = ImageVector.Builder(
            name = "Levels",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 2f)
                curveTo(6f, 1.448f, 6.448f, 1f, 7f, 1f)
                curveTo(7.552f, 1f, 8f, 1.448f, 8f, 2f)
                verticalLineTo(5.146f)
                curveTo(9.443f, 5.578f, 10.495f, 6.916f, 10.495f, 8.5f)
                curveTo(10.495f, 10.084f, 9.443f, 11.422f, 8f, 11.854f)
                verticalLineTo(22f)
                curveTo(8f, 22.552f, 7.552f, 23f, 7f, 23f)
                curveTo(6.448f, 23f, 6f, 22.552f, 6f, 22f)
                verticalLineTo(11.856f)
                curveTo(4.552f, 11.428f, 3.495f, 10.087f, 3.495f, 8.5f)
                curveTo(3.495f, 6.913f, 4.552f, 5.572f, 6f, 5.144f)
                verticalLineTo(2f)
                close()
                moveTo(6.995f, 10.005f)
                curveTo(6.164f, 10.005f, 5.49f, 9.331f, 5.49f, 8.5f)
                curveTo(5.49f, 7.669f, 6.164f, 6.995f, 6.995f, 6.995f)
                curveTo(7.826f, 6.995f, 8.5f, 7.669f, 8.5f, 8.5f)
                curveTo(8.5f, 9.331f, 7.826f, 10.005f, 6.995f, 10.005f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18f, 18.857f)
                curveTo(19.448f, 18.428f, 20.505f, 17.087f, 20.505f, 15.5f)
                curveTo(20.505f, 13.913f, 19.448f, 12.572f, 18f, 12.144f)
                verticalLineTo(2f)
                curveTo(18f, 1.448f, 17.552f, 1f, 17f, 1f)
                curveTo(16.448f, 1f, 16f, 1.448f, 16f, 2f)
                verticalLineTo(12.146f)
                curveTo(14.557f, 12.578f, 13.505f, 13.916f, 13.505f, 15.5f)
                curveTo(13.505f, 17.084f, 14.557f, 18.422f, 16f, 18.854f)
                verticalLineTo(22f)
                curveTo(16f, 22.552f, 16.448f, 23f, 17f, 23f)
                curveTo(17.552f, 23f, 18f, 22.552f, 18f, 22f)
                verticalLineTo(18.857f)
                close()
                moveTo(17.005f, 17.005f)
                curveTo(16.174f, 17.005f, 15.5f, 16.331f, 15.5f, 15.5f)
                curveTo(15.5f, 14.669f, 16.174f, 13.995f, 17.005f, 13.995f)
                curveTo(17.836f, 13.995f, 18.51f, 14.669f, 18.51f, 15.5f)
                curveTo(18.51f, 16.331f, 17.836f, 17.005f, 17.005f, 17.005f)
                close()
            }
        }.build()

        return _Levels!!
    }

@Suppress("ObjectPropertyName")
private var _Levels: ImageVector? = null
