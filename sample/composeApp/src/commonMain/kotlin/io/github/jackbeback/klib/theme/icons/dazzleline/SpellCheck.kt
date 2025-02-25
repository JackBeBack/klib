package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SpellCheck: ImageVector
    get() {
        if (_SpellCheck != null) {
            return _SpellCheck!!
        }
        _SpellCheck = ImageVector.Builder(
            name = "SpellCheck",
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
                moveTo(3f, 12.5f)
                lineTo(3.844f, 9.5f)
                moveTo(3.844f, 9.5f)
                lineTo(5f, 5.389f)
                curveTo(5f, 5.389f, 5.25f, 4.5f, 6f, 4.5f)
                curveTo(6.75f, 4.5f, 7f, 5.389f, 7f, 5.389f)
                lineTo(8.156f, 9.5f)
                moveTo(3.844f, 9.5f)
                horizontalLineTo(8.156f)
                moveTo(9f, 12.5f)
                lineTo(8.156f, 9.5f)
                moveTo(13f, 16.833f)
                lineTo(15.462f, 19.5f)
                lineTo(21f, 13.5f)
                moveTo(12f, 8.5f)
                horizontalLineTo(15f)
                curveTo(16.105f, 8.5f, 17f, 7.605f, 17f, 6.5f)
                curveTo(17f, 5.395f, 16.105f, 4.5f, 15f, 4.5f)
                horizontalLineTo(12f)
                verticalLineTo(8.5f)
                close()
                moveTo(12f, 8.5f)
                horizontalLineTo(16f)
                curveTo(17.105f, 8.5f, 18f, 9.395f, 18f, 10.5f)
                curveTo(18f, 11.605f, 17.105f, 12.5f, 16f, 12.5f)
                horizontalLineTo(12f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()

        return _SpellCheck!!
    }

@Suppress("ObjectPropertyName")
private var _SpellCheck: ImageVector? = null
