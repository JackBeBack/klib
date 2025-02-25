package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Feedback: ImageVector
    get() {
        if (_Feedback != null) {
            return _Feedback!!
        }
        _Feedback = ImageVector.Builder(
            name = "Feedback",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16f, 1f)
                curveTo(17.657f, 1f, 19f, 2.343f, 19f, 4f)
                curveTo(19f, 4.552f, 18.552f, 5f, 18f, 5f)
                curveTo(17.448f, 5f, 17f, 4.552f, 17f, 4f)
                curveTo(17f, 3.448f, 16.552f, 3f, 16f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(16f)
                curveTo(16.552f, 21f, 17f, 20.552f, 17f, 20f)
                verticalLineTo(19f)
                curveTo(17f, 18.448f, 17.448f, 18f, 18f, 18f)
                curveTo(18.552f, 18f, 19f, 18.448f, 19f, 19f)
                verticalLineTo(20f)
                curveTo(19f, 21.657f, 17.657f, 23f, 16f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.799f, 8.201f)
                curveTo(20.499f, 7.901f, 20.013f, 7.901f, 19.713f, 8.201f)
                lineTo(11.917f, 15.998f)
                curveTo(11.769f, 16.145f, 11.672f, 16.335f, 11.637f, 16.54f)
                lineTo(11.473f, 17.527f)
                lineTo(12.46f, 17.363f)
                curveTo(12.665f, 17.329f, 12.855f, 17.231f, 13.002f, 17.083f)
                lineTo(20.799f, 9.287f)
                curveTo(21.099f, 8.987f, 21.099f, 8.501f, 20.799f, 8.201f)
                close()
                moveTo(18.299f, 6.787f)
                curveTo(19.38f, 5.706f, 21.132f, 5.706f, 22.213f, 6.787f)
                curveTo(23.294f, 7.868f, 23.294f, 9.62f, 22.213f, 10.701f)
                lineTo(14.417f, 18.498f)
                curveTo(13.974f, 18.94f, 13.405f, 19.233f, 12.788f, 19.336f)
                lineTo(11.802f, 19.5f)
                curveTo(10.448f, 19.726f, 9.274f, 18.552f, 9.5f, 17.198f)
                lineTo(9.664f, 16.212f)
                curveTo(9.767f, 15.595f, 10.06f, 15.026f, 10.502f, 14.583f)
                lineTo(18.299f, 6.787f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5f, 7f)
                curveTo(5f, 6.448f, 5.448f, 6f, 6f, 6f)
                horizontalLineTo(14f)
                curveTo(14.552f, 6f, 15f, 6.448f, 15f, 7f)
                curveTo(15f, 7.552f, 14.552f, 8f, 14f, 8f)
                horizontalLineTo(6f)
                curveTo(5.448f, 8f, 5f, 7.552f, 5f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5f, 11f)
                curveTo(5f, 10.448f, 5.448f, 10f, 6f, 10f)
                horizontalLineTo(10f)
                curveTo(10.552f, 10f, 11f, 10.448f, 11f, 11f)
                curveTo(11f, 11.552f, 10.552f, 12f, 10f, 12f)
                horizontalLineTo(6f)
                curveTo(5.448f, 12f, 5f, 11.552f, 5f, 11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5f, 15f)
                curveTo(5f, 14.448f, 5.448f, 14f, 6f, 14f)
                horizontalLineTo(7f)
                curveTo(7.552f, 14f, 8f, 14.448f, 8f, 15f)
                curveTo(8f, 15.552f, 7.552f, 16f, 7f, 16f)
                horizontalLineTo(6f)
                curveTo(5.448f, 16f, 5f, 15.552f, 5f, 15f)
                close()
            }
        }.build()

        return _Feedback!!
    }

@Suppress("ObjectPropertyName")
private var _Feedback: ImageVector? = null
