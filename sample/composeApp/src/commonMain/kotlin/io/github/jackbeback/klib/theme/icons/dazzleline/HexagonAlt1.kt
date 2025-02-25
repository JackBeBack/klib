package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HexagonAlt1: ImageVector
    get() {
        if (_HexagonAlt1 != null) {
            return _HexagonAlt1!!
        }
        _HexagonAlt1 = ImageVector.Builder(
            name = "HexagonAlt1",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.461f, 12.8f)
                curveTo(2.293f, 12.509f, 2.209f, 12.363f, 2.176f, 12.208f)
                curveTo(2.147f, 12.071f, 2.147f, 11.929f, 2.176f, 11.792f)
                curveTo(2.209f, 11.637f, 2.293f, 11.491f, 2.461f, 11.2f)
                lineTo(6.538f, 4.14f)
                curveTo(6.706f, 3.848f, 6.79f, 3.703f, 6.908f, 3.597f)
                curveTo(7.012f, 3.503f, 7.135f, 3.432f, 7.268f, 3.389f)
                curveTo(7.419f, 3.34f, 7.587f, 3.34f, 7.923f, 3.34f)
                horizontalLineTo(16.076f)
                curveTo(16.412f, 3.34f, 16.581f, 3.34f, 16.731f, 3.389f)
                curveTo(16.865f, 3.432f, 16.987f, 3.503f, 17.091f, 3.597f)
                curveTo(17.209f, 3.703f, 17.293f, 3.848f, 17.462f, 4.14f)
                lineTo(21.538f, 11.2f)
                curveTo(21.706f, 11.491f, 21.79f, 11.637f, 21.823f, 11.792f)
                curveTo(21.852f, 11.929f, 21.852f, 12.071f, 21.823f, 12.208f)
                curveTo(21.79f, 12.363f, 21.706f, 12.509f, 21.538f, 12.8f)
                lineTo(17.462f, 19.86f)
                curveTo(17.293f, 20.152f, 17.209f, 20.298f, 17.091f, 20.403f)
                curveTo(16.987f, 20.497f, 16.865f, 20.568f, 16.731f, 20.611f)
                curveTo(16.581f, 20.66f, 16.412f, 20.66f, 16.076f, 20.66f)
                horizontalLineTo(7.923f)
                curveTo(7.587f, 20.66f, 7.419f, 20.66f, 7.268f, 20.611f)
                curveTo(7.135f, 20.568f, 7.012f, 20.497f, 6.908f, 20.403f)
                curveTo(6.79f, 20.298f, 6.706f, 20.152f, 6.538f, 19.86f)
                lineTo(2.461f, 12.8f)
                close()
            }
        }.build()

        return _HexagonAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _HexagonAlt1: ImageVector? = null
