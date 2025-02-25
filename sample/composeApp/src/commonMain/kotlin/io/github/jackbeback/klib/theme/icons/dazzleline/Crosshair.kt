package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Crosshair: ImageVector
    get() {
        if (_Crosshair != null) {
            return _Crosshair!!
        }
        _Crosshair = ImageVector.Builder(
            name = "Crosshair",
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
                verticalLineTo(7f)
                moveTo(12f, 17f)
                verticalLineTo(21f)
                moveTo(3f, 12f)
                horizontalLineTo(7f)
                moveTo(17f, 12f)
                horizontalLineTo(21f)
                moveTo(12f, 12f)
                horizontalLineTo(12.01f)
                moveTo(19f, 12f)
                curveTo(19f, 15.866f, 15.866f, 19f, 12f, 19f)
                curveTo(8.134f, 19f, 5f, 15.866f, 5f, 12f)
                curveTo(5f, 8.134f, 8.134f, 5f, 12f, 5f)
                curveTo(15.866f, 5f, 19f, 8.134f, 19f, 12f)
                close()
            }
        }.build()

        return _Crosshair!!
    }

@Suppress("ObjectPropertyName")
private var _Crosshair: ImageVector? = null
