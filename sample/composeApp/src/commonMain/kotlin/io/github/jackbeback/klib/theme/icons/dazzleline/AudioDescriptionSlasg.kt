package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.AudioDescriptionSlasg: ImageVector
    get() {
        if (_AudioDescriptionSlasg != null) {
            return _AudioDescriptionSlasg!!
        }
        _AudioDescriptionSlasg = ImageVector.Builder(
            name = "AudioDescriptionSlasg",
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
                moveTo(6.417f, 14f)
                lineTo(8.5f, 9f)
                lineTo(10.583f, 14f)
                moveTo(6.417f, 14f)
                lineTo(6f, 15f)
                moveTo(6.417f, 14f)
                horizontalLineTo(10.583f)
                moveTo(10.583f, 14f)
                lineTo(11f, 15f)
                moveTo(15f, 15f)
                horizontalLineTo(14f)
                curveTo(13.724f, 15f, 13.5f, 14.776f, 13.5f, 14.5f)
                verticalLineTo(13.5f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                curveTo(3.895f, 19f, 3f, 18.105f, 3f, 17f)
                verticalLineTo(7f)
                curveTo(3f, 5.895f, 3.895f, 5f, 5f, 5f)
                moveTo(10.6f, 5f)
                horizontalLineTo(19f)
                curveTo(20.105f, 5f, 21f, 5.895f, 21f, 7f)
                verticalLineTo(15.4f)
                moveTo(14.6f, 9f)
                horizontalLineTo(15f)
                curveTo(16.657f, 9f, 18f, 10.343f, 18f, 12f)
                curveTo(18f, 12.127f, 17.992f, 12.253f, 17.977f, 12.377f)
                moveTo(3f, 3f)
                lineTo(13.5f, 13.5f)
                moveTo(21f, 21f)
                lineTo(13.5f, 13.5f)
            }
        }.build()

        return _AudioDescriptionSlasg!!
    }

@Suppress("ObjectPropertyName")
private var _AudioDescriptionSlasg: ImageVector? = null
