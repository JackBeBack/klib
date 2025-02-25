package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Trophy: ImageVector
    get() {
        if (_Trophy != null) {
            return _Trophy!!
        }
        _Trophy = ImageVector.Builder(
            name = "Trophy",
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
                moveTo(12f, 14f)
                verticalLineTo(17f)
                moveTo(12f, 14f)
                curveTo(9.581f, 14f, 7.563f, 12.282f, 7.1f, 10f)
                moveTo(12f, 14f)
                curveTo(14.419f, 14f, 16.437f, 12.282f, 16.9f, 10f)
                moveTo(17f, 5f)
                horizontalLineTo(19.75f)
                curveTo(19.982f, 5f, 20.098f, 5f, 20.195f, 5.019f)
                curveTo(20.592f, 5.098f, 20.902f, 5.408f, 20.981f, 5.805f)
                curveTo(21f, 5.902f, 21f, 6.018f, 21f, 6.25f)
                curveTo(21f, 6.947f, 21f, 7.295f, 20.942f, 7.585f)
                curveTo(20.706f, 8.775f, 19.775f, 9.706f, 18.585f, 9.942f)
                curveTo(18.295f, 10f, 17.947f, 10f, 17.25f, 10f)
                horizontalLineTo(17f)
                horizontalLineTo(16.9f)
                moveTo(7f, 5f)
                horizontalLineTo(4.25f)
                curveTo(4.018f, 5f, 3.902f, 5f, 3.805f, 5.019f)
                curveTo(3.408f, 5.098f, 3.098f, 5.408f, 3.019f, 5.805f)
                curveTo(3f, 5.902f, 3f, 6.018f, 3f, 6.25f)
                curveTo(3f, 6.947f, 3f, 7.295f, 3.058f, 7.585f)
                curveTo(3.294f, 8.775f, 4.225f, 9.706f, 5.415f, 9.942f)
                curveTo(5.705f, 10f, 6.053f, 10f, 6.75f, 10f)
                horizontalLineTo(7f)
                horizontalLineTo(7.1f)
                moveTo(12f, 17f)
                curveTo(12.93f, 17f, 13.395f, 17f, 13.776f, 17.102f)
                curveTo(14.812f, 17.38f, 15.62f, 18.188f, 15.898f, 19.223f)
                curveTo(16f, 19.605f, 16f, 20.07f, 16f, 21f)
                horizontalLineTo(8f)
                curveTo(8f, 20.07f, 8f, 19.605f, 8.102f, 19.223f)
                curveTo(8.38f, 18.188f, 9.188f, 17.38f, 10.224f, 17.102f)
                curveTo(10.605f, 17f, 11.07f, 17f, 12f, 17f)
                close()
                moveTo(7.1f, 10f)
                curveTo(7.034f, 9.677f, 7f, 9.342f, 7f, 9f)
                verticalLineTo(4.571f)
                curveTo(7f, 4.038f, 7f, 3.772f, 7.099f, 3.566f)
                curveTo(7.197f, 3.362f, 7.362f, 3.197f, 7.566f, 3.099f)
                curveTo(7.772f, 3f, 8.038f, 3f, 8.571f, 3f)
                horizontalLineTo(15.429f)
                curveTo(15.962f, 3f, 16.228f, 3f, 16.434f, 3.099f)
                curveTo(16.638f, 3.197f, 16.803f, 3.362f, 16.901f, 3.566f)
                curveTo(17f, 3.772f, 17f, 4.038f, 17f, 4.571f)
                verticalLineTo(9f)
                curveTo(17f, 9.342f, 16.966f, 9.677f, 16.9f, 10f)
            }
        }.build()

        return _Trophy!!
    }

@Suppress("ObjectPropertyName")
private var _Trophy: ImageVector? = null
