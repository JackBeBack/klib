package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DoNotEnter: ImageVector
    get() {
        if (_DoNotEnter != null) {
            return _DoNotEnter!!
        }
        _DoNotEnter = ImageVector.Builder(
            name = "DoNotEnter",
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
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 11.6f)
                curveTo(7f, 11.04f, 7f, 10.76f, 7.109f, 10.546f)
                curveTo(7.205f, 10.358f, 7.358f, 10.205f, 7.546f, 10.109f)
                curveTo(7.76f, 10f, 8.04f, 10f, 8.6f, 10f)
                horizontalLineTo(15.4f)
                curveTo(15.96f, 10f, 16.24f, 10f, 16.454f, 10.109f)
                curveTo(16.642f, 10.205f, 16.795f, 10.358f, 16.891f, 10.546f)
                curveTo(17f, 10.76f, 17f, 11.04f, 17f, 11.6f)
                verticalLineTo(12.4f)
                curveTo(17f, 12.96f, 17f, 13.24f, 16.891f, 13.454f)
                curveTo(16.795f, 13.642f, 16.642f, 13.795f, 16.454f, 13.891f)
                curveTo(16.24f, 14f, 15.96f, 14f, 15.4f, 14f)
                horizontalLineTo(8.6f)
                curveTo(8.04f, 14f, 7.76f, 14f, 7.546f, 13.891f)
                curveTo(7.358f, 13.795f, 7.205f, 13.642f, 7.109f, 13.454f)
                curveTo(7f, 13.24f, 7f, 12.96f, 7f, 12.4f)
                verticalLineTo(11.6f)
                close()
            }
        }.build()

        return _DoNotEnter!!
    }

@Suppress("ObjectPropertyName")
private var _DoNotEnter: ImageVector? = null
