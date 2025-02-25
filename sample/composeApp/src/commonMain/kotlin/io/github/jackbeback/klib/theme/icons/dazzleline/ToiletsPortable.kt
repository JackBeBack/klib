package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ToiletsPortable: ImageVector
    get() {
        if (_ToiletsPortable != null) {
            return _ToiletsPortable!!
        }
        _ToiletsPortable = ImageVector.Builder(
            name = "ToiletsPortable",
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
                moveTo(4f, 19f)
                verticalLineTo(6.6f)
                curveTo(4f, 6.04f, 4f, 5.76f, 4.109f, 5.546f)
                curveTo(4.205f, 5.358f, 4.358f, 5.205f, 4.546f, 5.109f)
                curveTo(4.76f, 5f, 5.04f, 5f, 5.6f, 5f)
                horizontalLineTo(8.4f)
                curveTo(8.96f, 5f, 9.24f, 5f, 9.454f, 5.109f)
                curveTo(9.642f, 5.205f, 9.795f, 5.358f, 9.891f, 5.546f)
                curveTo(10f, 5.76f, 10f, 6.04f, 10f, 6.6f)
                verticalLineTo(19f)
                moveTo(14f, 19f)
                verticalLineTo(6.6f)
                curveTo(14f, 6.04f, 14f, 5.76f, 14.109f, 5.546f)
                curveTo(14.205f, 5.358f, 14.358f, 5.205f, 14.546f, 5.109f)
                curveTo(14.76f, 5f, 15.04f, 5f, 15.6f, 5f)
                horizontalLineTo(18.4f)
                curveTo(18.96f, 5f, 19.24f, 5f, 19.454f, 5.109f)
                curveTo(19.642f, 5.205f, 19.795f, 5.358f, 19.891f, 5.546f)
                curveTo(20f, 5.76f, 20f, 6.04f, 20f, 6.6f)
                verticalLineTo(19f)
                moveTo(4f, 9f)
                horizontalLineTo(10f)
                moveTo(14f, 9f)
                horizontalLineTo(20f)
                moveTo(4f, 17f)
                horizontalLineTo(10f)
                moveTo(14f, 17f)
                horizontalLineTo(20f)
                moveTo(9f, 13f)
                horizontalLineTo(9.01f)
                moveTo(19f, 13f)
                horizontalLineTo(19.01f)
            }
        }.build()

        return _ToiletsPortable!!
    }

@Suppress("ObjectPropertyName")
private var _ToiletsPortable: ImageVector? = null
