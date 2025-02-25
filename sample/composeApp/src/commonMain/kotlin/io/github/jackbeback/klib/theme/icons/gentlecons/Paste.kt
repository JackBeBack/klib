package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Paste: ImageVector
    get() {
        if (_Paste != null) {
            return _Paste!!
        }
        _Paste = ImageVector.Builder(
            name = "Paste",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 0f)
                curveTo(11.235f, 0f, 10.629f, 0.126f, 10.157f, 0.359f)
                curveTo(9.984f, 0.444f, 9.821f, 0.545f, 9.689f, 0.627f)
                lineTo(9.59f, 0.689f)
                curveTo(9.491f, 0.751f, 9.408f, 0.803f, 9.321f, 0.854f)
                curveTo(9.095f, 0.985f, 9.009f, 0.998f, 9.001f, 1f)
                curveTo(9f, 1f, 9f, 1f, 9.001f, 1f)
                curveTo(7.896f, 1f, 7f, 1.895f, 7f, 3f)
                horizontalLineTo(6f)
                curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
                verticalLineTo(20f)
                curveTo(3f, 21.657f, 4.343f, 23f, 6f, 23f)
                horizontalLineTo(18f)
                curveTo(19.657f, 23f, 21f, 21.657f, 21f, 20f)
                verticalLineTo(6f)
                curveTo(21f, 4.343f, 19.657f, 3f, 18f, 3f)
                horizontalLineTo(17f)
                curveTo(17f, 1.895f, 16.105f, 1f, 15f, 1f)
                curveTo(15f, 1f, 15.001f, 1f, 15f, 1f)
                curveTo(14.992f, 0.999f, 14.905f, 0.985f, 14.679f, 0.854f)
                curveTo(14.592f, 0.803f, 14.509f, 0.751f, 14.41f, 0.689f)
                lineTo(14.311f, 0.627f)
                curveTo(14.179f, 0.545f, 14.016f, 0.444f, 13.843f, 0.359f)
                curveTo(13.371f, 0.126f, 12.765f, 0f, 12f, 0f)
                close()
                moveTo(16.732f, 5f)
                curveTo(16.387f, 5.598f, 15.74f, 6f, 15f, 6f)
                horizontalLineTo(9f)
                curveTo(8.26f, 6f, 7.613f, 5.598f, 7.268f, 5f)
                horizontalLineTo(6f)
                curveTo(5.448f, 5f, 5f, 5.448f, 5f, 6f)
                verticalLineTo(20f)
                curveTo(5f, 20.552f, 5.448f, 21f, 6f, 21f)
                horizontalLineTo(18f)
                curveTo(18.552f, 21f, 19f, 20.552f, 19f, 20f)
                verticalLineTo(6f)
                curveTo(19f, 5.448f, 18.552f, 5f, 18f, 5f)
                horizontalLineTo(16.732f)
                close()
                moveTo(11.043f, 2.152f)
                curveTo(11.163f, 2.093f, 11.443f, 2f, 12f, 2f)
                curveTo(12.557f, 2f, 12.837f, 2.093f, 12.957f, 2.152f)
                curveTo(13.033f, 2.19f, 13.124f, 2.243f, 13.252f, 2.323f)
                lineTo(13.326f, 2.37f)
                curveTo(13.43f, 2.435f, 13.555f, 2.514f, 13.678f, 2.585f)
                curveTo(13.971f, 2.755f, 14.443f, 3f, 15f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                curveTo(9.557f, 3f, 10.029f, 2.755f, 10.322f, 2.585f)
                curveTo(10.445f, 2.514f, 10.57f, 2.435f, 10.674f, 2.37f)
                lineTo(10.748f, 2.323f)
                curveTo(10.876f, 2.243f, 10.967f, 2.19f, 11.043f, 2.152f)
                close()
            }
        }.build()

        return _Paste!!
    }

@Suppress("ObjectPropertyName")
private var _Paste: ImageVector? = null
