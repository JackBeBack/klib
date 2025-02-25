package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Subdirectory: ImageVector
    get() {
        if (_Subdirectory != null) {
            return _Subdirectory!!
        }
        _Subdirectory = ImageVector.Builder(
            name = "Subdirectory",
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
                moveTo(3f, 7f)
                verticalLineTo(8.2f)
                curveTo(3f, 9.88f, 3f, 10.72f, 3.327f, 11.362f)
                curveTo(3.615f, 11.927f, 4.074f, 12.385f, 4.638f, 12.673f)
                curveTo(5.28f, 13f, 6.12f, 13f, 7.8f, 13f)
                horizontalLineTo(21f)
                moveTo(21f, 13f)
                lineTo(17f, 9f)
                moveTo(21f, 13f)
                lineTo(17f, 17f)
            }
        }.build()

        return _Subdirectory!!
    }

@Suppress("ObjectPropertyName")
private var _Subdirectory: ImageVector? = null
