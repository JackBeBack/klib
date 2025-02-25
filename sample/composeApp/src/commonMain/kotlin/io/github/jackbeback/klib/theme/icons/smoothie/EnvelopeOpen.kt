package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.EnvelopeOpen: ImageVector
    get() {
        if (_EnvelopeOpen != null) {
            return _EnvelopeOpen!!
        }
        _EnvelopeOpen = ImageVector.Builder(
            name = "EnvelopeOpen",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(-24f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFFFFFFFF))) {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(-24f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(3f, 20f)
                    verticalLineTo(8.588f)
                    curveTo(3f, 8.225f, 3.197f, 7.891f, 3.514f, 7.714f)
                    lineTo(11.514f, 3.27f)
                    curveTo(11.816f, 3.102f, 12.184f, 3.102f, 12.486f, 3.27f)
                    lineTo(20.486f, 7.714f)
                    curveTo(20.803f, 7.891f, 21f, 8.225f, 21f, 8.588f)
                    verticalLineTo(20f)
                    curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                    horizontalLineTo(4f)
                    curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(3f, 8.5f)
                    lineTo(12f, 13.5f)
                    lineTo(21f, 8.5f)
                }
            }
        }.build()

        return _EnvelopeOpen!!
    }

@Suppress("ObjectPropertyName")
private var _EnvelopeOpen: ImageVector? = null
