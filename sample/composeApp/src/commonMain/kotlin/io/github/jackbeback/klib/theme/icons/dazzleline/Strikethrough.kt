package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Strikethrough: ImageVector
    get() {
        if (_Strikethrough != null) {
            return _Strikethrough!!
        }
        _Strikethrough = ImageVector.Builder(
            name = "Strikethrough",
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
                moveTo(19f, 7.5f)
                verticalLineTo(7.313f)
                curveTo(19f, 4.931f, 17.069f, 3f, 14.688f, 3f)
                horizontalLineTo(9.5f)
                curveTo(7.015f, 3f, 5f, 5.015f, 5f, 7.5f)
                curveTo(5f, 9.985f, 7.015f, 12f, 9.5f, 12f)
                horizontalLineTo(14.5f)
                curveTo(16.985f, 12f, 19f, 14.015f, 19f, 16.5f)
                curveTo(19f, 18.985f, 16.985f, 21f, 14.5f, 21f)
                horizontalLineTo(9.406f)
                curveTo(6.973f, 21f, 5f, 19.027f, 5f, 16.594f)
                verticalLineTo(16.5f)
            }
        }.build()

        return _Strikethrough!!
    }

@Suppress("ObjectPropertyName")
private var _Strikethrough: ImageVector? = null
