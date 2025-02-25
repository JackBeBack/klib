package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Play: ImageVector
    get() {
        if (_Play != null) {
            return _Play!!
        }
        _Play = ImageVector.Builder(
            name = "Play",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.465f, 3.923f)
                curveTo(4.799f, 3.574f, 4f, 4.057f, 4f, 4.809f)
                verticalLineTo(19.191f)
                curveTo(4f, 19.943f, 4.799f, 20.426f, 5.465f, 20.076f)
                lineTo(19.162f, 12.885f)
                curveTo(19.876f, 12.511f, 19.876f, 11.489f, 19.162f, 11.115f)
                lineTo(5.465f, 3.923f)
                close()
                moveTo(2f, 4.809f)
                curveTo(2f, 2.553f, 4.397f, 1.104f, 6.395f, 2.153f)
                lineTo(20.092f, 9.344f)
                curveTo(22.233f, 10.468f, 22.233f, 13.532f, 20.092f, 14.656f)
                lineTo(6.394f, 21.847f)
                curveTo(4.397f, 22.896f, 2f, 21.447f, 2f, 19.191f)
                verticalLineTo(4.809f)
                close()
            }
        }.build()

        return _Play!!
    }

@Suppress("ObjectPropertyName")
private var _Play: ImageVector? = null
