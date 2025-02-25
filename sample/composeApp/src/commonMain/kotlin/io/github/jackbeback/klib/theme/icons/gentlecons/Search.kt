package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Search: ImageVector
    get() {
        if (_Search != null) {
            return _Search!!
        }
        _Search = ImageVector.Builder(
            name = "Search",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.039f, 15.624f)
                curveTo(18.271f, 14.084f, 19.008f, 12.13f, 19.008f, 10.004f)
                curveTo(19.008f, 5.031f, 14.977f, 1f, 10.004f, 1f)
                curveTo(5.031f, 1f, 1f, 5.031f, 1f, 10.004f)
                curveTo(1f, 14.977f, 5.031f, 19.008f, 10.004f, 19.008f)
                curveTo(12.13f, 19.008f, 14.084f, 18.271f, 15.624f, 17.039f)
                lineTo(21.292f, 22.707f)
                curveTo(21.683f, 23.098f, 22.316f, 23.098f, 22.707f, 22.707f)
                curveTo(23.098f, 22.316f, 23.098f, 21.683f, 22.707f, 21.292f)
                lineTo(17.039f, 15.624f)
                close()
                moveTo(10.004f, 17.017f)
                curveTo(6.131f, 17.017f, 2.991f, 13.877f, 2.991f, 10.004f)
                curveTo(2.991f, 6.131f, 6.131f, 2.991f, 10.004f, 2.991f)
                curveTo(13.877f, 2.991f, 17.017f, 6.131f, 17.017f, 10.004f)
                curveTo(17.017f, 13.877f, 13.877f, 17.017f, 10.004f, 17.017f)
                close()
            }
        }.build()

        return _Search!!
    }

@Suppress("ObjectPropertyName")
private var _Search: ImageVector? = null
