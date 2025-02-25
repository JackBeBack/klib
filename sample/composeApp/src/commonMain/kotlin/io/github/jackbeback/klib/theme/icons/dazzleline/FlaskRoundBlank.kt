package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FlaskRoundBlank: ImageVector
    get() {
        if (_FlaskRoundBlank != null) {
            return _FlaskRoundBlank!!
        }
        _FlaskRoundBlank = ImageVector.Builder(
            name = "FlaskRoundBlank",
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
                moveTo(17f, 3f)
                horizontalLineTo(7f)
                moveTo(15f, 3f)
                verticalLineTo(9.674f)
                curveTo(17.365f, 10.797f, 19f, 13.208f, 19f, 16f)
                curveTo(19f, 17.959f, 18.195f, 19.729f, 16.899f, 21f)
                horizontalLineTo(7.101f)
                curveTo(5.804f, 19.729f, 5f, 17.959f, 5f, 16f)
                curveTo(5f, 13.208f, 6.635f, 10.797f, 9f, 9.674f)
                verticalLineTo(3f)
            }
        }.build()

        return _FlaskRoundBlank!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskRoundBlank: ImageVector? = null
