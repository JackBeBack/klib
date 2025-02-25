package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BallPile: ImageVector
    get() {
        if (_BallPile != null) {
            return _BallPile!!
        }
        _BallPile = ImageVector.Builder(
            name = "BallPile",
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
                moveTo(11f, 12f)
                curveTo(11f, 13.105f, 10.105f, 14f, 9f, 14f)
                curveTo(7.895f, 14f, 7f, 13.105f, 7f, 12f)
                curveTo(7f, 10.896f, 7.895f, 10f, 9f, 10f)
                curveTo(10.105f, 10f, 11f, 10.896f, 11f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 12f)
                curveTo(17f, 13.105f, 16.105f, 14f, 15f, 14f)
                curveTo(13.895f, 14f, 13f, 13.105f, 13f, 12f)
                curveTo(13f, 10.896f, 13.895f, 10f, 15f, 10f)
                curveTo(16.105f, 10f, 17f, 10.896f, 17f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 6.81f)
                curveTo(14f, 7.915f, 13.105f, 8.81f, 12f, 8.81f)
                curveTo(10.895f, 8.81f, 10f, 7.915f, 10f, 6.81f)
                curveTo(10f, 5.705f, 10.895f, 4.81f, 12f, 4.81f)
                curveTo(13.105f, 4.81f, 14f, 5.705f, 14f, 6.81f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 17.19f)
                curveTo(8f, 18.295f, 7.105f, 19.19f, 6f, 19.19f)
                curveTo(4.895f, 19.19f, 4f, 18.295f, 4f, 17.19f)
                curveTo(4f, 16.086f, 4.895f, 15.19f, 6f, 15.19f)
                curveTo(7.105f, 15.19f, 8f, 16.086f, 8f, 17.19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 17.19f)
                curveTo(14f, 18.295f, 13.105f, 19.19f, 12f, 19.19f)
                curveTo(10.895f, 19.19f, 10f, 18.295f, 10f, 17.19f)
                curveTo(10f, 16.086f, 10.895f, 15.19f, 12f, 15.19f)
                curveTo(13.105f, 15.19f, 14f, 16.086f, 14f, 17.19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 17.19f)
                curveTo(20f, 18.295f, 19.105f, 19.19f, 18f, 19.19f)
                curveTo(16.895f, 19.19f, 16f, 18.295f, 16f, 17.19f)
                curveTo(16f, 16.086f, 16.895f, 15.19f, 18f, 15.19f)
                curveTo(19.105f, 15.19f, 20f, 16.086f, 20f, 17.19f)
                close()
            }
        }.build()

        return _BallPile!!
    }

@Suppress("ObjectPropertyName")
private var _BallPile: ImageVector? = null
