package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleHeart: ImageVector
    get() {
        if (_CircleHeart != null) {
            return _CircleHeart!!
        }
        _CircleHeart = ImageVector.Builder(
            name = "CircleHeart",
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
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.997f, 9.331f)
                curveTo(11.198f, 8.422f, 9.864f, 8.177f, 8.862f, 9.009f)
                curveTo(7.86f, 9.842f, 7.719f, 11.233f, 8.506f, 12.218f)
                curveTo(8.974f, 12.803f, 10.12f, 13.853f, 10.972f, 14.608f)
                curveTo(11.324f, 14.92f, 11.5f, 15.075f, 11.711f, 15.139f)
                curveTo(11.892f, 15.193f, 12.102f, 15.193f, 12.283f, 15.139f)
                curveTo(12.495f, 15.075f, 12.671f, 14.92f, 13.023f, 14.608f)
                curveTo(13.875f, 13.853f, 15.021f, 12.803f, 15.489f, 12.218f)
                curveTo(16.276f, 11.233f, 16.152f, 9.833f, 15.133f, 9.009f)
                curveTo(14.113f, 8.186f, 12.797f, 8.422f, 11.997f, 9.331f)
                close()
            }
        }.build()

        return _CircleHeart!!
    }

@Suppress("ObjectPropertyName")
private var _CircleHeart: ImageVector? = null
