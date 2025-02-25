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

val Smoothie.SoundMax: ImageVector
    get() {
        if (_SoundMax != null) {
            return _SoundMax!!
        }
        _SoundMax = ImageVector.Builder(
            name = "SoundMax",
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
                    moveTo(3f, 16f)
                    verticalLineTo(8f)
                    horizontalLineTo(6f)
                    lineTo(11f, 4f)
                    verticalLineTo(20f)
                    lineTo(6f, 16f)
                    horizontalLineTo(3f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(13f, 9f)
                    curveTo(13f, 9f, 15f, 9.5f, 15f, 12f)
                    curveTo(15f, 14.5f, 13f, 15f, 13f, 15f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(15f, 7f)
                    curveTo(15f, 7f, 18f, 7.833f, 18f, 12f)
                    curveTo(18f, 16.167f, 15f, 17f, 15f, 17f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(17f, 5f)
                    curveTo(17f, 5f, 21f, 6.167f, 21f, 12f)
                    curveTo(21f, 17.833f, 17f, 19f, 17f, 19f)
                }
            }
        }.build()

        return _SoundMax!!
    }

@Suppress("ObjectPropertyName")
private var _SoundMax: ImageVector? = null
