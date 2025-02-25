package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Link: ImageVector
    get() {
        if (_Link != null) {
            return _Link!!
        }
        _Link = ImageVector.Builder(
            name = "Link",
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
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(16.243f, 12f)
                    lineTo(19.071f, 9.172f)
                    curveTo(19.071f, 9.172f, 20.485f, 7.757f, 18.364f, 5.636f)
                    curveTo(16.243f, 3.515f, 14.828f, 4.929f, 14.828f, 4.929f)
                    curveTo(14.828f, 4.929f, 12.707f, 7.05f, 11.293f, 8.464f)
                    curveTo(9.879f, 9.879f, 9.879f, 11.293f, 10.586f, 12f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(7.757f, 12f)
                    lineTo(4.929f, 14.828f)
                    curveTo(4.929f, 14.828f, 3.515f, 16.243f, 5.636f, 18.364f)
                    curveTo(7.757f, 20.485f, 9.172f, 19.071f, 9.172f, 19.071f)
                    curveTo(9.172f, 19.071f, 10.939f, 17.303f, 12.354f, 15.889f)
                    curveTo(13.768f, 14.475f, 14.121f, 12.707f, 13.414f, 12f)
                }
            }
        }.build()

        return _Link!!
    }

@Suppress("ObjectPropertyName")
private var _Link: ImageVector? = null
