package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FileWired: ImageVector
    get() {
        if (_FileWired != null) {
            return _FileWired!!
        }
        _FileWired = ImageVector.Builder(
            name = "FileWired",
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
                moveTo(12f, 3f)
                verticalLineTo(6.4f)
                curveTo(12f, 6.96f, 12f, 7.24f, 12.109f, 7.454f)
                curveTo(12.205f, 7.642f, 12.358f, 7.795f, 12.546f, 7.891f)
                curveTo(12.76f, 8f, 13.04f, 8f, 13.6f, 8f)
                horizontalLineTo(16f)
                moveTo(14f, 19f)
                curveTo(14f, 20.105f, 13.105f, 21f, 12f, 21f)
                curveTo(10.895f, 21f, 10f, 20.105f, 10f, 19f)
                moveTo(14f, 19f)
                curveTo(14f, 17.895f, 13.105f, 17f, 12f, 17f)
                moveTo(14f, 19f)
                horizontalLineTo(21f)
                moveTo(10f, 19f)
                curveTo(10f, 17.895f, 10.895f, 17f, 12f, 17f)
                moveTo(10f, 19f)
                horizontalLineTo(3f)
                moveTo(12f, 17f)
                verticalLineTo(13f)
                moveTo(16f, 7.281f)
                verticalLineTo(11.4f)
                curveTo(16f, 11.96f, 16f, 12.24f, 15.891f, 12.454f)
                curveTo(15.795f, 12.642f, 15.642f, 12.795f, 15.454f, 12.891f)
                curveTo(15.24f, 13f, 14.96f, 13f, 14.4f, 13f)
                horizontalLineTo(9.6f)
                curveTo(9.04f, 13f, 8.76f, 13f, 8.546f, 12.891f)
                curveTo(8.358f, 12.795f, 8.205f, 12.642f, 8.109f, 12.454f)
                curveTo(8f, 12.24f, 8f, 11.96f, 8f, 11.4f)
                verticalLineTo(4.6f)
                curveTo(8f, 4.04f, 8f, 3.76f, 8.109f, 3.546f)
                curveTo(8.205f, 3.358f, 8.358f, 3.205f, 8.546f, 3.109f)
                curveTo(8.76f, 3f, 9.04f, 3f, 9.6f, 3f)
                horizontalLineTo(11.819f)
                curveTo(12.07f, 3f, 12.196f, 3f, 12.314f, 3.029f)
                curveTo(12.418f, 3.055f, 12.517f, 3.097f, 12.608f, 3.154f)
                curveTo(12.711f, 3.219f, 12.798f, 3.31f, 12.972f, 3.49f)
                lineTo(15.553f, 6.172f)
                curveTo(15.718f, 6.343f, 15.8f, 6.429f, 15.86f, 6.528f)
                curveTo(15.912f, 6.616f, 15.95f, 6.712f, 15.974f, 6.812f)
                curveTo(16f, 6.924f, 16f, 7.043f, 16f, 7.281f)
                close()
            }
        }.build()

        return _FileWired!!
    }

@Suppress("ObjectPropertyName")
private var _FileWired: ImageVector? = null
