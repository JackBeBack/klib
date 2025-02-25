package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserRefreshAlt: ImageVector
    get() {
        if (_UserRefreshAlt != null) {
            return _UserRefreshAlt!!
        }
        _UserRefreshAlt = ImageVector.Builder(
            name = "UserRefreshAlt",
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
                moveTo(18.5f, 20.236f)
                curveTo(17.969f, 20.711f, 17.268f, 21f, 16.5f, 21f)
                curveTo(14.843f, 21f, 13.5f, 19.657f, 13.5f, 18f)
                curveTo(13.5f, 16.343f, 14.843f, 15f, 16.5f, 15f)
                curveTo(17.806f, 15f, 18.917f, 15.835f, 19.329f, 17f)
                moveTo(20f, 14.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(17f)
                moveTo(10f, 21f)
                horizontalLineTo(5.6f)
                curveTo(5.04f, 21f, 4.76f, 21f, 4.546f, 20.891f)
                curveTo(4.358f, 20.795f, 4.205f, 20.642f, 4.109f, 20.454f)
                curveTo(4f, 20.24f, 4f, 19.96f, 4f, 19.4f)
                verticalLineTo(17.684f)
                curveTo(4f, 17.049f, 4f, 16.731f, 4.048f, 16.466f)
                curveTo(4.271f, 15.234f, 5.234f, 14.271f, 6.466f, 14.048f)
                curveTo(6.543f, 14.034f, 6.624f, 14.024f, 6.716f, 14.017f)
                curveTo(6.941f, 14f, 7.053f, 13.991f, 7.204f, 14.003f)
                curveTo(7.36f, 14.014f, 7.447f, 14.03f, 7.598f, 14.072f)
                curveTo(7.743f, 14.113f, 8.004f, 14.231f, 8.527f, 14.468f)
                curveTo(8.99f, 14.678f, 9.484f, 14.83f, 10f, 14.917f)
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserRefreshAlt!!
    }

@Suppress("ObjectPropertyName")
private var _UserRefreshAlt: ImageVector? = null
