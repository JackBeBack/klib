package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Key: ImageVector
    get() {
        if (_Key != null) {
            return _Key!!
        }
        _Key = ImageVector.Builder(
            name = "Key",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.321f, 10.685f)
                lineTo(4f, 19f)
                lineTo(6f, 21f)
                moveTo(7f, 16f)
                lineTo(9f, 18f)
                moveTo(20f, 7.5f)
                curveTo(20f, 9.985f, 17.985f, 12f, 15.5f, 12f)
                curveTo(13.015f, 12f, 11f, 9.985f, 11f, 7.5f)
                curveTo(11f, 5.015f, 13.015f, 3f, 15.5f, 3f)
                curveTo(17.985f, 3f, 20f, 5.015f, 20f, 7.5f)
                close()
            }
        }.build()

        return _Key!!
    }

@Suppress("ObjectPropertyName")
private var _Key: ImageVector? = null
