package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.EuroSign: ImageVector
    get() {
        if (_EuroSign != null) {
            return _EuroSign!!
        }
        _EuroSign = ImageVector.Builder(
            name = "EuroSign",
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
                moveTo(19f, 7.111f)
                curveTo(17.775f, 5.219f, 15.856f, 4f, 13.698f, 4f)
                curveTo(9.999f, 4f, 7f, 7.582f, 7f, 12f)
                curveTo(7f, 16.418f, 9.999f, 20f, 13.698f, 20f)
                curveTo(15.856f, 20f, 17.775f, 18.781f, 19f, 16.889f)
                moveTo(5f, 10f)
                horizontalLineTo(14f)
                moveTo(5f, 14f)
                horizontalLineTo(14f)
            }
        }.build()

        return _EuroSign!!
    }

@Suppress("ObjectPropertyName")
private var _EuroSign: ImageVector? = null
