package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ObjectsAlignTop: ImageVector
    get() {
        if (_ObjectsAlignTop != null) {
            return _ObjectsAlignTop!!
        }
        _ObjectsAlignTop = ImageVector.Builder(
            name = "ObjectsAlignTop",
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
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                moveTo(5f, 19.4f)
                verticalLineTo(8.6f)
                curveTo(5f, 8.04f, 5f, 7.76f, 5.109f, 7.546f)
                curveTo(5.205f, 7.358f, 5.358f, 7.205f, 5.546f, 7.109f)
                curveTo(5.76f, 7f, 6.04f, 7f, 6.6f, 7f)
                horizontalLineTo(8.4f)
                curveTo(8.96f, 7f, 9.24f, 7f, 9.454f, 7.109f)
                curveTo(9.642f, 7.205f, 9.795f, 7.358f, 9.891f, 7.546f)
                curveTo(10f, 7.76f, 10f, 8.04f, 10f, 8.6f)
                verticalLineTo(19.4f)
                curveTo(10f, 19.96f, 10f, 20.24f, 9.891f, 20.454f)
                curveTo(9.795f, 20.642f, 9.642f, 20.795f, 9.454f, 20.891f)
                curveTo(9.24f, 21f, 8.96f, 21f, 8.4f, 21f)
                horizontalLineTo(6.6f)
                curveTo(6.04f, 21f, 5.76f, 21f, 5.546f, 20.891f)
                curveTo(5.358f, 20.795f, 5.205f, 20.642f, 5.109f, 20.454f)
                curveTo(5f, 20.24f, 5f, 19.96f, 5f, 19.4f)
                close()
                moveTo(14f, 13.4f)
                verticalLineTo(8.6f)
                curveTo(14f, 8.04f, 14f, 7.76f, 14.109f, 7.546f)
                curveTo(14.205f, 7.358f, 14.358f, 7.205f, 14.546f, 7.109f)
                curveTo(14.76f, 7f, 15.04f, 7f, 15.6f, 7f)
                horizontalLineTo(17.4f)
                curveTo(17.96f, 7f, 18.24f, 7f, 18.454f, 7.109f)
                curveTo(18.642f, 7.205f, 18.795f, 7.358f, 18.891f, 7.546f)
                curveTo(19f, 7.76f, 19f, 8.04f, 19f, 8.6f)
                verticalLineTo(13.4f)
                curveTo(19f, 13.96f, 19f, 14.24f, 18.891f, 14.454f)
                curveTo(18.795f, 14.642f, 18.642f, 14.795f, 18.454f, 14.891f)
                curveTo(18.24f, 15f, 17.96f, 15f, 17.4f, 15f)
                horizontalLineTo(15.6f)
                curveTo(15.04f, 15f, 14.76f, 15f, 14.546f, 14.891f)
                curveTo(14.358f, 14.795f, 14.205f, 14.642f, 14.109f, 14.454f)
                curveTo(14f, 14.24f, 14f, 13.96f, 14f, 13.4f)
                close()
            }
        }.build()

        return _ObjectsAlignTop!!
    }

@Suppress("ObjectPropertyName")
private var _ObjectsAlignTop: ImageVector? = null
