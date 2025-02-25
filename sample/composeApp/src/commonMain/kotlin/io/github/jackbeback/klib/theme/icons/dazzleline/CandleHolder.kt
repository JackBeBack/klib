package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CandleHolder: ImageVector
    get() {
        if (_CandleHolder != null) {
            return _CandleHolder!!
        }
        _CandleHolder = ImageVector.Builder(
            name = "CandleHolder",
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
                moveTo(13f, 21f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                moveTo(19f, 21f)
                curveTo(20.105f, 21f, 21f, 20.105f, 21f, 19f)
                curveTo(21f, 17.895f, 20.105f, 17f, 19f, 17f)
                curveTo(17.895f, 17f, 17f, 17.895f, 17f, 19f)
                curveTo(17f, 20.105f, 17.895f, 21f, 19f, 21f)
                close()
                moveTo(19f, 21f)
                horizontalLineTo(3f)
                moveTo(8f, 11f)
                verticalLineTo(14f)
                moveTo(9f, 8f)
                curveTo(9.897f, 8f, 10.656f, 7.41f, 10.91f, 6.596f)
                curveTo(11.027f, 6.22f, 10.883f, 5.825f, 10.664f, 5.496f)
                lineTo(9f, 3f)
                lineTo(7.336f, 5.496f)
                curveTo(7.117f, 5.825f, 6.973f, 6.22f, 7.09f, 6.596f)
                curveTo(7.344f, 7.41f, 8.103f, 8f, 9f, 8f)
                close()
            }
        }.build()

        return _CandleHolder!!
    }

@Suppress("ObjectPropertyName")
private var _CandleHolder: ImageVector? = null
