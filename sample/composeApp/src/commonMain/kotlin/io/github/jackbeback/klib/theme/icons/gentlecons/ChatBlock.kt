package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ChatBlock: ImageVector
    get() {
        if (_ChatBlock != null) {
            return _ChatBlock!!
        }
        _ChatBlock = ImageVector.Builder(
            name = "ChatBlock",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(4f, 10f)
                curveTo(4f, 5.734f, 7.851f, 3f, 12f, 3f)
                curveTo(16.149f, 3f, 20f, 5.734f, 20f, 10f)
                curveTo(20f, 10.454f, 19.975f, 10.872f, 19.918f, 11.266f)
                curveTo(20.59f, 11.457f, 21.221f, 11.746f, 21.795f, 12.117f)
                curveTo(21.944f, 11.436f, 22f, 10.735f, 22f, 10f)
                curveTo(22f, 4.266f, 16.851f, 1f, 12f, 1f)
                curveTo(7.149f, 1f, 2f, 4.266f, 2f, 10f)
                curveTo(2f, 11.93f, 2.488f, 13.528f, 3.482f, 14.854f)
                curveTo(4.293f, 15.938f, 5.4f, 16.784f, 6.726f, 17.487f)
                curveTo(6.212f, 18.573f, 5.444f, 19.58f, 4.744f, 20.361f)
                curveTo(4.221f, 20.945f, 4.288f, 21.7f, 4.562f, 22.188f)
                curveTo(4.841f, 22.684f, 5.487f, 23.16f, 6.298f, 22.928f)
                curveTo(7.7f, 22.528f, 9.698f, 21.901f, 11.707f, 21.07f)
                curveTo(11.417f, 20.475f, 11.208f, 19.833f, 11.095f, 19.158f)
                curveTo(9.734f, 19.728f, 8.352f, 20.207f, 7.152f, 20.584f)
                curveTo(7.85f, 19.661f, 8.541f, 18.538f, 8.949f, 17.316f)
                lineTo(9.233f, 16.465f)
                lineTo(8.416f, 16.091f)
                curveTo(6.877f, 15.386f, 5.79f, 14.6f, 5.083f, 13.655f)
                curveTo(4.388f, 12.729f, 4f, 11.57f, 4f, 10f)
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
                curveTo(13.982f, 17.253f, 14.186f, 16.554f, 14.541f, 15.955f)
                lineTo(20.045f, 21.459f)
                curveTo(19.446f, 21.814f, 18.747f, 22.018f, 18f, 22.018f)
                close()
                moveTo(21.459f, 20.045f)
                curveTo(21.814f, 19.446f, 22.018f, 18.747f, 22.018f, 18f)
                curveTo(22.018f, 15.781f, 20.219f, 13.982f, 18f, 13.982f)
                curveTo(17.253f, 13.982f, 16.554f, 14.186f, 15.955f, 14.541f)
                lineTo(21.459f, 20.045f)
                close()
            }
        }.build()

        return _ChatBlock!!
    }

@Suppress("ObjectPropertyName")
private var _ChatBlock: ImageVector? = null
