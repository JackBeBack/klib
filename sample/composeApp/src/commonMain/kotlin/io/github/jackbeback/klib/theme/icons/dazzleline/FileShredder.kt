package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FileShredder: ImageVector
    get() {
        if (_FileShredder != null) {
            return _FileShredder!!
        }
        _FileShredder = ImageVector.Builder(
            name = "FileShredder",
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
                moveTo(13f, 3f)
                verticalLineTo(7.4f)
                curveTo(13f, 7.96f, 13f, 8.24f, 13.109f, 8.454f)
                curveTo(13.205f, 8.642f, 13.358f, 8.795f, 13.546f, 8.891f)
                curveTo(13.76f, 9f, 14.04f, 9f, 14.6f, 9f)
                horizontalLineTo(19f)
                moveTo(13f, 3f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 3f, 6.52f, 3f, 6.092f, 3.218f)
                curveTo(5.716f, 3.41f, 5.41f, 3.716f, 5.218f, 4.092f)
                curveTo(5f, 4.52f, 5f, 5.08f, 5f, 6.2f)
                verticalLineTo(13f)
                moveTo(13f, 3f)
                lineTo(19f, 9f)
                moveTo(19f, 9f)
                verticalLineTo(13f)
                moveTo(3f, 13f)
                horizontalLineTo(21f)
                moveTo(6f, 19f)
                verticalLineTo(17f)
                moveTo(10f, 21f)
                verticalLineTo(17f)
                moveTo(14f, 21f)
                verticalLineTo(17f)
                moveTo(18f, 19f)
                verticalLineTo(17f)
            }
        }.build()

        return _FileShredder!!
    }

@Suppress("ObjectPropertyName")
private var _FileShredder: ImageVector? = null
