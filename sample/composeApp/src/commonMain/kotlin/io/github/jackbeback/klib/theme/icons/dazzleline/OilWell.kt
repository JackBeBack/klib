package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.OilWell: ImageVector
    get() {
        if (_OilWell != null) {
            return _OilWell!!
        }
        _OilWell = ImageVector.Builder(
            name = "OilWell",
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
                moveTo(7f, 21f)
                lineTo(8.634f, 16.26f)
                moveTo(18f, 21f)
                lineTo(14.851f, 13.391f)
                moveTo(4f, 14f)
                lineTo(10.439f, 11.028f)
                moveTo(17f, 8f)
                lineTo(13.323f, 9.697f)
                moveTo(8.379f, 17f)
                horizontalLineTo(16.345f)
                moveTo(3f, 21f)
                horizontalLineTo(21f)
                moveTo(4f, 21f)
                verticalLineTo(10f)
                moveTo(13.323f, 9.697f)
                lineTo(12f, 6.5f)
                lineTo(10.439f, 11.028f)
                moveTo(13.323f, 9.697f)
                lineTo(10.439f, 11.028f)
                moveTo(15f, 3.5f)
                lineTo(19f, 12.5f)
                lineTo(19.436f, 12.282f)
                curveTo(20.871f, 11.565f, 21.487f, 9.846f, 20.836f, 8.38f)
                lineTo(19.275f, 4.869f)
                curveTo(18.58f, 3.306f, 16.722f, 2.639f, 15.192f, 3.404f)
                lineTo(15f, 3.5f)
                close()
            }
        }.build()

        return _OilWell!!
    }

@Suppress("ObjectPropertyName")
private var _OilWell: ImageVector? = null
