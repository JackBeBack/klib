package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DropletDegree: ImageVector
    get() {
        if (_DropletDegree != null) {
            return _DropletDegree!!
        }
        _DropletDegree = ImageVector.Builder(
            name = "DropletDegree",
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
                moveTo(21f, 14.7f)
                curveTo(21f, 18.179f, 19.044f, 21f, 15.5f, 21f)
                curveTo(11.956f, 21f, 10f, 18.179f, 10f, 14.7f)
                curveTo(10f, 11.221f, 15.5f, 3f, 15.5f, 3f)
                curveTo(15.5f, 3f, 21f, 11.221f, 21f, 14.7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 6f)
                curveTo(9f, 7.657f, 7.657f, 9f, 6f, 9f)
                curveTo(4.343f, 9f, 3f, 7.657f, 3f, 6f)
                curveTo(3f, 4.343f, 4.343f, 3f, 6f, 3f)
                curveTo(7.657f, 3f, 9f, 4.343f, 9f, 6f)
                close()
            }
        }.build()

        return _DropletDegree!!
    }

@Suppress("ObjectPropertyName")
private var _DropletDegree: ImageVector? = null
