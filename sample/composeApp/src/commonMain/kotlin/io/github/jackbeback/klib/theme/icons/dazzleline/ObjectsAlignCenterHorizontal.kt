package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ObjectsAlignCenterHorizontal: ImageVector
    get() {
        if (_ObjectsAlignCenterHorizontal != null) {
            return _ObjectsAlignCenterHorizontal!!
        }
        _ObjectsAlignCenterHorizontal = ImageVector.Builder(
            name = "ObjectsAlignCenterHorizontal",
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
                moveTo(12f, 5f)
                verticalLineTo(3f)
                moveTo(12f, 21f)
                verticalLineTo(19f)
                moveTo(12f, 14f)
                verticalLineTo(10f)
                moveTo(6.6f, 10f)
                horizontalLineTo(17.4f)
                curveTo(17.96f, 10f, 18.24f, 10f, 18.454f, 9.891f)
                curveTo(18.642f, 9.795f, 18.795f, 9.642f, 18.891f, 9.454f)
                curveTo(19f, 9.24f, 19f, 8.96f, 19f, 8.4f)
                verticalLineTo(6.6f)
                curveTo(19f, 6.04f, 19f, 5.76f, 18.891f, 5.546f)
                curveTo(18.795f, 5.358f, 18.642f, 5.205f, 18.454f, 5.109f)
                curveTo(18.24f, 5f, 17.96f, 5f, 17.4f, 5f)
                horizontalLineTo(6.6f)
                curveTo(6.04f, 5f, 5.76f, 5f, 5.546f, 5.109f)
                curveTo(5.358f, 5.205f, 5.205f, 5.358f, 5.109f, 5.546f)
                curveTo(5f, 5.76f, 5f, 6.04f, 5f, 6.6f)
                verticalLineTo(8.4f)
                curveTo(5f, 8.96f, 5f, 9.24f, 5.109f, 9.454f)
                curveTo(5.205f, 9.642f, 5.358f, 9.795f, 5.546f, 9.891f)
                curveTo(5.76f, 10f, 6.04f, 10f, 6.6f, 10f)
                close()
                moveTo(9.6f, 19f)
                horizontalLineTo(14.4f)
                curveTo(14.96f, 19f, 15.24f, 19f, 15.454f, 18.891f)
                curveTo(15.642f, 18.795f, 15.795f, 18.642f, 15.891f, 18.454f)
                curveTo(16f, 18.24f, 16f, 17.96f, 16f, 17.4f)
                verticalLineTo(15.6f)
                curveTo(16f, 15.04f, 16f, 14.76f, 15.891f, 14.546f)
                curveTo(15.795f, 14.358f, 15.642f, 14.205f, 15.454f, 14.109f)
                curveTo(15.24f, 14f, 14.96f, 14f, 14.4f, 14f)
                horizontalLineTo(9.6f)
                curveTo(9.04f, 14f, 8.76f, 14f, 8.546f, 14.109f)
                curveTo(8.358f, 14.205f, 8.205f, 14.358f, 8.109f, 14.546f)
                curveTo(8f, 14.76f, 8f, 15.04f, 8f, 15.6f)
                verticalLineTo(17.4f)
                curveTo(8f, 17.96f, 8f, 18.24f, 8.109f, 18.454f)
                curveTo(8.205f, 18.642f, 8.358f, 18.795f, 8.546f, 18.891f)
                curveTo(8.76f, 19f, 9.04f, 19f, 9.6f, 19f)
                close()
            }
        }.build()

        return _ObjectsAlignCenterHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _ObjectsAlignCenterHorizontal: ImageVector? = null
