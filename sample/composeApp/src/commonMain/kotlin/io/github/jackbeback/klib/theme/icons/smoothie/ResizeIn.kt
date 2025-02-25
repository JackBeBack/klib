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

val Smoothie.ResizeIn: ImageVector
    get() {
        if (_ResizeIn != null) {
            return _ResizeIn!!
        }
        _ResizeIn = ImageVector.Builder(
            name = "ResizeIn",
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
                    moveTo(20.899f, 20.899f)
                    lineTo(13.828f, 13.828f)
                    moveTo(13.828f, 13.828f)
                    lineTo(13.946f, 19.603f)
                    moveTo(13.828f, 13.828f)
                    lineTo(19.603f, 13.946f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(2.828f, 20.899f)
                    lineTo(9.899f, 13.828f)
                    moveTo(9.899f, 13.828f)
                    lineTo(4.125f, 13.946f)
                    moveTo(9.899f, 13.828f)
                    lineTo(9.782f, 19.603f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(20.899f, 2.828f)
                    lineTo(13.828f, 9.899f)
                    moveTo(13.828f, 9.899f)
                    lineTo(19.603f, 9.782f)
                    moveTo(13.828f, 9.899f)
                    lineTo(13.946f, 4.125f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(2.828f, 2.828f)
                    lineTo(9.899f, 9.899f)
                    moveTo(9.899f, 9.899f)
                    lineTo(9.782f, 4.125f)
                    moveTo(9.899f, 9.899f)
                    lineTo(4.125f, 9.782f)
                }
            }
        }.build()

        return _ResizeIn!!
    }

@Suppress("ObjectPropertyName")
private var _ResizeIn: ImageVector? = null
