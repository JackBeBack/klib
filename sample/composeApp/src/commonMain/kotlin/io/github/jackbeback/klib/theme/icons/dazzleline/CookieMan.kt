package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CookieMan: ImageVector
    get() {
        if (_CookieMan != null) {
            return _CookieMan!!
        }
        _CookieMan = ImageVector.Builder(
            name = "CookieMan",
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
                moveTo(12f, 14f)
                horizontalLineTo(12.01f)
                moveTo(12f, 11f)
                horizontalLineTo(12.01f)
                moveTo(5.632f, 15.421f)
                lineTo(8f, 14f)
                lineTo(6.195f, 18.813f)
                curveTo(5.617f, 20.355f, 6.757f, 22f, 8.403f, 22f)
                curveTo(9.368f, 22f, 10.235f, 21.413f, 10.593f, 20.517f)
                lineTo(12f, 17f)
                lineTo(13.407f, 20.517f)
                curveTo(13.765f, 21.413f, 14.632f, 22f, 15.597f, 22f)
                curveTo(17.243f, 22f, 18.383f, 20.355f, 17.805f, 18.813f)
                lineTo(16f, 14f)
                lineTo(17.824f, 15.094f)
                curveTo(19.222f, 15.933f, 21f, 14.926f, 21f, 13.296f)
                curveTo(21f, 12.502f, 20.551f, 11.776f, 19.841f, 11.42f)
                lineTo(14.771f, 8.885f)
                curveTo(15.528f, 8.157f, 16f, 7.134f, 16f, 6f)
                curveTo(16f, 3.791f, 14.209f, 2f, 12f, 2f)
                curveTo(9.791f, 2f, 8f, 3.791f, 8f, 6f)
                curveTo(8f, 7.122f, 8.462f, 8.136f, 9.206f, 8.863f)
                lineTo(3.774f, 12.484f)
                curveTo(3.29f, 12.806f, 3f, 13.349f, 3f, 13.93f)
                curveTo(3f, 15.281f, 4.474f, 16.116f, 5.632f, 15.421f)
                close()
            }
        }.build()

        return _CookieMan!!
    }

@Suppress("ObjectPropertyName")
private var _CookieMan: ImageVector? = null
