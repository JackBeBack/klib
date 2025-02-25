package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GraduationHatAlt1: ImageVector
    get() {
        if (_GraduationHatAlt1 != null) {
            return _GraduationHatAlt1!!
        }
        _GraduationHatAlt1 = ImageVector.Builder(
            name = "GraduationHatAlt1",
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
                lineTo(6.737f, 11.368f)
                moveTo(22f, 9f)
                lineTo(17.263f, 11.368f)
                moveTo(22f, 9f)
                verticalLineTo(17f)
                moveTo(22f, 9f)
                horizontalLineTo(12f)
                moveTo(6.737f, 11.368f)
                lineTo(6.128f, 16.847f)
                curveTo(6.051f, 17.54f, 6.414f, 18.207f, 7.038f, 18.519f)
                curveTo(10.162f, 20.081f, 13.838f, 20.081f, 16.962f, 18.519f)
                curveTo(17.586f, 18.207f, 17.949f, 17.54f, 17.872f, 16.847f)
                lineTo(17.263f, 11.368f)
                moveTo(6.737f, 11.368f)
                lineTo(12f, 14f)
                lineTo(17.263f, 11.368f)
            }
        }.build()

        return _GraduationHatAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _GraduationHatAlt1: ImageVector? = null
