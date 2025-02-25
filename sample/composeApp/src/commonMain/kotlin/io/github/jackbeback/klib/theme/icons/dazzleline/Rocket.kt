package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Rocket: ImageVector
    get() {
        if (_Rocket != null) {
            return _Rocket!!
        }
        _Rocket = ImageVector.Builder(
            name = "Rocket",
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
                moveTo(8f, 13f)
                lineTo(6.351f, 15.062f)
                curveTo(6.221f, 15.224f, 6.156f, 15.305f, 6.109f, 15.396f)
                curveTo(6.068f, 15.476f, 6.039f, 15.561f, 6.02f, 15.65f)
                curveTo(6f, 15.749f, 6f, 15.853f, 6f, 16.061f)
                verticalLineTo(21f)
                lineTo(10f, 16f)
                moveTo(16f, 13f)
                lineTo(17.649f, 15.062f)
                curveTo(17.779f, 15.224f, 17.844f, 15.305f, 17.89f, 15.396f)
                curveTo(17.931f, 15.476f, 17.962f, 15.561f, 17.98f, 15.65f)
                curveTo(18f, 15.749f, 18f, 15.853f, 18f, 16.061f)
                verticalLineTo(21f)
                lineTo(14f, 16f)
                moveTo(12f, 13f)
                verticalLineTo(20f)
                moveTo(8f, 8f)
                horizontalLineTo(16f)
                moveTo(12f, 3f)
                lineTo(8.404f, 7.045f)
                curveTo(8.255f, 7.214f, 8.18f, 7.298f, 8.127f, 7.393f)
                curveTo(8.079f, 7.478f, 8.045f, 7.569f, 8.024f, 7.664f)
                curveTo(8f, 7.771f, 8f, 7.883f, 8f, 8.108f)
                verticalLineTo(12f)
                curveTo(8f, 13.4f, 8f, 14.1f, 8.272f, 14.635f)
                curveTo(8.512f, 15.105f, 8.895f, 15.488f, 9.365f, 15.727f)
                curveTo(9.9f, 16f, 10.6f, 16f, 12f, 16f)
                curveTo(13.4f, 16f, 14.1f, 16f, 14.635f, 15.727f)
                curveTo(15.105f, 15.488f, 15.488f, 15.105f, 15.727f, 14.635f)
                curveTo(16f, 14.1f, 16f, 13.4f, 16f, 12f)
                verticalLineTo(8.108f)
                curveTo(16f, 7.883f, 16f, 7.771f, 15.976f, 7.664f)
                curveTo(15.955f, 7.569f, 15.921f, 7.478f, 15.873f, 7.393f)
                curveTo(15.82f, 7.298f, 15.745f, 7.214f, 15.596f, 7.045f)
                lineTo(12f, 3f)
                close()
            }
        }.build()

        return _Rocket!!
    }

@Suppress("ObjectPropertyName")
private var _Rocket: ImageVector? = null
