package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PhoneLock: ImageVector
    get() {
        if (_PhoneLock != null) {
            return _PhoneLock!!
        }
        _PhoneLock = ImageVector.Builder(
            name = "PhoneLock",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 6f)
                verticalLineTo(5f)
                curveTo(16f, 3.895f, 16.895f, 3f, 18f, 3f)
                curveTo(19.105f, 3f, 20f, 3.895f, 20f, 5f)
                verticalLineTo(6f)
                moveTo(18.5f, 21f)
                curveTo(9.94f, 21f, 3f, 14.06f, 3f, 5.5f)
                curveTo(3f, 5.114f, 3.014f, 4.731f, 3.042f, 4.352f)
                curveTo(3.074f, 3.917f, 3.09f, 3.699f, 3.204f, 3.501f)
                curveTo(3.298f, 3.337f, 3.466f, 3.181f, 3.636f, 3.099f)
                curveTo(3.842f, 3f, 4.082f, 3f, 4.562f, 3f)
                horizontalLineTo(7.379f)
                curveTo(7.783f, 3f, 7.985f, 3f, 8.158f, 3.066f)
                curveTo(8.311f, 3.125f, 8.447f, 3.22f, 8.554f, 3.344f)
                curveTo(8.676f, 3.484f, 8.745f, 3.674f, 8.883f, 4.053f)
                lineTo(10.049f, 7.26f)
                curveTo(10.21f, 7.702f, 10.29f, 7.922f, 10.276f, 8.132f)
                curveTo(10.264f, 8.316f, 10.201f, 8.494f, 10.094f, 8.645f)
                curveTo(9.973f, 8.816f, 9.771f, 8.937f, 9.369f, 9.179f)
                lineTo(8f, 10f)
                curveTo(9.202f, 12.649f, 11.35f, 14.8f, 14f, 16f)
                lineTo(14.821f, 14.631f)
                curveTo(15.063f, 14.229f, 15.184f, 14.027f, 15.355f, 13.906f)
                curveTo(15.506f, 13.799f, 15.684f, 13.736f, 15.868f, 13.724f)
                curveTo(16.078f, 13.71f, 16.299f, 13.79f, 16.74f, 13.951f)
                lineTo(19.947f, 15.117f)
                curveTo(20.326f, 15.255f, 20.516f, 15.324f, 20.656f, 15.446f)
                curveTo(20.779f, 15.553f, 20.875f, 15.689f, 20.934f, 15.842f)
                curveTo(21f, 16.015f, 21f, 16.217f, 21f, 16.621f)
                verticalLineTo(19.438f)
                curveTo(21f, 19.918f, 21f, 20.158f, 20.901f, 20.364f)
                curveTo(20.819f, 20.535f, 20.663f, 20.702f, 20.499f, 20.796f)
                curveTo(20.301f, 20.91f, 20.083f, 20.926f, 19.648f, 20.958f)
                curveTo(19.269f, 20.986f, 18.886f, 21f, 18.5f, 21f)
                close()
                moveTo(16.5f, 9f)
                horizontalLineTo(19.5f)
                curveTo(19.966f, 9f, 20.199f, 9f, 20.383f, 8.924f)
                curveTo(20.628f, 8.822f, 20.822f, 8.628f, 20.924f, 8.383f)
                curveTo(21f, 8.199f, 21f, 7.966f, 21f, 7.5f)
                curveTo(21f, 7.034f, 21f, 6.801f, 20.924f, 6.617f)
                curveTo(20.822f, 6.372f, 20.628f, 6.178f, 20.383f, 6.076f)
                curveTo(20.199f, 6f, 19.966f, 6f, 19.5f, 6f)
                horizontalLineTo(16.5f)
                curveTo(16.034f, 6f, 15.801f, 6f, 15.617f, 6.076f)
                curveTo(15.372f, 6.178f, 15.178f, 6.372f, 15.076f, 6.617f)
                curveTo(15f, 6.801f, 15f, 7.034f, 15f, 7.5f)
                curveTo(15f, 7.966f, 15f, 8.199f, 15.076f, 8.383f)
                curveTo(15.178f, 8.628f, 15.372f, 8.822f, 15.617f, 8.924f)
                curveTo(15.801f, 9f, 16.034f, 9f, 16.5f, 9f)
                close()
            }
        }.build()

        return _PhoneLock!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneLock: ImageVector? = null
