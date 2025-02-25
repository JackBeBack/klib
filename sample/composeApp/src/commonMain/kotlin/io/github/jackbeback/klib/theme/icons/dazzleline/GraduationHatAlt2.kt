package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GraduationHatAlt2: ImageVector
    get() {
        if (_GraduationHatAlt2 != null) {
            return _GraduationHatAlt2!!
        }
        _GraduationHatAlt2 = ImageVector.Builder(
            name = "GraduationHatAlt2",
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
                moveTo(2f, 10f)
                lineTo(12f, 4.5f)
                lineTo(22f, 10f)
                lineTo(17.946f, 12.23f)
                moveTo(2f, 10f)
                lineTo(6.054f, 12.23f)
                moveTo(2f, 10f)
                verticalLineTo(16f)
                moveTo(6f, 17.5f)
                verticalLineTo(12.5f)
                curveTo(6f, 12.408f, 6.018f, 12.318f, 6.054f, 12.23f)
                moveTo(6f, 17.5f)
                curveTo(6f, 18.605f, 8.686f, 19.5f, 12f, 19.5f)
                curveTo(15.314f, 19.5f, 18f, 18.605f, 18f, 17.5f)
                moveTo(6f, 17.5f)
                curveTo(6f, 16.395f, 8.686f, 15.5f, 12f, 15.5f)
                curveTo(15.314f, 15.5f, 18f, 16.395f, 18f, 17.5f)
                moveTo(18f, 17.5f)
                verticalLineTo(12.5f)
                curveTo(18f, 12.408f, 17.982f, 12.318f, 17.946f, 12.23f)
                moveTo(17.946f, 12.23f)
                curveTo(17.933f, 12.199f, 17.919f, 12.169f, 17.903f, 12.139f)
                curveTo(17.393f, 11.207f, 14.944f, 10.5f, 12f, 10.5f)
                curveTo(9.056f, 10.5f, 6.607f, 11.207f, 6.097f, 12.139f)
                curveTo(6.081f, 12.169f, 6.067f, 12.199f, 6.054f, 12.23f)
            }
        }.build()

        return _GraduationHatAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _GraduationHatAlt2: ImageVector? = null
