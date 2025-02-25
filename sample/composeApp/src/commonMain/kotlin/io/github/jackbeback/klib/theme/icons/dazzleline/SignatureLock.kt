package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SignatureLock: ImageVector
    get() {
        if (_SignatureLock != null) {
            return _SignatureLock!!
        }
        _SignatureLock = ImageVector.Builder(
            name = "SignatureLock",
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
                moveTo(3f, 6.314f)
                curveTo(4f, 3.899f, 6.5f, 2.623f, 8f, 6.314f)
                curveTo(8.357f, 7.192f, 8.555f, 8.071f, 8.616f, 8.932f)
                moveTo(8.616f, 8.932f)
                curveTo(8.897f, 12.893f, 6.286f, 16.484f, 3f, 18f)
                verticalLineTo(13.381f)
                curveTo(3f, 12.605f, 3f, 12.218f, 3.124f, 11.882f)
                curveTo(3.234f, 11.585f, 3.413f, 11.318f, 3.646f, 11.104f)
                curveTo(3.91f, 10.861f, 4.268f, 10.714f, 4.986f, 10.42f)
                lineTo(8.616f, 8.932f)
                close()
                moveTo(8.616f, 8.932f)
                lineTo(12f, 7.544f)
                lineTo(11.5f, 11.234f)
                horizontalLineTo(14f)
                moveTo(16f, 17f)
                verticalLineTo(16f)
                curveTo(16f, 14.895f, 16.895f, 14f, 18f, 14f)
                curveTo(19.105f, 14f, 20f, 14.895f, 20f, 16f)
                verticalLineTo(17f)
                moveTo(10.5f, 15f)
                horizontalLineTo(12.5f)
                moveTo(16.5f, 20f)
                horizontalLineTo(19.5f)
                curveTo(19.966f, 20f, 20.199f, 20f, 20.383f, 19.924f)
                curveTo(20.628f, 19.822f, 20.822f, 19.628f, 20.924f, 19.383f)
                curveTo(21f, 19.199f, 21f, 18.966f, 21f, 18.5f)
                curveTo(21f, 18.034f, 21f, 17.801f, 20.924f, 17.617f)
                curveTo(20.822f, 17.372f, 20.628f, 17.178f, 20.383f, 17.076f)
                curveTo(20.199f, 17f, 19.966f, 17f, 19.5f, 17f)
                horizontalLineTo(16.5f)
                curveTo(16.034f, 17f, 15.801f, 17f, 15.617f, 17.076f)
                curveTo(15.372f, 17.178f, 15.178f, 17.372f, 15.076f, 17.617f)
                curveTo(15f, 17.801f, 15f, 18.034f, 15f, 18.5f)
                curveTo(15f, 18.966f, 15f, 19.199f, 15.076f, 19.383f)
                curveTo(15.178f, 19.628f, 15.372f, 19.822f, 15.617f, 19.924f)
                curveTo(15.801f, 20f, 16.034f, 20f, 16.5f, 20f)
                close()
            }
        }.build()

        return _SignatureLock!!
    }

@Suppress("ObjectPropertyName")
private var _SignatureLock: ImageVector? = null
