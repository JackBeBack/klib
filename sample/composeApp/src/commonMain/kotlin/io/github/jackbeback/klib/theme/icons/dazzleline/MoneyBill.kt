package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MoneyBill: ImageVector
    get() {
        if (_MoneyBill != null) {
            return _MoneyBill!!
        }
        _MoneyBill = ImageVector.Builder(
            name = "MoneyBill",
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
                moveTo(5.823f, 6f)
                curveTo(6.238f, 6.367f, 6.5f, 6.903f, 6.5f, 7.5f)
                curveTo(6.5f, 8.605f, 5.605f, 9.5f, 4.5f, 9.5f)
                curveTo(3.903f, 9.5f, 3.367f, 9.238f, 3f, 8.823f)
                moveTo(5.823f, 6f)
                curveTo(5.941f, 6f, 6.067f, 6f, 6.2f, 6f)
                horizontalLineTo(17.8f)
                curveTo(17.933f, 6f, 18.059f, 6f, 18.177f, 6f)
                moveTo(5.823f, 6f)
                curveTo(4.949f, 6.003f, 4.469f, 6.026f, 4.092f, 6.218f)
                curveTo(3.716f, 6.41f, 3.41f, 6.716f, 3.218f, 7.092f)
                curveTo(3.026f, 7.469f, 3.003f, 7.949f, 3f, 8.823f)
                moveTo(3f, 8.823f)
                curveTo(3f, 8.941f, 3f, 9.067f, 3f, 9.2f)
                verticalLineTo(14.8f)
                curveTo(3f, 14.933f, 3f, 15.059f, 3f, 15.177f)
                moveTo(3f, 15.177f)
                curveTo(3.367f, 14.762f, 3.903f, 14.5f, 4.5f, 14.5f)
                curveTo(5.605f, 14.5f, 6.5f, 15.395f, 6.5f, 16.5f)
                curveTo(6.5f, 17.097f, 6.238f, 17.633f, 5.823f, 18f)
                moveTo(3f, 15.177f)
                curveTo(3.003f, 16.052f, 3.026f, 16.531f, 3.218f, 16.908f)
                curveTo(3.41f, 17.284f, 3.716f, 17.59f, 4.092f, 17.782f)
                curveTo(4.469f, 17.974f, 4.949f, 17.997f, 5.823f, 18f)
                moveTo(5.823f, 18f)
                curveTo(5.941f, 18f, 6.067f, 18f, 6.2f, 18f)
                horizontalLineTo(17.8f)
                curveTo(17.933f, 18f, 18.059f, 18f, 18.177f, 18f)
                moveTo(21f, 15.177f)
                curveTo(20.633f, 14.762f, 20.097f, 14.5f, 19.5f, 14.5f)
                curveTo(18.395f, 14.5f, 17.5f, 15.395f, 17.5f, 16.5f)
                curveTo(17.5f, 17.097f, 17.762f, 17.633f, 18.177f, 18f)
                moveTo(21f, 15.177f)
                curveTo(21f, 15.059f, 21f, 14.933f, 21f, 14.8f)
                verticalLineTo(9.2f)
                curveTo(21f, 9.067f, 21f, 8.941f, 21f, 8.823f)
                moveTo(21f, 15.177f)
                curveTo(20.997f, 16.052f, 20.974f, 16.531f, 20.782f, 16.908f)
                curveTo(20.59f, 17.284f, 20.284f, 17.59f, 19.908f, 17.782f)
                curveTo(19.531f, 17.974f, 19.052f, 17.997f, 18.177f, 18f)
                moveTo(21f, 8.823f)
                curveTo(20.633f, 9.238f, 20.097f, 9.5f, 19.5f, 9.5f)
                curveTo(18.395f, 9.5f, 17.5f, 8.605f, 17.5f, 7.5f)
                curveTo(17.5f, 6.903f, 17.762f, 6.367f, 18.177f, 6f)
                moveTo(21f, 8.823f)
                curveTo(20.997f, 7.949f, 20.974f, 7.469f, 20.782f, 7.092f)
                curveTo(20.59f, 6.716f, 20.284f, 6.41f, 19.908f, 6.218f)
                curveTo(19.531f, 6.026f, 19.052f, 6.003f, 18.177f, 6f)
                moveTo(14f, 12f)
                curveTo(14f, 13.105f, 13.105f, 14f, 12f, 14f)
                curveTo(10.895f, 14f, 10f, 13.105f, 10f, 12f)
                curveTo(10f, 10.895f, 10.895f, 10f, 12f, 10f)
                curveTo(13.105f, 10f, 14f, 10.895f, 14f, 12f)
                close()
            }
        }.build()

        return _MoneyBill!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyBill: ImageVector? = null
