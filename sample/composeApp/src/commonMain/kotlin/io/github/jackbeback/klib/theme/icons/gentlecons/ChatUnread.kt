package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ChatUnread: ImageVector
    get() {
        if (_ChatUnread != null) {
            return _ChatUnread!!
        }
        _ChatUnread = ImageVector.Builder(
            name = "ChatUnread",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(21.95f, 9.037f)
                curveTo(21.983f, 9.35f, 22f, 9.671f, 22f, 10f)
                curveTo(22f, 11.629f, 21.724f, 13.086f, 20.776f, 14.545f)
                curveTo(19.853f, 15.965f, 18.345f, 17.305f, 16.055f, 18.832f)
                curveTo(13.078f, 20.816f, 8.766f, 22.223f, 6.298f, 22.928f)
                curveTo(5.487f, 23.16f, 4.841f, 22.684f, 4.562f, 22.188f)
                curveTo(4.288f, 21.7f, 4.221f, 20.945f, 4.744f, 20.361f)
                curveTo(5.444f, 19.58f, 6.212f, 18.573f, 6.726f, 17.487f)
                curveTo(5.4f, 16.784f, 4.293f, 15.938f, 3.482f, 14.854f)
                curveTo(2.488f, 13.528f, 2f, 11.93f, 2f, 10f)
                curveTo(2f, 4.266f, 7.149f, 1f, 12f, 1f)
                curveTo(13.14f, 1f, 14.297f, 1.18f, 15.399f, 1.531f)
                curveTo(14.92f, 2.028f, 14.543f, 2.625f, 14.302f, 3.286f)
                curveTo(13.561f, 3.098f, 12.786f, 3f, 12f, 3f)
                curveTo(7.851f, 3f, 4f, 5.734f, 4f, 10f)
                curveTo(4f, 11.57f, 4.388f, 12.729f, 5.083f, 13.655f)
                curveTo(5.79f, 14.6f, 6.877f, 15.386f, 8.416f, 16.091f)
                lineTo(9.233f, 16.465f)
                lineTo(8.949f, 17.316f)
                curveTo(8.541f, 18.538f, 7.85f, 19.661f, 7.152f, 20.584f)
                curveTo(9.565f, 19.826f, 12.717f, 18.654f, 14.945f, 17.168f)
                curveTo(17.155f, 15.695f, 18.397f, 14.535f, 19.099f, 13.455f)
                curveTo(19.776f, 12.414f, 20f, 11.371f, 20f, 10f)
                curveTo(20f, 9.967f, 20f, 9.933f, 19.999f, 9.9f)
                curveTo(20.717f, 9.754f, 21.38f, 9.455f, 21.95f, 9.037f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(23f, 5f)
                curveTo(23f, 7.209f, 21.209f, 9f, 19f, 9f)
                curveTo(16.791f, 9f, 15f, 7.209f, 15f, 5f)
                curveTo(15f, 2.791f, 16.791f, 1f, 19f, 1f)
                curveTo(21.209f, 1f, 23f, 2.791f, 23f, 5f)
                close()
                moveTo(16.983f, 5f)
                curveTo(16.983f, 6.114f, 17.886f, 7.017f, 19f, 7.017f)
                curveTo(20.114f, 7.017f, 21.017f, 6.114f, 21.017f, 5f)
                curveTo(21.017f, 3.886f, 20.114f, 2.983f, 19f, 2.983f)
                curveTo(17.886f, 2.983f, 16.983f, 3.886f, 16.983f, 5f)
                close()
            }
        }.build()

        return _ChatUnread!!
    }

@Suppress("ObjectPropertyName")
private var _ChatUnread: ImageVector? = null
