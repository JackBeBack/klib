package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.GooglePlay: ImageVector
    get() {
        if (_GooglePlay != null) {
            return _GooglePlay!!
        }
        _GooglePlay = ImageVector.Builder(
            name = "GooglePlay",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 3.656f)
                curveTo(2f, 2.151f, 3.6f, 1.185f, 4.931f, 1.886f)
                lineTo(20.784f, 10.23f)
                curveTo(22.209f, 10.98f, 22.209f, 13.02f, 20.784f, 13.77f)
                lineTo(4.931f, 22.113f)
                curveTo(3.6f, 22.814f, 2f, 21.849f, 2f, 20.344f)
                verticalLineTo(3.656f)
                close()
                moveTo(19.853f, 12f)
                lineTo(16.268f, 10.113f)
                lineTo(14.224f, 12f)
                lineTo(16.268f, 13.887f)
                lineTo(19.853f, 12f)
                close()
                moveTo(14.39f, 14.875f)
                lineTo(12.75f, 13.361f)
                lineTo(6.758f, 18.892f)
                lineTo(14.39f, 14.875f)
                close()
                moveTo(12.75f, 10.639f)
                lineTo(14.39f, 9.125f)
                lineTo(6.758f, 5.108f)
                lineTo(12.75f, 10.639f)
                close()
                moveTo(4f, 5.284f)
                lineTo(11.276f, 12f)
                lineTo(4f, 18.716f)
                verticalLineTo(5.284f)
                close()
            }
        }.build()

        return _GooglePlay!!
    }

@Suppress("ObjectPropertyName")
private var _GooglePlay: ImageVector? = null
