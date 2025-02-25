package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserXmarkAlt: ImageVector
    get() {
        if (_UserXmarkAlt != null) {
            return _UserXmarkAlt!!
        }
        _UserXmarkAlt = ImageVector.Builder(
            name = "UserXmarkAlt",
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
                moveTo(15f, 16f)
                lineTo(17.5f, 18.5f)
                moveTo(17.5f, 18.5f)
                lineTo(20f, 21f)
                moveTo(17.5f, 18.5f)
                lineTo(20f, 16f)
                moveTo(17.5f, 18.5f)
                lineTo(15f, 21f)
                moveTo(11f, 15f)
                curveTo(10.118f, 15f, 9.281f, 14.81f, 8.527f, 14.468f)
                curveTo(8.004f, 14.231f, 7.743f, 14.113f, 7.598f, 14.072f)
                curveTo(7.447f, 14.03f, 7.36f, 14.014f, 7.204f, 14.003f)
                curveTo(7.053f, 13.991f, 6.941f, 14f, 6.716f, 14.017f)
                curveTo(6.624f, 14.024f, 6.543f, 14.034f, 6.466f, 14.048f)
                curveTo(5.234f, 14.271f, 4.271f, 15.234f, 4.048f, 16.466f)
                curveTo(4f, 16.731f, 4f, 17.049f, 4f, 17.684f)
                verticalLineTo(19.4f)
                curveTo(4f, 19.96f, 4f, 20.24f, 4.109f, 20.454f)
                curveTo(4.205f, 20.642f, 4.358f, 20.795f, 4.546f, 20.891f)
                curveTo(4.76f, 21f, 5.04f, 21f, 5.6f, 21f)
                horizontalLineTo(11f)
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserXmarkAlt!!
    }

@Suppress("ObjectPropertyName")
private var _UserXmarkAlt: ImageVector? = null
