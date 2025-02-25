package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GridHorizontal: ImageVector
    get() {
        if (_GridHorizontal != null) {
            return _GridHorizontal!!
        }
        _GridHorizontal = ImageVector.Builder(
            name = "GridHorizontal",
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
                moveTo(3.5f, 10f)
                horizontalLineTo(6.5f)
                verticalLineTo(7f)
                horizontalLineTo(3.5f)
                verticalLineTo(10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.5f, 17f)
                horizontalLineTo(6.5f)
                verticalLineTo(14f)
                horizontalLineTo(3.5f)
                verticalLineTo(17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 10f)
                horizontalLineTo(13.5f)
                verticalLineTo(7f)
                horizontalLineTo(10.5f)
                verticalLineTo(10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 17f)
                horizontalLineTo(13.5f)
                verticalLineTo(14f)
                horizontalLineTo(10.5f)
                verticalLineTo(17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 10f)
                horizontalLineTo(20.5f)
                verticalLineTo(7f)
                horizontalLineTo(17.5f)
                verticalLineTo(10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 17f)
                horizontalLineTo(20.5f)
                verticalLineTo(14f)
                horizontalLineTo(17.5f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _GridHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _GridHorizontal: ImageVector? = null
