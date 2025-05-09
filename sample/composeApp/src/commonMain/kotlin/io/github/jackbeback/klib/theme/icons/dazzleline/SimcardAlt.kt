package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SimcardAlt: ImageVector
    get() {
        if (_SimcardAlt != null) {
            return _SimcardAlt!!
        }
        _SimcardAlt = ImageVector.Builder(
            name = "SimcardAlt",
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
                moveTo(13.462f, 3f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 3f, 6.52f, 3f, 6.092f, 3.218f)
                curveTo(5.716f, 3.41f, 5.41f, 3.716f, 5.218f, 4.092f)
                curveTo(5f, 4.52f, 5f, 5.08f, 5f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(5f, 18.92f, 5f, 19.48f, 5.218f, 19.908f)
                curveTo(5.41f, 20.284f, 5.716f, 20.59f, 6.092f, 20.782f)
                curveTo(6.52f, 21f, 7.08f, 21f, 8.2f, 21f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 21f, 17.48f, 21f, 17.908f, 20.782f)
                curveTo(18.284f, 20.59f, 18.59f, 20.284f, 18.782f, 19.908f)
                curveTo(19f, 19.48f, 19f, 18.92f, 19f, 17.8f)
                verticalLineTo(9.123f)
                curveTo(19f, 8.706f, 19f, 8.498f, 18.959f, 8.299f)
                curveTo(18.923f, 8.123f, 18.863f, 7.952f, 18.781f, 7.792f)
                curveTo(18.689f, 7.611f, 18.559f, 7.448f, 18.299f, 7.123f)
                lineTo(15.961f, 4.201f)
                curveTo(15.608f, 3.76f, 15.432f, 3.539f, 15.213f, 3.381f)
                curveTo(15.019f, 3.24f, 14.801f, 3.135f, 14.57f, 3.072f)
                curveTo(14.309f, 3f, 14.027f, 3f, 13.462f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 14f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _SimcardAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SimcardAlt: ImageVector? = null
