package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FontCase: ImageVector
    get() {
        if (_FontCase != null) {
            return _FontCase!!
        }
        _FontCase = ImageVector.Builder(
            name = "FontCase",
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
                moveTo(22f, 12f)
                verticalLineTo(21f)
                moveTo(2f, 21f)
                lineTo(8f, 3f)
                lineTo(14f, 21f)
                moveTo(11f, 14f)
                horizontalLineTo(5f)
                moveTo(19f, 21f)
                curveTo(17.343f, 21f, 16f, 19.657f, 16f, 18f)
                verticalLineTo(15f)
                curveTo(16f, 13.343f, 17.343f, 12f, 19f, 12f)
                curveTo(20.657f, 12f, 22f, 13.343f, 22f, 15f)
                verticalLineTo(18f)
                curveTo(22f, 19.657f, 20.657f, 21f, 19f, 21f)
                close()
            }
        }.build()

        return _FontCase!!
    }

@Suppress("ObjectPropertyName")
private var _FontCase: ImageVector? = null
