package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.StarAlt3: ImageVector
    get() {
        if (_StarAlt3 != null) {
            return _StarAlt3!!
        }
        _StarAlt3 = ImageVector.Builder(
            name = "StarAlt3",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                lineTo(14.036f, 8.162f)
                curveTo(14.224f, 8.638f, 14.318f, 8.876f, 14.461f, 9.077f)
                curveTo(14.589f, 9.255f, 14.745f, 9.411f, 14.923f, 9.539f)
                curveTo(15.124f, 9.682f, 15.362f, 9.776f, 15.839f, 9.964f)
                lineTo(21f, 12f)
                lineTo(15.839f, 14.036f)
                curveTo(15.362f, 14.224f, 15.124f, 14.318f, 14.923f, 14.461f)
                curveTo(14.745f, 14.589f, 14.589f, 14.745f, 14.461f, 14.923f)
                curveTo(14.318f, 15.124f, 14.224f, 15.362f, 14.036f, 15.839f)
                lineTo(12f, 21f)
                lineTo(9.964f, 15.839f)
                curveTo(9.776f, 15.362f, 9.682f, 15.124f, 9.539f, 14.923f)
                curveTo(9.411f, 14.745f, 9.255f, 14.589f, 9.077f, 14.461f)
                curveTo(8.876f, 14.318f, 8.638f, 14.224f, 8.162f, 14.036f)
                lineTo(3f, 12f)
                lineTo(8.162f, 9.964f)
                curveTo(8.638f, 9.776f, 8.876f, 9.682f, 9.077f, 9.539f)
                curveTo(9.255f, 9.411f, 9.411f, 9.255f, 9.539f, 9.077f)
                curveTo(9.682f, 8.876f, 9.776f, 8.638f, 9.964f, 8.162f)
                lineTo(12f, 3f)
                close()
            }
        }.build()

        return _StarAlt3!!
    }

@Suppress("ObjectPropertyName")
private var _StarAlt3: ImageVector? = null
