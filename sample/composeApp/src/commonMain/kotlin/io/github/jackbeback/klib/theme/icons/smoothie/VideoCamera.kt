package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.VideoCamera: ImageVector
    get() {
        if (_VideoCamera != null) {
            return _VideoCamera!!
        }
        _VideoCamera = ImageVector.Builder(
            name = "VideoCamera",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 18f)
                horizontalLineTo(15f)
                curveTo(16.105f, 18f, 17f, 17.105f, 17f, 16f)
                verticalLineTo(8.571f)
                verticalLineTo(8f)
                curveTo(17f, 6.895f, 16.105f, 6f, 15f, 6f)
                horizontalLineTo(5f)
                curveTo(3.895f, 6f, 3f, 6.895f, 3f, 8f)
                verticalLineTo(16f)
                curveTo(3f, 17.105f, 3.895f, 18f, 5f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 9.5f)
                moveToRelative(-0.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 10f)
                lineTo(21f, 7f)
                verticalLineTo(17f)
                lineTo(17f, 14f)
            }
        }.build()

        return _VideoCamera!!
    }

@Suppress("ObjectPropertyName")
private var _VideoCamera: ImageVector? = null
