package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LocationPinLock: ImageVector
    get() {
        if (_LocationPinLock != null) {
            return _LocationPinLock!!
        }
        _LocationPinLock = ImageVector.Builder(
            name = "LocationPinLock",
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
                moveTo(16f, 18f)
                verticalLineTo(17f)
                curveTo(16f, 15.895f, 16.895f, 15f, 18f, 15f)
                curveTo(19.105f, 15f, 20f, 15.895f, 20f, 17f)
                verticalLineTo(18f)
                moveTo(16.953f, 11f)
                curveTo(16.984f, 10.737f, 17f, 10.47f, 17f, 10.2f)
                curveTo(17f, 6.224f, 13.866f, 3f, 10f, 3f)
                curveTo(6.134f, 3f, 3f, 6.224f, 3f, 10.2f)
                curveTo(3f, 14.176f, 6.5f, 17.4f, 10f, 21f)
                curveTo(10.334f, 20.656f, 10.669f, 20.316f, 11f, 19.978f)
                moveTo(16.5f, 21f)
                horizontalLineTo(19.5f)
                curveTo(19.966f, 21f, 20.199f, 21f, 20.383f, 20.924f)
                curveTo(20.628f, 20.822f, 20.822f, 20.628f, 20.924f, 20.383f)
                curveTo(21f, 20.199f, 21f, 19.966f, 21f, 19.5f)
                curveTo(21f, 19.034f, 21f, 18.801f, 20.924f, 18.617f)
                curveTo(20.822f, 18.372f, 20.628f, 18.178f, 20.383f, 18.076f)
                curveTo(20.199f, 18f, 19.966f, 18f, 19.5f, 18f)
                horizontalLineTo(16.5f)
                curveTo(16.034f, 18f, 15.801f, 18f, 15.617f, 18.076f)
                curveTo(15.372f, 18.178f, 15.178f, 18.372f, 15.076f, 18.617f)
                curveTo(15f, 18.801f, 15f, 19.034f, 15f, 19.5f)
                curveTo(15f, 19.966f, 15f, 20.199f, 15.076f, 20.383f)
                curveTo(15.178f, 20.628f, 15.372f, 20.822f, 15.617f, 20.924f)
                curveTo(15.801f, 21f, 16.034f, 21f, 16.5f, 21f)
                close()
                moveTo(13f, 10f)
                curveTo(13f, 11.657f, 11.657f, 13f, 10f, 13f)
                curveTo(8.343f, 13f, 7f, 11.657f, 7f, 10f)
                curveTo(7f, 8.343f, 8.343f, 7f, 10f, 7f)
                curveTo(11.657f, 7f, 13f, 8.343f, 13f, 10f)
                close()
            }
        }.build()

        return _LocationPinLock!!
    }

@Suppress("ObjectPropertyName")
private var _LocationPinLock: ImageVector? = null
