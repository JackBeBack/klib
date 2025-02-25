package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Cleaver: ImageVector
    get() {
        if (_Cleaver != null) {
            return _Cleaver!!
        }
        _Cleaver = ImageVector.Builder(
            name = "Cleaver",
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
                moveTo(16.211f, 12.88f)
                lineTo(9f, 17f)
                lineTo(3f, 7f)
                lineTo(10f, 3f)
                lineTo(20.381f, 19.515f)
                curveTo(20.731f, 20.072f, 20.595f, 20.804f, 20.069f, 21.198f)
                curveTo(19.488f, 21.634f, 18.661f, 21.492f, 18.259f, 20.888f)
                lineTo(16f, 17.5f)
                lineTo(16.5f, 16f)
                lineTo(15f, 13.571f)
                moveTo(9f, 7f)
                lineTo(9.007f, 7.007f)
            }
        }.build()

        return _Cleaver!!
    }

@Suppress("ObjectPropertyName")
private var _Cleaver: ImageVector? = null
