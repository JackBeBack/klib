package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudFog: ImageVector
    get() {
        if (_CloudFog != null) {
            return _CloudFog!!
        }
        _CloudFog = ImageVector.Builder(
            name = "CloudFog",
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
                moveTo(3f, 18f)
                horizontalLineTo(7f)
                moveTo(10f, 18f)
                horizontalLineTo(21f)
                moveTo(5f, 21f)
                horizontalLineTo(12f)
                moveTo(16f, 21f)
                horizontalLineTo(19f)
                moveTo(8.8f, 15f)
                curveTo(6.149f, 15f, 4f, 12.947f, 4f, 10.414f)
                curveTo(4f, 8.314f, 5.6f, 6.375f, 8f, 6f)
                curveTo(8.753f, 4.274f, 10.535f, 3f, 12.613f, 3f)
                curveTo(15.275f, 3f, 17.45f, 4.991f, 17.6f, 7.5f)
                curveTo(19.013f, 8.096f, 20f, 9.557f, 20f, 11.14f)
                curveTo(20f, 13.272f, 18.209f, 15f, 16f, 15f)
                lineTo(8.8f, 15f)
                close()
            }
        }.build()

        return _CloudFog!!
    }

@Suppress("ObjectPropertyName")
private var _CloudFog: ImageVector? = null
