package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TrainTram: ImageVector
    get() {
        if (_TrainTram != null) {
            return _TrainTram!!
        }
        _TrainTram = ImageVector.Builder(
            name = "TrainTram",
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
                moveTo(7f, 13f)
                horizontalLineTo(17f)
                moveTo(10f, 16f)
                horizontalLineTo(10.01f)
                moveTo(14f, 16f)
                horizontalLineTo(14.01f)
                moveTo(5f, 21f)
                lineTo(7.5f, 18.5f)
                moveTo(19f, 21f)
                lineTo(16.5f, 18.5f)
                moveTo(12f, 7f)
                verticalLineTo(3f)
                moveTo(4f, 4f)
                lineTo(4.121f, 3.879f)
                curveTo(4.684f, 3.316f, 5.447f, 3f, 6.243f, 3f)
                horizontalLineTo(17.757f)
                curveTo(18.553f, 3f, 19.316f, 3.316f, 19.879f, 3.879f)
                lineTo(20f, 4f)
                moveTo(10.2f, 19f)
                horizontalLineTo(13.8f)
                curveTo(14.92f, 19f, 15.48f, 19f, 15.908f, 18.782f)
                curveTo(16.284f, 18.59f, 16.59f, 18.284f, 16.782f, 17.908f)
                curveTo(17f, 17.48f, 17f, 16.92f, 17f, 15.8f)
                verticalLineTo(10.2f)
                curveTo(17f, 9.08f, 17f, 8.52f, 16.782f, 8.092f)
                curveTo(16.59f, 7.716f, 16.284f, 7.41f, 15.908f, 7.218f)
                curveTo(15.48f, 7f, 14.92f, 7f, 13.8f, 7f)
                horizontalLineTo(10.2f)
                curveTo(9.08f, 7f, 8.52f, 7f, 8.092f, 7.218f)
                curveTo(7.716f, 7.41f, 7.41f, 7.716f, 7.218f, 8.092f)
                curveTo(7f, 8.52f, 7f, 9.08f, 7f, 10.2f)
                verticalLineTo(15.8f)
                curveTo(7f, 16.92f, 7f, 17.48f, 7.218f, 17.908f)
                curveTo(7.41f, 18.284f, 7.716f, 18.59f, 8.092f, 18.782f)
                curveTo(8.52f, 19f, 9.08f, 19f, 10.2f, 19f)
                close()
            }
        }.build()

        return _TrainTram!!
    }

@Suppress("ObjectPropertyName")
private var _TrainTram: ImageVector? = null
