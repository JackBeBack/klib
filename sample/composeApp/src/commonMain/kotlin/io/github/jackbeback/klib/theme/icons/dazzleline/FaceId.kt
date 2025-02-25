package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FaceId: ImageVector
    get() {
        if (_FaceId != null) {
            return _FaceId!!
        }
        _FaceId = ImageVector.Builder(
            name = "FaceId",
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
                moveTo(13.8f, 10.2f)
                horizontalLineTo(13.806f)
                moveTo(10.2f, 10.2f)
                horizontalLineTo(10.206f)
                moveTo(9.6f, 13.2f)
                curveTo(9.6f, 13.2f, 10.5f, 14.4f, 12f, 14.4f)
                curveTo(13.5f, 14.4f, 14.4f, 13.2f, 14.4f, 13.2f)
                moveTo(17f, 3f)
                horizontalLineTo(19f)
                curveTo(20.105f, 3f, 21f, 3.895f, 21f, 5f)
                verticalLineTo(7f)
                moveTo(21f, 17f)
                verticalLineTo(19f)
                curveTo(21f, 20.105f, 20.105f, 21f, 19f, 21f)
                horizontalLineTo(17f)
                moveTo(7f, 21f)
                horizontalLineTo(5f)
                curveTo(3.895f, 21f, 3f, 20.105f, 3f, 19f)
                verticalLineTo(17f)
                moveTo(3f, 7f)
                verticalLineTo(5f)
                curveTo(3f, 3.895f, 3.895f, 3f, 5f, 3f)
                horizontalLineTo(7f)
                moveTo(14.1f, 10.2f)
                curveTo(14.1f, 10.366f, 13.966f, 10.5f, 13.8f, 10.5f)
                curveTo(13.634f, 10.5f, 13.5f, 10.366f, 13.5f, 10.2f)
                curveTo(13.5f, 10.034f, 13.634f, 9.9f, 13.8f, 9.9f)
                curveTo(13.966f, 9.9f, 14.1f, 10.034f, 14.1f, 10.2f)
                close()
                moveTo(10.5f, 10.2f)
                curveTo(10.5f, 10.366f, 10.366f, 10.5f, 10.2f, 10.5f)
                curveTo(10.035f, 10.5f, 9.9f, 10.366f, 9.9f, 10.2f)
                curveTo(9.9f, 10.034f, 10.035f, 9.9f, 10.2f, 9.9f)
                curveTo(10.366f, 9.9f, 10.5f, 10.034f, 10.5f, 10.2f)
                close()
                moveTo(18f, 12f)
                curveTo(18f, 15.314f, 15.314f, 18f, 12f, 18f)
                curveTo(8.686f, 18f, 6f, 15.314f, 6f, 12f)
                curveTo(6f, 8.686f, 8.686f, 6f, 12f, 6f)
                curveTo(15.314f, 6f, 18f, 8.686f, 18f, 12f)
                close()
            }
        }.build()

        return _FaceId!!
    }

@Suppress("ObjectPropertyName")
private var _FaceId: ImageVector? = null
