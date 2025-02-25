package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Temple: ImageVector
    get() {
        if (_Temple != null) {
            return _Temple!!
        }
        _Temple = ImageVector.Builder(
            name = "Temple",
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
                moveTo(7f, 21f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 21f, 3.76f, 21f, 3.546f, 20.891f)
                curveTo(3.358f, 20.795f, 3.205f, 20.642f, 3.109f, 20.454f)
                curveTo(3f, 20.24f, 3f, 19.96f, 3f, 19.4f)
                verticalLineTo(12.89f)
                curveTo(3f, 12.789f, 3f, 12.739f, 3.01f, 12.691f)
                curveTo(3.018f, 12.648f, 3.032f, 12.607f, 3.051f, 12.568f)
                curveTo(3.073f, 12.524f, 3.103f, 12.484f, 3.164f, 12.404f)
                lineTo(4.364f, 10.833f)
                curveTo(4.58f, 10.55f, 4.688f, 10.408f, 4.82f, 10.357f)
                curveTo(4.936f, 10.313f, 5.064f, 10.313f, 5.18f, 10.357f)
                curveTo(5.312f, 10.408f, 5.42f, 10.55f, 5.636f, 10.833f)
                lineTo(6.836f, 12.404f)
                curveTo(6.897f, 12.484f, 6.927f, 12.524f, 6.949f, 12.568f)
                curveTo(6.968f, 12.607f, 6.982f, 12.648f, 6.99f, 12.691f)
                curveTo(7f, 12.739f, 7f, 12.789f, 7f, 12.89f)
                moveTo(7f, 21f)
                horizontalLineTo(17f)
                moveTo(7f, 21f)
                verticalLineTo(8.508f)
                curveTo(7f, 8.258f, 7f, 8.133f, 7.029f, 8.015f)
                curveTo(7.054f, 7.911f, 7.097f, 7.812f, 7.154f, 7.721f)
                curveTo(7.218f, 7.618f, 7.308f, 7.531f, 7.488f, 7.357f)
                lineTo(10.888f, 4.074f)
                curveTo(11.279f, 3.697f, 11.474f, 3.508f, 11.698f, 3.437f)
                curveTo(11.894f, 3.375f, 12.106f, 3.375f, 12.302f, 3.437f)
                curveTo(12.526f, 3.508f, 12.721f, 3.697f, 13.112f, 4.074f)
                lineTo(16.512f, 7.357f)
                curveTo(16.692f, 7.531f, 16.782f, 7.618f, 16.846f, 7.721f)
                curveTo(16.903f, 7.812f, 16.946f, 7.911f, 16.971f, 8.015f)
                curveTo(17f, 8.133f, 17f, 8.258f, 17f, 8.508f)
                verticalLineTo(21f)
                moveTo(17f, 21f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 21f, 20.24f, 21f, 20.454f, 20.891f)
                curveTo(20.642f, 20.795f, 20.795f, 20.642f, 20.891f, 20.454f)
                curveTo(21f, 20.24f, 21f, 19.96f, 21f, 19.4f)
                verticalLineTo(12.89f)
                curveTo(21f, 12.789f, 21f, 12.739f, 20.99f, 12.691f)
                curveTo(20.982f, 12.648f, 20.968f, 12.607f, 20.949f, 12.568f)
                curveTo(20.927f, 12.524f, 20.897f, 12.484f, 20.836f, 12.404f)
                lineTo(19.636f, 10.833f)
                curveTo(19.42f, 10.55f, 19.312f, 10.408f, 19.18f, 10.357f)
                curveTo(19.064f, 10.313f, 18.936f, 10.313f, 18.82f, 10.357f)
                curveTo(18.688f, 10.408f, 18.58f, 10.55f, 18.364f, 10.833f)
                lineTo(17.164f, 12.404f)
                curveTo(17.103f, 12.484f, 17.073f, 12.524f, 17.051f, 12.568f)
                curveTo(17.032f, 12.607f, 17.018f, 12.648f, 17.01f, 12.691f)
                curveTo(17f, 12.739f, 17f, 12.789f, 17f, 12.89f)
                moveTo(14f, 21f)
                verticalLineTo(17f)
                curveTo(14f, 15.895f, 13.105f, 15f, 12f, 15f)
                curveTo(10.895f, 15f, 10f, 15.895f, 10f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _Temple!!
    }

@Suppress("ObjectPropertyName")
private var _Temple: ImageVector? = null
