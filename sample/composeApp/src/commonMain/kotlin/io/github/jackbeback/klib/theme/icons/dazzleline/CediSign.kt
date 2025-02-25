package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CediSign: ImageVector
    get() {
        if (_CediSign != null) {
            return _CediSign!!
        }
        _CediSign = ImageVector.Builder(
            name = "CediSign",
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
                moveTo(18f, 7.37f)
                curveTo(16.743f, 5.917f, 14.905f, 5f, 12.857f, 5f)
                curveTo(9.07f, 5f, 6f, 8.134f, 6f, 12f)
                curveTo(6f, 15.866f, 9.07f, 19f, 12.857f, 19f)
                curveTo(14.905f, 19f, 16.743f, 18.083f, 18f, 16.63f)
                moveTo(13f, 21f)
                verticalLineTo(3f)
            }
        }.build()

        return _CediSign!!
    }

@Suppress("ObjectPropertyName")
private var _CediSign: ImageVector? = null
