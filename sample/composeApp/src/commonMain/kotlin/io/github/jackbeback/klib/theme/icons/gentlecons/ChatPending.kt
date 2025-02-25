package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ChatPending: ImageVector
    get() {
        if (_ChatPending != null) {
            return _ChatPending!!
        }
        _ChatPending = ImageVector.Builder(
            name = "ChatPending",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12f, 3f)
                curveTo(7.851f, 3f, 4f, 5.734f, 4f, 10f)
                curveTo(4f, 11.57f, 4.388f, 12.729f, 5.083f, 13.655f)
                curveTo(5.79f, 14.6f, 6.877f, 15.386f, 8.416f, 16.091f)
                lineTo(9.233f, 16.465f)
                lineTo(8.949f, 17.316f)
                curveTo(8.541f, 18.538f, 7.85f, 19.661f, 7.152f, 20.584f)
                curveTo(8.352f, 20.207f, 9.734f, 19.728f, 11.095f, 19.158f)
                curveTo(11.208f, 19.833f, 11.417f, 20.475f, 11.707f, 21.07f)
                curveTo(9.698f, 21.901f, 7.7f, 22.528f, 6.298f, 22.928f)
                curveTo(5.487f, 23.16f, 4.841f, 22.684f, 4.562f, 22.188f)
                curveTo(4.288f, 21.7f, 4.221f, 20.945f, 4.744f, 20.361f)
                curveTo(5.444f, 19.58f, 6.212f, 18.573f, 6.726f, 17.487f)
                curveTo(5.4f, 16.784f, 4.293f, 15.938f, 3.482f, 14.854f)
                curveTo(2.488f, 13.528f, 2f, 11.93f, 2f, 10f)
                curveTo(2f, 4.266f, 7.149f, 1f, 12f, 1f)
                curveTo(16.851f, 1f, 22f, 4.266f, 22f, 10f)
                curveTo(22f, 10.735f, 21.944f, 11.436f, 21.795f, 12.117f)
                curveTo(21.221f, 11.746f, 20.59f, 11.457f, 19.918f, 11.266f)
                curveTo(19.975f, 10.872f, 20f, 10.454f, 20f, 10f)
                curveTo(20f, 5.734f, 16.149f, 3f, 12f, 3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18f, 15f)
                curveTo(17.448f, 15f, 17f, 15.448f, 17f, 16f)
                verticalLineTo(18f)
                curveTo(17f, 18.02f, 17.001f, 18.039f, 17.002f, 18.059f)
                curveTo(16.986f, 18.334f, 17.083f, 18.614f, 17.293f, 18.824f)
                lineTo(18.466f, 19.997f)
                curveTo(18.856f, 20.388f, 19.49f, 20.388f, 19.88f, 19.997f)
                curveTo(20.271f, 19.607f, 20.271f, 18.974f, 19.88f, 18.583f)
                lineTo(19f, 17.703f)
                verticalLineTo(16f)
                curveTo(19f, 15.448f, 18.552f, 15f, 18f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18f, 24f)
                curveTo(21.314f, 24f, 24f, 21.314f, 24f, 18f)
                curveTo(24f, 14.686f, 21.314f, 12f, 18f, 12f)
                curveTo(14.686f, 12f, 12f, 14.686f, 12f, 18f)
                curveTo(12f, 21.314f, 14.686f, 24f, 18f, 24f)
                close()
                moveTo(18f, 22.018f)
                curveTo(15.781f, 22.018f, 13.982f, 20.219f, 13.982f, 18f)
                curveTo(13.982f, 15.781f, 15.781f, 13.982f, 18f, 13.982f)
                curveTo(20.219f, 13.982f, 22.018f, 15.781f, 22.018f, 18f)
                curveTo(22.018f, 20.219f, 20.219f, 22.018f, 18f, 22.018f)
                close()
            }
        }.build()

        return _ChatPending!!
    }

@Suppress("ObjectPropertyName")
private var _ChatPending: ImageVector? = null
