package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.History: ImageVector
    get() {
        if (_History != null) {
            return _History!!
        }
        _History = ImageVector.Builder(
            name = "History",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(3f, 5.675f)
                verticalLineTo(3f)
                curveTo(3f, 2.448f, 2.552f, 2f, 2f, 2f)
                curveTo(1.448f, 2f, 1f, 2.448f, 1f, 3f)
                verticalLineTo(7f)
                curveTo(1f, 8.105f, 1.895f, 9f, 3f, 9f)
                horizontalLineTo(7f)
                curveTo(7.552f, 9f, 8f, 8.552f, 8f, 8f)
                curveTo(8f, 7.448f, 7.552f, 7f, 7f, 7f)
                horizontalLineTo(4.522f)
                curveTo(4.542f, 6.975f, 4.562f, 6.949f, 4.58f, 6.922f)
                curveTo(5.621f, 5.401f, 7.11f, 4.229f, 8.852f, 3.578f)
                curveTo(10.907f, 2.81f, 13.173f, 2.82f, 15.222f, 3.606f)
                curveTo(17.27f, 4.392f, 18.961f, 5.901f, 19.975f, 7.847f)
                curveTo(20.988f, 9.793f, 21.255f, 12.043f, 20.725f, 14.172f)
                curveTo(20.194f, 16.302f, 18.904f, 18.164f, 17.096f, 19.407f)
                curveTo(15.288f, 20.651f, 13.088f, 21.191f, 10.909f, 20.925f)
                curveTo(8.731f, 20.659f, 6.726f, 19.605f, 5.27f, 17.962f)
                curveTo(4.037f, 16.571f, 3.271f, 14.837f, 3.065f, 13.005f)
                curveTo(3.004f, 12.457f, 2.557f, 12.008f, 2.004f, 12.008f)
                curveTo(1.452f, 12.009f, 0.996f, 12.458f, 1.046f, 13.008f)
                curveTo(1.26f, 15.331f, 2.208f, 17.536f, 3.767f, 19.295f)
                curveTo(5.547f, 21.304f, 8.001f, 22.593f, 10.666f, 22.919f)
                curveTo(13.331f, 23.244f, 16.023f, 22.584f, 18.235f, 21.063f)
                curveTo(20.446f, 19.541f, 22.025f, 17.263f, 22.674f, 14.658f)
                curveTo(23.323f, 12.053f, 22.996f, 9.3f, 21.756f, 6.919f)
                curveTo(20.516f, 4.538f, 18.448f, 2.692f, 15.941f, 1.73f)
                curveTo(13.435f, 0.768f, 10.663f, 0.756f, 8.149f, 1.696f)
                curveTo(6.061f, 2.477f, 4.27f, 3.869f, 3f, 5.675f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12f, 5f)
                curveTo(11.448f, 5f, 11f, 5.448f, 11f, 6f)
                verticalLineTo(12.467f)
                curveTo(11f, 12.467f, 11f, 12.727f, 11.127f, 12.924f)
                curveTo(11.212f, 13.09f, 11.344f, 13.234f, 11.517f, 13.335f)
                lineTo(16.137f, 16.002f)
                curveTo(16.615f, 16.278f, 17.227f, 16.114f, 17.503f, 15.636f)
                curveTo(17.779f, 15.158f, 17.615f, 14.546f, 17.137f, 14.27f)
                lineTo(13f, 11.881f)
                verticalLineTo(6f)
                curveTo(13f, 5.448f, 12.552f, 5f, 12f, 5f)
                close()
            }
        }.build()

        return _History!!
    }

@Suppress("ObjectPropertyName")
private var _History: ImageVector? = null
