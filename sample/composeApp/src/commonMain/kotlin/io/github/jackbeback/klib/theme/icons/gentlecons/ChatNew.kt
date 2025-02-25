package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ChatNew: ImageVector
    get() {
        if (_ChatNew != null) {
            return _ChatNew!!
        }
        _ChatNew = ImageVector.Builder(
            name = "ChatNew",
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
                moveTo(12f, 6f)
                curveTo(11.448f, 6f, 11f, 6.448f, 11f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                curveTo(8.448f, 9f, 8f, 9.448f, 8f, 10f)
                curveTo(8f, 10.552f, 8.448f, 11f, 9f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                curveTo(11f, 13.552f, 11.448f, 14f, 12f, 14f)
                curveTo(12.552f, 14f, 13f, 13.552f, 13f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                curveTo(15.552f, 11f, 16f, 10.552f, 16f, 10f)
                curveTo(16f, 9.448f, 15.552f, 9f, 15f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                curveTo(13f, 6.448f, 12.552f, 6f, 12f, 6f)
                close()
            }
        }.build()

        return _ChatNew!!
    }

@Suppress("ObjectPropertyName")
private var _ChatNew: ImageVector? = null
