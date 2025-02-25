package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Cauldron: ImageVector
    get() {
        if (_Cauldron != null) {
            return _Cauldron!!
        }
        _Cauldron = ImageVector.Builder(
            name = "Cauldron",
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
                moveTo(3f, 10f)
                horizontalLineTo(21f)
                moveTo(9f, 3f)
                lineTo(9.007f, 3.007f)
                moveTo(19f, 10f)
                verticalLineTo(13f)
                curveTo(19f, 16.866f, 15.866f, 20f, 12f, 20f)
                curveTo(8.134f, 20f, 5f, 16.866f, 5f, 13f)
                verticalLineTo(10f)
                moveTo(6f, 16.608f)
                verticalLineTo(21f)
                moveTo(18f, 16.608f)
                verticalLineTo(21f)
                moveTo(15f, 6f)
                curveTo(15f, 6.552f, 14.552f, 7f, 14f, 7f)
                curveTo(13.448f, 7f, 13f, 6.552f, 13f, 6f)
                curveTo(13f, 5.448f, 13.448f, 5f, 14f, 5f)
                curveTo(14.552f, 5f, 15f, 5.448f, 15f, 6f)
                close()
            }
        }.build()

        return _Cauldron!!
    }

@Suppress("ObjectPropertyName")
private var _Cauldron: ImageVector? = null
