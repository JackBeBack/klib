package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Anchor: ImageVector
    get() {
        if (_Anchor != null) {
            return _Anchor!!
        }
        _Anchor = ImageVector.Builder(
            name = "Anchor",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 6.829f)
                curveTo(14.165f, 6.417f, 15f, 5.306f, 15f, 4f)
                curveTo(15f, 2.343f, 13.657f, 1f, 12f, 1f)
                curveTo(10.343f, 1f, 9f, 2.343f, 9f, 4f)
                curveTo(9f, 5.306f, 9.835f, 6.417f, 11f, 6.829f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                curveTo(9.448f, 9f, 9f, 9.448f, 9f, 10f)
                curveTo(9f, 10.552f, 9.448f, 11f, 10f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(20.951f)
                curveTo(9.685f, 20.818f, 8.691f, 20.425f, 7.93f, 19.918f)
                curveTo(6.98f, 19.285f, 6.335f, 18.434f, 5.894f, 17.553f)
                curveTo(5.452f, 16.667f, 5.225f, 15.77f, 5.111f, 15.086f)
                curveTo(5.107f, 15.057f, 5.102f, 15.028f, 5.098f, 15f)
                horizontalLineTo(6f)
                curveTo(6.552f, 15f, 7f, 14.552f, 7f, 14f)
                curveTo(7f, 13.448f, 6.552f, 13f, 6f, 13f)
                horizontalLineTo(4f)
                curveTo(3.373f, 13f, 2.983f, 13.537f, 3.003f, 14.123f)
                curveTo(3.01f, 14.334f, 3.036f, 14.799f, 3.139f, 15.414f)
                curveTo(3.275f, 16.23f, 3.548f, 17.333f, 4.106f, 18.447f)
                curveTo(4.665f, 19.566f, 5.52f, 20.715f, 6.82f, 21.582f)
                curveTo(8.127f, 22.453f, 9.825f, 23f, 12f, 23f)
                curveTo(14.175f, 23f, 15.873f, 22.453f, 17.18f, 21.582f)
                curveTo(18.48f, 20.715f, 19.335f, 19.566f, 19.894f, 18.447f)
                curveTo(20.452f, 17.333f, 20.726f, 16.23f, 20.861f, 15.414f)
                curveTo(20.964f, 14.799f, 20.99f, 14.334f, 20.997f, 14.123f)
                curveTo(21.017f, 13.537f, 20.627f, 13f, 20f, 13f)
                horizontalLineTo(18f)
                curveTo(17.448f, 13f, 17f, 13.448f, 17f, 14f)
                curveTo(17f, 14.552f, 17.448f, 15f, 18f, 15f)
                horizontalLineTo(18.903f)
                curveTo(18.898f, 15.028f, 18.893f, 15.057f, 18.889f, 15.086f)
                curveTo(18.774f, 15.77f, 18.548f, 16.667f, 18.106f, 17.553f)
                curveTo(17.665f, 18.434f, 17.02f, 19.285f, 16.07f, 19.918f)
                curveTo(15.309f, 20.425f, 14.315f, 20.818f, 13f, 20.951f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                curveTo(14.552f, 11f, 15f, 10.552f, 15f, 10f)
                curveTo(15f, 9.448f, 14.552f, 9f, 14f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(6.829f)
                close()
                moveTo(12f, 5.049f)
                curveTo(11.42f, 5.049f, 10.951f, 4.579f, 10.951f, 4f)
                curveTo(10.951f, 3.421f, 11.42f, 2.951f, 12f, 2.951f)
                curveTo(12.58f, 2.951f, 13.049f, 3.421f, 13.049f, 4f)
                curveTo(13.049f, 4.579f, 12.58f, 5.049f, 12f, 5.049f)
                close()
            }
        }.build()

        return _Anchor!!
    }

@Suppress("ObjectPropertyName")
private var _Anchor: ImageVector? = null
