package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.User: ImageVector
    get() {
        if (_User != null) {
            return _User!!
        }
        _User = ImageVector.Builder(
            name = "User",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 12f)
                curveTo(14.761f, 12f, 17f, 9.538f, 17f, 6.5f)
                curveTo(17f, 3.462f, 14.761f, 1f, 12f, 1f)
                curveTo(9.239f, 1f, 7f, 3.462f, 7f, 6.5f)
                curveTo(7f, 9.538f, 9.239f, 12f, 12f, 12f)
                close()
                moveTo(12f, 9.8f)
                curveTo(10.343f, 9.8f, 9f, 8.323f, 9f, 6.5f)
                curveTo(9f, 4.677f, 10.343f, 3.2f, 12f, 3.2f)
                curveTo(13.657f, 3.2f, 15f, 4.677f, 15f, 6.5f)
                curveTo(15f, 8.323f, 13.657f, 9.8f, 12f, 9.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.103f, 14.109f)
                curveTo(18.26f, 13.263f, 16.957f, 13.081f, 15.916f, 13.699f)
                curveTo(15.726f, 13.812f, 15.558f, 13.915f, 15.404f, 14.01f)
                curveTo(14.994f, 14.264f, 14.675f, 14.46f, 14.265f, 14.628f)
                curveTo(13.75f, 14.84f, 13.083f, 15f, 12f, 15f)
                curveTo(10.927f, 15f, 10.249f, 14.849f, 9.726f, 14.645f)
                curveTo(9.264f, 14.464f, 8.898f, 14.237f, 8.417f, 13.938f)
                curveTo(8.323f, 13.88f, 8.224f, 13.818f, 8.12f, 13.754f)
                curveTo(7.076f, 13.113f, 5.735f, 13.262f, 4.864f, 14.142f)
                curveTo(4.484f, 14.526f, 4.04f, 15.022f, 3.685f, 15.563f)
                curveTo(3.346f, 16.078f, 3f, 16.764f, 3f, 17.5f)
                verticalLineTo(20f)
                curveTo(3f, 21.657f, 4.343f, 23f, 6f, 23f)
                horizontalLineTo(18f)
                curveTo(19.657f, 23f, 21f, 21.657f, 21f, 20f)
                verticalLineTo(17.5f)
                curveTo(21f, 16.754f, 20.645f, 16.059f, 20.3f, 15.539f)
                curveTo(19.937f, 14.993f, 19.485f, 14.492f, 19.103f, 14.109f)
                close()
                moveTo(16.937f, 15.419f)
                curveTo(17.176f, 15.277f, 17.478f, 15.312f, 17.686f, 15.521f)
                curveTo(18.021f, 15.857f, 18.372f, 16.252f, 18.633f, 16.645f)
                curveTo(18.911f, 17.064f, 19f, 17.352f, 19f, 17.5f)
                verticalLineTo(20f)
                curveTo(19f, 20.552f, 18.552f, 21f, 18f, 21f)
                horizontalLineTo(6f)
                curveTo(5.448f, 21f, 5f, 20.552f, 5f, 20f)
                verticalLineTo(17.5f)
                curveTo(5f, 17.355f, 5.085f, 17.073f, 5.356f, 16.661f)
                curveTo(5.61f, 16.275f, 5.954f, 15.884f, 6.286f, 15.549f)
                curveTo(6.494f, 15.338f, 6.811f, 15.297f, 7.074f, 15.459f)
                curveTo(7.157f, 15.509f, 7.241f, 15.562f, 7.327f, 15.616f)
                curveTo(7.809f, 15.917f, 8.349f, 16.254f, 8.998f, 16.508f)
                curveTo(9.793f, 16.818f, 10.724f, 17f, 12f, 17f)
                curveTo(13.3f, 17f, 14.231f, 16.805f, 15.025f, 16.478f)
                curveTo(15.601f, 16.242f, 16.108f, 15.928f, 16.556f, 15.651f)
                curveTo(16.688f, 15.569f, 16.815f, 15.491f, 16.937f, 15.419f)
                close()
            }
        }.build()

        return _User!!
    }

@Suppress("ObjectPropertyName")
private var _User: ImageVector? = null
