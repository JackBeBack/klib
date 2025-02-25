package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Landing: ImageVector
    get() {
        if (_Landing != null) {
            return _Landing!!
        }
        _Landing = ImageVector.Builder(
            name = "Landing",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.989f, 6.118f)
                curveTo(7.848f, 4.395f, 9.458f, 3.053f, 11.127f, 3.5f)
                lineTo(11.611f, 3.63f)
                curveTo(12.478f, 3.862f, 13.154f, 4.541f, 13.382f, 5.408f)
                lineTo(14.991f, 11.523f)
                curveTo(15.046f, 11.646f, 15.142f, 11.769f, 15.25f, 11.851f)
                lineTo(18.851f, 12.816f)
                curveTo(20.862f, 13.355f, 22.065f, 14.352f, 22.664f, 15.572f)
                curveTo(23.244f, 16.753f, 23.17f, 17.97f, 23f, 18.808f)
                curveTo(22.714f, 20.219f, 21.292f, 20.718f, 20.198f, 20.424f)
                lineTo(3.488f, 15.947f)
                curveTo(2.22f, 15.607f, 1.32f, 14.483f, 1.267f, 13.172f)
                lineTo(1.041f, 7.679f)
                curveTo(0.983f, 6.267f, 2.733f, 5.565f, 3.666f, 6.628f)
                lineTo(6.103f, 9.401f)
                lineTo(8.304f, 9.99f)
                lineTo(7.989f, 6.118f)
                close()
                moveTo(10.61f, 5.432f)
                curveTo(10.276f, 5.342f, 9.954f, 5.611f, 9.982f, 5.955f)
                lineTo(10.355f, 10.535f)
                curveTo(10.439f, 11.569f, 9.474f, 12.374f, 8.472f, 12.106f)
                lineTo(5.001f, 11.176f)
                lineTo(3.097f, 9.01f)
                lineTo(3.265f, 13.09f)
                curveTo(3.283f, 13.527f, 3.583f, 13.902f, 4.005f, 14.015f)
                lineTo(20.716f, 18.493f)
                curveTo(20.805f, 18.516f, 21.015f, 18.534f, 21.04f, 18.411f)
                curveTo(21.165f, 17.796f, 21.177f, 17.081f, 20.869f, 16.453f)
                curveTo(20.58f, 15.865f, 19.922f, 15.174f, 18.333f, 14.748f)
                lineTo(14.68f, 13.769f)
                curveTo(14.206f, 13.642f, 13.84f, 13.3f, 13.624f, 13.05f)
                curveTo(13.395f, 12.786f, 13.16f, 12.422f, 13.059f, 12.039f)
                lineTo(11.448f, 5.917f)
                curveTo(11.402f, 5.744f, 11.267f, 5.608f, 11.094f, 5.562f)
                lineTo(10.61f, 5.432f)
                close()
            }
        }.build()

        return _Landing!!
    }

@Suppress("ObjectPropertyName")
private var _Landing: ImageVector? = null
