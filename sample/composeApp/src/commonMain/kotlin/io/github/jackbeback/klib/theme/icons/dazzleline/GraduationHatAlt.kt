package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GraduationHatAlt: ImageVector
    get() {
        if (_GraduationHatAlt != null) {
            return _GraduationHatAlt!!
        }
        _GraduationHatAlt = ImageVector.Builder(
            name = "GraduationHatAlt",
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
                moveTo(22f, 9f)
                lineTo(12f, 4f)
                lineTo(2f, 9f)
                lineTo(12f, 14f)
                lineTo(22f, 9f)
                close()
                moveTo(22f, 9f)
                verticalLineTo(15f)
                moveTo(19f, 10.5f)
                verticalLineTo(16.5f)
                lineTo(12f, 20f)
                lineTo(5f, 16.5f)
                verticalLineTo(10.5f)
            }
        }.build()

        return _GraduationHatAlt!!
    }

@Suppress("ObjectPropertyName")
private var _GraduationHatAlt: ImageVector? = null
