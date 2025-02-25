package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TrafficCone: ImageVector
    get() {
        if (_TrafficCone != null) {
            return _TrafficCone!!
        }
        _TrafficCone = ImageVector.Builder(
            name = "TrafficCone",
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
                moveTo(8.889f, 10f)
                horizontalLineTo(15.111f)
                moveTo(6.944f, 15f)
                horizontalLineTo(17.056f)
                moveTo(3f, 20f)
                horizontalLineTo(21f)
                moveTo(5f, 20f)
                lineTo(10.3f, 6.371f)
                curveTo(10.829f, 5.012f, 11.093f, 4.332f, 11.474f, 4.134f)
                curveTo(11.804f, 3.962f, 12.196f, 3.962f, 12.526f, 4.134f)
                curveTo(12.907f, 4.332f, 13.171f, 5.012f, 13.7f, 6.371f)
                lineTo(19f, 20f)
            }
        }.build()

        return _TrafficCone!!
    }

@Suppress("ObjectPropertyName")
private var _TrafficCone: ImageVector? = null
