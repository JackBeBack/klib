package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Rhombus: ImageVector
    get() {
        if (_Rhombus != null) {
            return _Rhombus!!
        }
        _Rhombus = ImageVector.Builder(
            name = "Rhombus",
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
                moveTo(5.28f, 14.341f)
                curveTo(4.576f, 13.508f, 4.224f, 13.092f, 4.089f, 12.627f)
                curveTo(3.97f, 12.217f, 3.97f, 11.783f, 4.089f, 11.373f)
                curveTo(4.224f, 10.908f, 4.576f, 10.492f, 5.28f, 9.659f)
                lineTo(9.148f, 5.086f)
                curveTo(10.128f, 3.929f, 10.617f, 3.35f, 11.204f, 3.139f)
                curveTo(11.718f, 2.954f, 12.282f, 2.954f, 12.796f, 3.139f)
                curveTo(13.383f, 3.35f, 13.872f, 3.929f, 14.852f, 5.086f)
                lineTo(18.72f, 9.659f)
                curveTo(19.424f, 10.492f, 19.776f, 10.908f, 19.911f, 11.373f)
                curveTo(20.03f, 11.783f, 20.03f, 12.217f, 19.911f, 12.627f)
                curveTo(19.776f, 13.092f, 19.424f, 13.508f, 18.72f, 14.341f)
                lineTo(14.852f, 18.913f)
                curveTo(13.872f, 20.071f, 13.383f, 20.65f, 12.796f, 20.861f)
                curveTo(12.282f, 21.046f, 11.718f, 21.046f, 11.204f, 20.861f)
                curveTo(10.617f, 20.65f, 10.128f, 20.071f, 9.148f, 18.913f)
                lineTo(5.28f, 14.341f)
                close()
            }
        }.build()

        return _Rhombus!!
    }

@Suppress("ObjectPropertyName")
private var _Rhombus: ImageVector? = null
