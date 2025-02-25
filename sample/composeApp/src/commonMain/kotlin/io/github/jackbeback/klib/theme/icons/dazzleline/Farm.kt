package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Farm: ImageVector
    get() {
        if (_Farm != null) {
            return _Farm!!
        }
        _Farm = ImageVector.Builder(
            name = "Farm",
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
                moveTo(9f, 12f)
                verticalLineTo(21f)
                moveTo(9f, 12f)
                lineTo(10.846f, 7f)
                lineTo(15f, 5f)
                lineTo(19.154f, 7f)
                lineTo(21f, 12f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                moveTo(9f, 12f)
                verticalLineTo(8f)
                moveTo(9f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                curveTo(3f, 4.343f, 4.343f, 3f, 6f, 3f)
                curveTo(7.657f, 3f, 9f, 4.343f, 9f, 6f)
                verticalLineTo(8f)
                moveTo(9f, 8f)
                horizontalLineTo(3f)
                moveTo(13f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                close()
                moveTo(14.5f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(15.5f)
                verticalLineTo(10f)
                horizontalLineTo(14.5f)
                close()
            }
        }.build()

        return _Farm!!
    }

@Suppress("ObjectPropertyName")
private var _Farm: ImageVector? = null
