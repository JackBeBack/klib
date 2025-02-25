package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DocumentLayoutLeft: ImageVector
    get() {
        if (_DocumentLayoutLeft != null) {
            return _DocumentLayoutLeft!!
        }
        _DocumentLayoutLeft = ImageVector.Builder(
            name = "DocumentLayoutLeft",
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
                moveTo(3f, 15f)
                horizontalLineTo(21f)
                moveTo(3f, 19f)
                horizontalLineTo(13f)
                moveTo(21f, 7f)
                horizontalLineTo(13f)
                moveTo(21f, 11f)
                horizontalLineTo(13f)
                moveTo(4.6f, 11f)
                horizontalLineTo(7.4f)
                curveTo(7.96f, 11f, 8.24f, 11f, 8.454f, 10.891f)
                curveTo(8.642f, 10.795f, 8.795f, 10.642f, 8.891f, 10.454f)
                curveTo(9f, 10.24f, 9f, 9.96f, 9f, 9.4f)
                verticalLineTo(6.6f)
                curveTo(9f, 6.04f, 9f, 5.76f, 8.891f, 5.546f)
                curveTo(8.795f, 5.358f, 8.642f, 5.205f, 8.454f, 5.109f)
                curveTo(8.24f, 5f, 7.96f, 5f, 7.4f, 5f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 5f, 3.76f, 5f, 3.546f, 5.109f)
                curveTo(3.358f, 5.205f, 3.205f, 5.358f, 3.109f, 5.546f)
                curveTo(3f, 5.76f, 3f, 6.04f, 3f, 6.6f)
                verticalLineTo(9.4f)
                curveTo(3f, 9.96f, 3f, 10.24f, 3.109f, 10.454f)
                curveTo(3.205f, 10.642f, 3.358f, 10.795f, 3.546f, 10.891f)
                curveTo(3.76f, 11f, 4.04f, 11f, 4.6f, 11f)
                close()
            }
        }.build()

        return _DocumentLayoutLeft!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentLayoutLeft: ImageVector? = null
