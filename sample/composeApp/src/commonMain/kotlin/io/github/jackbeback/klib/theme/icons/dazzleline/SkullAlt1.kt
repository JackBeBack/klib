package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SkullAlt1: ImageVector
    get() {
        if (_SkullAlt1 != null) {
            return _SkullAlt1!!
        }
        _SkullAlt1 = ImageVector.Builder(
            name = "SkullAlt1",
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
                moveTo(12f, 18f)
                verticalLineTo(21f)
                moveTo(8f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                moveTo(13.5f, 14f)
                lineTo(12f, 12.5f)
                lineTo(10.5f, 14f)
                moveTo(8f, 19f)
                horizontalLineTo(6.343f)
                curveTo(4.304f, 17.35f, 3f, 14.827f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                curveTo(21f, 14.827f, 19.696f, 17.35f, 17.657f, 19f)
                horizontalLineTo(16f)
                moveTo(10f, 9f)
                curveTo(10f, 9.552f, 9.552f, 10f, 9f, 10f)
                curveTo(8.448f, 10f, 8f, 9.552f, 8f, 9f)
                curveTo(8f, 8.448f, 8.448f, 8f, 9f, 8f)
                curveTo(9.552f, 8f, 10f, 8.448f, 10f, 9f)
                close()
                moveTo(16f, 9f)
                curveTo(16f, 9.552f, 15.552f, 10f, 15f, 10f)
                curveTo(14.448f, 10f, 14f, 9.552f, 14f, 9f)
                curveTo(14f, 8.448f, 14.448f, 8f, 15f, 8f)
                curveTo(15.552f, 8f, 16f, 8.448f, 16f, 9f)
                close()
            }
        }.build()

        return _SkullAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SkullAlt1: ImageVector? = null
