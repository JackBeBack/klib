package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Smoothie: ImageVector
    get() {
        if (_Smoothie != null) {
            return _Smoothie!!
        }
        _Smoothie = ImageVector.Builder(
            name = "Smoothie",
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
                moveTo(7f, 12f)
                horizontalLineTo(17f)
                moveTo(7f, 12f)
                lineTo(8f, 22f)
                horizontalLineTo(16f)
                lineTo(17f, 12f)
                moveTo(7f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                moveTo(17f, 12f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                moveTo(7f, 9f)
                curveTo(7f, 7.333f, 8f, 4f, 12f, 4f)
                curveTo(16f, 4f, 17f, 7.333f, 17f, 9f)
                moveTo(7f, 9f)
                horizontalLineTo(13f)
                moveTo(17f, 9f)
                horizontalLineTo(13f)
                moveTo(13f, 9f)
                lineTo(16f, 2f)
                lineTo(19f, 4f)
            }
        }.build()

        return _Smoothie!!
    }

@Suppress("ObjectPropertyName")
private var _Smoothie: ImageVector? = null
