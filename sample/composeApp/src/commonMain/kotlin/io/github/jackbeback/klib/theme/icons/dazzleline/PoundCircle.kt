package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PoundCircle: ImageVector
    get() {
        if (_PoundCircle != null) {
            return _PoundCircle!!
        }
        _PoundCircle = ImageVector.Builder(
            name = "PoundCircle",
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
                moveTo(15.5f, 8.167f)
                curveTo(15f, 7.056f, 14f, 6.5f, 13f, 6.5f)
                curveTo(11.343f, 6.5f, 10f, 7.992f, 10f, 9.833f)
                verticalLineTo(12.5f)
                moveTo(10f, 12.5f)
                verticalLineTo(14.278f)
                curveTo(10f, 16.5f, 8f, 16.5f, 8f, 16.5f)
                horizontalLineTo(16f)
                moveTo(10f, 12.5f)
                horizontalLineTo(8f)
                moveTo(10f, 12.5f)
                horizontalLineTo(14f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
        }.build()

        return _PoundCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PoundCircle: ImageVector? = null
