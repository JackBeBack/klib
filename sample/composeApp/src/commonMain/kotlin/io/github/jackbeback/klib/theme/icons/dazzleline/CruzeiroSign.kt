package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CruzeiroSign: ImageVector
    get() {
        if (_CruzeiroSign != null) {
            return _CruzeiroSign!!
        }
        _CruzeiroSign = ImageVector.Builder(
            name = "CruzeiroSign",
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
                moveTo(19f, 4.974f)
                curveTo(17.525f, 3.739f, 15.653f, 3f, 13.615f, 3f)
                curveTo(8.857f, 3f, 5f, 7.029f, 5f, 12f)
                curveTo(5f, 16.971f, 8.857f, 21f, 13.615f, 21f)
                curveTo(15.653f, 21f, 17.525f, 20.261f, 19f, 19.026f)
                moveTo(18f, 12.316f)
                curveTo(17.341f, 11.493f, 16.506f, 11f, 15.596f, 11f)
                curveTo(14.517f, 11f, 13.698f, 11.884f, 13f, 13f)
                moveTo(13f, 21f)
                verticalLineTo(11f)
            }
        }.build()

        return _CruzeiroSign!!
    }

@Suppress("ObjectPropertyName")
private var _CruzeiroSign: ImageVector? = null
