package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FlaskRoundPotion: ImageVector
    get() {
        if (_FlaskRoundPotion != null) {
            return _FlaskRoundPotion!!
        }
        _FlaskRoundPotion = ImageVector.Builder(
            name = "FlaskRoundPotion",
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
                moveTo(19f, 16f)
                curveTo(19f, 17.959f, 18.195f, 19.729f, 16.899f, 21f)
                horizontalLineTo(7.101f)
                curveTo(5.804f, 19.729f, 5f, 17.959f, 5f, 16f)
                moveTo(19f, 16f)
                horizontalLineTo(16.803f)
                curveTo(15.627f, 16f, 14.478f, 15.652f, 13.5f, 15f)
                curveTo(12.522f, 14.348f, 11.373f, 14f, 10.197f, 14f)
                horizontalLineTo(10f)
                curveTo(9.818f, 14f, 9.728f, 14f, 9.639f, 14.003f)
                curveTo(8.576f, 14.034f, 7.54f, 14.348f, 6.638f, 14.911f)
                curveTo(6.563f, 14.958f, 6.487f, 15.009f, 6.336f, 15.109f)
                lineTo(5f, 16f)
                moveTo(9f, 3f)
                verticalLineTo(9.674f)
                curveTo(6.635f, 10.797f, 5f, 13.208f, 5f, 16f)
            }
        }.build()

        return _FlaskRoundPotion!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskRoundPotion: ImageVector? = null
