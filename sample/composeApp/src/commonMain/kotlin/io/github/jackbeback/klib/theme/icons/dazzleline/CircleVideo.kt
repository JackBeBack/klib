package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleVideo: ImageVector
    get() {
        if (_CircleVideo != null) {
            return _CircleVideo!!
        }
        _CircleVideo = ImageVector.Builder(
            name = "CircleVideo",
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
                moveTo(14f, 11f)
                lineTo(17f, 9.5f)
                verticalLineTo(14.5f)
                lineTo(14f, 13f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
                moveTo(8f, 15f)
                horizontalLineTo(13f)
                curveTo(13.552f, 15f, 14f, 14.552f, 14f, 14f)
                verticalLineTo(10f)
                curveTo(14f, 9.448f, 13.552f, 9f, 13f, 9f)
                horizontalLineTo(8f)
                curveTo(7.448f, 9f, 7f, 9.448f, 7f, 10f)
                verticalLineTo(14f)
                curveTo(7f, 14.552f, 7.448f, 15f, 8f, 15f)
                close()
            }
        }.build()

        return _CircleVideo!!
    }

@Suppress("ObjectPropertyName")
private var _CircleVideo: ImageVector? = null
