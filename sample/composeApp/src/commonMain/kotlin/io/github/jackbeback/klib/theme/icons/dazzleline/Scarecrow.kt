package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Scarecrow: ImageVector
    get() {
        if (_Scarecrow != null) {
            return _Scarecrow!!
        }
        _Scarecrow = ImageVector.Builder(
            name = "Scarecrow",
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
                moveTo(9f, 6f)
                lineTo(10f, 3f)
                horizontalLineTo(14f)
                lineTo(15f, 6f)
                moveTo(12f, 19f)
                verticalLineTo(21f)
                moveTo(18f, 12f)
                horizontalLineTo(21f)
                moveTo(6f, 12f)
                horizontalLineTo(3f)
                moveTo(10f, 6f)
                curveTo(9.686f, 6.418f, 9.5f, 6.937f, 9.5f, 7.5f)
                curveTo(9.5f, 8.881f, 10.619f, 10f, 12f, 10f)
                curveTo(13.381f, 10f, 14.5f, 8.881f, 14.5f, 7.5f)
                curveTo(14.5f, 6.937f, 14.314f, 6.418f, 14f, 6f)
                moveTo(7f, 6f)
                horizontalLineTo(17f)
                moveTo(6f, 10f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(14.5f)
                lineTo(15f, 19f)
                horizontalLineTo(9f)
                lineTo(9.5f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _Scarecrow!!
    }

@Suppress("ObjectPropertyName")
private var _Scarecrow: ImageVector? = null
