package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MoneyWithdrawal: ImageVector
    get() {
        if (_MoneyWithdrawal != null) {
            return _MoneyWithdrawal!!
        }
        _MoneyWithdrawal = ImageVector.Builder(
            name = "MoneyWithdrawal",
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
                moveTo(6f, 17.5f)
                curveTo(6.418f, 17.186f, 6.937f, 17f, 7.5f, 17f)
                curveTo(8.881f, 17f, 10f, 18.119f, 10f, 19.5f)
                curveTo(10f, 20.063f, 9.814f, 20.582f, 9.5f, 21f)
                moveTo(18f, 17.5f)
                curveTo(17.582f, 17.186f, 17.063f, 17f, 16.5f, 17f)
                curveTo(15.119f, 17f, 14f, 18.119f, 14f, 19.5f)
                curveTo(14f, 20.063f, 14.186f, 20.582f, 14.5f, 21f)
                moveTo(18f, 10f)
                curveTo(18.988f, 9.999f, 19.506f, 9.987f, 19.908f, 9.782f)
                curveTo(20.284f, 9.59f, 20.59f, 9.284f, 20.782f, 8.908f)
                curveTo(21f, 8.48f, 21f, 7.92f, 21f, 6.8f)
                verticalLineTo(6.2f)
                curveTo(21f, 5.08f, 21f, 4.52f, 20.782f, 4.092f)
                curveTo(20.59f, 3.716f, 20.284f, 3.41f, 19.908f, 3.218f)
                curveTo(19.48f, 3f, 18.92f, 3f, 17.8f, 3f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 3f, 4.52f, 3f, 4.092f, 3.218f)
                curveTo(3.716f, 3.41f, 3.41f, 3.716f, 3.218f, 4.092f)
                curveTo(3f, 4.52f, 3f, 5.08f, 3f, 6.2f)
                verticalLineTo(6.8f)
                curveTo(3f, 7.92f, 3f, 8.48f, 3.218f, 8.908f)
                curveTo(3.41f, 9.284f, 3.716f, 9.59f, 4.092f, 9.782f)
                curveTo(4.494f, 9.987f, 5.012f, 9.999f, 6f, 10f)
                moveTo(18f, 10f)
                curveTo(18f, 10.065f, 18f, 10.131f, 18f, 10.2f)
                verticalLineTo(17.8f)
                curveTo(18f, 18.92f, 18f, 19.48f, 17.782f, 19.908f)
                curveTo(17.59f, 20.284f, 17.284f, 20.59f, 16.908f, 20.782f)
                curveTo(16.48f, 21f, 15.92f, 21f, 14.8f, 21f)
                horizontalLineTo(9.2f)
                curveTo(8.08f, 21f, 7.52f, 21f, 7.092f, 20.782f)
                curveTo(6.716f, 20.59f, 6.41f, 20.284f, 6.218f, 19.908f)
                curveTo(6f, 19.48f, 6f, 18.92f, 6f, 17.8f)
                verticalLineTo(10.2f)
                curveTo(6f, 10.131f, 6f, 10.065f, 6f, 10f)
                moveTo(18f, 10f)
                curveTo(17.999f, 9.012f, 17.987f, 8.494f, 17.782f, 8.092f)
                curveTo(17.59f, 7.716f, 17.284f, 7.41f, 16.908f, 7.218f)
                curveTo(16.48f, 7f, 15.92f, 7f, 14.8f, 7f)
                horizontalLineTo(9.2f)
                curveTo(8.08f, 7f, 7.52f, 7f, 7.092f, 7.218f)
                curveTo(6.716f, 7.41f, 6.41f, 7.716f, 6.218f, 8.092f)
                curveTo(6.013f, 8.494f, 6.001f, 9.012f, 6f, 10f)
                moveTo(14f, 12f)
                curveTo(14f, 13.105f, 13.105f, 14f, 12f, 14f)
                curveTo(10.895f, 14f, 10f, 13.105f, 10f, 12f)
                curveTo(10f, 10.895f, 10.895f, 10f, 12f, 10f)
                curveTo(13.105f, 10f, 14f, 10.895f, 14f, 12f)
                close()
            }
        }.build()

        return _MoneyWithdrawal!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyWithdrawal: ImageVector? = null
