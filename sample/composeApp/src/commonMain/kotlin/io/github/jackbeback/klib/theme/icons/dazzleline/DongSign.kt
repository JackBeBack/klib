package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DongSign: ImageVector
    get() {
        if (_DongSign != null) {
            return _DongSign!!
        }
        _DongSign = ImageVector.Builder(
            name = "DongSign",
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
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                moveTo(16f, 17f)
                verticalLineTo(3f)
                moveTo(14f, 6f)
                horizontalLineTo(18f)
                moveTo(16f, 13f)
                curveTo(16f, 14.657f, 14.657f, 16f, 13f, 16f)
                curveTo(11.343f, 16f, 10f, 14.657f, 10f, 13f)
                curveTo(10f, 11.343f, 11.343f, 10f, 13f, 10f)
                curveTo(14.657f, 10f, 16f, 11.343f, 16f, 13f)
                close()
            }
        }.build()

        return _DongSign!!
    }

@Suppress("ObjectPropertyName")
private var _DongSign: ImageVector? = null
