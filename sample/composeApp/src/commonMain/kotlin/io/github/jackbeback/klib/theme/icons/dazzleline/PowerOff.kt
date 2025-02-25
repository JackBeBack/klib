package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PowerOff: ImageVector
    get() {
        if (_PowerOff != null) {
            return _PowerOff!!
        }
        _PowerOff = ImageVector.Builder(
            name = "PowerOff",
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
                moveTo(12f, 3f)
                verticalLineTo(12f)
                moveTo(18.361f, 5.64f)
                curveTo(19.619f, 6.899f, 20.476f, 8.502f, 20.823f, 10.248f)
                curveTo(21.17f, 11.994f, 20.992f, 13.803f, 20.311f, 15.448f)
                curveTo(19.629f, 17.092f, 18.476f, 18.498f, 16.996f, 19.486f)
                curveTo(15.516f, 20.475f, 13.776f, 21.003f, 11.996f, 21.003f)
                curveTo(10.216f, 21.003f, 8.476f, 20.475f, 6.996f, 19.486f)
                curveTo(5.516f, 18.498f, 4.363f, 17.092f, 3.681f, 15.448f)
                curveTo(3f, 13.803f, 2.822f, 11.994f, 3.169f, 10.248f)
                curveTo(3.516f, 8.502f, 4.373f, 6.899f, 5.631f, 5.64f)
            }
        }.build()

        return _PowerOff!!
    }

@Suppress("ObjectPropertyName")
private var _PowerOff: ImageVector? = null
