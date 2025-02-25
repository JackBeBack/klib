package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TriangleInstrument: ImageVector
    get() {
        if (_TriangleInstrument != null) {
            return _TriangleInstrument!!
        }
        _TriangleInstrument = ImageVector.Builder(
            name = "TriangleInstrument",
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
                moveTo(13.5f, 13.5f)
                lineTo(16.074f, 10.926f)
                moveTo(20f, 7f)
                lineTo(16.074f, 10.926f)
                moveTo(18.112f, 14.39f)
                lineTo(20.227f, 17.986f)
                curveTo(21.012f, 19.319f, 20.05f, 21f, 18.503f, 21f)
                horizontalLineTo(5.497f)
                curveTo(3.95f, 21f, 2.989f, 19.319f, 3.773f, 17.986f)
                lineTo(10.276f, 6.931f)
                curveTo(11.05f, 5.616f, 12.951f, 5.616f, 13.724f, 6.931f)
                lineTo(16.074f, 10.926f)
                moveTo(12f, 5.945f)
                verticalLineTo(3f)
                moveTo(14f, 15f)
                curveTo(14f, 16.105f, 13.105f, 17f, 12f, 17f)
                curveTo(10.896f, 17f, 10f, 16.105f, 10f, 15f)
                curveTo(10f, 13.895f, 10.896f, 13f, 12f, 13f)
                curveTo(13.105f, 13f, 14f, 13.895f, 14f, 15f)
                close()
            }
        }.build()

        return _TriangleInstrument!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleInstrument: ImageVector? = null
