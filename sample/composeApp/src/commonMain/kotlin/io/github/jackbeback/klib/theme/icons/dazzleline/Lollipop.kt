package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Lollipop: ImageVector
    get() {
        if (_Lollipop != null) {
            return _Lollipop!!
        }
        _Lollipop = ImageVector.Builder(
            name = "Lollipop",
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
                moveTo(21f, 21f)
                lineTo(15.803f, 15.803f)
                moveTo(15.803f, 15.803f)
                curveTo(17.16f, 14.446f, 18f, 12.571f, 18f, 10.5f)
                curveTo(18f, 6.358f, 14.642f, 3f, 10.5f, 3f)
                curveTo(6.358f, 3f, 3f, 6.358f, 3f, 10.5f)
                curveTo(3f, 14.642f, 6.358f, 18f, 10.5f, 18f)
                curveTo(12.571f, 18f, 14.446f, 17.16f, 15.803f, 15.803f)
                close()
                moveTo(15f, 10.5f)
                curveTo(15f, 8.015f, 12.985f, 6f, 10.5f, 6f)
                curveTo(8.015f, 6f, 6f, 8.015f, 6f, 10.5f)
                curveTo(6f, 12.985f, 8.015f, 15f, 10.5f, 15f)
                curveTo(12.985f, 15f, 15f, 12.985f, 15f, 10.5f)
                close()
                moveTo(12f, 10.5f)
                curveTo(12f, 9.672f, 11.328f, 9f, 10.5f, 9f)
                curveTo(9.672f, 9f, 9f, 9.672f, 9f, 10.5f)
                curveTo(9f, 11.328f, 9.672f, 12f, 10.5f, 12f)
                curveTo(11.328f, 12f, 12f, 11.328f, 12f, 10.5f)
                close()
            }
        }.build()

        return _Lollipop!!
    }

@Suppress("ObjectPropertyName")
private var _Lollipop: ImageVector? = null
