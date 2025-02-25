package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Drum: ImageVector
    get() {
        if (_Drum != null) {
            return _Drum!!
        }
        _Drum = ImageVector.Builder(
            name = "Drum",
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
                moveTo(21f, 10f)
                curveTo(21f, 12.209f, 16.971f, 14f, 12f, 14f)
                moveTo(21f, 10f)
                curveTo(21f, 7.791f, 16.971f, 6f, 12f, 6f)
                curveTo(7.029f, 6f, 3f, 7.791f, 3f, 10f)
                moveTo(21f, 10f)
                verticalLineTo(16f)
                curveTo(21f, 18.209f, 16.971f, 20f, 12f, 20f)
                moveTo(12f, 14f)
                curveTo(7.029f, 14f, 3f, 12.209f, 3f, 10f)
                moveTo(12f, 14f)
                verticalLineTo(20f)
                moveTo(3f, 10f)
                verticalLineTo(16f)
                curveTo(3f, 18.209f, 7.029f, 20f, 12f, 20f)
                moveTo(7f, 19.326f)
                verticalLineTo(13.326f)
                moveTo(17f, 19.326f)
                verticalLineTo(13.326f)
                moveTo(12f, 10f)
                lineTo(20f, 4f)
            }
        }.build()

        return _Drum!!
    }

@Suppress("ObjectPropertyName")
private var _Drum: ImageVector? = null
