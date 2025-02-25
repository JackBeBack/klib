package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Files: ImageVector
    get() {
        if (_Files != null) {
            return _Files!!
        }
        _Files = ImageVector.Builder(
            name = "Files",
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
                moveTo(9f, 7f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 7f, 6.52f, 7f, 6.092f, 7.218f)
                curveTo(5.716f, 7.41f, 5.41f, 7.716f, 5.218f, 8.092f)
                curveTo(5f, 8.52f, 5f, 9.08f, 5f, 10.2f)
                verticalLineTo(17.8f)
                curveTo(5f, 18.92f, 5f, 19.48f, 5.218f, 19.908f)
                curveTo(5.41f, 20.284f, 5.716f, 20.59f, 6.092f, 20.782f)
                curveTo(6.52f, 21f, 7.08f, 21f, 8.2f, 21f)
                horizontalLineTo(11.8f)
                curveTo(12.92f, 21f, 13.48f, 21f, 13.908f, 20.782f)
                curveTo(14.284f, 20.59f, 14.59f, 20.284f, 14.782f, 19.908f)
                curveTo(15f, 19.48f, 15f, 18.92f, 15f, 17.8f)
                verticalLineTo(17f)
                moveTo(19f, 8f)
                verticalLineTo(13.8f)
                curveTo(19f, 14.92f, 19f, 15.48f, 18.782f, 15.908f)
                curveTo(18.59f, 16.284f, 18.284f, 16.59f, 17.908f, 16.782f)
                curveTo(17.48f, 17f, 16.92f, 17f, 15.8f, 17f)
                horizontalLineTo(12.2f)
                curveTo(11.08f, 17f, 10.52f, 17f, 10.092f, 16.782f)
                curveTo(9.716f, 16.59f, 9.41f, 16.284f, 9.218f, 15.908f)
                curveTo(9f, 15.48f, 9f, 14.92f, 9f, 13.8f)
                verticalLineTo(6.2f)
                curveTo(9f, 5.08f, 9f, 4.52f, 9.218f, 4.092f)
                curveTo(9.41f, 3.716f, 9.716f, 3.41f, 10.092f, 3.218f)
                curveTo(10.52f, 3f, 11.08f, 3f, 12.2f, 3f)
                horizontalLineTo(14f)
                moveTo(19f, 8f)
                lineTo(14f, 3f)
                moveTo(19f, 8f)
                horizontalLineTo(15.6f)
                curveTo(15.04f, 8f, 14.76f, 8f, 14.546f, 7.891f)
                curveTo(14.358f, 7.795f, 14.205f, 7.642f, 14.109f, 7.454f)
                curveTo(14f, 7.24f, 14f, 6.96f, 14f, 6.4f)
                verticalLineTo(3f)
            }
        }.build()

        return _Files!!
    }

@Suppress("ObjectPropertyName")
private var _Files: ImageVector? = null
