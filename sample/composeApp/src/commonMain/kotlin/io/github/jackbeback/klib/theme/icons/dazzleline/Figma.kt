package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Figma: ImageVector
    get() {
        if (_Figma != null) {
            return _Figma!!
        }
        _Figma = ImageVector.Builder(
            name = "Figma",
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
                horizontalLineTo(9f)
                curveTo(7.343f, 3f, 6f, 4.343f, 6f, 6f)
                curveTo(6f, 7.657f, 7.343f, 9f, 9f, 9f)
                moveTo(12f, 3f)
                verticalLineTo(9f)
                moveTo(12f, 3f)
                horizontalLineTo(15f)
                curveTo(16.657f, 3f, 18f, 4.343f, 18f, 6f)
                curveTo(18f, 7.657f, 16.657f, 9f, 15f, 9f)
                moveTo(12f, 9f)
                horizontalLineTo(9f)
                moveTo(12f, 9f)
                horizontalLineTo(15f)
                moveTo(12f, 9f)
                verticalLineTo(15f)
                moveTo(9f, 9f)
                curveTo(7.343f, 9f, 6f, 10.343f, 6f, 12f)
                curveTo(6f, 13.657f, 7.343f, 15f, 9f, 15f)
                moveTo(15f, 9f)
                curveTo(16.657f, 9f, 18f, 10.343f, 18f, 12f)
                curveTo(18f, 13.657f, 16.657f, 15f, 15f, 15f)
                curveTo(13.343f, 15f, 12f, 13.657f, 12f, 12f)
                curveTo(12f, 10.343f, 13.343f, 9f, 15f, 9f)
                close()
                moveTo(12f, 15f)
                horizontalLineTo(9f)
                moveTo(12f, 15f)
                verticalLineTo(18f)
                curveTo(12f, 19.657f, 10.657f, 21f, 9f, 21f)
                curveTo(7.343f, 21f, 6f, 19.657f, 6f, 18f)
                curveTo(6f, 16.343f, 7.343f, 15f, 9f, 15f)
            }
        }.build()

        return _Figma!!
    }

@Suppress("ObjectPropertyName")
private var _Figma: ImageVector? = null
