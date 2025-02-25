package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowDownUpIn: ImageVector
    get() {
        if (_ArrowDownUpIn != null) {
            return _ArrowDownUpIn!!
        }
        _ArrowDownUpIn = ImageVector.Builder(
            name = "ArrowDownUpIn",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18.317f, 4.711f)
                curveTo(18.708f, 4.32f, 18.708f, 3.687f, 18.317f, 3.296f)
                curveTo(17.927f, 2.906f, 17.294f, 2.906f, 16.903f, 3.296f)
                lineTo(12.721f, 7.479f)
                curveTo(12.331f, 7.869f, 11.698f, 7.869f, 11.307f, 7.479f)
                lineTo(7.121f, 3.293f)
                curveTo(6.731f, 2.902f, 6.098f, 2.902f, 5.707f, 3.293f)
                curveTo(5.317f, 3.683f, 5.317f, 4.317f, 5.707f, 4.707f)
                lineTo(10.597f, 9.597f)
                curveTo(11.378f, 10.378f, 12.644f, 10.379f, 13.425f, 9.598f)
                lineTo(18.317f, 4.711f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5.707f, 19.312f)
                curveTo(5.317f, 19.702f, 5.317f, 20.336f, 5.707f, 20.726f)
                curveTo(6.098f, 21.117f, 6.731f, 21.117f, 7.121f, 20.726f)
                lineTo(11.303f, 16.544f)
                curveTo(11.694f, 16.154f, 12.327f, 16.154f, 12.718f, 16.544f)
                lineTo(16.903f, 20.73f)
                curveTo(17.294f, 21.12f, 17.927f, 21.12f, 18.317f, 20.73f)
                curveTo(18.708f, 20.339f, 18.708f, 19.706f, 18.317f, 19.316f)
                lineTo(13.427f, 14.425f)
                curveTo(12.646f, 13.644f, 11.38f, 13.644f, 10.599f, 14.425f)
                lineTo(5.707f, 19.312f)
                close()
            }
        }.build()

        return _ArrowDownUpIn!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownUpIn: ImageVector? = null
