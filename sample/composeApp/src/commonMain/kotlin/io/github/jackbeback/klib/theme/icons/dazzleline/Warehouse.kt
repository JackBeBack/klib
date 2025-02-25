package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Warehouse: ImageVector
    get() {
        if (_Warehouse != null) {
            return _Warehouse!!
        }
        _Warehouse = ImageVector.Builder(
            name = "Warehouse",
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
                moveTo(7f, 14.001f)
                horizontalLineTo(17f)
                moveTo(7f, 14.001f)
                verticalLineTo(11.601f)
                curveTo(7f, 11.041f, 7f, 10.761f, 7.109f, 10.547f)
                curveTo(7.205f, 10.359f, 7.358f, 10.206f, 7.546f, 10.11f)
                curveTo(7.76f, 10.001f, 8.04f, 10.001f, 8.6f, 10.001f)
                horizontalLineTo(15.4f)
                curveTo(15.96f, 10.001f, 16.24f, 10.001f, 16.454f, 10.11f)
                curveTo(16.642f, 10.206f, 16.795f, 10.359f, 16.891f, 10.547f)
                curveTo(17f, 10.761f, 17f, 11.041f, 17f, 11.601f)
                verticalLineTo(14.001f)
                moveTo(7f, 14.001f)
                verticalLineTo(18.001f)
                verticalLineTo(21.001f)
                moveTo(17f, 14.001f)
                verticalLineTo(18.001f)
                verticalLineTo(21.001f)
                moveTo(18.347f, 6.175f)
                lineTo(14.147f, 4.075f)
                curveTo(13.359f, 3.681f, 12.966f, 3.484f, 12.553f, 3.407f)
                curveTo(12.188f, 3.338f, 11.812f, 3.338f, 11.447f, 3.407f)
                curveTo(11.034f, 3.484f, 10.641f, 3.681f, 9.853f, 4.075f)
                lineTo(5.653f, 6.175f)
                curveTo(4.69f, 6.656f, 4.209f, 6.897f, 3.857f, 7.256f)
                curveTo(3.546f, 7.574f, 3.309f, 7.957f, 3.164f, 8.377f)
                curveTo(3f, 8.853f, 3f, 9.391f, 3f, 10.468f)
                verticalLineTo(19.401f)
                curveTo(3f, 19.961f, 3f, 20.241f, 3.109f, 20.455f)
                curveTo(3.205f, 20.643f, 3.358f, 20.796f, 3.546f, 20.892f)
                curveTo(3.76f, 21.001f, 4.04f, 21.001f, 4.6f, 21.001f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 21.001f, 20.24f, 21.001f, 20.454f, 20.892f)
                curveTo(20.642f, 20.796f, 20.795f, 20.643f, 20.891f, 20.455f)
                curveTo(21f, 20.241f, 21f, 19.961f, 21f, 19.401f)
                verticalLineTo(10.468f)
                curveTo(21f, 9.391f, 21f, 8.853f, 20.836f, 8.377f)
                curveTo(20.691f, 7.957f, 20.454f, 7.574f, 20.143f, 7.256f)
                curveTo(19.791f, 6.897f, 19.31f, 6.656f, 18.347f, 6.175f)
                close()
            }
        }.build()

        return _Warehouse!!
    }

@Suppress("ObjectPropertyName")
private var _Warehouse: ImageVector? = null
