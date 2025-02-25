package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseTree: ImageVector
    get() {
        if (_HouseTree != null) {
            return _HouseTree!!
        }
        _HouseTree = ImageVector.Builder(
            name = "HouseTree",
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
                moveTo(16.343f, 21f)
                horizontalLineTo(21f)
                lineTo(17f, 15.5f)
                horizontalLineTo(21f)
                lineTo(16.881f, 10f)
                horizontalLineTo(21f)
                lineTo(14.043f, 3f)
                lineTo(9.5f, 7.5f)
                moveTo(3f, 16f)
                lineTo(7.424f, 11.978f)
                curveTo(7.804f, 11.633f, 7.994f, 11.46f, 8.209f, 11.395f)
                curveTo(8.399f, 11.337f, 8.601f, 11.337f, 8.791f, 11.395f)
                curveTo(9.006f, 11.46f, 9.196f, 11.633f, 9.576f, 11.978f)
                lineTo(14f, 16f)
                moveTo(5f, 14.182f)
                verticalLineTo(19.4f)
                curveTo(5f, 19.96f, 5f, 20.24f, 5.109f, 20.454f)
                curveTo(5.205f, 20.642f, 5.358f, 20.795f, 5.546f, 20.891f)
                curveTo(5.76f, 21f, 6.04f, 21f, 6.6f, 21f)
                horizontalLineTo(10.4f)
                curveTo(10.96f, 21f, 11.24f, 21f, 11.454f, 20.891f)
                curveTo(11.642f, 20.795f, 11.795f, 20.642f, 11.891f, 20.454f)
                curveTo(12f, 20.24f, 12f, 19.96f, 12f, 19.4f)
                lineTo(12f, 14.182f)
            }
        }.build()

        return _HouseTree!!
    }

@Suppress("ObjectPropertyName")
private var _HouseTree: ImageVector? = null
