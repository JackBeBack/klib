package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ChatWriting: ImageVector
    get() {
        if (_ChatWriting != null) {
            return _ChatWriting!!
        }
        _ChatWriting = ImageVector.Builder(
            name = "ChatWriting",
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
                moveTo(9f, 10f)
                curveTo(9f, 10.828f, 8.328f, 11.5f, 7.5f, 11.5f)
                curveTo(6.672f, 11.5f, 6f, 10.828f, 6f, 10f)
                curveTo(6f, 9.172f, 6.672f, 8.5f, 7.5f, 8.5f)
                curveTo(8.328f, 8.5f, 9f, 9.172f, 9f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13.498f, 10f)
                curveTo(13.498f, 10.828f, 12.826f, 11.5f, 11.998f, 11.5f)
                curveTo(11.169f, 11.5f, 10.498f, 10.828f, 10.498f, 10f)
                curveTo(10.498f, 9.172f, 11.169f, 8.5f, 11.998f, 8.5f)
                curveTo(12.826f, 8.5f, 13.498f, 9.172f, 13.498f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.5f, 11.5f)
                curveTo(17.328f, 11.5f, 18f, 10.828f, 18f, 10f)
                curveTo(18f, 9.172f, 17.328f, 8.5f, 16.5f, 8.5f)
                curveTo(15.672f, 8.5f, 15f, 9.172f, 15f, 10f)
                curveTo(15f, 10.828f, 15.672f, 11.5f, 16.5f, 11.5f)
                close()
            }
        }.build()

        return _ChatWriting!!
    }

@Suppress("ObjectPropertyName")
private var _ChatWriting: ImageVector? = null
