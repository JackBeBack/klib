package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.JackOLantern: ImageVector
    get() {
        if (_JackOLantern != null) {
            return _JackOLantern!!
        }
        _JackOLantern = ImageVector.Builder(
            name = "JackOLantern",
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
                moveTo(7f, 10f)
                lineTo(9.5f, 11f)
                lineTo(8.5f, 12f)
                moveTo(16.5f, 10f)
                lineTo(14f, 11f)
                lineTo(15f, 12f)
                moveTo(7f, 15f)
                lineTo(8f, 16.5f)
                lineTo(9.5f, 15.5f)
                lineTo(10.5f, 17f)
                lineTo(12f, 15.5f)
                lineTo(13.5f, 17f)
                lineTo(14.5f, 15.5f)
                lineTo(16f, 16.5f)
                lineTo(17f, 15f)
                moveTo(14f, 6.427f)
                verticalLineTo(4.303f)
                curveTo(14f, 3.583f, 13.417f, 3f, 12.697f, 3f)
                curveTo(12.262f, 3f, 11.855f, 3.218f, 11.613f, 3.58f)
                lineTo(9.778f, 6.335f)
                moveTo(14f, 6.427f)
                curveTo(14.626f, 6.15f, 15.299f, 6f, 16f, 6f)
                curveTo(19.314f, 6f, 22f, 9.358f, 22f, 13.5f)
                curveTo(22f, 17.642f, 19.314f, 21f, 16f, 21f)
                curveTo(15.299f, 21f, 14.626f, 20.85f, 14f, 20.573f)
                curveTo(13.374f, 20.85f, 12.701f, 21f, 12f, 21f)
                curveTo(11.299f, 21f, 10.626f, 20.85f, 10f, 20.573f)
                curveTo(9.374f, 20.85f, 8.701f, 21f, 8f, 21f)
                curveTo(4.686f, 21f, 2f, 17.642f, 2f, 13.5f)
                curveTo(2f, 9.358f, 4.686f, 6f, 8f, 6f)
                curveTo(8.701f, 6f, 9.374f, 6.15f, 10f, 6.427f)
                curveTo(10.626f, 6.15f, 11.299f, 6f, 12f, 6f)
                curveTo(12.701f, 6f, 13.374f, 6.15f, 14f, 6.427f)
                close()
            }
        }.build()

        return _JackOLantern!!
    }

@Suppress("ObjectPropertyName")
private var _JackOLantern: ImageVector? = null
