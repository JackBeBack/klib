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

val Smoothie.Tag: ImageVector
    get() {
        if (_Tag != null) {
            return _Tag!!
        }
        _Tag = ImageVector.Builder(
            name = "Tag",
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
                    moveTo(9.169f, 21.899f)
                    lineTo(19.436f, 11.633f)
                    curveTo(19.65f, 11.418f, 19.756f, 11.117f, 19.722f, 10.815f)
                    lineTo(19.157f, 5.724f)
                    curveTo(19.105f, 5.259f, 18.738f, 4.892f, 18.273f, 4.841f)
                    lineTo(13.182f, 4.275f)
                    curveTo(12.88f, 4.241f, 12.579f, 4.347f, 12.365f, 4.562f)
                    lineTo(2.098f, 14.828f)
                    curveTo(1.707f, 15.219f, 1.707f, 15.852f, 2.098f, 16.243f)
                    lineTo(7.755f, 21.899f)
                    curveTo(8.145f, 22.29f, 8.778f, 22.29f, 9.169f, 21.899f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(14.12f, 9.881f)
                    moveToRelative(-1.414f, -1.414f)
                    arcToRelative(2f, 2f, 96.326f, isMoreThanHalf = true, isPositiveArc = true, 2.828f, 2.828f)
                    arcToRelative(2f, 2f, 71.565f, isMoreThanHalf = true, isPositiveArc = true, -2.828f, -2.828f)
                }
            }
        }.build()

        return _Tag!!
    }

@Suppress("ObjectPropertyName")
private var _Tag: ImageVector? = null
