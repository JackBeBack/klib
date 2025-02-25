package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HalloweenMail: ImageVector
    get() {
        if (_HalloweenMail != null) {
            return _HalloweenMail!!
        }
        _HalloweenMail = ImageVector.Builder(
            name = "HalloweenMail",
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
                moveTo(14.53f, 15.31f)
                lineTo(13.774f, 14.78f)
                curveTo(13.132f, 14.352f, 12.811f, 14.138f, 12.465f, 14.055f)
                curveTo(12.158f, 13.982f, 11.839f, 13.982f, 11.533f, 14.055f)
                curveTo(11.186f, 14.138f, 10.865f, 14.352f, 10.224f, 14.78f)
                lineTo(9.468f, 15.311f)
                moveTo(14.53f, 15.31f)
                lineTo(20.5f, 19.5f)
                moveTo(14.53f, 15.31f)
                lineTo(20.97f, 11f)
                moveTo(3.5f, 19.5f)
                lineTo(9.468f, 15.311f)
                moveTo(9.468f, 15.311f)
                lineTo(3.027f, 11f)
                moveTo(6f, 13f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                moveTo(10.5f, 10f)
                lineTo(9.5f, 9.5f)
                moveTo(13.5f, 10f)
                lineTo(14.5f, 9.5f)
                moveTo(8.891f, 4.644f)
                lineTo(4.691f, 8.215f)
                curveTo(4.069f, 8.743f, 3.758f, 9.008f, 3.535f, 9.33f)
                curveTo(3.337f, 9.615f, 3.19f, 9.933f, 3.101f, 10.268f)
                curveTo(3f, 10.647f, 3f, 11.055f, 3f, 11.871f)
                verticalLineTo(16.2f)
                curveTo(3f, 17.88f, 3f, 18.72f, 3.327f, 19.362f)
                curveTo(3.615f, 19.926f, 4.074f, 20.385f, 4.638f, 20.673f)
                curveTo(5.28f, 21f, 6.12f, 21f, 7.8f, 21f)
                horizontalLineTo(16.2f)
                curveTo(17.88f, 21f, 18.72f, 21f, 19.362f, 20.673f)
                curveTo(19.927f, 20.385f, 20.385f, 19.926f, 20.673f, 19.362f)
                curveTo(21f, 18.72f, 21f, 17.88f, 21f, 16.2f)
                verticalLineTo(11.871f)
                curveTo(21f, 11.055f, 21f, 10.647f, 20.899f, 10.268f)
                curveTo(20.81f, 9.933f, 20.663f, 9.615f, 20.465f, 9.33f)
                curveTo(20.242f, 9.008f, 19.931f, 8.743f, 19.309f, 8.215f)
                lineTo(15.109f, 4.644f)
                curveTo(14.005f, 3.705f, 13.453f, 3.235f, 12.834f, 3.056f)
                curveTo(12.289f, 2.898f, 11.711f, 2.898f, 11.166f, 3.056f)
                curveTo(10.547f, 3.235f, 9.995f, 3.705f, 8.891f, 4.644f)
                close()
            }
        }.build()

        return _HalloweenMail!!
    }

@Suppress("ObjectPropertyName")
private var _HalloweenMail: ImageVector? = null
