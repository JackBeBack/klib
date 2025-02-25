package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GridVertical: ImageVector
    get() {
        if (_GridVertical != null) {
            return _GridVertical!!
        }
        _GridVertical = ImageVector.Builder(
            name = "GridVertical",
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
                moveTo(7f, 6.5f)
                horizontalLineTo(10f)
                verticalLineTo(3.5f)
                horizontalLineTo(7f)
                verticalLineTo(6.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 6.5f)
                horizontalLineTo(17f)
                verticalLineTo(3.5f)
                horizontalLineTo(14f)
                verticalLineTo(6.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 13.5f)
                horizontalLineTo(10f)
                verticalLineTo(10.5f)
                horizontalLineTo(7f)
                verticalLineTo(13.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 13.5f)
                horizontalLineTo(17f)
                verticalLineTo(10.5f)
                horizontalLineTo(14f)
                verticalLineTo(13.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 20.5f)
                horizontalLineTo(10f)
                verticalLineTo(17.5f)
                horizontalLineTo(7f)
                verticalLineTo(20.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 20.5f)
                horizontalLineTo(17f)
                verticalLineTo(17.5f)
                horizontalLineTo(14f)
                verticalLineTo(20.5f)
                close()
            }
        }.build()

        return _GridVertical!!
    }

@Suppress("ObjectPropertyName")
private var _GridVertical: ImageVector? = null
