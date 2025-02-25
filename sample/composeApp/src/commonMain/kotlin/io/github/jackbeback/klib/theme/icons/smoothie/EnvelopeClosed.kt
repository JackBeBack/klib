package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.EnvelopeClosed: ImageVector
    get() {
        if (_EnvelopeClosed != null) {
            return _EnvelopeClosed!!
        }
        _EnvelopeClosed = ImageVector.Builder(
            name = "EnvelopeClosed",
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
                    moveTo(3f, 17.5f)
                    verticalLineTo(6.5f)
                    curveTo(3f, 5.948f, 3.448f, 5.5f, 4f, 5.5f)
                    horizontalLineTo(12f)
                    horizontalLineTo(20f)
                    curveTo(20.552f, 5.5f, 21f, 5.948f, 21f, 6.5f)
                    verticalLineTo(17.5f)
                    curveTo(21f, 18.052f, 20.552f, 18.5f, 20f, 18.5f)
                    horizontalLineTo(4f)
                    curveTo(3.448f, 18.5f, 3f, 18.052f, 3f, 17.5f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(3f, 6f)
                    lineTo(12f, 12f)
                    lineTo(21f, 6f)
                }
            }
        }.build()

        return _EnvelopeClosed!!
    }

@Suppress("ObjectPropertyName")
private var _EnvelopeClosed: ImageVector? = null
