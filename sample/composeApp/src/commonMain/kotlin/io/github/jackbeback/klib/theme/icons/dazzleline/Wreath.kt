package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Wreath: ImageVector
    get() {
        if (_Wreath != null) {
            return _Wreath!!
        }
        _Wreath = ImageVector.Builder(
            name = "Wreath",
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
                moveTo(16f, 17.928f)
                lineTo(16.808f, 15.808f)
                lineTo(18.928f, 15f)
                lineTo(18.568f, 12.76f)
                lineTo(20f, 11f)
                lineTo(18.568f, 9.24f)
                lineTo(18.928f, 7f)
                lineTo(16.808f, 6.192f)
                lineTo(16f, 4.072f)
                lineTo(13.76f, 4.432f)
                lineTo(12f, 3f)
                lineTo(10.24f, 4.432f)
                lineTo(8f, 4.072f)
                lineTo(7.192f, 6.192f)
                lineTo(5.072f, 7f)
                lineTo(5.432f, 9.24f)
                lineTo(4f, 11f)
                lineTo(5.432f, 12.76f)
                lineTo(5.072f, 15f)
                lineTo(7.192f, 15.808f)
                lineTo(8f, 17.928f)
                moveTo(12f, 8f)
                lineTo(12.66f, 8.537f)
                lineTo(13.5f, 8.402f)
                lineTo(13.803f, 9.197f)
                lineTo(14.598f, 9.5f)
                lineTo(14.463f, 10.34f)
                lineTo(15f, 11f)
                lineTo(14.463f, 11.66f)
                lineTo(14.598f, 12.5f)
                lineTo(13.803f, 12.803f)
                lineTo(13.5f, 13.598f)
                lineTo(12.66f, 13.463f)
                lineTo(12f, 14f)
                lineTo(11.34f, 13.463f)
                lineTo(10.5f, 13.598f)
                lineTo(10.197f, 12.803f)
                lineTo(9.402f, 12.5f)
                lineTo(9.537f, 11.66f)
                lineTo(9f, 11f)
                lineTo(9.537f, 10.34f)
                lineTo(9.402f, 9.5f)
                lineTo(10.197f, 9.197f)
                lineTo(10.5f, 8.402f)
                lineTo(11.34f, 8.537f)
                lineTo(12f, 8f)
                close()
                moveTo(8f, 17f)
                lineTo(12f, 17.5f)
                lineTo(16f, 17f)
                verticalLineTo(21f)
                lineTo(12f, 20.5f)
                lineTo(8f, 21f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Wreath!!
    }

@Suppress("ObjectPropertyName")
private var _Wreath: ImageVector? = null
