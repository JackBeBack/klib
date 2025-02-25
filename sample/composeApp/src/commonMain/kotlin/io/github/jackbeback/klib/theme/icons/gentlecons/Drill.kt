package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Drill: ImageVector
    get() {
        if (_Drill != null) {
            return _Drill!!
        }
        _Drill = ImageVector.Builder(
            name = "Drill",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 6f)
                curveTo(1.135f, 6f, 3f, 6f, 3f, 6f)
                curveTo(3f, 6f, 3.007f, 6.156f, 3.025f, 6.262f)
                curveTo(3.047f, 6.381f, 3.086f, 6.53f, 3.155f, 6.697f)
                curveTo(3.297f, 7.037f, 3.555f, 7.424f, 4f, 7.781f)
                curveTo(4.878f, 8.483f, 6.393f, 9f, 9f, 9f)
                horizontalLineTo(13.219f)
                lineTo(14.719f, 15f)
                horizontalLineTo(14f)
                curveTo(12.343f, 15f, 11f, 16.343f, 11f, 18f)
                verticalLineTo(20f)
                curveTo(11f, 21.657f, 12.343f, 23f, 14f, 23f)
                horizontalLineTo(21f)
                curveTo(22.657f, 23f, 24f, 21.657f, 24f, 20f)
                verticalLineTo(17.438f)
                curveTo(24f, 16.167f, 23.026f, 15.122f, 21.783f, 15.01f)
                lineTo(20.281f, 9f)
                horizontalLineTo(21f)
                curveTo(22.657f, 9f, 24f, 7.657f, 24f, 6f)
                verticalLineTo(4f)
                curveTo(24f, 2.343f, 22.657f, 1f, 21f, 1f)
                horizontalLineTo(9f)
                curveTo(6.393f, 1f, 4.878f, 1.517f, 4f, 2.219f)
                curveTo(3.555f, 2.576f, 3.297f, 2.963f, 3.155f, 3.303f)
                curveTo(3.086f, 3.47f, 3.047f, 3.619f, 3.025f, 3.738f)
                curveTo(3.01f, 3.825f, 3.004f, 3.912f, 3f, 4f)
                horizontalLineTo(1f)
                curveTo(0.448f, 4f, 0f, 4.448f, 0f, 5f)
                curveTo(0f, 5.552f, 0.448f, 6f, 1f, 6f)
                close()
                moveTo(5f, 5.925f)
                lineTo(5.001f, 5.928f)
                curveTo(5.016f, 5.963f, 5.07f, 6.076f, 5.25f, 6.219f)
                curveTo(5.565f, 6.472f, 6.321f, 6.857f, 8f, 6.969f)
                verticalLineTo(3.031f)
                curveTo(6.321f, 3.143f, 5.565f, 3.528f, 5.25f, 3.781f)
                curveTo(5.07f, 3.924f, 5.016f, 4.037f, 5.001f, 4.072f)
                lineTo(5f, 4.075f)
                verticalLineTo(5.925f)
                close()
                moveTo(10f, 3f)
                verticalLineTo(7f)
                horizontalLineTo(13.219f)
                curveTo(14.137f, 7f, 14.937f, 7.625f, 15.16f, 8.515f)
                lineTo(16.66f, 14.515f)
                curveTo(16.975f, 15.777f, 16.02f, 17f, 14.719f, 17f)
                horizontalLineTo(14f)
                curveTo(13.448f, 17f, 13f, 17.448f, 13f, 18f)
                verticalLineTo(20f)
                curveTo(13f, 20.552f, 13.448f, 21f, 14f, 21f)
                horizontalLineTo(21f)
                curveTo(21.552f, 21f, 22f, 20.552f, 22f, 20f)
                verticalLineTo(17.438f)
                curveTo(22f, 17.196f, 21.804f, 17f, 21.562f, 17f)
                curveTo(20.773f, 17f, 20.085f, 16.463f, 19.894f, 15.698f)
                lineTo(18.34f, 9.485f)
                curveTo(18.025f, 8.223f, 18.98f, 7f, 20.281f, 7f)
                horizontalLineTo(21f)
                curveTo(21.552f, 7f, 22f, 6.552f, 22f, 6f)
                verticalLineTo(4f)
                curveTo(22f, 3.448f, 21.552f, 3f, 21f, 3f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _Drill!!
    }

@Suppress("ObjectPropertyName")
private var _Drill: ImageVector? = null
