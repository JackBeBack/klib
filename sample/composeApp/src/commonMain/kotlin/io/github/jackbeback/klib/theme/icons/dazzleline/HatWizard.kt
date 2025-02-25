package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HatWizard: ImageVector
    get() {
        if (_HatWizard != null) {
            return _HatWizard!!
        }
        _HatWizard = ImageVector.Builder(
            name = "HatWizard",
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
                moveTo(5f, 18f)
                lineTo(9.084f, 8.198f)
                curveTo(9.423f, 7.384f, 9.593f, 6.978f, 9.838f, 6.626f)
                curveTo(10.055f, 6.313f, 10.316f, 6.034f, 10.613f, 5.795f)
                curveTo(10.947f, 5.526f, 11.342f, 5.329f, 12.13f, 4.935f)
                lineTo(16f, 3f)
                lineTo(15.187f, 7.067f)
                curveTo(15.117f, 7.414f, 15.083f, 7.587f, 15.078f, 7.761f)
                curveTo(15.075f, 7.915f, 15.089f, 8.07f, 15.12f, 8.221f)
                curveTo(15.156f, 8.391f, 15.222f, 8.555f, 15.353f, 8.883f)
                lineTo(19f, 18f)
                moveTo(14f, 18f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                moveTo(4.5f, 21f)
                horizontalLineTo(19.5f)
                curveTo(20.328f, 21f, 21f, 20.328f, 21f, 19.5f)
                curveTo(21f, 18.672f, 20.328f, 18f, 19.5f, 18f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 18f, 3f, 18.672f, 3f, 19.5f)
                curveTo(3f, 20.328f, 3.672f, 21f, 4.5f, 21f)
                close()
            }
        }.build()

        return _HatWizard!!
    }

@Suppress("ObjectPropertyName")
private var _HatWizard: ImageVector? = null
