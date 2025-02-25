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

val Smoothie.LinkBroken: ImageVector
    get() {
        if (_LinkBroken != null) {
            return _LinkBroken!!
        }
        _LinkBroken = ImageVector.Builder(
            name = "LinkBroken",
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
                    moveTo(14.828f, 13.414f)
                    lineTo(19.071f, 9.172f)
                    curveTo(19.071f, 9.172f, 20.485f, 7.757f, 18.364f, 5.636f)
                    curveTo(16.243f, 3.515f, 14.828f, 4.929f, 14.828f, 4.929f)
                    curveTo(14.828f, 4.929f, 12f, 7.757f, 10.586f, 9.172f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(16.596f, 14.475f)
                    lineTo(19.425f, 15.182f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(15.535f, 15.535f)
                    lineTo(17.657f, 17.657f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(14.475f, 16.596f)
                    lineTo(15.182f, 19.425f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(7.404f, 9.525f)
                    lineTo(4.575f, 8.818f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(8.464f, 8.464f)
                    lineTo(6.343f, 6.343f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(9.525f, 7.404f)
                    lineTo(8.818f, 4.575f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(9.171f, 10.586f)
                    lineTo(4.929f, 14.828f)
                    curveTo(4.929f, 14.828f, 3.515f, 16.243f, 5.636f, 18.364f)
                    curveTo(7.757f, 20.485f, 9.171f, 19.071f, 9.171f, 19.071f)
                    curveTo(9.171f, 19.071f, 12f, 16.243f, 13.414f, 14.828f)
                }
            }
        }.build()

        return _LinkBroken!!
    }

@Suppress("ObjectPropertyName")
private var _LinkBroken: ImageVector? = null
