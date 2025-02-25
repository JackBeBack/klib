package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ToiletPortable: ImageVector
    get() {
        if (_ToiletPortable != null) {
            return _ToiletPortable!!
        }
        _ToiletPortable = ImageVector.Builder(
            name = "ToiletPortable",
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
                moveTo(7f, 7f)
                horizontalLineTo(17f)
                moveTo(7f, 21f)
                verticalLineTo(4.6f)
                curveTo(7f, 4.04f, 7f, 3.76f, 7.109f, 3.546f)
                curveTo(7.205f, 3.358f, 7.358f, 3.205f, 7.546f, 3.109f)
                curveTo(7.76f, 3f, 8.04f, 3f, 8.6f, 3f)
                horizontalLineTo(15.4f)
                curveTo(15.96f, 3f, 16.24f, 3f, 16.454f, 3.109f)
                curveTo(16.642f, 3.205f, 16.795f, 3.358f, 16.891f, 3.546f)
                curveTo(17f, 3.76f, 17f, 4.04f, 17f, 4.6f)
                verticalLineTo(21f)
                moveTo(7f, 19f)
                horizontalLineTo(17f)
                moveTo(14f, 13f)
                horizontalLineTo(14.01f)
            }
        }.build()

        return _ToiletPortable!!
    }

@Suppress("ObjectPropertyName")
private var _ToiletPortable: ImageVector? = null
