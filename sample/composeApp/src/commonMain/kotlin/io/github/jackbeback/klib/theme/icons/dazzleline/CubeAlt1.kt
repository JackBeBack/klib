package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CubeAlt1: ImageVector
    get() {
        if (_CubeAlt1 != null) {
            return _CubeAlt1!!
        }
        _CubeAlt1 = ImageVector.Builder(
            name = "CubeAlt1",
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
                moveTo(12f, 21f)
                lineTo(10f, 20f)
                moveTo(12f, 21f)
                lineTo(14f, 20f)
                moveTo(12f, 21f)
                verticalLineTo(18.5f)
                moveTo(6f, 18f)
                lineTo(4f, 17f)
                verticalLineTo(14.5f)
                moveTo(4f, 9.5f)
                verticalLineTo(7f)
                moveTo(4f, 7f)
                lineTo(6f, 6f)
                moveTo(4f, 7f)
                lineTo(6f, 8f)
                moveTo(10f, 4f)
                lineTo(12f, 3f)
                lineTo(14f, 4f)
                moveTo(18f, 6f)
                lineTo(20f, 7f)
                moveTo(20f, 7f)
                lineTo(18f, 8f)
                moveTo(20f, 7f)
                verticalLineTo(9.5f)
                moveTo(12f, 11f)
                lineTo(10f, 10f)
                moveTo(12f, 11f)
                lineTo(14f, 10f)
                moveTo(12f, 11f)
                verticalLineTo(13.5f)
                moveTo(18f, 18f)
                lineTo(20f, 17f)
                verticalLineTo(14.5f)
            }
        }.build()

        return _CubeAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _CubeAlt1: ImageVector? = null
