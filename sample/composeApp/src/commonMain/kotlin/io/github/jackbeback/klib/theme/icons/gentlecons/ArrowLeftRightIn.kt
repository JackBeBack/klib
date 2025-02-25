package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowLeftRightIn: ImageVector
    get() {
        if (_ArrowLeftRightIn != null) {
            return _ArrowLeftRightIn!!
        }
        _ArrowLeftRightIn = ImageVector.Builder(
            name = "ArrowLeftRightIn",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(4.711f, 5.683f)
                curveTo(4.32f, 5.292f, 3.687f, 5.292f, 3.296f, 5.683f)
                curveTo(2.906f, 6.073f, 2.906f, 6.706f, 3.296f, 7.097f)
                lineTo(7.479f, 11.279f)
                curveTo(7.869f, 11.669f, 7.869f, 12.302f, 7.479f, 12.693f)
                lineTo(3.293f, 16.879f)
                curveTo(2.902f, 17.269f, 2.902f, 17.902f, 3.293f, 18.293f)
                curveTo(3.683f, 18.683f, 4.317f, 18.683f, 4.707f, 18.293f)
                lineTo(9.597f, 13.403f)
                curveTo(10.378f, 12.622f, 10.379f, 11.356f, 9.598f, 10.575f)
                lineTo(4.711f, 5.683f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(19.312f, 18.293f)
                curveTo(19.702f, 18.683f, 20.336f, 18.683f, 20.726f, 18.293f)
                curveTo(21.117f, 17.902f, 21.117f, 17.269f, 20.726f, 16.879f)
                lineTo(16.544f, 12.697f)
                curveTo(16.154f, 12.306f, 16.154f, 11.673f, 16.544f, 11.282f)
                lineTo(20.73f, 7.097f)
                curveTo(21.12f, 6.706f, 21.12f, 6.073f, 20.73f, 5.683f)
                curveTo(20.339f, 5.292f, 19.706f, 5.292f, 19.316f, 5.683f)
                lineTo(14.425f, 10.573f)
                curveTo(13.644f, 11.354f, 13.644f, 12.62f, 14.425f, 13.401f)
                lineTo(19.312f, 18.293f)
                close()
            }
        }.build()

        return _ArrowLeftRightIn!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftRightIn: ImageVector? = null
