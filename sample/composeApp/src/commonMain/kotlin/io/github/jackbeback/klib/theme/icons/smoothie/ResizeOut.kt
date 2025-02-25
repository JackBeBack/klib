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

val Smoothie.ResizeOut: ImageVector
    get() {
        if (_ResizeOut != null) {
            return _ResizeOut!!
        }
        _ResizeOut = ImageVector.Builder(
            name = "ResizeOut",
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
                    moveTo(13.828f, 13.828f)
                    lineTo(20.899f, 20.899f)
                    moveTo(20.899f, 20.899f)
                    lineTo(20.782f, 15.125f)
                    moveTo(20.899f, 20.899f)
                    lineTo(15.125f, 20.782f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(9.899f, 13.828f)
                    lineTo(2.828f, 20.899f)
                    moveTo(2.828f, 20.899f)
                    lineTo(8.603f, 20.782f)
                    moveTo(2.828f, 20.899f)
                    lineTo(2.946f, 15.125f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(13.828f, 9.899f)
                    lineTo(20.899f, 2.828f)
                    moveTo(20.899f, 2.828f)
                    lineTo(15.125f, 2.946f)
                    moveTo(20.899f, 2.828f)
                    lineTo(20.782f, 8.603f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(9.899f, 9.9f)
                    lineTo(2.828f, 2.828f)
                    moveTo(2.828f, 2.828f)
                    lineTo(2.946f, 8.603f)
                    moveTo(2.828f, 2.828f)
                    lineTo(8.603f, 2.946f)
                }
            }
        }.build()

        return _ResizeOut!!
    }

@Suppress("ObjectPropertyName")
private var _ResizeOut: ImageVector? = null
