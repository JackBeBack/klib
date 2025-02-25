package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.MailOpen: ImageVector
    get() {
        if (_MailOpen != null) {
            return _MailOpen!!
        }
        _MailOpen = ImageVector.Builder(
            name = "MailOpen",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.818f, 7.685f)
                curveTo(22.563f, 8.252f, 23f, 9.134f, 23f, 10.071f)
                verticalLineTo(20f)
                curveTo(23f, 21.657f, 21.657f, 23f, 20f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(10.071f)
                curveTo(1f, 9.134f, 1.437f, 8.252f, 2.182f, 7.685f)
                curveTo(4.367f, 6.022f, 8.931f, 2.551f, 10.2f, 1.6f)
                curveTo(11.267f, 0.8f, 12.733f, 0.8f, 13.8f, 1.6f)
                curveTo(15.069f, 2.551f, 19.633f, 6.022f, 21.818f, 7.685f)
                close()
                moveTo(3f, 10.169f)
                lineTo(10.141f, 15.807f)
                curveTo(11.231f, 16.667f, 12.769f, 16.667f, 13.859f, 15.807f)
                lineTo(21f, 10.169f)
                verticalLineTo(20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                horizontalLineTo(4f)
                curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                verticalLineTo(10.169f)
                close()
                moveTo(12.6f, 3.2f)
                lineTo(19.779f, 8.584f)
                lineTo(12.62f, 14.237f)
                curveTo(12.256f, 14.524f, 11.744f, 14.524f, 11.38f, 14.237f)
                lineTo(4.221f, 8.584f)
                lineTo(11.4f, 3.2f)
                curveTo(11.756f, 2.933f, 12.244f, 2.933f, 12.6f, 3.2f)
                close()
            }
        }.build()

        return _MailOpen!!
    }

@Suppress("ObjectPropertyName")
private var _MailOpen: ImageVector? = null
