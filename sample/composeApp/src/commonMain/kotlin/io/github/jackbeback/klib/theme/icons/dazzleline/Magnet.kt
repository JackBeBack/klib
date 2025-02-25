package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Magnet: ImageVector
    get() {
        if (_Magnet != null) {
            return _Magnet!!
        }
        _Magnet = ImageVector.Builder(
            name = "Magnet",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(5f, 7f)
                verticalLineTo(5f)
                curveTo(5f, 3.895f, 5.895f, 3f, 7f, 3f)
                curveTo(8.105f, 3f, 9f, 3.895f, 9f, 5f)
                verticalLineTo(7f)
                moveTo(5f, 7f)
                horizontalLineTo(9f)
                moveTo(5f, 7f)
                verticalLineTo(14f)
                curveTo(5f, 17.866f, 8.134f, 21f, 12f, 21f)
                curveTo(15.866f, 21f, 19f, 17.866f, 19f, 14f)
                verticalLineTo(7f)
                moveTo(9f, 7f)
                verticalLineTo(14f)
                curveTo(9f, 15.657f, 10.343f, 17f, 12f, 17f)
                curveTo(13.657f, 17f, 15f, 15.657f, 15f, 14f)
                verticalLineTo(7f)
                moveTo(15f, 7f)
                verticalLineTo(5f)
                curveTo(15f, 3.895f, 15.895f, 3f, 17f, 3f)
                curveTo(18.105f, 3f, 19f, 3.895f, 19f, 5f)
                verticalLineTo(7f)
                moveTo(15f, 7f)
                horizontalLineTo(19f)
            }
        }.build()

        return _Magnet!!
    }

@Suppress("ObjectPropertyName")
private var _Magnet: ImageVector? = null
