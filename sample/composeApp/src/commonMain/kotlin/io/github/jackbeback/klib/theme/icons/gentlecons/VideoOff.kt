package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.VideoOff: ImageVector
    get() {
        if (_VideoOff != null) {
            return _VideoOff!!
        }
        _VideoOff = ImageVector.Builder(
            name = "VideoOff",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(1.906f, 4.852f)
                curveTo(1.347f, 5.396f, 1f, 6.158f, 1f, 7f)
                verticalLineTo(17f)
                curveTo(1f, 18.657f, 2.343f, 20f, 4f, 20f)
                horizontalLineTo(14f)
                curveTo(14.842f, 20f, 15.604f, 19.653f, 16.148f, 19.094f)
                lineTo(14.734f, 17.679f)
                curveTo(14.551f, 17.876f, 14.29f, 18f, 14f, 18f)
                horizontalLineTo(4f)
                curveTo(3.448f, 18f, 3f, 17.552f, 3f, 17f)
                verticalLineTo(7f)
                curveTo(3f, 6.71f, 3.123f, 6.449f, 3.321f, 6.266f)
                lineTo(1.906f, 4.852f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18.451f, 15.432f)
                lineTo(21f, 17.132f)
                verticalLineTo(6.869f)
                lineTo(17.332f, 9.314f)
                curveTo(16.335f, 9.978f, 15f, 9.264f, 15f, 8.066f)
                verticalLineTo(7f)
                curveTo(15f, 6.448f, 14.552f, 6f, 14f, 6f)
                horizontalLineTo(9.019f)
                lineTo(7.019f, 4f)
                horizontalLineTo(14f)
                curveTo(15.657f, 4f, 17f, 5.343f, 17f, 7f)
                verticalLineTo(7.131f)
                lineTo(19.891f, 5.204f)
                curveTo(21.22f, 4.318f, 23f, 5.271f, 23f, 6.869f)
                verticalLineTo(17.132f)
                curveTo(23f, 17.939f, 22.545f, 18.581f, 21.924f, 18.905f)
                lineTo(18.451f, 15.432f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(2.008f, 3.422f)
                curveTo(1.617f, 3.032f, 1.617f, 2.398f, 2.008f, 2.008f)
                curveTo(2.398f, 1.617f, 3.032f, 1.617f, 3.422f, 2.008f)
                lineTo(22f, 20.586f)
                curveTo(22.391f, 20.977f, 22.391f, 21.61f, 22f, 22f)
                curveTo(21.61f, 22.391f, 20.977f, 22.391f, 20.586f, 22f)
                lineTo(2.008f, 3.422f)
                close()
            }
        }.build()

        return _VideoOff!!
    }

@Suppress("ObjectPropertyName")
private var _VideoOff: ImageVector? = null
