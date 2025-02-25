package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserLockAlt: ImageVector
    get() {
        if (_UserLockAlt != null) {
            return _UserLockAlt!!
        }
        _UserLockAlt = ImageVector.Builder(
            name = "UserLockAlt",
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
                moveTo(19f, 18.004f)
                verticalLineTo(17f)
                curveTo(19f, 15.895f, 18.105f, 15f, 17f, 15f)
                curveTo(15.895f, 15f, 15f, 15.895f, 15f, 17f)
                verticalLineTo(18.004f)
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
                curveTo(9.281f, 14.81f, 10.118f, 15f, 11f, 15f)
                curveTo(11.168f, 15f, 11.335f, 14.993f, 11.5f, 14.979f)
                moveTo(15.5f, 21f)
                horizontalLineTo(18.5f)
                curveTo(18.966f, 21f, 19.199f, 21f, 19.383f, 20.924f)
                curveTo(19.628f, 20.822f, 19.822f, 20.628f, 19.924f, 20.383f)
                curveTo(20f, 20.199f, 20f, 19.966f, 20f, 19.5f)
                curveTo(20f, 19.034f, 20f, 18.801f, 19.924f, 18.617f)
                curveTo(19.822f, 18.372f, 19.628f, 18.178f, 19.383f, 18.076f)
                curveTo(19.199f, 18f, 18.966f, 18f, 18.5f, 18f)
                horizontalLineTo(15.5f)
                curveTo(15.034f, 18f, 14.801f, 18f, 14.617f, 18.076f)
                curveTo(14.372f, 18.178f, 14.178f, 18.372f, 14.076f, 18.617f)
                curveTo(14f, 18.801f, 14f, 19.034f, 14f, 19.5f)
                curveTo(14f, 19.966f, 14f, 20.199f, 14.076f, 20.383f)
                curveTo(14.178f, 20.628f, 14.372f, 20.822f, 14.617f, 20.924f)
                curveTo(14.801f, 21f, 15.034f, 21f, 15.5f, 21f)
                close()
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserLockAlt!!
    }

@Suppress("ObjectPropertyName")
private var _UserLockAlt: ImageVector? = null
