package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SnowAlt1: ImageVector
    get() {
        if (_SnowAlt1 != null) {
            return _SnowAlt1!!
        }
        _SnowAlt1 = ImageVector.Builder(
            name = "SnowAlt1",
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
                moveTo(11.999f, 3f)
                verticalLineTo(7f)
                moveTo(11.999f, 7f)
                verticalLineTo(17f)
                moveTo(11.999f, 7f)
                lineTo(8.999f, 4f)
                moveTo(11.999f, 7f)
                lineTo(14.999f, 4f)
                moveTo(11.999f, 17f)
                verticalLineTo(21f)
                moveTo(11.999f, 17f)
                lineTo(8.999f, 20f)
                moveTo(11.999f, 17f)
                lineTo(14.999f, 20f)
                moveTo(4.206f, 7.5f)
                lineTo(7.67f, 9.5f)
                moveTo(7.67f, 9.5f)
                lineTo(16.331f, 14.5f)
                moveTo(7.67f, 9.5f)
                lineTo(3.572f, 10.598f)
                moveTo(7.67f, 9.5f)
                lineTo(6.572f, 5.402f)
                moveTo(16.331f, 14.5f)
                lineTo(19.795f, 16.5f)
                moveTo(16.331f, 14.5f)
                lineTo(17.429f, 18.598f)
                moveTo(16.331f, 14.5f)
                lineTo(20.429f, 13.402f)
                moveTo(4.207f, 16.5f)
                lineTo(7.671f, 14.5f)
                moveTo(7.671f, 14.5f)
                lineTo(16.331f, 9.5f)
                moveTo(7.671f, 14.5f)
                lineTo(3.573f, 13.402f)
                moveTo(7.671f, 14.5f)
                lineTo(6.573f, 18.598f)
                moveTo(16.331f, 9.5f)
                lineTo(19.795f, 7.5f)
                moveTo(16.331f, 9.5f)
                lineTo(17.429f, 5.402f)
                moveTo(16.331f, 9.5f)
                lineTo(20.429f, 10.598f)
            }
        }.build()

        return _SnowAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SnowAlt1: ImageVector? = null
