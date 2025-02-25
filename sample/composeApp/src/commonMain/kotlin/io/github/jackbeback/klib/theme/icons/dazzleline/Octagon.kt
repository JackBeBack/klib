package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Octagon: ImageVector
    get() {
        if (_Octagon != null) {
            return _Octagon!!
        }
        _Octagon = ImageVector.Builder(
            name = "Octagon",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.775f, 3.507f)
                curveTo(11.227f, 3.32f, 11.453f, 3.226f, 11.686f, 3.189f)
                curveTo(11.894f, 3.157f, 12.105f, 3.157f, 12.312f, 3.189f)
                curveTo(12.546f, 3.226f, 12.772f, 3.32f, 13.224f, 3.507f)
                lineTo(17.139f, 5.129f)
                curveTo(17.591f, 5.316f, 17.817f, 5.41f, 18.008f, 5.549f)
                curveTo(18.178f, 5.672f, 18.327f, 5.821f, 18.451f, 5.991f)
                curveTo(18.59f, 6.183f, 18.683f, 6.409f, 18.871f, 6.861f)
                lineTo(20.492f, 10.775f)
                curveTo(20.679f, 11.227f, 20.773f, 11.453f, 20.81f, 11.687f)
                curveTo(20.843f, 11.894f, 20.843f, 12.106f, 20.81f, 12.313f)
                curveTo(20.773f, 12.547f, 20.679f, 12.773f, 20.492f, 13.225f)
                lineTo(18.871f, 17.139f)
                curveTo(18.683f, 17.591f, 18.59f, 17.817f, 18.451f, 18.009f)
                curveTo(18.327f, 18.179f, 18.178f, 18.328f, 18.008f, 18.451f)
                curveTo(17.817f, 18.59f, 17.591f, 18.684f, 17.139f, 18.871f)
                lineTo(13.224f, 20.493f)
                curveTo(12.772f, 20.68f, 12.546f, 20.774f, 12.312f, 20.811f)
                curveTo(12.105f, 20.843f, 11.894f, 20.843f, 11.686f, 20.811f)
                curveTo(11.453f, 20.774f, 11.227f, 20.68f, 10.775f, 20.493f)
                lineTo(6.86f, 18.871f)
                curveTo(6.408f, 18.684f, 6.182f, 18.59f, 5.99f, 18.451f)
                curveTo(5.821f, 18.328f, 5.671f, 18.179f, 5.548f, 18.009f)
                curveTo(5.409f, 17.817f, 5.315f, 17.591f, 5.128f, 17.139f)
                lineTo(3.507f, 13.225f)
                curveTo(3.319f, 12.773f, 3.226f, 12.547f, 3.189f, 12.313f)
                curveTo(3.156f, 12.106f, 3.156f, 11.894f, 3.189f, 11.687f)
                curveTo(3.226f, 11.453f, 3.319f, 11.227f, 3.507f, 10.775f)
                lineTo(5.128f, 6.861f)
                curveTo(5.315f, 6.409f, 5.409f, 6.183f, 5.548f, 5.991f)
                curveTo(5.671f, 5.821f, 5.821f, 5.672f, 5.99f, 5.549f)
                curveTo(6.182f, 5.41f, 6.408f, 5.316f, 6.86f, 5.129f)
                lineTo(10.775f, 3.507f)
                close()
            }
        }.build()

        return _Octagon!!
    }

@Suppress("ObjectPropertyName")
private var _Octagon: ImageVector? = null
