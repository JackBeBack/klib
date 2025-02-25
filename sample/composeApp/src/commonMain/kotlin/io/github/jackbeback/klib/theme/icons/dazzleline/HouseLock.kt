package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseLock: ImageVector
    get() {
        if (_HouseLock != null) {
            return _HouseLock!!
        }
        _HouseLock = ImageVector.Builder(
            name = "HouseLock",
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
                moveTo(11f, 21f)
                horizontalLineTo(9.8f)
                curveTo(8.12f, 21f, 7.28f, 21f, 6.638f, 20.673f)
                curveTo(6.074f, 20.385f, 5.615f, 19.927f, 5.327f, 19.362f)
                curveTo(5f, 18.72f, 5f, 17.88f, 5f, 16.2f)
                verticalLineTo(9.778f)
                moveTo(5f, 9.778f)
                lineTo(3f, 12f)
                moveTo(5f, 9.778f)
                lineTo(8.431f, 5.965f)
                curveTo(9.667f, 4.592f, 10.284f, 3.905f, 11.012f, 3.652f)
                curveTo(11.651f, 3.429f, 12.347f, 3.429f, 12.986f, 3.652f)
                curveTo(13.713f, 3.905f, 14.331f, 4.591f, 15.567f, 5.964f)
                lineTo(21f, 12f)
                moveTo(16f, 18f)
                verticalLineTo(17f)
                curveTo(16f, 15.896f, 16.895f, 15f, 18f, 15f)
                curveTo(19.105f, 15f, 20f, 15.896f, 20f, 17f)
                verticalLineTo(18f)
                moveTo(16.5f, 21f)
                horizontalLineTo(19.5f)
                curveTo(19.966f, 21f, 20.199f, 21f, 20.383f, 20.924f)
                curveTo(20.628f, 20.823f, 20.822f, 20.628f, 20.924f, 20.383f)
                curveTo(21f, 20.199f, 21f, 19.966f, 21f, 19.5f)
                curveTo(21f, 19.034f, 21f, 18.801f, 20.924f, 18.617f)
                curveTo(20.822f, 18.372f, 20.628f, 18.178f, 20.383f, 18.076f)
                curveTo(20.199f, 18f, 19.966f, 18f, 19.5f, 18f)
                horizontalLineTo(16.5f)
                curveTo(16.034f, 18f, 15.801f, 18f, 15.617f, 18.076f)
                curveTo(15.372f, 18.178f, 15.178f, 18.372f, 15.076f, 18.617f)
                curveTo(15f, 18.801f, 15f, 19.034f, 15f, 19.5f)
                curveTo(15f, 19.966f, 15f, 20.199f, 15.076f, 20.383f)
                curveTo(15.178f, 20.628f, 15.372f, 20.823f, 15.617f, 20.924f)
                curveTo(15.801f, 21f, 16.034f, 21f, 16.5f, 21f)
                close()
            }
        }.build()

        return _HouseLock!!
    }

@Suppress("ObjectPropertyName")
private var _HouseLock: ImageVector? = null
