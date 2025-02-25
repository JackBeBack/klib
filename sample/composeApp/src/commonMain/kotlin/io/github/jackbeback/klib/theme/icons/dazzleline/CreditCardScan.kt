package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CreditCardScan: ImageVector
    get() {
        if (_CreditCardScan != null) {
            return _CreditCardScan!!
        }
        _CreditCardScan = ImageVector.Builder(
            name = "CreditCardScan",
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
                moveTo(6f, 11f)
                horizontalLineTo(18f)
                moveTo(22f, 8f)
                verticalLineTo(7.8f)
                curveTo(22f, 6.12f, 22f, 5.28f, 21.673f, 4.638f)
                curveTo(21.385f, 4.074f, 20.927f, 3.615f, 20.362f, 3.327f)
                curveTo(19.72f, 3f, 18.88f, 3f, 17.2f, 3f)
                horizontalLineTo(17f)
                moveTo(22f, 16f)
                verticalLineTo(16.2f)
                curveTo(22f, 17.88f, 22f, 18.72f, 21.673f, 19.362f)
                curveTo(21.385f, 19.927f, 20.927f, 20.385f, 20.362f, 20.673f)
                curveTo(19.72f, 21f, 18.88f, 21f, 17.2f, 21f)
                horizontalLineTo(17f)
                moveTo(7f, 21f)
                horizontalLineTo(6.8f)
                curveTo(5.12f, 21f, 4.28f, 21f, 3.638f, 20.673f)
                curveTo(3.074f, 20.385f, 2.615f, 19.927f, 2.327f, 19.362f)
                curveTo(2f, 18.72f, 2f, 17.88f, 2f, 16.2f)
                verticalLineTo(16f)
                moveTo(2f, 8f)
                verticalLineTo(7.8f)
                curveTo(2f, 6.12f, 2f, 5.28f, 2.327f, 4.638f)
                curveTo(2.615f, 4.074f, 3.074f, 3.615f, 3.638f, 3.327f)
                curveTo(4.28f, 3f, 5.12f, 3f, 6.8f, 3f)
                horizontalLineTo(7f)
                moveTo(6f, 13.8f)
                verticalLineTo(10.2f)
                curveTo(6f, 9.08f, 6f, 8.52f, 6.218f, 8.092f)
                curveTo(6.41f, 7.716f, 6.716f, 7.41f, 7.092f, 7.218f)
                curveTo(7.52f, 7f, 8.08f, 7f, 9.2f, 7f)
                horizontalLineTo(14.8f)
                curveTo(15.92f, 7f, 16.48f, 7f, 16.908f, 7.218f)
                curveTo(17.284f, 7.41f, 17.59f, 7.716f, 17.782f, 8.092f)
                curveTo(18f, 8.52f, 18f, 9.08f, 18f, 10.2f)
                verticalLineTo(13.8f)
                curveTo(18f, 14.92f, 18f, 15.48f, 17.782f, 15.908f)
                curveTo(17.59f, 16.284f, 17.284f, 16.59f, 16.908f, 16.782f)
                curveTo(16.48f, 17f, 15.92f, 17f, 14.8f, 17f)
                horizontalLineTo(9.2f)
                curveTo(8.08f, 17f, 7.52f, 17f, 7.092f, 16.782f)
                curveTo(6.716f, 16.59f, 6.41f, 16.284f, 6.218f, 15.908f)
                curveTo(6f, 15.48f, 6f, 14.92f, 6f, 13.8f)
                close()
            }
        }.build()

        return _CreditCardScan!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardScan: ImageVector? = null
