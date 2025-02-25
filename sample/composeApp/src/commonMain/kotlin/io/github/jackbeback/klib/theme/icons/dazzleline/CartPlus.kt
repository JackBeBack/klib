package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CartPlus: ImageVector
    get() {
        if (_CartPlus != null) {
            return _CartPlus!!
        }
        _CartPlus = ImageVector.Builder(
            name = "CartPlus",
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
                moveTo(21f, 5f)
                lineTo(19f, 12f)
                horizontalLineTo(7.377f)
                moveTo(20f, 16f)
                horizontalLineTo(8f)
                lineTo(6f, 3f)
                horizontalLineTo(3f)
                moveTo(16f, 5.5f)
                horizontalLineTo(13.5f)
                moveTo(13.5f, 5.5f)
                horizontalLineTo(11f)
                moveTo(13.5f, 5.5f)
                verticalLineTo(8f)
                moveTo(13.5f, 5.5f)
                verticalLineTo(3f)
                moveTo(9f, 20f)
                curveTo(9f, 20.552f, 8.552f, 21f, 8f, 21f)
                curveTo(7.448f, 21f, 7f, 20.552f, 7f, 20f)
                curveTo(7f, 19.448f, 7.448f, 19f, 8f, 19f)
                curveTo(8.552f, 19f, 9f, 19.448f, 9f, 20f)
                close()
                moveTo(20f, 20f)
                curveTo(20f, 20.552f, 19.552f, 21f, 19f, 21f)
                curveTo(18.448f, 21f, 18f, 20.552f, 18f, 20f)
                curveTo(18f, 19.448f, 18.448f, 19f, 19f, 19f)
                curveTo(19.552f, 19f, 20f, 19.448f, 20f, 20f)
                close()
            }
        }.build()

        return _CartPlus!!
    }

@Suppress("ObjectPropertyName")
private var _CartPlus: ImageVector? = null
