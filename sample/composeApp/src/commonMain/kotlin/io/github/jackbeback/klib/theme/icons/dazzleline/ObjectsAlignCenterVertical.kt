package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ObjectsAlignCenterVertical: ImageVector
    get() {
        if (_ObjectsAlignCenterVertical != null) {
            return _ObjectsAlignCenterVertical!!
        }
        _ObjectsAlignCenterVertical = ImageVector.Builder(
            name = "ObjectsAlignCenterVertical",
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
                moveTo(3f, 12f)
                horizontalLineTo(5f)
                moveTo(19f, 12f)
                horizontalLineTo(21f)
                moveTo(10f, 12f)
                horizontalLineTo(14f)
                moveTo(6.6f, 19f)
                horizontalLineTo(8.4f)
                curveTo(8.96f, 19f, 9.24f, 19f, 9.454f, 18.891f)
                curveTo(9.642f, 18.795f, 9.795f, 18.642f, 9.891f, 18.454f)
                curveTo(10f, 18.24f, 10f, 17.96f, 10f, 17.4f)
                verticalLineTo(6.6f)
                curveTo(10f, 6.04f, 10f, 5.76f, 9.891f, 5.546f)
                curveTo(9.795f, 5.358f, 9.642f, 5.205f, 9.454f, 5.109f)
                curveTo(9.24f, 5f, 8.96f, 5f, 8.4f, 5f)
                horizontalLineTo(6.6f)
                curveTo(6.04f, 5f, 5.76f, 5f, 5.546f, 5.109f)
                curveTo(5.358f, 5.205f, 5.205f, 5.358f, 5.109f, 5.546f)
                curveTo(5f, 5.76f, 5f, 6.04f, 5f, 6.6f)
                verticalLineTo(17.4f)
                curveTo(5f, 17.96f, 5f, 18.24f, 5.109f, 18.454f)
                curveTo(5.205f, 18.642f, 5.358f, 18.795f, 5.546f, 18.891f)
                curveTo(5.76f, 19f, 6.04f, 19f, 6.6f, 19f)
                close()
                moveTo(15.6f, 16f)
                horizontalLineTo(17.4f)
                curveTo(17.96f, 16f, 18.24f, 16f, 18.454f, 15.891f)
                curveTo(18.642f, 15.795f, 18.795f, 15.642f, 18.891f, 15.454f)
                curveTo(19f, 15.24f, 19f, 14.96f, 19f, 14.4f)
                verticalLineTo(9.6f)
                curveTo(19f, 9.04f, 19f, 8.76f, 18.891f, 8.546f)
                curveTo(18.795f, 8.358f, 18.642f, 8.205f, 18.454f, 8.109f)
                curveTo(18.24f, 8f, 17.96f, 8f, 17.4f, 8f)
                horizontalLineTo(15.6f)
                curveTo(15.04f, 8f, 14.76f, 8f, 14.546f, 8.109f)
                curveTo(14.358f, 8.205f, 14.205f, 8.358f, 14.109f, 8.546f)
                curveTo(14f, 8.76f, 14f, 9.04f, 14f, 9.6f)
                verticalLineTo(14.4f)
                curveTo(14f, 14.96f, 14f, 15.24f, 14.109f, 15.454f)
                curveTo(14.205f, 15.642f, 14.358f, 15.795f, 14.546f, 15.891f)
                curveTo(14.76f, 16f, 15.04f, 16f, 15.6f, 16f)
                close()
            }
        }.build()

        return _ObjectsAlignCenterVertical!!
    }

@Suppress("ObjectPropertyName")
private var _ObjectsAlignCenterVertical: ImageVector? = null
