package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Phone: ImageVector
    get() {
        if (_Phone != null) {
            return _Phone!!
        }
        _Phone = ImageVector.Builder(
            name = "Phone",
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
                moveTo(3f, 5.5f)
                curveTo(3f, 14.06f, 9.94f, 21f, 18.5f, 21f)
                curveTo(18.886f, 21f, 19.269f, 20.986f, 19.648f, 20.958f)
                curveTo(20.083f, 20.926f, 20.301f, 20.91f, 20.499f, 20.796f)
                curveTo(20.663f, 20.702f, 20.819f, 20.535f, 20.901f, 20.364f)
                curveTo(21f, 20.158f, 21f, 19.918f, 21f, 19.438f)
                verticalLineTo(16.621f)
                curveTo(21f, 16.217f, 21f, 16.015f, 20.934f, 15.842f)
                curveTo(20.875f, 15.689f, 20.779f, 15.553f, 20.656f, 15.446f)
                curveTo(20.516f, 15.324f, 20.326f, 15.255f, 19.947f, 15.117f)
                lineTo(16.74f, 13.951f)
                curveTo(16.299f, 13.79f, 16.078f, 13.71f, 15.868f, 13.724f)
                curveTo(15.684f, 13.736f, 15.506f, 13.799f, 15.355f, 13.906f)
                curveTo(15.184f, 14.027f, 15.063f, 14.229f, 14.821f, 14.631f)
                lineTo(14f, 16f)
                curveTo(11.35f, 14.8f, 9.202f, 12.649f, 8f, 10f)
                lineTo(9.369f, 9.179f)
                curveTo(9.771f, 8.937f, 9.973f, 8.816f, 10.094f, 8.645f)
                curveTo(10.201f, 8.494f, 10.264f, 8.316f, 10.276f, 8.132f)
                curveTo(10.29f, 7.922f, 10.21f, 7.702f, 10.049f, 7.26f)
                lineTo(8.883f, 4.053f)
                curveTo(8.745f, 3.674f, 8.676f, 3.484f, 8.554f, 3.344f)
                curveTo(8.447f, 3.22f, 8.311f, 3.125f, 8.158f, 3.066f)
                curveTo(7.985f, 3f, 7.783f, 3f, 7.379f, 3f)
                horizontalLineTo(4.562f)
                curveTo(4.082f, 3f, 3.842f, 3f, 3.636f, 3.099f)
                curveTo(3.466f, 3.181f, 3.298f, 3.337f, 3.204f, 3.501f)
                curveTo(3.09f, 3.699f, 3.074f, 3.917f, 3.042f, 4.352f)
                curveTo(3.014f, 4.731f, 3f, 5.114f, 3f, 5.5f)
                close()
            }
        }.build()

        return _Phone!!
    }

@Suppress("ObjectPropertyName")
private var _Phone: ImageVector? = null
