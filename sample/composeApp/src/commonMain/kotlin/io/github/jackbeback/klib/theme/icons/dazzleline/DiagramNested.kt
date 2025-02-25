package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DiagramNested: ImageVector
    get() {
        if (_DiagramNested != null) {
            return _DiagramNested!!
        }
        _DiagramNested = ImageVector.Builder(
            name = "DiagramNested",
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
                moveTo(6.5f, 9f)
                verticalLineTo(11.1f)
                curveTo(6.5f, 13.34f, 6.5f, 14.46f, 6.936f, 15.316f)
                curveTo(7.319f, 16.069f, 7.931f, 16.681f, 8.684f, 17.064f)
                curveTo(9.54f, 17.5f, 10.66f, 17.5f, 12.9f, 17.5f)
                horizontalLineTo(15f)
                moveTo(5.6f, 9f)
                horizontalLineTo(7.4f)
                curveTo(7.96f, 9f, 8.24f, 9f, 8.454f, 8.891f)
                curveTo(8.642f, 8.795f, 8.795f, 8.642f, 8.891f, 8.454f)
                curveTo(9f, 8.24f, 9f, 7.96f, 9f, 7.4f)
                verticalLineTo(5.6f)
                curveTo(9f, 5.04f, 9f, 4.76f, 8.891f, 4.546f)
                curveTo(8.795f, 4.358f, 8.642f, 4.205f, 8.454f, 4.109f)
                curveTo(8.24f, 4f, 7.96f, 4f, 7.4f, 4f)
                horizontalLineTo(5.6f)
                curveTo(5.04f, 4f, 4.76f, 4f, 4.546f, 4.109f)
                curveTo(4.358f, 4.205f, 4.205f, 4.358f, 4.109f, 4.546f)
                curveTo(4f, 4.76f, 4f, 5.04f, 4f, 5.6f)
                verticalLineTo(7.4f)
                curveTo(4f, 7.96f, 4f, 8.24f, 4.109f, 8.454f)
                curveTo(4.205f, 8.642f, 4.358f, 8.795f, 4.546f, 8.891f)
                curveTo(4.76f, 9f, 5.04f, 9f, 5.6f, 9f)
                close()
                moveTo(16.6f, 20f)
                horizontalLineTo(18.4f)
                curveTo(18.96f, 20f, 19.24f, 20f, 19.454f, 19.891f)
                curveTo(19.642f, 19.795f, 19.795f, 19.642f, 19.891f, 19.454f)
                curveTo(20f, 19.24f, 20f, 18.96f, 20f, 18.4f)
                verticalLineTo(16.6f)
                curveTo(20f, 16.04f, 20f, 15.76f, 19.891f, 15.546f)
                curveTo(19.795f, 15.358f, 19.642f, 15.205f, 19.454f, 15.109f)
                curveTo(19.24f, 15f, 18.96f, 15f, 18.4f, 15f)
                horizontalLineTo(16.6f)
                curveTo(16.04f, 15f, 15.76f, 15f, 15.546f, 15.109f)
                curveTo(15.358f, 15.205f, 15.205f, 15.358f, 15.109f, 15.546f)
                curveTo(15f, 15.76f, 15f, 16.04f, 15f, 16.6f)
                verticalLineTo(18.4f)
                curveTo(15f, 18.96f, 15f, 19.24f, 15.109f, 19.454f)
                curveTo(15.205f, 19.642f, 15.358f, 19.795f, 15.546f, 19.891f)
                curveTo(15.76f, 20f, 16.04f, 20f, 16.6f, 20f)
                close()
            }
        }.build()

        return _DiagramNested!!
    }

@Suppress("ObjectPropertyName")
private var _DiagramNested: ImageVector? = null
