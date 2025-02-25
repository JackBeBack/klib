package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Location: ImageVector
    get() {
        if (_Location != null) {
            return _Location!!
        }
        _Location = ImageVector.Builder(
            name = "Location",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.925f, 1.784f)
                curveTo(21.533f, 1.182f, 23.103f, 2.752f, 22.5f, 4.359f)
                lineTo(16.072f, 21.5f)
                curveTo(15.357f, 23.406f, 12.584f, 23.15f, 12.23f, 21.145f)
                lineTo(10.866f, 13.418f)
                lineTo(3.139f, 12.054f)
                curveTo(1.134f, 11.701f, 0.878f, 8.927f, 2.784f, 8.212f)
                lineTo(19.925f, 1.784f)
                close()
                moveTo(20.627f, 3.657f)
                lineTo(3.487f, 10.085f)
                lineTo(11.214f, 11.448f)
                curveTo(12.042f, 11.594f, 12.69f, 12.243f, 12.836f, 13.07f)
                lineTo(14.2f, 20.798f)
                lineTo(20.627f, 3.657f)
                close()
            }
        }.build()

        return _Location!!
    }

@Suppress("ObjectPropertyName")
private var _Location: ImageVector? = null
