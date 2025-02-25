package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Mask: ImageVector
    get() {
        if (_Mask != null) {
            return _Mask!!
        }
        _Mask = ImageVector.Builder(
            name = "Mask",
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
                moveTo(8f, 12f)
                horizontalLineTo(7f)
                moveTo(17f, 12f)
                horizontalLineTo(16f)
                moveTo(12f, 8.5f)
                lineTo(15.584f, 7.425f)
                curveTo(16.086f, 7.274f, 16.337f, 7.199f, 16.591f, 7.168f)
                curveTo(16.862f, 7.135f, 17.135f, 7.14f, 17.404f, 7.181f)
                curveTo(17.658f, 7.219f, 17.906f, 7.302f, 18.403f, 7.468f)
                curveTo(19.931f, 7.977f, 20.695f, 8.231f, 21.185f, 8.706f)
                curveTo(21.703f, 9.207f, 22.023f, 9.878f, 22.087f, 10.596f)
                curveTo(22.147f, 11.276f, 21.864f, 12.03f, 21.299f, 13.538f)
                lineTo(20.779f, 14.924f)
                curveTo(20.498f, 15.672f, 20.358f, 16.046f, 20.115f, 16.322f)
                curveTo(19.9f, 16.566f, 19.629f, 16.754f, 19.326f, 16.869f)
                curveTo(18.982f, 17f, 18.582f, 17f, 17.783f, 17f)
                horizontalLineTo(16.756f)
                curveTo(16.474f, 17f, 16.333f, 17f, 16.195f, 16.981f)
                curveTo(16.073f, 16.963f, 15.952f, 16.935f, 15.835f, 16.896f)
                curveTo(15.703f, 16.851f, 15.577f, 16.788f, 15.325f, 16.662f)
                lineTo(14.863f, 16.431f)
                curveTo(13.813f, 15.906f, 13.288f, 15.644f, 12.738f, 15.541f)
                curveTo(12.25f, 15.449f, 11.75f, 15.449f, 11.263f, 15.541f)
                curveTo(10.712f, 15.644f, 10.188f, 15.906f, 9.138f, 16.431f)
                lineTo(8.676f, 16.662f)
                curveTo(8.424f, 16.788f, 8.298f, 16.851f, 8.166f, 16.896f)
                curveTo(8.049f, 16.935f, 7.928f, 16.963f, 7.806f, 16.981f)
                curveTo(7.668f, 17f, 7.527f, 17f, 7.245f, 17f)
                horizontalLineTo(6.218f)
                curveTo(5.418f, 17f, 5.019f, 17f, 4.675f, 16.869f)
                curveTo(4.372f, 16.754f, 4.101f, 16.566f, 3.886f, 16.322f)
                curveTo(3.643f, 16.046f, 3.502f, 15.672f, 3.222f, 14.924f)
                lineTo(2.702f, 13.538f)
                curveTo(2.137f, 12.03f, 1.854f, 11.276f, 1.914f, 10.596f)
                curveTo(1.978f, 9.878f, 2.298f, 9.207f, 2.816f, 8.706f)
                curveTo(3.306f, 8.231f, 4.07f, 7.977f, 5.598f, 7.468f)
                curveTo(6.094f, 7.302f, 6.343f, 7.219f, 6.597f, 7.181f)
                curveTo(6.866f, 7.14f, 7.139f, 7.135f, 7.41f, 7.168f)
                curveTo(7.664f, 7.199f, 7.915f, 7.274f, 8.416f, 7.425f)
                lineTo(12f, 8.5f)
                close()
            }
        }.build()

        return _Mask!!
    }

@Suppress("ObjectPropertyName")
private var _Mask: ImageVector? = null
