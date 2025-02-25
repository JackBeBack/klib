package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Nsfw: ImageVector
    get() {
        if (_Nsfw != null) {
            return _Nsfw!!
        }
        _Nsfw = ImageVector.Builder(
            name = "Nsfw",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(4.8f, 1.4f)
                curveTo(4.542f, 1.056f, 4.092f, 0.915f, 3.684f, 1.051f)
                curveTo(3.275f, 1.188f, 3f, 1.57f, 3f, 2f)
                verticalLineTo(10f)
                curveTo(3f, 10.552f, 3.448f, 11f, 4f, 11f)
                curveTo(4.552f, 11f, 5f, 10.552f, 5f, 10f)
                verticalLineTo(5f)
                lineTo(9.2f, 10.6f)
                curveTo(9.458f, 10.944f, 9.908f, 11.085f, 10.316f, 10.949f)
                curveTo(10.725f, 10.813f, 11f, 10.431f, 11f, 10f)
                verticalLineTo(2f)
                curveTo(11f, 1.448f, 10.552f, 1f, 10f, 1f)
                curveTo(9.448f, 1f, 9f, 1.448f, 9f, 2f)
                verticalLineTo(7f)
                lineTo(4.8f, 1.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15f, 1f)
                curveTo(13.895f, 1f, 13f, 1.895f, 13f, 3f)
                verticalLineTo(5f)
                curveTo(13f, 6.105f, 13.895f, 7f, 15f, 7f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                curveTo(13.448f, 9f, 13f, 9.448f, 13f, 10f)
                curveTo(13f, 10.552f, 13.448f, 11f, 14f, 11f)
                horizontalLineTo(19f)
                curveTo(20.105f, 11f, 21f, 10.105f, 21f, 9f)
                verticalLineTo(7f)
                curveTo(21f, 5.895f, 20.105f, 5f, 19f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(20f)
                curveTo(20.552f, 3f, 21f, 2.552f, 21f, 2f)
                curveTo(21f, 1.448f, 20.552f, 1f, 20f, 1f)
                horizontalLineTo(15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(3f, 14f)
                curveTo(3f, 13.448f, 3.448f, 13f, 4f, 13f)
                horizontalLineTo(10f)
                curveTo(10.552f, 13f, 11f, 13.448f, 11f, 14f)
                curveTo(11f, 14.552f, 10.552f, 15f, 10f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                curveTo(10.552f, 17f, 11f, 17.448f, 11f, 18f)
                curveTo(11f, 18.552f, 10.552f, 19f, 10f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(22f)
                curveTo(5f, 22.552f, 4.552f, 23f, 4f, 23f)
                curveTo(3.448f, 23f, 3f, 22.552f, 3f, 22f)
                verticalLineTo(14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15f, 14f)
                curveTo(15f, 13.448f, 14.552f, 13f, 14f, 13f)
                curveTo(13.448f, 13f, 13f, 13.448f, 13f, 14f)
                verticalLineTo(22f)
                curveTo(13f, 22.449f, 13.3f, 22.844f, 13.733f, 22.964f)
                curveTo(14.166f, 23.084f, 14.626f, 22.9f, 14.858f, 22.515f)
                lineTo(17f, 18.944f)
                lineTo(19.142f, 22.515f)
                curveTo(19.374f, 22.9f, 19.834f, 23.084f, 20.267f, 22.964f)
                curveTo(20.7f, 22.844f, 21f, 22.449f, 21f, 22f)
                verticalLineTo(14f)
                curveTo(21f, 13.448f, 20.552f, 13f, 20f, 13f)
                curveTo(19.448f, 13f, 19f, 13.448f, 19f, 14f)
                verticalLineTo(18.39f)
                lineTo(17.858f, 16.486f)
                curveTo(17.677f, 16.184f, 17.351f, 16f, 17f, 16f)
                curveTo(16.649f, 16f, 16.323f, 16.184f, 16.142f, 16.486f)
                lineTo(15f, 18.39f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _Nsfw!!
    }

@Suppress("ObjectPropertyName")
private var _Nsfw: ImageVector? = null
