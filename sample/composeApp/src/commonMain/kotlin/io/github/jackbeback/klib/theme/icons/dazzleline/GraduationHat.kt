package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GraduationHat: ImageVector
    get() {
        if (_GraduationHat != null) {
            return _GraduationHat!!
        }
        _GraduationHat = ImageVector.Builder(
            name = "GraduationHat",
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
                moveTo(7.54f, 11.77f)
                lineTo(12f, 14f)
                lineTo(19f, 10.5f)
                moveTo(7.54f, 11.77f)
                verticalLineTo(17.77f)
                moveTo(7.54f, 11.77f)
                lineTo(12f, 9.54f)
                moveTo(7.54f, 11.77f)
                lineTo(5f, 10.5f)
                moveTo(7.54f, 17.77f)
                verticalLineTo(21f)
                moveTo(7.54f, 17.77f)
                lineTo(12f, 20f)
                lineTo(19f, 16.5f)
                verticalLineTo(10.5f)
                moveTo(7.54f, 17.77f)
                lineTo(5f, 16.5f)
                verticalLineTo(10.5f)
                moveTo(19f, 10.5f)
                lineTo(22f, 9f)
                lineTo(12f, 4f)
                lineTo(2f, 9f)
                lineTo(5f, 10.5f)
            }
        }.build()

        return _GraduationHat!!
    }

@Suppress("ObjectPropertyName")
private var _GraduationHat: ImageVector? = null
