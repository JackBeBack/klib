package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Pound: ImageVector
    get() {
        if (_Pound != null) {
            return _Pound!!
        }
        _Pound = ImageVector.Builder(
            name = "Pound",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(21f, 8.001f)
                curveTo(21f, 6.059f, 20.164f, 4.555f, 18.9f, 3.559f)
                curveTo(17.663f, 2.583f, 16.058f, 2.125f, 14.5f, 2.125f)
                curveTo(12.942f, 2.125f, 11.338f, 2.583f, 10.1f, 3.559f)
                curveTo(8.836f, 4.554f, 8f, 6.059f, 8f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                curveTo(3.448f, 12f, 3f, 12.448f, 3f, 13f)
                curveTo(3f, 13.552f, 3.448f, 14f, 4f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(17.5f)
                curveTo(8f, 17.989f, 7.774f, 18.381f, 7.322f, 18.742f)
                curveTo(6.848f, 19.12f, 6.189f, 19.403f, 5.521f, 19.606f)
                curveTo(4.899f, 19.795f, 4.338f, 19.896f, 4.02f, 19.952f)
                lineTo(4.006f, 19.955f)
                curveTo(3.827f, 19.987f, 3.645f, 20.019f, 3.485f, 20.106f)
                curveTo(3.448f, 20.127f, 3.299f, 20.208f, 3.169f, 20.376f)
                curveTo(2.927f, 20.69f, 2.894f, 21.131f, 3.088f, 21.478f)
                curveTo(3.251f, 21.767f, 3.501f, 21.879f, 3.552f, 21.902f)
                lineTo(3.554f, 21.903f)
                curveTo(3.735f, 21.984f, 3.924f, 21.997f, 4.119f, 21.999f)
                curveTo(4.229f, 22f, 4.339f, 22f, 4.449f, 22f)
                lineTo(4.494f, 22f)
                lineTo(20f, 22f)
                curveTo(21.407f, 22f, 21.277f, 20f, 20f, 20f)
                curveTo(19f, 20f, 8.915f, 20f, 8.915f, 20f)
                curveTo(9.534f, 19.394f, 10f, 18.57f, 10f, 17.5f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                curveTo(14.552f, 14f, 15f, 13.552f, 15f, 13f)
                curveTo(15f, 12.448f, 14.552f, 12f, 14f, 12f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                curveTo(10f, 6.692f, 10.539f, 5.759f, 11.338f, 5.13f)
                curveTo(12.162f, 4.48f, 13.308f, 4.125f, 14.5f, 4.125f)
                curveTo(15.692f, 4.125f, 16.838f, 4.48f, 17.662f, 5.13f)
                curveTo(18.461f, 5.759f, 19f, 6.692f, 19f, 8.001f)
                curveTo(19f, 8.553f, 19.448f, 9.001f, 20f, 9.001f)
                curveTo(20.552f, 9.001f, 21f, 8.553f, 21f, 8.001f)
                close()
            }
        }.build()

        return _Pound!!
    }

@Suppress("ObjectPropertyName")
private var _Pound: ImageVector? = null
