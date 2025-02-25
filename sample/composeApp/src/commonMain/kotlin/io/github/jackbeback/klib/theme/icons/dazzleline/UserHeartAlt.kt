package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserHeartAlt: ImageVector
    get() {
        if (_UserHeartAlt != null) {
            return _UserHeartAlt!!
        }
        _UserHeartAlt = ImageVector.Builder(
            name = "UserHeartAlt",
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
                moveTo(10.5f, 21f)
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
                curveTo(8.838f, 14.609f, 9.163f, 14.724f, 9.5f, 14.811f)
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
                moveTo(16.498f, 16.212f)
                curveTo(15.798f, 15.433f, 14.631f, 15.223f, 13.754f, 15.937f)
                curveTo(12.877f, 16.65f, 12.754f, 17.843f, 13.443f, 18.687f)
                curveTo(13.831f, 19.163f, 14.755f, 19.998f, 15.485f, 20.635f)
                curveTo(15.832f, 20.937f, 16.005f, 21.088f, 16.215f, 21.15f)
                curveTo(16.393f, 21.203f, 16.602f, 21.203f, 16.781f, 21.15f)
                curveTo(16.99f, 21.088f, 17.163f, 20.937f, 17.51f, 20.635f)
                curveTo(18.24f, 19.998f, 19.164f, 19.163f, 19.553f, 18.687f)
                curveTo(20.241f, 17.843f, 20.133f, 16.643f, 19.241f, 15.937f)
                curveTo(18.349f, 15.231f, 17.197f, 15.433f, 16.498f, 16.212f)
                close()
            }
        }.build()

        return _UserHeartAlt!!
    }

@Suppress("ObjectPropertyName")
private var _UserHeartAlt: ImageVector? = null
