package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Home: ImageVector
    get() {
        if (_Home != null) {
            return _Home!!
        }
        _Home = ImageVector.Builder(
            name = "Home",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.188f, 11.379f)
                curveTo(4.03f, 11.759f, 4f, 11.953f, 4f, 12f)
                verticalLineTo(20.002f)
                curveTo(4f, 20.553f, 4.447f, 21f, 5f, 21f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                curveTo(8f, 13.895f, 8.895f, 13f, 10f, 13f)
                horizontalLineTo(14f)
                curveTo(15.105f, 13f, 16f, 13.895f, 16f, 15f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                curveTo(19.553f, 21f, 20f, 20.553f, 20f, 20.002f)
                verticalLineTo(12f)
                curveTo(20f, 11.953f, 19.97f, 11.759f, 19.813f, 11.379f)
                curveTo(19.666f, 11.026f, 19.444f, 10.593f, 19.155f, 10.102f)
                curveTo(18.576f, 9.124f, 17.765f, 7.98f, 16.857f, 6.89f)
                curveTo(15.946f, 5.798f, 14.964f, 4.79f, 14.05f, 4.065f)
                curveTo(13.594f, 3.702f, 13.174f, 3.426f, 12.806f, 3.244f)
                curveTo(12.429f, 3.059f, 12.164f, 3f, 12f, 3f)
                curveTo(11.836f, 3f, 11.571f, 3.059f, 11.194f, 3.244f)
                curveTo(10.826f, 3.426f, 10.406f, 3.702f, 9.95f, 4.065f)
                curveTo(9.036f, 4.79f, 8.053f, 5.798f, 7.143f, 6.89f)
                curveTo(6.235f, 7.98f, 5.424f, 9.124f, 4.845f, 10.102f)
                curveTo(4.556f, 10.593f, 4.334f, 11.026f, 4.188f, 11.379f)
                close()
                moveTo(10.309f, 1.451f)
                curveTo(10.835f, 1.191f, 11.414f, 1f, 12f, 1f)
                curveTo(12.586f, 1f, 13.165f, 1.191f, 13.691f, 1.451f)
                curveTo(14.225f, 1.715f, 14.766f, 2.079f, 15.293f, 2.498f)
                curveTo(16.349f, 3.335f, 17.428f, 4.452f, 18.393f, 5.61f)
                curveTo(19.36f, 6.77f, 20.236f, 8.001f, 20.877f, 9.085f)
                curveTo(21.196f, 9.626f, 21.467f, 10.146f, 21.66f, 10.613f)
                curveTo(21.843f, 11.054f, 22f, 11.547f, 22f, 12f)
                verticalLineTo(20.002f)
                curveTo(22f, 21.66f, 20.656f, 23f, 19f, 23f)
                horizontalLineTo(16f)
                curveTo(14.895f, 23f, 14f, 22.105f, 14f, 21f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                curveTo(10f, 22.105f, 9.105f, 23f, 8f, 23f)
                horizontalLineTo(5f)
                curveTo(3.344f, 23f, 2f, 21.66f, 2f, 20.002f)
                verticalLineTo(12f)
                curveTo(2f, 11.547f, 2.157f, 11.054f, 2.34f, 10.613f)
                curveTo(2.533f, 10.146f, 2.804f, 9.626f, 3.123f, 9.085f)
                curveTo(3.764f, 8.001f, 4.64f, 6.77f, 5.607f, 5.61f)
                curveTo(6.572f, 4.452f, 7.651f, 3.335f, 8.706f, 2.498f)
                curveTo(9.234f, 2.079f, 9.775f, 1.715f, 10.309f, 1.451f)
                close()
            }
        }.build()

        return _Home!!
    }

@Suppress("ObjectPropertyName")
private var _Home: ImageVector? = null
