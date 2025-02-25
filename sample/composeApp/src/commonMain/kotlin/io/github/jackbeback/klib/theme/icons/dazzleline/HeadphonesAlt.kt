package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HeadphonesAlt: ImageVector
    get() {
        if (_HeadphonesAlt != null) {
            return _HeadphonesAlt!!
        }
        _HeadphonesAlt = ImageVector.Builder(
            name = "HeadphonesAlt",
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
                moveTo(21f, 18f)
                verticalLineTo(12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
                verticalLineTo(18f)
                moveTo(6.75f, 21f)
                curveTo(6.053f, 21f, 5.705f, 21f, 5.415f, 20.942f)
                curveTo(4.225f, 20.706f, 3.294f, 19.775f, 3.058f, 18.585f)
                curveTo(3f, 18.295f, 3f, 17.947f, 3f, 17.25f)
                verticalLineTo(15.6f)
                curveTo(3f, 15.04f, 3f, 14.76f, 3.109f, 14.546f)
                curveTo(3.205f, 14.358f, 3.358f, 14.205f, 3.546f, 14.109f)
                curveTo(3.76f, 14f, 4.04f, 14f, 4.6f, 14f)
                horizontalLineTo(6.4f)
                curveTo(6.96f, 14f, 7.24f, 14f, 7.454f, 14.109f)
                curveTo(7.642f, 14.205f, 7.795f, 14.358f, 7.891f, 14.546f)
                curveTo(8f, 14.76f, 8f, 15.04f, 8f, 15.6f)
                verticalLineTo(19.75f)
                curveTo(8f, 19.982f, 8f, 20.098f, 7.981f, 20.195f)
                curveTo(7.902f, 20.592f, 7.592f, 20.902f, 7.195f, 20.981f)
                curveTo(7.098f, 21f, 6.982f, 21f, 6.75f, 21f)
                close()
                moveTo(17.25f, 21f)
                curveTo(17.018f, 21f, 16.902f, 21f, 16.805f, 20.981f)
                curveTo(16.408f, 20.902f, 16.098f, 20.592f, 16.019f, 20.195f)
                curveTo(16f, 20.098f, 16f, 19.982f, 16f, 19.75f)
                verticalLineTo(15.6f)
                curveTo(16f, 15.04f, 16f, 14.76f, 16.109f, 14.546f)
                curveTo(16.205f, 14.358f, 16.358f, 14.205f, 16.546f, 14.109f)
                curveTo(16.76f, 14f, 17.04f, 14f, 17.6f, 14f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 14f, 20.24f, 14f, 20.454f, 14.109f)
                curveTo(20.642f, 14.205f, 20.795f, 14.358f, 20.891f, 14.546f)
                curveTo(21f, 14.76f, 21f, 15.04f, 21f, 15.6f)
                verticalLineTo(17.25f)
                curveTo(21f, 17.947f, 21f, 18.295f, 20.942f, 18.585f)
                curveTo(20.706f, 19.775f, 19.775f, 20.706f, 18.585f, 20.942f)
                curveTo(18.295f, 21f, 17.947f, 21f, 17.25f, 21f)
                close()
            }
        }.build()

        return _HeadphonesAlt!!
    }

@Suppress("ObjectPropertyName")
private var _HeadphonesAlt: ImageVector? = null
