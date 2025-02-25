package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudLock: ImageVector
    get() {
        if (_CloudLock != null) {
            return _CloudLock!!
        }
        _CloudLock = ImageVector.Builder(
            name = "CloudLock",
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
                moveTo(14f, 12.504f)
                verticalLineTo(11.5f)
                curveTo(14f, 10.395f, 13.105f, 9.5f, 12f, 9.5f)
                curveTo(10.895f, 9.5f, 10f, 10.395f, 10f, 11.5f)
                verticalLineTo(12.504f)
                moveTo(10.5f, 15.5f)
                horizontalLineTo(13.5f)
                curveTo(13.966f, 15.5f, 14.199f, 15.5f, 14.383f, 15.424f)
                curveTo(14.628f, 15.322f, 14.822f, 15.128f, 14.924f, 14.883f)
                curveTo(15f, 14.699f, 15f, 14.466f, 15f, 14f)
                curveTo(15f, 13.534f, 15f, 13.301f, 14.924f, 13.117f)
                curveTo(14.822f, 12.872f, 14.628f, 12.678f, 14.383f, 12.576f)
                curveTo(14.199f, 12.5f, 13.966f, 12.5f, 13.5f, 12.5f)
                horizontalLineTo(10.5f)
                curveTo(10.034f, 12.5f, 9.801f, 12.5f, 9.617f, 12.576f)
                curveTo(9.372f, 12.678f, 9.178f, 12.872f, 9.076f, 13.117f)
                curveTo(9f, 13.301f, 9f, 13.534f, 9f, 14f)
                curveTo(9f, 14.466f, 9f, 14.699f, 9.076f, 14.883f)
                curveTo(9.178f, 15.128f, 9.372f, 15.322f, 9.617f, 15.424f)
                curveTo(9.801f, 15.5f, 10.034f, 15.5f, 10.5f, 15.5f)
                close()
                moveTo(8.4f, 19f)
                curveTo(5.418f, 19f, 3f, 16.604f, 3f, 13.649f)
                curveTo(3f, 11.2f, 4.8f, 8.938f, 7.5f, 8.5f)
                curveTo(8.347f, 6.486f, 10.351f, 5f, 12.689f, 5f)
                curveTo(15.684f, 5f, 18.132f, 7.323f, 18.3f, 10.25f)
                curveTo(19.889f, 10.945f, 21f, 12.65f, 21f, 14.497f)
                curveTo(21f, 16.984f, 18.985f, 19f, 16.5f, 19f)
                lineTo(8.4f, 19f)
                close()
            }
        }.build()

        return _CloudLock!!
    }

@Suppress("ObjectPropertyName")
private var _CloudLock: ImageVector? = null
