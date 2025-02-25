package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WalletPlus: ImageVector
    get() {
        if (_WalletPlus != null) {
            return _WalletPlus!!
        }
        _WalletPlus = ImageVector.Builder(
            name = "WalletPlus",
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
                moveTo(10f, 16f)
                verticalLineTo(14f)
                moveTo(10f, 14f)
                verticalLineTo(12f)
                moveTo(10f, 14f)
                lineTo(12f, 14f)
                moveTo(10f, 14f)
                lineTo(8f, 14f)
                moveTo(21f, 12f)
                verticalLineTo(11.2f)
                curveTo(21f, 10.08f, 21f, 9.52f, 20.782f, 9.092f)
                curveTo(20.59f, 8.716f, 20.284f, 8.41f, 19.908f, 8.218f)
                curveTo(19.48f, 8f, 18.92f, 8f, 17.8f, 8f)
                horizontalLineTo(3f)
                moveTo(21f, 12f)
                verticalLineTo(16f)
                moveTo(21f, 12f)
                horizontalLineTo(19f)
                curveTo(17.895f, 12f, 17f, 12.895f, 17f, 14f)
                curveTo(17f, 15.105f, 17.895f, 16f, 19f, 16f)
                horizontalLineTo(21f)
                moveTo(21f, 16f)
                verticalLineTo(16.8f)
                curveTo(21f, 17.92f, 21f, 18.48f, 20.782f, 18.908f)
                curveTo(20.59f, 19.284f, 20.284f, 19.59f, 19.908f, 19.782f)
                curveTo(19.48f, 20f, 18.92f, 20f, 17.8f, 20f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 20f, 4.52f, 20f, 4.092f, 19.782f)
                curveTo(3.716f, 19.59f, 3.41f, 19.284f, 3.218f, 18.908f)
                curveTo(3f, 18.48f, 3f, 17.92f, 3f, 16.8f)
                verticalLineTo(8f)
                moveTo(18f, 8f)
                verticalLineTo(7.2f)
                curveTo(18f, 6.08f, 18f, 5.52f, 17.782f, 5.092f)
                curveTo(17.59f, 4.716f, 17.284f, 4.41f, 16.908f, 4.218f)
                curveTo(16.48f, 4f, 15.92f, 4f, 14.8f, 4f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 4f, 4.52f, 4f, 4.092f, 4.218f)
                curveTo(3.716f, 4.41f, 3.41f, 4.716f, 3.218f, 5.092f)
                curveTo(3f, 5.52f, 3f, 6.08f, 3f, 7.2f)
                verticalLineTo(8f)
            }
        }.build()

        return _WalletPlus!!
    }

@Suppress("ObjectPropertyName")
private var _WalletPlus: ImageVector? = null
