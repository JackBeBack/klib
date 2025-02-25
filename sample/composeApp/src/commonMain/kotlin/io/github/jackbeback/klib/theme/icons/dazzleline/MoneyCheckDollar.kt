package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MoneyCheckDollar: ImageVector
    get() {
        if (_MoneyCheckDollar != null) {
            return _MoneyCheckDollar!!
        }
        _MoneyCheckDollar = ImageVector.Builder(
            name = "MoneyCheckDollar",
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
                moveTo(14f, 14f)
                horizontalLineTo(17f)
                moveTo(14f, 10f)
                horizontalLineTo(17f)
                moveTo(9f, 9.5f)
                verticalLineTo(8.5f)
                moveTo(9f, 9.5f)
                horizontalLineTo(11f)
                moveTo(9f, 9.5f)
                curveTo(7.201f, 9.5f, 7.002f, 9.932f, 7f, 10.833f)
                curveTo(6.998f, 11.733f, 7f, 12f, 9f, 12f)
                curveTo(11f, 12f, 11f, 12.205f, 11f, 13.167f)
                curveTo(11f, 13.889f, 11f, 14.5f, 9f, 14.5f)
                moveTo(9f, 14.5f)
                lineTo(9f, 15.5f)
                moveTo(9f, 14.5f)
                horizontalLineTo(7f)
                moveTo(6.2f, 19f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 19f, 19.48f, 19f, 19.908f, 18.782f)
                curveTo(20.284f, 18.59f, 20.59f, 18.284f, 20.782f, 17.908f)
                curveTo(21f, 17.48f, 21f, 16.92f, 21f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(21f, 7.08f, 21f, 6.52f, 20.782f, 6.092f)
                curveTo(20.59f, 5.716f, 20.284f, 5.41f, 19.908f, 5.218f)
                curveTo(19.48f, 5f, 18.92f, 5f, 17.8f, 5f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 5f, 4.52f, 5f, 4.092f, 5.218f)
                curveTo(3.716f, 5.41f, 3.41f, 5.716f, 3.218f, 6.092f)
                curveTo(3f, 6.52f, 3f, 7.08f, 3f, 8.2f)
                verticalLineTo(15.8f)
                curveTo(3f, 16.92f, 3f, 17.48f, 3.218f, 17.908f)
                curveTo(3.41f, 18.284f, 3.716f, 18.59f, 4.092f, 18.782f)
                curveTo(4.52f, 19f, 5.08f, 19f, 6.2f, 19f)
                close()
            }
        }.build()

        return _MoneyCheckDollar!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyCheckDollar: ImageVector? = null
