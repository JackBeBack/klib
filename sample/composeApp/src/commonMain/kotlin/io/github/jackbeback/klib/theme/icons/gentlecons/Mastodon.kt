package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Mastodon: ImageVector
    get() {
        if (_Mastodon != null) {
            return _Mastodon!!
        }
        _Mastodon = ImageVector.Builder(
            name = "Mastodon",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8f, 7f)
                verticalLineTo(12f)
                curveTo(8f, 12.552f, 7.552f, 13f, 7f, 13f)
                curveTo(6.448f, 13f, 6f, 12.552f, 6f, 12f)
                verticalLineTo(7f)
                curveTo(6.005f, 5.121f, 7.761f, 4f, 9.5f, 4f)
                curveTo(10.631f, 4f, 11.444f, 4.341f, 12f, 4.835f)
                curveTo(12.556f, 4.341f, 13.369f, 4f, 14.5f, 4f)
                curveTo(16.239f, 4f, 17.994f, 5.121f, 18f, 6.999f)
                verticalLineTo(12f)
                curveTo(18f, 12.552f, 17.552f, 13f, 17f, 13f)
                curveTo(16.448f, 13f, 16f, 12.552f, 16f, 12f)
                verticalLineTo(6.999f)
                curveTo(15.941f, 6.241f, 15.16f, 6f, 14.5f, 6f)
                curveTo(13.851f, 6f, 13.067f, 6.247f, 13f, 6.999f)
                verticalLineTo(10f)
                curveTo(13f, 10.552f, 12.552f, 11f, 12f, 11f)
                curveTo(11.448f, 11f, 11f, 10.552f, 11f, 10f)
                verticalLineTo(7f)
                curveTo(10.94f, 6.24f, 10.153f, 6f, 9.5f, 6f)
                curveTo(8.852f, 6f, 8.067f, 6.248f, 8f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 1f)
                horizontalLineTo(8f)
                curveTo(4.073f, 1f, 1.086f, 4.024f, 1f, 7.989f)
                verticalLineTo(13f)
                curveTo(1f, 18.115f, 4.558f, 23f, 10f, 23f)
                horizontalLineTo(15.48f)
                curveTo(16.872f, 23f, 18f, 21.872f, 18f, 20.48f)
                curveTo(18f, 19.113f, 16.865f, 18.034f, 15.5f, 18f)
                curveTo(15.218f, 17.993f, 14.884f, 17.997f, 14.515f, 18f)
                curveTo(12.436f, 18.022f, 9.268f, 18.055f, 8.283f, 16.296f)
                curveTo(12.808f, 17.126f, 23f, 18.5f, 23f, 11f)
                verticalLineTo(8f)
                curveTo(22.906f, 4.035f, 19.934f, 1f, 16f, 1f)
                close()
                moveTo(3f, 13f)
                verticalLineTo(7.989f)
                curveTo(3.116f, 5.114f, 5.139f, 3f, 8f, 3f)
                horizontalLineTo(16f)
                curveTo(18.867f, 3f, 20.878f, 5.126f, 21f, 8f)
                verticalLineTo(11f)
                curveTo(21f, 17f, 10.344f, 14.805f, 7.243f, 14.03f)
                curveTo(6.621f, 13.875f, 6f, 14.36f, 6f, 15f)
                curveTo(6f, 16.084f, 6.275f, 17.011f, 6.859f, 17.755f)
                curveTo(8.535f, 19.891f, 11.896f, 19.924f, 14.518f, 19.949f)
                curveTo(14.858f, 19.952f, 15.186f, 19.956f, 15.495f, 19.963f)
                curveTo(15.777f, 19.97f, 16f, 20.199f, 16f, 20.48f)
                curveTo(16f, 20.767f, 15.767f, 21f, 15.48f, 21f)
                horizontalLineTo(10f)
                curveTo(5.654f, 21f, 3f, 17.016f, 3f, 13f)
                close()
            }
        }.build()

        return _Mastodon!!
    }

@Suppress("ObjectPropertyName")
private var _Mastodon: ImageVector? = null
