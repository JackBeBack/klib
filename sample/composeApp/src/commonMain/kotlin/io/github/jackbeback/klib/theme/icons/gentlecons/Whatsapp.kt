package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Whatsapp: ImageVector
    get() {
        if (_Whatsapp != null) {
            return _Whatsapp!!
        }
        _Whatsapp = ImageVector.Builder(
            name = "Whatsapp",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6.014f, 8.006f)
                curveTo(6.128f, 7.102f, 7.303f, 5.874f, 8.235f, 6.01f)
                lineTo(8.233f, 6.009f)
                curveTo(9.141f, 6.181f, 9.859f, 7.743f, 10.264f, 8.445f)
                curveTo(10.55f, 8.954f, 10.364f, 9.47f, 10.097f, 9.688f)
                curveTo(9.736f, 9.979f, 9.171f, 10.38f, 9.289f, 10.783f)
                curveTo(9.5f, 11.5f, 12f, 14f, 13.23f, 14.711f)
                curveTo(13.695f, 14.98f, 14.033f, 14.27f, 14.321f, 13.907f)
                curveTo(14.53f, 13.627f, 15.047f, 13.46f, 15.555f, 13.736f)
                curveTo(16.314f, 14.178f, 17.029f, 14.692f, 17.69f, 15.27f)
                curveTo(18.02f, 15.546f, 18.098f, 15.954f, 17.869f, 16.385f)
                curveTo(17.466f, 17.144f, 16.3f, 18.146f, 15.454f, 17.942f)
                curveTo(13.976f, 17.587f, 8f, 15.27f, 6.08f, 8.558f)
                curveTo(5.972f, 8.24f, 6f, 8.12f, 6.014f, 8.006f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 23f)
                curveTo(10.776f, 23f, 10.099f, 22.869f, 9f, 22.5f)
                lineTo(6.894f, 23.553f)
                curveTo(5.565f, 24.218f, 4f, 23.251f, 4f, 21.764f)
                verticalLineTo(19.5f)
                curveTo(1.847f, 17.492f, 1f, 15.177f, 1f, 12f)
                curveTo(1f, 5.925f, 5.925f, 1f, 12f, 1f)
                curveTo(18.075f, 1f, 23f, 5.925f, 23f, 12f)
                curveTo(23f, 18.075f, 18.075f, 23f, 12f, 23f)
                close()
                moveTo(6f, 18.63f)
                lineTo(5.364f, 18.037f)
                curveTo(3.691f, 16.477f, 3f, 14.733f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(11.014f, 21f, 10.552f, 20.911f, 9.636f, 20.604f)
                lineTo(8.848f, 20.34f)
                lineTo(6f, 21.764f)
                verticalLineTo(18.63f)
                close()
            }
        }.build()

        return _Whatsapp!!
    }

@Suppress("ObjectPropertyName")
private var _Whatsapp: ImageVector? = null
