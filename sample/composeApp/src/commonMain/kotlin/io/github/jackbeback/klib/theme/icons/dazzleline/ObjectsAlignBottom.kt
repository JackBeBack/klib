package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ObjectsAlignBottom: ImageVector
    get() {
        if (_ObjectsAlignBottom != null) {
            return _ObjectsAlignBottom!!
        }
        _ObjectsAlignBottom = ImageVector.Builder(
            name = "ObjectsAlignBottom",
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
                moveTo(3f, 21f)
                horizontalLineTo(21f)
                moveTo(6.6f, 17f)
                horizontalLineTo(8.4f)
                curveTo(8.96f, 17f, 9.24f, 17f, 9.454f, 16.891f)
                curveTo(9.642f, 16.795f, 9.795f, 16.642f, 9.891f, 16.454f)
                curveTo(10f, 16.24f, 10f, 15.96f, 10f, 15.4f)
                verticalLineTo(4.6f)
                curveTo(10f, 4.04f, 10f, 3.76f, 9.891f, 3.546f)
                curveTo(9.795f, 3.358f, 9.642f, 3.205f, 9.454f, 3.109f)
                curveTo(9.24f, 3f, 8.96f, 3f, 8.4f, 3f)
                horizontalLineTo(6.6f)
                curveTo(6.04f, 3f, 5.76f, 3f, 5.546f, 3.109f)
                curveTo(5.358f, 3.205f, 5.205f, 3.358f, 5.109f, 3.546f)
                curveTo(5f, 3.76f, 5f, 4.04f, 5f, 4.6f)
                verticalLineTo(15.4f)
                curveTo(5f, 15.96f, 5f, 16.24f, 5.109f, 16.454f)
                curveTo(5.205f, 16.642f, 5.358f, 16.795f, 5.546f, 16.891f)
                curveTo(5.76f, 17f, 6.04f, 17f, 6.6f, 17f)
                close()
                moveTo(15.6f, 17f)
                horizontalLineTo(17.4f)
                curveTo(17.96f, 17f, 18.24f, 17f, 18.454f, 16.891f)
                curveTo(18.642f, 16.795f, 18.795f, 16.642f, 18.891f, 16.454f)
                curveTo(19f, 16.24f, 19f, 15.96f, 19f, 15.4f)
                verticalLineTo(10.6f)
                curveTo(19f, 10.04f, 19f, 9.76f, 18.891f, 9.546f)
                curveTo(18.795f, 9.358f, 18.642f, 9.205f, 18.454f, 9.109f)
                curveTo(18.24f, 9f, 17.96f, 9f, 17.4f, 9f)
                horizontalLineTo(15.6f)
                curveTo(15.04f, 9f, 14.76f, 9f, 14.546f, 9.109f)
                curveTo(14.358f, 9.205f, 14.205f, 9.358f, 14.109f, 9.546f)
                curveTo(14f, 9.76f, 14f, 10.04f, 14f, 10.6f)
                verticalLineTo(15.4f)
                curveTo(14f, 15.96f, 14f, 16.24f, 14.109f, 16.454f)
                curveTo(14.205f, 16.642f, 14.358f, 16.795f, 14.546f, 16.891f)
                curveTo(14.76f, 17f, 15.04f, 17f, 15.6f, 17f)
                close()
            }
        }.build()

        return _ObjectsAlignBottom!!
    }

@Suppress("ObjectPropertyName")
private var _ObjectsAlignBottom: ImageVector? = null
