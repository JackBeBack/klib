package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleExclamationCheck: ImageVector
    get() {
        if (_CircleExclamationCheck != null) {
            return _CircleExclamationCheck!!
        }
        _CircleExclamationCheck = ImageVector.Builder(
            name = "CircleExclamationCheck",
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
                moveTo(19.485f, 7f)
                curveTo(17.87f, 4.588f, 15.12f, 3f, 12f, 3f)
                curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                curveTo(14.665f, 21f, 17.06f, 19.841f, 18.708f, 18f)
                moveTo(16f, 12.286f)
                lineTo(17.8f, 14f)
                lineTo(22f, 10f)
                moveTo(12f, 8f)
                verticalLineTo(13f)
                moveTo(12f, 16f)
                horizontalLineTo(12.01f)
            }
        }.build()

        return _CircleExclamationCheck!!
    }

@Suppress("ObjectPropertyName")
private var _CircleExclamationCheck: ImageVector? = null
