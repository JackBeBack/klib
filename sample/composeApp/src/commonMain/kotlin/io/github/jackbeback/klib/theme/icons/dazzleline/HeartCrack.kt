package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HeartCrack: ImageVector
    get() {
        if (_HeartCrack != null) {
            return _HeartCrack!!
        }
        _HeartCrack = ImageVector.Builder(
            name = "HeartCrack",
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
                moveTo(12f, 6f)
                lineTo(14f, 8f)
                lineTo(10f, 10f)
                lineTo(13f, 13f)
                moveTo(12f, 6f)
                curveTo(10.201f, 3.903f, 7.194f, 3.255f, 4.939f, 5.175f)
                curveTo(2.685f, 7.096f, 2.367f, 10.306f, 4.138f, 12.577f)
                curveTo(5.61f, 14.465f, 10.065f, 18.448f, 11.525f, 19.737f)
                curveTo(11.688f, 19.881f, 11.77f, 19.953f, 11.865f, 19.982f)
                curveTo(11.948f, 20.006f, 12.039f, 20.006f, 12.123f, 19.982f)
                curveTo(12.218f, 19.953f, 12.299f, 19.881f, 12.463f, 19.737f)
                curveTo(13.923f, 18.448f, 18.378f, 14.465f, 19.85f, 12.577f)
                curveTo(21.62f, 10.306f, 21.342f, 7.075f, 19.048f, 5.175f)
                curveTo(16.755f, 3.275f, 13.799f, 3.903f, 12f, 6f)
                close()
            }
        }.build()

        return _HeartCrack!!
    }

@Suppress("ObjectPropertyName")
private var _HeartCrack: ImageVector? = null
