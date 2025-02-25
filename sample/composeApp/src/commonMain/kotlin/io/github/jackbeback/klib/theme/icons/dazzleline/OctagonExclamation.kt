package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.OctagonExclamation: ImageVector
    get() {
        if (_OctagonExclamation != null) {
            return _OctagonExclamation!!
        }
        _OctagonExclamation = ImageVector.Builder(
            name = "OctagonExclamation",
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
                moveTo(12f, 8f)
                verticalLineTo(13f)
                moveTo(12f, 16f)
                horizontalLineTo(12.01f)
                moveTo(5.129f, 6.861f)
                lineTo(3.507f, 10.775f)
                curveTo(3.32f, 11.227f, 3.227f, 11.453f, 3.19f, 11.687f)
                curveTo(3.157f, 11.894f, 3.157f, 12.106f, 3.19f, 12.313f)
                curveTo(3.227f, 12.547f, 3.32f, 12.773f, 3.507f, 13.225f)
                lineTo(5.129f, 17.139f)
                curveTo(5.316f, 17.591f, 5.41f, 17.817f, 5.549f, 18.009f)
                curveTo(5.672f, 18.179f, 5.822f, 18.328f, 5.991f, 18.451f)
                curveTo(6.183f, 18.59f, 6.409f, 18.684f, 6.861f, 18.871f)
                lineTo(10.776f, 20.493f)
                curveTo(11.228f, 20.68f, 11.454f, 20.774f, 11.687f, 20.811f)
                curveTo(11.895f, 20.843f, 12.106f, 20.843f, 12.313f, 20.811f)
                curveTo(12.547f, 20.774f, 12.773f, 20.68f, 13.225f, 20.493f)
                lineTo(17.14f, 18.871f)
                curveTo(17.592f, 18.684f, 17.817f, 18.59f, 18.009f, 18.451f)
                curveTo(18.179f, 18.328f, 18.328f, 18.179f, 18.451f, 18.009f)
                curveTo(18.591f, 17.817f, 18.684f, 17.591f, 18.872f, 17.139f)
                lineTo(20.493f, 13.225f)
                curveTo(20.68f, 12.773f, 20.774f, 12.547f, 20.811f, 12.313f)
                curveTo(20.844f, 12.106f, 20.844f, 11.894f, 20.811f, 11.687f)
                curveTo(20.774f, 11.453f, 20.68f, 11.227f, 20.493f, 10.775f)
                lineTo(18.872f, 6.861f)
                curveTo(18.684f, 6.409f, 18.591f, 6.183f, 18.451f, 5.991f)
                curveTo(18.328f, 5.821f, 18.179f, 5.672f, 18.009f, 5.549f)
                curveTo(17.817f, 5.41f, 17.592f, 5.316f, 17.14f, 5.129f)
                lineTo(13.225f, 3.507f)
                curveTo(12.773f, 3.32f, 12.547f, 3.226f, 12.313f, 3.189f)
                curveTo(12.106f, 3.157f, 11.895f, 3.157f, 11.687f, 3.189f)
                curveTo(11.454f, 3.226f, 11.228f, 3.32f, 10.776f, 3.507f)
                lineTo(6.861f, 5.129f)
                curveTo(6.409f, 5.316f, 6.183f, 5.41f, 5.991f, 5.549f)
                curveTo(5.822f, 5.672f, 5.672f, 5.821f, 5.549f, 5.991f)
                curveTo(5.41f, 6.183f, 5.316f, 6.409f, 5.129f, 6.861f)
                close()
            }
        }.build()

        return _OctagonExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _OctagonExclamation: ImageVector? = null
