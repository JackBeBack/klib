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

val Smoothie.Cloud: ImageVector
    get() {
        if (_Cloud != null) {
            return _Cloud!!
        }
        _Cloud = ImageVector.Builder(
            name = "Cloud",
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
                    moveTo(6.5f, 18f)
                    horizontalLineTo(13f)
                    horizontalLineTo(19f)
                    curveTo(20.696f, 17.757f, 22f, 16.263f, 22f, 14.5f)
                    curveTo(22f, 12.71f, 20.656f, 11.233f, 18.921f, 11.025f)
                    curveTo(18.455f, 8.175f, 15.982f, 6f, 13f, 6f)
                    curveTo(10.712f, 6f, 8.723f, 7.281f, 7.711f, 9.165f)
                    curveTo(7.326f, 9.057f, 6.919f, 9f, 6.5f, 9f)
                    curveTo(4.015f, 9f, 2f, 11.015f, 2f, 13.5f)
                    curveTo(2f, 15.985f, 4.015f, 18f, 6.5f, 18f)
                    close()
                }
            }
        }.build()

        return _Cloud!!
    }

@Suppress("ObjectPropertyName")
private var _Cloud: ImageVector? = null
