package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CodeCompare: ImageVector
    get() {
        if (_CodeCompare != null) {
            return _CodeCompare!!
        }
        _CodeCompare = ImageVector.Builder(
            name = "CodeCompare",
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
                moveTo(18f, 8f)
                verticalLineTo(15.3f)
                curveTo(18f, 16.42f, 18f, 16.98f, 17.782f, 17.408f)
                curveTo(17.59f, 17.784f, 17.284f, 18.09f, 16.908f, 18.282f)
                curveTo(16.48f, 18.5f, 15.92f, 18.5f, 14.8f, 18.5f)
                horizontalLineTo(12f)
                moveTo(18f, 8f)
                curveTo(19.381f, 8f, 20.5f, 6.881f, 20.5f, 5.5f)
                curveTo(20.5f, 4.119f, 19.381f, 3f, 18f, 3f)
                curveTo(16.619f, 3f, 15.5f, 4.119f, 15.5f, 5.5f)
                curveTo(15.5f, 6.881f, 16.619f, 8f, 18f, 8f)
                close()
                moveTo(12f, 18.5f)
                lineTo(14f, 16f)
                moveTo(12f, 18.5f)
                lineTo(14f, 21f)
                moveTo(6f, 16f)
                verticalLineTo(8.7f)
                curveTo(6f, 7.58f, 6f, 7.02f, 6.218f, 6.592f)
                curveTo(6.41f, 6.216f, 6.716f, 5.91f, 7.092f, 5.718f)
                curveTo(7.52f, 5.5f, 8.08f, 5.5f, 9.2f, 5.5f)
                horizontalLineTo(12f)
                moveTo(6f, 16f)
                curveTo(4.619f, 16f, 3.5f, 17.119f, 3.5f, 18.5f)
                curveTo(3.5f, 19.881f, 4.619f, 21f, 6f, 21f)
                curveTo(7.381f, 21f, 8.5f, 19.881f, 8.5f, 18.5f)
                curveTo(8.5f, 17.119f, 7.381f, 16f, 6f, 16f)
                close()
                moveTo(12f, 5.5f)
                lineTo(10f, 8f)
                moveTo(12f, 5.5f)
                lineTo(10f, 3f)
            }
        }.build()

        return _CodeCompare!!
    }

@Suppress("ObjectPropertyName")
private var _CodeCompare: ImageVector? = null
