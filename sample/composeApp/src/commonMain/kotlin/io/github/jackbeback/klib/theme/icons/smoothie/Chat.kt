package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Chat: ImageVector
    get() {
        if (_Chat != null) {
            return _Chat!!
        }
        _Chat = ImageVector.Builder(
            name = "Chat",
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
                    moveTo(20f, 12f)
                    curveTo(20f, 16.418f, 16.418f, 20f, 12f, 20f)
                    curveTo(10.594f, 20f, 9.272f, 19.637f, 8.124f, 19f)
                    curveTo(7.533f, 18.672f, 4.487f, 20.462f, 4f, 20f)
                    curveTo(3.441f, 19.471f, 5.458f, 16.671f, 5.07f, 16f)
                    curveTo(4.39f, 14.823f, 4f, 13.457f, 4f, 12f)
                    curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                    curveTo(16.418f, 4f, 20f, 7.582f, 20f, 12f)
                    close()
                }
            }
        }.build()

        return _Chat!!
    }

@Suppress("ObjectPropertyName")
private var _Chat: ImageVector? = null
