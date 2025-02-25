package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Bold: ImageVector
    get() {
        if (_Bold != null) {
            return _Bold!!
        }
        _Bold = ImageVector.Builder(
            name = "Bold",
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
                moveTo(6f, 12f)
                horizontalLineTo(12.5f)
                curveTo(14.985f, 12f, 17f, 9.985f, 17f, 7.5f)
                curveTo(17f, 5.015f, 14.985f, 3f, 12.5f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                close()
                moveTo(6f, 12f)
                horizontalLineTo(13.5f)
                curveTo(15.985f, 12f, 18f, 14.015f, 18f, 16.5f)
                curveTo(18f, 18.985f, 15.985f, 21f, 13.5f, 21f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _Bold!!
    }

@Suppress("ObjectPropertyName")
private var _Bold: ImageVector? = null
