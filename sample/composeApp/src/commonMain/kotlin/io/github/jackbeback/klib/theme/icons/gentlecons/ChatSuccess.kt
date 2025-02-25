package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ChatSuccess: ImageVector
    get() {
        if (_ChatSuccess != null) {
            return _ChatSuccess!!
        }
        _ChatSuccess = ImageVector.Builder(
            name = "ChatSuccess",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 3f)
                curveTo(7.851f, 3f, 4f, 5.734f, 4f, 10f)
                curveTo(4f, 11.57f, 4.388f, 12.729f, 5.083f, 13.655f)
                curveTo(5.79f, 14.6f, 6.877f, 15.386f, 8.416f, 16.091f)
                lineTo(9.233f, 16.465f)
                lineTo(8.949f, 17.316f)
                curveTo(8.541f, 18.538f, 7.85f, 19.661f, 7.152f, 20.584f)
                curveTo(9.565f, 19.826f, 12.717f, 18.654f, 14.945f, 17.168f)
                curveTo(17.155f, 15.695f, 18.397f, 14.535f, 19.099f, 13.455f)
                curveTo(19.776f, 12.414f, 20f, 11.371f, 20f, 10f)
                curveTo(20f, 5.734f, 16.149f, 3f, 12f, 3f)
                close()
                moveTo(2f, 10f)
                curveTo(2f, 4.266f, 7.149f, 1f, 12f, 1f)
                curveTo(16.851f, 1f, 22f, 4.266f, 22f, 10f)
                curveTo(22f, 11.629f, 21.724f, 13.086f, 20.776f, 14.545f)
                curveTo(19.853f, 15.965f, 18.345f, 17.305f, 16.055f, 18.832f)
                curveTo(13.078f, 20.816f, 8.766f, 22.223f, 6.298f, 22.928f)
                curveTo(5.487f, 23.16f, 4.841f, 22.684f, 4.562f, 22.188f)
                curveTo(4.288f, 21.7f, 4.221f, 20.945f, 4.744f, 20.361f)
                curveTo(5.444f, 19.58f, 6.212f, 18.573f, 6.726f, 17.487f)
                curveTo(5.4f, 16.784f, 4.293f, 15.938f, 3.482f, 14.854f)
                curveTo(2.488f, 13.528f, 2f, 11.93f, 2f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.463f, 8.734f)
                curveTo(16.854f, 8.344f, 16.854f, 7.71f, 16.463f, 7.32f)
                curveTo(16.073f, 6.929f, 15.439f, 6.929f, 15.049f, 7.32f)
                lineTo(10.762f, 11.606f)
                lineTo(8.978f, 9.822f)
                curveTo(8.588f, 9.431f, 7.954f, 9.431f, 7.564f, 9.822f)
                curveTo(7.173f, 10.212f, 7.173f, 10.845f, 7.564f, 11.236f)
                lineTo(10.035f, 13.707f)
                curveTo(10.363f, 14.035f, 10.863f, 14.087f, 11.246f, 13.863f)
                curveTo(11.351f, 13.815f, 11.449f, 13.748f, 11.536f, 13.661f)
                lineTo(16.463f, 8.734f)
                close()
            }
        }.build()

        return _ChatSuccess!!
    }

@Suppress("ObjectPropertyName")
private var _ChatSuccess: ImageVector? = null
