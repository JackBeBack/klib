package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SkullAlt: ImageVector
    get() {
        if (_SkullAlt != null) {
            return _SkullAlt!!
        }
        _SkullAlt = ImageVector.Builder(
            name = "SkullAlt",
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
                moveTo(10f, 18f)
                verticalLineTo(21f)
                moveTo(14f, 20f)
                verticalLineTo(21f)
                moveTo(21f, 12f)
                verticalLineTo(13f)
                curveTo(21f, 15.209f, 19.209f, 17f, 17f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                curveTo(4.791f, 17f, 3f, 15.209f, 3f, 13f)
                verticalLineTo(12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
                moveTo(10f, 10.5f)
                curveTo(10f, 11.605f, 9.105f, 12.5f, 8f, 12.5f)
                curveTo(6.895f, 12.5f, 6f, 11.605f, 6f, 10.5f)
                curveTo(6f, 9.395f, 6.895f, 8.5f, 8f, 8.5f)
                curveTo(9.105f, 8.5f, 10f, 9.395f, 10f, 10.5f)
                close()
                moveTo(18f, 10.5f)
                curveTo(18f, 11.605f, 17.105f, 12.5f, 16f, 12.5f)
                curveTo(14.895f, 12.5f, 14f, 11.605f, 14f, 10.5f)
                curveTo(14f, 9.395f, 14.895f, 8.5f, 16f, 8.5f)
                curveTo(17.105f, 8.5f, 18f, 9.395f, 18f, 10.5f)
                close()
            }
        }.build()

        return _SkullAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SkullAlt: ImageVector? = null
