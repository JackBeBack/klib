package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TentArrowDownToLine: ImageVector
    get() {
        if (_TentArrowDownToLine != null) {
            return _TentArrowDownToLine!!
        }
        _TentArrowDownToLine = ImageVector.Builder(
            name = "TentArrowDownToLine",
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
                moveTo(5f, 3f)
                verticalLineTo(9f)
                moveTo(5f, 9f)
                lineTo(3f, 7f)
                moveTo(5f, 9f)
                lineTo(7f, 7f)
                moveTo(3f, 21f)
                horizontalLineTo(6f)
                moveTo(6f, 21f)
                horizontalLineTo(13f)
                moveTo(6f, 21f)
                lineTo(6.843f, 14.253f)
                curveTo(6.901f, 13.79f, 6.93f, 13.558f, 7.008f, 13.346f)
                curveTo(7.077f, 13.157f, 7.174f, 12.98f, 7.295f, 12.82f)
                curveTo(7.432f, 12.64f, 7.612f, 12.49f, 7.97f, 12.192f)
                lineTo(13f, 8f)
                moveTo(13f, 21f)
                horizontalLineTo(17f)
                moveTo(13f, 21f)
                verticalLineTo(15f)
                moveTo(17f, 21f)
                horizontalLineTo(20f)
                moveTo(17f, 21f)
                lineTo(13f, 15f)
                moveTo(20f, 21f)
                horizontalLineTo(21f)
                moveTo(20f, 21f)
                lineTo(19.157f, 14.253f)
                curveTo(19.099f, 13.79f, 19.07f, 13.558f, 18.992f, 13.346f)
                curveTo(18.923f, 13.157f, 18.826f, 12.98f, 18.705f, 12.82f)
                curveTo(18.568f, 12.64f, 18.388f, 12.49f, 18.03f, 12.192f)
                lineTo(13f, 8f)
                moveTo(13f, 8f)
                verticalLineTo(15f)
            }
        }.build()

        return _TentArrowDownToLine!!
    }

@Suppress("ObjectPropertyName")
private var _TentArrowDownToLine: ImageVector? = null
