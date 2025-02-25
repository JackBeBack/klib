package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CandyCorn: ImageVector
    get() {
        if (_CandyCorn != null) {
            return _CandyCorn!!
        }
        _CandyCorn = ImageVector.Builder(
            name = "CandyCorn",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.539f, 17f)
                horizontalLineTo(11.462f)
                moveTo(5.077f, 13f)
                horizontalLineTo(9.923f)
                moveTo(12.539f, 7f)
                horizontalLineTo(20.462f)
                moveTo(14.077f, 11f)
                horizontalLineTo(18.923f)
                moveTo(6.821f, 8.467f)
                lineTo(3.673f, 16.651f)
                curveTo(3.111f, 18.111f, 2.831f, 18.84f, 2.958f, 19.425f)
                curveTo(3.069f, 19.937f, 3.377f, 20.384f, 3.814f, 20.671f)
                curveTo(4.314f, 21f, 5.096f, 21f, 6.66f, 21f)
                horizontalLineTo(8.341f)
                curveTo(9.905f, 21f, 10.686f, 21f, 11.186f, 20.671f)
                curveTo(11.624f, 20.384f, 11.931f, 19.937f, 12.042f, 19.425f)
                curveTo(12.17f, 18.84f, 11.889f, 18.111f, 11.328f, 16.651f)
                lineTo(8.18f, 8.467f)
                curveTo(8.072f, 8.186f, 7.801f, 8f, 7.5f, 8f)
                curveTo(7.199f, 8f, 6.929f, 8.186f, 6.821f, 8.467f)
                close()
                moveTo(15.821f, 15.533f)
                lineTo(12.673f, 7.349f)
                curveTo(12.111f, 5.889f, 11.831f, 5.16f, 11.958f, 4.575f)
                curveTo(12.069f, 4.063f, 12.377f, 3.616f, 12.814f, 3.329f)
                curveTo(13.314f, 3f, 14.096f, 3f, 15.66f, 3f)
                horizontalLineTo(17.341f)
                curveTo(18.905f, 3f, 19.687f, 3f, 20.187f, 3.329f)
                curveTo(20.624f, 3.616f, 20.931f, 4.063f, 21.042f, 4.575f)
                curveTo(21.17f, 5.16f, 20.889f, 5.889f, 20.328f, 7.349f)
                lineTo(17.18f, 15.533f)
                curveTo(17.072f, 15.814f, 16.801f, 16f, 16.5f, 16f)
                curveTo(16.199f, 16f, 15.929f, 15.814f, 15.821f, 15.533f)
                close()
            }
        }.build()

        return _CandyCorn!!
    }

@Suppress("ObjectPropertyName")
private var _CandyCorn: ImageVector? = null
