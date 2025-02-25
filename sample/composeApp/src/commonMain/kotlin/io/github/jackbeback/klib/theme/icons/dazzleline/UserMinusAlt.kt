package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserMinusAlt: ImageVector
    get() {
        if (_UserMinusAlt != null) {
            return _UserMinusAlt!!
        }
        _UserMinusAlt = ImageVector.Builder(
            name = "UserMinusAlt",
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
                moveTo(11f, 21f)
                horizontalLineTo(5.6f)
                curveTo(5.04f, 21f, 4.76f, 21f, 4.546f, 20.891f)
                curveTo(4.358f, 20.795f, 4.205f, 20.642f, 4.109f, 20.454f)
                curveTo(4f, 20.24f, 4f, 19.96f, 4f, 19.4f)
                verticalLineTo(17.684f)
                curveTo(4f, 17.048f, 4f, 16.731f, 4.048f, 16.466f)
                curveTo(4.271f, 15.234f, 5.234f, 14.271f, 6.466f, 14.048f)
                curveTo(6.543f, 14.034f, 6.624f, 14.024f, 6.716f, 14.017f)
                curveTo(6.941f, 14f, 7.053f, 13.991f, 7.204f, 14.003f)
                curveTo(7.36f, 14.014f, 7.447f, 14.03f, 7.598f, 14.072f)
                curveTo(7.743f, 14.113f, 8.004f, 14.231f, 8.527f, 14.468f)
                curveTo(9.281f, 14.81f, 10.118f, 15f, 11f, 15f)
                curveTo(11.882f, 15f, 12.719f, 14.81f, 13.473f, 14.468f)
                curveTo(13.996f, 14.231f, 14.257f, 14.113f, 14.402f, 14.072f)
                curveTo(14.553f, 14.03f, 14.64f, 14.014f, 14.796f, 14.003f)
                horizontalLineTo(15f)
                moveTo(20f, 18f)
                lineTo(14f, 18f)
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserMinusAlt!!
    }

@Suppress("ObjectPropertyName")
private var _UserMinusAlt: ImageVector? = null
