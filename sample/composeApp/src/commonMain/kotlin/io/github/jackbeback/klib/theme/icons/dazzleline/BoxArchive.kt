package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BoxArchive: ImageVector
    get() {
        if (_BoxArchive != null) {
            return _BoxArchive!!
        }
        _BoxArchive = ImageVector.Builder(
            name = "BoxArchive",
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
                moveTo(9f, 14f)
                horizontalLineTo(15f)
                moveTo(4.6f, 10f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 10f, 20.24f, 10f, 20.454f, 9.891f)
                curveTo(20.642f, 9.795f, 20.795f, 9.642f, 20.891f, 9.454f)
                curveTo(21f, 9.24f, 21f, 8.96f, 21f, 8.4f)
                verticalLineTo(5.6f)
                curveTo(21f, 5.04f, 21f, 4.76f, 20.891f, 4.546f)
                curveTo(20.795f, 4.358f, 20.642f, 4.205f, 20.454f, 4.109f)
                curveTo(20.24f, 4f, 19.96f, 4f, 19.4f, 4f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 4f, 3.76f, 4f, 3.546f, 4.109f)
                curveTo(3.358f, 4.205f, 3.205f, 4.358f, 3.109f, 4.546f)
                curveTo(3f, 4.76f, 3f, 5.04f, 3f, 5.6f)
                verticalLineTo(8.4f)
                curveTo(3f, 8.96f, 3f, 9.24f, 3.109f, 9.454f)
                curveTo(3.205f, 9.642f, 3.358f, 9.795f, 3.546f, 9.891f)
                curveTo(3.76f, 10f, 4.04f, 10f, 4.6f, 10f)
                close()
                moveTo(5f, 10f)
                horizontalLineTo(19f)
                verticalLineTo(16.8f)
                curveTo(19f, 17.92f, 19f, 18.48f, 18.782f, 18.908f)
                curveTo(18.59f, 19.284f, 18.284f, 19.59f, 17.908f, 19.782f)
                curveTo(17.48f, 20f, 16.92f, 20f, 15.8f, 20f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 20f, 6.52f, 20f, 6.092f, 19.782f)
                curveTo(5.716f, 19.59f, 5.41f, 19.284f, 5.218f, 18.908f)
                curveTo(5f, 18.48f, 5f, 17.92f, 5f, 16.8f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _BoxArchive!!
    }

@Suppress("ObjectPropertyName")
private var _BoxArchive: ImageVector? = null
