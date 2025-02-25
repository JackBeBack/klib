package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Compass: ImageVector
    get() {
        if (_Compass != null) {
            return _Compass!!
        }
        _Compass = ImageVector.Builder(
            name = "Compass",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.121f, 14.121f)
                lineTo(16.517f, 8.133f)
                curveTo(16.68f, 7.725f, 16.275f, 7.32f, 15.867f, 7.484f)
                lineTo(9.879f, 9.879f)
                moveTo(14.121f, 14.121f)
                lineTo(8.134f, 16.517f)
                curveTo(7.725f, 16.68f, 7.32f, 16.275f, 7.484f, 15.866f)
                lineTo(9.879f, 9.879f)
                moveTo(14.121f, 14.121f)
                lineTo(9.879f, 9.879f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                moveToRelative(-9f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
            }
        }.build()

        return _Compass!!
    }

@Suppress("ObjectPropertyName")
private var _Compass: ImageVector? = null
