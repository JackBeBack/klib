package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Inbox: ImageVector
    get() {
        if (_Inbox != null) {
            return _Inbox!!
        }
        _Inbox = ImageVector.Builder(
            name = "Inbox",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.614f, 1f)
                curveTo(18.01f, 1f, 19.222f, 1.964f, 19.537f, 3.325f)
                lineTo(21.744f, 12.89f)
                curveTo(21.914f, 13.628f, 22f, 14.382f, 22f, 15.139f)
                verticalLineTo(20f)
                curveTo(22f, 21.657f, 20.657f, 23f, 19f, 23f)
                horizontalLineTo(5f)
                curveTo(3.343f, 23f, 2f, 21.657f, 2f, 20f)
                verticalLineTo(15.139f)
                curveTo(2f, 14.382f, 2.086f, 13.628f, 2.256f, 12.89f)
                lineTo(4.463f, 3.325f)
                curveTo(4.777f, 1.964f, 5.99f, 1f, 7.387f, 1f)
                horizontalLineTo(16.614f)
                close()
                moveTo(16.236f, 3f)
                curveTo(16.687f, 3f, 17.082f, 3.302f, 17.201f, 3.737f)
                lineTo(20f, 14f)
                horizontalLineTo(15.5f)
                curveTo(14.659f, 14f, 14.08f, 14.655f, 13.963f, 15.325f)
                curveTo(13.904f, 15.663f, 13.769f, 16.092f, 13.491f, 16.421f)
                curveTo(13.246f, 16.709f, 12.829f, 17f, 12f, 17f)
                curveTo(11.171f, 17f, 10.754f, 16.709f, 10.509f, 16.421f)
                curveTo(10.231f, 16.092f, 10.096f, 15.663f, 10.037f, 15.325f)
                curveTo(9.92f, 14.655f, 9.341f, 14f, 8.5f, 14f)
                horizontalLineTo(4f)
                lineTo(6.799f, 3.737f)
                curveTo(6.918f, 3.302f, 7.313f, 3f, 7.764f, 3f)
                horizontalLineTo(16.236f)
                close()
                moveTo(4f, 16f)
                verticalLineTo(20f)
                curveTo(4f, 20.552f, 4.448f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(19.552f, 21f, 20f, 20.552f, 20f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(15.864f)
                curveTo(15.742f, 16.498f, 15.501f, 17.142f, 15.016f, 17.714f)
                curveTo(14.38f, 18.465f, 13.397f, 19f, 12f, 19f)
                curveTo(10.603f, 19f, 9.62f, 18.465f, 8.984f, 17.714f)
                curveTo(8.499f, 17.142f, 8.258f, 16.498f, 8.136f, 16f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _Inbox!!
    }

@Suppress("ObjectPropertyName")
private var _Inbox: ImageVector? = null
