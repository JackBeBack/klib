package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Minivan: ImageVector
    get() {
        if (_Minivan != null) {
            return _Minivan!!
        }
        _Minivan = ImageVector.Builder(
            name = "Minivan",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 4f)
                curveTo(1.343f, 4f, 0f, 5.343f, 0f, 7f)
                verticalLineTo(14f)
                curveTo(0f, 15.312f, 0.842f, 16.427f, 2.016f, 16.835f)
                curveTo(2.184f, 18.611f, 3.68f, 20f, 5.5f, 20f)
                curveTo(7.263f, 20f, 8.722f, 18.696f, 8.965f, 17f)
                horizontalLineTo(15.035f)
                curveTo(15.278f, 18.696f, 16.737f, 20f, 18.5f, 20f)
                curveTo(20.32f, 20f, 21.816f, 18.611f, 21.984f, 16.835f)
                curveTo(23.158f, 16.427f, 24f, 15.312f, 24f, 14f)
                verticalLineTo(11.64f)
                curveTo(24f, 10.21f, 22.991f, 8.978f, 21.588f, 8.698f)
                lineTo(18.619f, 8.104f)
                lineTo(16.935f, 5.41f)
                curveTo(16.387f, 4.533f, 15.426f, 4f, 14.392f, 4f)
                horizontalLineTo(3f)
                close()
                moveTo(4f, 16.436f)
                verticalLineTo(16.564f)
                curveTo(4.033f, 17.363f, 4.692f, 18.001f, 5.5f, 18.001f)
                curveTo(6.308f, 18.001f, 6.967f, 17.363f, 7f, 16.564f)
                verticalLineTo(16.436f)
                curveTo(6.967f, 15.637f, 6.308f, 14.999f, 5.5f, 14.999f)
                curveTo(4.692f, 14.999f, 4.033f, 15.637f, 4f, 16.436f)
                close()
                moveTo(5.5f, 13f)
                curveTo(6.896f, 13f, 8.101f, 13.818f, 8.663f, 15f)
                horizontalLineTo(15.337f)
                curveTo(15.899f, 13.818f, 17.104f, 13f, 18.5f, 13f)
                curveTo(19.824f, 13f, 20.977f, 13.736f, 21.572f, 14.821f)
                curveTo(21.831f, 14.64f, 22f, 14.34f, 22f, 14f)
                verticalLineTo(11.64f)
                curveTo(22f, 11.163f, 21.663f, 10.752f, 21.196f, 10.659f)
                lineTo(17.901f, 10f)
                horizontalLineTo(13f)
                curveTo(11.895f, 10f, 11f, 9.105f, 11f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                curveTo(2.448f, 6f, 2f, 6.448f, 2f, 7f)
                verticalLineTo(14f)
                curveTo(2f, 14.34f, 2.169f, 14.64f, 2.428f, 14.821f)
                curveTo(3.023f, 13.736f, 4.176f, 13f, 5.5f, 13f)
                close()
                moveTo(13f, 6f)
                verticalLineTo(7f)
                curveTo(13f, 7.552f, 13.448f, 8f, 14f, 8f)
                horizontalLineTo(16.196f)
                lineTo(15.24f, 6.47f)
                curveTo(15.057f, 6.178f, 14.736f, 6f, 14.392f, 6f)
                horizontalLineTo(13f)
                close()
                moveTo(17f, 16.436f)
                verticalLineTo(16.564f)
                curveTo(17.034f, 17.363f, 17.692f, 18.001f, 18.5f, 18.001f)
                curveTo(19.308f, 18.001f, 19.966f, 17.363f, 20f, 16.564f)
                verticalLineTo(16.436f)
                curveTo(19.966f, 15.637f, 19.308f, 14.999f, 18.5f, 14.999f)
                curveTo(17.692f, 14.999f, 17.034f, 15.637f, 17f, 16.436f)
                close()
            }
        }.build()

        return _Minivan!!
    }

@Suppress("ObjectPropertyName")
private var _Minivan: ImageVector? = null
