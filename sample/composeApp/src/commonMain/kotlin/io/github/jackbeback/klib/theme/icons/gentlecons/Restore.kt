package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Restore: ImageVector
    get() {
        if (_Restore != null) {
            return _Restore!!
        }
        _Restore = ImageVector.Builder(
            name = "Restore",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(4.522f, 7f)
                horizontalLineTo(7f)
                curveTo(7.552f, 7f, 8f, 7.448f, 8f, 8f)
                curveTo(8f, 8.552f, 7.552f, 9f, 7f, 9f)
                horizontalLineTo(3f)
                curveTo(1.895f, 9f, 1f, 8.105f, 1f, 7f)
                verticalLineTo(3f)
                curveTo(1f, 2.448f, 1.448f, 2f, 2f, 2f)
                curveTo(2.552f, 2f, 3f, 2.448f, 3f, 3f)
                verticalLineTo(5.675f)
                curveTo(4.27f, 3.869f, 6.061f, 2.477f, 8.149f, 1.696f)
                curveTo(10.663f, 0.756f, 13.435f, 0.768f, 15.941f, 1.73f)
                curveTo(18.448f, 2.692f, 20.516f, 4.538f, 21.756f, 6.919f)
                curveTo(22.996f, 9.3f, 23.323f, 12.053f, 22.674f, 14.658f)
                curveTo(22.025f, 17.263f, 20.446f, 19.541f, 18.235f, 21.063f)
                curveTo(16.023f, 22.584f, 13.331f, 23.244f, 10.666f, 22.919f)
                curveTo(8.001f, 22.593f, 5.547f, 21.304f, 3.767f, 19.295f)
                curveTo(2.208f, 17.536f, 1.26f, 15.331f, 1.046f, 13.008f)
                curveTo(0.996f, 12.458f, 1.452f, 12.009f, 2.004f, 12.008f)
                curveTo(2.557f, 12.008f, 3.004f, 12.457f, 3.065f, 13.005f)
                curveTo(3.271f, 14.837f, 4.037f, 16.571f, 5.27f, 17.962f)
                curveTo(6.726f, 19.605f, 8.731f, 20.659f, 10.909f, 20.925f)
                curveTo(13.088f, 21.191f, 15.288f, 20.651f, 17.096f, 19.407f)
                curveTo(18.904f, 18.164f, 20.194f, 16.302f, 20.725f, 14.172f)
                curveTo(21.255f, 12.043f, 20.988f, 9.793f, 19.975f, 7.847f)
                curveTo(18.961f, 5.901f, 17.27f, 4.392f, 15.222f, 3.606f)
                curveTo(13.173f, 2.82f, 10.907f, 2.81f, 8.852f, 3.578f)
                curveTo(7.11f, 4.229f, 5.621f, 5.401f, 4.58f, 6.922f)
                curveTo(4.562f, 6.949f, 4.542f, 6.975f, 4.522f, 7f)
                close()
            }
        }.build()

        return _Restore!!
    }

@Suppress("ObjectPropertyName")
private var _Restore: ImageVector? = null
