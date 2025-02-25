package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Dislike: ImageVector
    get() {
        if (_Dislike != null) {
            return _Dislike!!
        }
        _Dislike = ImageVector.Builder(
            name = "Dislike",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.556f, 22.646f)
                curveTo(12.352f, 23.044f, 13.319f, 22.665f, 13.631f, 21.831f)
                lineTo(16.193f, 15f)
                lineTo(20f, 15f)
                curveTo(21.657f, 15f, 23f, 13.657f, 23f, 12f)
                lineTo(23f, 4f)
                curveTo(23f, 2.343f, 21.657f, 1f, 20f, 1f)
                lineTo(5.626f, 1f)
                curveTo(4.205f, 1f, 2.979f, 1.997f, 2.689f, 3.388f)
                lineTo(1.023f, 11.388f)
                curveTo(0.635f, 13.251f, 2.057f, 15f, 3.96f, 15f)
                horizontalLineTo(9.113f)
                lineTo(8.374f, 17.215f)
                curveTo(7.745f, 19.104f, 8.6f, 21.168f, 10.38f, 22.058f)
                lineTo(11.556f, 22.646f)
                close()
                moveTo(14.32f, 14.298f)
                lineTo(11.954f, 20.609f)
                lineTo(11.274f, 20.269f)
                curveTo(10.384f, 19.824f, 9.957f, 18.792f, 10.271f, 17.848f)
                lineTo(11.01f, 15.632f)
                curveTo(11.442f, 14.337f, 10.478f, 13f, 9.113f, 13f)
                horizontalLineTo(3.96f)
                curveTo(3.325f, 13f, 2.851f, 12.417f, 2.981f, 11.796f)
                lineTo(3.146f, 11f)
                lineTo(7f, 11f)
                curveTo(7.552f, 11f, 8f, 10.552f, 8f, 10f)
                curveTo(8f, 9.448f, 7.552f, 9f, 7f, 9f)
                lineTo(3.563f, 9f)
                lineTo(3.98f, 7f)
                lineTo(7f, 7f)
                curveTo(7.552f, 7f, 8f, 6.552f, 8f, 6f)
                curveTo(8f, 5.448f, 7.552f, 5f, 7f, 5f)
                lineTo(4.396f, 5f)
                lineTo(4.647f, 3.796f)
                curveTo(4.744f, 3.332f, 5.153f, 3f, 5.626f, 3f)
                lineTo(16f, 3f)
                lineTo(16f, 13.009f)
                curveTo(15.246f, 13.082f, 14.59f, 13.578f, 14.32f, 14.298f)
                close()
                moveTo(18f, 13f)
                horizontalLineTo(20f)
                curveTo(20.552f, 13f, 21f, 12.552f, 21f, 12f)
                lineTo(21f, 4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                lineTo(18f, 3f)
                lineTo(18f, 13f)
                close()
            }
        }.build()

        return _Dislike!!
    }

@Suppress("ObjectPropertyName")
private var _Dislike: ImageVector? = null
