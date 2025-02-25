package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.NetworkWired: ImageVector
    get() {
        if (_NetworkWired != null) {
            return _NetworkWired!!
        }
        _NetworkWired = ImageVector.Builder(
            name = "NetworkWired",
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
                moveTo(3f, 12f)
                horizontalLineTo(21f)
                moveTo(12f, 8f)
                verticalLineTo(12f)
                moveTo(6.5f, 12f)
                verticalLineTo(16f)
                moveTo(17.5f, 12f)
                verticalLineTo(16f)
                moveTo(10.1f, 8f)
                horizontalLineTo(13.9f)
                curveTo(14.46f, 8f, 14.74f, 8f, 14.954f, 7.891f)
                curveTo(15.142f, 7.795f, 15.295f, 7.642f, 15.391f, 7.454f)
                curveTo(15.5f, 7.24f, 15.5f, 6.96f, 15.5f, 6.4f)
                verticalLineTo(4.6f)
                curveTo(15.5f, 4.04f, 15.5f, 3.76f, 15.391f, 3.546f)
                curveTo(15.295f, 3.358f, 15.142f, 3.205f, 14.954f, 3.109f)
                curveTo(14.74f, 3f, 14.46f, 3f, 13.9f, 3f)
                horizontalLineTo(10.1f)
                curveTo(9.54f, 3f, 9.26f, 3f, 9.046f, 3.109f)
                curveTo(8.858f, 3.205f, 8.705f, 3.358f, 8.609f, 3.546f)
                curveTo(8.5f, 3.76f, 8.5f, 4.04f, 8.5f, 4.6f)
                verticalLineTo(6.4f)
                curveTo(8.5f, 6.96f, 8.5f, 7.24f, 8.609f, 7.454f)
                curveTo(8.705f, 7.642f, 8.858f, 7.795f, 9.046f, 7.891f)
                curveTo(9.26f, 8f, 9.54f, 8f, 10.1f, 8f)
                close()
                moveTo(15.6f, 21f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 21f, 20.24f, 21f, 20.454f, 20.891f)
                curveTo(20.642f, 20.795f, 20.795f, 20.642f, 20.891f, 20.454f)
                curveTo(21f, 20.24f, 21f, 19.96f, 21f, 19.4f)
                verticalLineTo(17.6f)
                curveTo(21f, 17.04f, 21f, 16.76f, 20.891f, 16.546f)
                curveTo(20.795f, 16.358f, 20.642f, 16.205f, 20.454f, 16.109f)
                curveTo(20.24f, 16f, 19.96f, 16f, 19.4f, 16f)
                horizontalLineTo(15.6f)
                curveTo(15.04f, 16f, 14.76f, 16f, 14.546f, 16.109f)
                curveTo(14.358f, 16.205f, 14.205f, 16.358f, 14.109f, 16.546f)
                curveTo(14f, 16.76f, 14f, 17.04f, 14f, 17.6f)
                verticalLineTo(19.4f)
                curveTo(14f, 19.96f, 14f, 20.24f, 14.109f, 20.454f)
                curveTo(14.205f, 20.642f, 14.358f, 20.795f, 14.546f, 20.891f)
                curveTo(14.76f, 21f, 15.04f, 21f, 15.6f, 21f)
                close()
                moveTo(4.6f, 21f)
                horizontalLineTo(8.4f)
                curveTo(8.96f, 21f, 9.24f, 21f, 9.454f, 20.891f)
                curveTo(9.642f, 20.795f, 9.795f, 20.642f, 9.891f, 20.454f)
                curveTo(10f, 20.24f, 10f, 19.96f, 10f, 19.4f)
                verticalLineTo(17.6f)
                curveTo(10f, 17.04f, 10f, 16.76f, 9.891f, 16.546f)
                curveTo(9.795f, 16.358f, 9.642f, 16.205f, 9.454f, 16.109f)
                curveTo(9.24f, 16f, 8.96f, 16f, 8.4f, 16f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 16f, 3.76f, 16f, 3.546f, 16.109f)
                curveTo(3.358f, 16.205f, 3.205f, 16.358f, 3.109f, 16.546f)
                curveTo(3f, 16.76f, 3f, 17.04f, 3f, 17.6f)
                verticalLineTo(19.4f)
                curveTo(3f, 19.96f, 3f, 20.24f, 3.109f, 20.454f)
                curveTo(3.205f, 20.642f, 3.358f, 20.795f, 3.546f, 20.891f)
                curveTo(3.76f, 21f, 4.04f, 21f, 4.6f, 21f)
                close()
            }
        }.build()

        return _NetworkWired!!
    }

@Suppress("ObjectPropertyName")
private var _NetworkWired: ImageVector? = null
