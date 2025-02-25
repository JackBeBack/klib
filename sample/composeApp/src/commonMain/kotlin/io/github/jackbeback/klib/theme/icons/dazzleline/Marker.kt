package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Marker: ImageVector
    get() {
        if (_Marker != null) {
            return _Marker!!
        }
        _Marker = ImageVector.Builder(
            name = "Marker",
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
                moveTo(7f, 7f)
                lineTo(8.737f, 5.263f)
                curveTo(9.529f, 4.471f, 9.925f, 4.075f, 10.382f, 3.926f)
                curveTo(10.784f, 3.796f, 11.216f, 3.796f, 11.618f, 3.926f)
                curveTo(12.075f, 4.075f, 12.471f, 4.471f, 13.263f, 5.263f)
                lineTo(14f, 6f)
                moveTo(10f, 10f)
                lineTo(14f, 14f)
                moveTo(9.5f, 18.5f)
                curveTo(10.158f, 17.842f, 16.644f, 11.356f, 20.004f, 7.996f)
                curveTo(21.109f, 6.892f, 21.105f, 5.105f, 20f, 4f)
                curveTo(18.895f, 2.895f, 17.108f, 2.891f, 16.004f, 3.996f)
                curveTo(12.644f, 7.356f, 6.158f, 13.842f, 5.5f, 14.5f)
                curveTo(3.715f, 16.284f, 2.646f, 20.646f, 3f, 21f)
                curveTo(3.353f, 21.353f, 7.661f, 20.34f, 9.5f, 18.5f)
                close()
            }
        }.build()

        return _Marker!!
    }

@Suppress("ObjectPropertyName")
private var _Marker: ImageVector? = null
