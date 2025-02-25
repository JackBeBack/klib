package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ObjectsAlignLeft: ImageVector
    get() {
        if (_ObjectsAlignLeft != null) {
            return _ObjectsAlignLeft!!
        }
        _ObjectsAlignLeft = ImageVector.Builder(
            name = "ObjectsAlignLeft",
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
                moveTo(3f, 3f)
                verticalLineTo(21f)
                moveTo(8.6f, 10f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 10f, 20.24f, 10f, 20.454f, 9.891f)
                curveTo(20.642f, 9.795f, 20.795f, 9.642f, 20.891f, 9.454f)
                curveTo(21f, 9.24f, 21f, 8.96f, 21f, 8.4f)
                verticalLineTo(6.6f)
                curveTo(21f, 6.04f, 21f, 5.76f, 20.891f, 5.546f)
                curveTo(20.795f, 5.358f, 20.642f, 5.205f, 20.454f, 5.109f)
                curveTo(20.24f, 5f, 19.96f, 5f, 19.4f, 5f)
                horizontalLineTo(8.6f)
                curveTo(8.04f, 5f, 7.76f, 5f, 7.546f, 5.109f)
                curveTo(7.358f, 5.205f, 7.205f, 5.358f, 7.109f, 5.546f)
                curveTo(7f, 5.76f, 7f, 6.04f, 7f, 6.6f)
                verticalLineTo(8.4f)
                curveTo(7f, 8.96f, 7f, 9.24f, 7.109f, 9.454f)
                curveTo(7.205f, 9.642f, 7.358f, 9.795f, 7.546f, 9.891f)
                curveTo(7.76f, 10f, 8.04f, 10f, 8.6f, 10f)
                close()
                moveTo(8.6f, 19f)
                horizontalLineTo(13.4f)
                curveTo(13.96f, 19f, 14.24f, 19f, 14.454f, 18.891f)
                curveTo(14.642f, 18.795f, 14.795f, 18.642f, 14.891f, 18.454f)
                curveTo(15f, 18.24f, 15f, 17.96f, 15f, 17.4f)
                verticalLineTo(15.6f)
                curveTo(15f, 15.04f, 15f, 14.76f, 14.891f, 14.546f)
                curveTo(14.795f, 14.358f, 14.642f, 14.205f, 14.454f, 14.109f)
                curveTo(14.24f, 14f, 13.96f, 14f, 13.4f, 14f)
                horizontalLineTo(8.6f)
                curveTo(8.04f, 14f, 7.76f, 14f, 7.546f, 14.109f)
                curveTo(7.358f, 14.205f, 7.205f, 14.358f, 7.109f, 14.546f)
                curveTo(7f, 14.76f, 7f, 15.04f, 7f, 15.6f)
                verticalLineTo(17.4f)
                curveTo(7f, 17.96f, 7f, 18.24f, 7.109f, 18.454f)
                curveTo(7.205f, 18.642f, 7.358f, 18.795f, 7.546f, 18.891f)
                curveTo(7.76f, 19f, 8.04f, 19f, 8.6f, 19f)
                close()
            }
        }.build()

        return _ObjectsAlignLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ObjectsAlignLeft: ImageVector? = null
