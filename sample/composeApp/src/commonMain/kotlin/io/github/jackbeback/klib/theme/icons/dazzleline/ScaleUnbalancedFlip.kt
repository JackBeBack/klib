package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ScaleUnbalancedFlip: ImageVector
    get() {
        if (_ScaleUnbalancedFlip != null) {
            return _ScaleUnbalancedFlip!!
        }
        _ScaleUnbalancedFlip = ImageVector.Builder(
            name = "ScaleUnbalancedFlip",
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
                moveTo(4f, 21f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                moveTo(12f, 8f)
                curveTo(10.896f, 8f, 10f, 7.104f, 10f, 6f)
                curveTo(10f, 5.76f, 10.042f, 5.53f, 10.12f, 5.317f)
                moveTo(12f, 8f)
                curveTo(13.105f, 8f, 14f, 7.104f, 14f, 6f)
                curveTo(14f, 4.895f, 13.105f, 4f, 12f, 4f)
                curveTo(11.135f, 4f, 10.399f, 4.549f, 10.12f, 5.317f)
                moveTo(13.876f, 6.684f)
                lineTo(19.514f, 8.736f)
                moveTo(4.479f, 3.264f)
                lineTo(10.12f, 5.317f)
                moveTo(18f, 21f)
                curveTo(16.487f, 21f, 15.236f, 20.158f, 15.03f, 18.751f)
                curveTo(15.017f, 18.662f, 15.01f, 18.617f, 15.015f, 18.518f)
                curveTo(15.019f, 18.45f, 15.042f, 18.326f, 15.063f, 18.26f)
                curveTo(15.094f, 18.166f, 15.131f, 18.1f, 15.205f, 17.968f)
                lineTo(18f, 13f)
                lineTo(20.795f, 17.968f)
                curveTo(20.864f, 18.09f, 20.898f, 18.152f, 20.93f, 18.258f)
                curveTo(20.949f, 18.324f, 20.972f, 18.481f, 20.972f, 18.549f)
                curveTo(20.972f, 18.66f, 20.965f, 18.69f, 20.951f, 18.749f)
                curveTo(20.696f, 19.86f, 19.472f, 21f, 18f, 21f)
                close()
                moveTo(6f, 17f)
                curveTo(4.488f, 17f, 3.236f, 16.158f, 3.03f, 14.751f)
                curveTo(3.017f, 14.662f, 3.01f, 14.617f, 3.015f, 14.519f)
                curveTo(3.019f, 14.45f, 3.042f, 14.325f, 3.063f, 14.26f)
                curveTo(3.094f, 14.166f, 3.131f, 14.1f, 3.206f, 13.968f)
                lineTo(6f, 9f)
                lineTo(8.795f, 13.968f)
                curveTo(8.864f, 14.09f, 8.898f, 14.152f, 8.93f, 14.258f)
                curveTo(8.95f, 14.324f, 8.972f, 14.481f, 8.972f, 14.549f)
                curveTo(8.971f, 14.66f, 8.965f, 14.69f, 8.951f, 14.748f)
                curveTo(8.696f, 15.86f, 7.472f, 17f, 6f, 17f)
                close()
            }
        }.build()

        return _ScaleUnbalancedFlip!!
    }

@Suppress("ObjectPropertyName")
private var _ScaleUnbalancedFlip: ImageVector? = null
