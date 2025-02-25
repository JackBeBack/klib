package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WalletAlt: ImageVector
    get() {
        if (_WalletAlt != null) {
            return _WalletAlt!!
        }
        _WalletAlt = ImageVector.Builder(
            name = "WalletAlt",
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
                moveTo(16.501f, 14.15f)
                horizontalLineTo(16.51f)
                moveTo(19f, 4.001f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 4.001f, 4.52f, 4.001f, 4.092f, 4.219f)
                curveTo(3.716f, 4.411f, 3.41f, 4.717f, 3.218f, 5.093f)
                curveTo(3f, 5.521f, 3f, 6.081f, 3f, 7.201f)
                verticalLineTo(16.801f)
                curveTo(3f, 17.921f, 3f, 18.481f, 3.218f, 18.909f)
                curveTo(3.41f, 19.285f, 3.716f, 19.591f, 4.092f, 19.783f)
                curveTo(4.52f, 20.001f, 5.08f, 20.001f, 6.2f, 20.001f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 20.001f, 19.48f, 20.001f, 19.908f, 19.783f)
                curveTo(20.284f, 19.591f, 20.59f, 19.285f, 20.782f, 18.909f)
                curveTo(21f, 18.481f, 21f, 17.921f, 21f, 16.801f)
                verticalLineTo(11.201f)
                curveTo(21f, 10.081f, 21f, 9.521f, 20.782f, 9.093f)
                curveTo(20.59f, 8.717f, 20.284f, 8.411f, 19.908f, 8.219f)
                curveTo(19.48f, 8.001f, 18.92f, 8.001f, 17.8f, 8.001f)
                horizontalLineTo(7f)
                moveTo(16.951f, 14.15f)
                curveTo(16.951f, 14.399f, 16.749f, 14.6f, 16.501f, 14.6f)
                curveTo(16.252f, 14.6f, 16.051f, 14.399f, 16.051f, 14.15f)
                curveTo(16.051f, 13.902f, 16.252f, 13.7f, 16.501f, 13.7f)
                curveTo(16.749f, 13.7f, 16.951f, 13.902f, 16.951f, 14.15f)
                close()
            }
        }.build()

        return _WalletAlt!!
    }

@Suppress("ObjectPropertyName")
private var _WalletAlt: ImageVector? = null
