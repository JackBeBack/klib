package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Scythe: ImageVector
    get() {
        if (_Scythe != null) {
            return _Scythe!!
        }
        _Scythe = ImageVector.Builder(
            name = "Scythe",
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
                moveTo(3.394f, 6.976f)
                curveTo(8.383f, 2.641f, 15.418f, 1.911f, 21.097f, 4.784f)
                curveTo(15.706f, 4.363f, 10.178f, 6.119f, 5.939f, 10.052f)
                moveTo(3f, 6.5f)
                lineTo(15f, 21f)
            }
        }.build()

        return _Scythe!!
    }

@Suppress("ObjectPropertyName")
private var _Scythe: ImageVector? = null
