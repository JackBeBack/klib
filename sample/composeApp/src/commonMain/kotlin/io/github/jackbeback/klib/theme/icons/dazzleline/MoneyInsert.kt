package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MoneyInsert: ImageVector
    get() {
        if (_MoneyInsert != null) {
            return _MoneyInsert!!
        }
        _MoneyInsert = ImageVector.Builder(
            name = "MoneyInsert",
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
                moveTo(12f, 3f)
                verticalLineTo(9f)
                moveTo(12f, 3f)
                lineTo(9.5f, 5.5f)
                moveTo(12f, 3f)
                lineTo(14.5f, 5.5f)
                moveTo(5.823f, 9f)
                curveTo(6.238f, 9.367f, 6.5f, 9.903f, 6.5f, 10.5f)
                curveTo(6.5f, 11.605f, 5.605f, 12.5f, 4.5f, 12.5f)
                curveTo(3.903f, 12.5f, 3.367f, 12.238f, 3f, 11.823f)
                moveTo(5.823f, 9f)
                curveTo(5.941f, 9f, 6.067f, 9f, 6.2f, 9f)
                horizontalLineTo(8f)
                moveTo(5.823f, 9f)
                curveTo(4.949f, 9.003f, 4.469f, 9.026f, 4.092f, 9.218f)
                curveTo(3.716f, 9.41f, 3.41f, 9.716f, 3.218f, 10.092f)
                curveTo(3.026f, 10.469f, 3.003f, 10.948f, 3f, 11.823f)
                moveTo(3f, 11.823f)
                curveTo(3f, 11.941f, 3f, 12.067f, 3f, 12.2f)
                verticalLineTo(17.8f)
                curveTo(3f, 17.933f, 3f, 18.059f, 3f, 18.177f)
                moveTo(3f, 18.177f)
                curveTo(3.367f, 17.762f, 3.903f, 17.5f, 4.5f, 17.5f)
                curveTo(5.605f, 17.5f, 6.5f, 18.395f, 6.5f, 19.5f)
                curveTo(6.5f, 20.097f, 6.238f, 20.633f, 5.823f, 21f)
                moveTo(3f, 18.177f)
                curveTo(3.003f, 19.052f, 3.026f, 19.531f, 3.218f, 19.908f)
                curveTo(3.41f, 20.284f, 3.716f, 20.59f, 4.092f, 20.782f)
                curveTo(4.469f, 20.974f, 4.949f, 20.997f, 5.823f, 21f)
                moveTo(5.823f, 21f)
                curveTo(5.941f, 21f, 6.067f, 21f, 6.2f, 21f)
                horizontalLineTo(17.8f)
                curveTo(17.933f, 21f, 18.059f, 21f, 18.177f, 21f)
                moveTo(21f, 18.177f)
                curveTo(20.633f, 17.762f, 20.097f, 17.5f, 19.5f, 17.5f)
                curveTo(18.395f, 17.5f, 17.5f, 18.395f, 17.5f, 19.5f)
                curveTo(17.5f, 20.097f, 17.762f, 20.633f, 18.177f, 21f)
                moveTo(21f, 18.177f)
                curveTo(21f, 18.059f, 21f, 17.933f, 21f, 17.8f)
                verticalLineTo(12.2f)
                curveTo(21f, 12.067f, 21f, 11.941f, 21f, 11.823f)
                moveTo(21f, 18.177f)
                curveTo(20.997f, 19.052f, 20.974f, 19.531f, 20.782f, 19.908f)
                curveTo(20.59f, 20.284f, 20.284f, 20.59f, 19.908f, 20.782f)
                curveTo(19.531f, 20.974f, 19.052f, 20.997f, 18.177f, 21f)
                moveTo(21f, 11.823f)
                curveTo(20.633f, 12.238f, 20.097f, 12.5f, 19.5f, 12.5f)
                curveTo(18.395f, 12.5f, 17.5f, 11.605f, 17.5f, 10.5f)
                curveTo(17.5f, 9.903f, 17.762f, 9.367f, 18.177f, 9f)
                moveTo(21f, 11.823f)
                curveTo(20.997f, 10.948f, 20.974f, 10.469f, 20.782f, 10.092f)
                curveTo(20.59f, 9.716f, 20.284f, 9.41f, 19.908f, 9.218f)
                curveTo(19.531f, 9.026f, 19.052f, 9.003f, 18.177f, 9f)
                moveTo(18.177f, 9f)
                curveTo(18.059f, 9f, 17.933f, 9f, 17.8f, 9f)
                horizontalLineTo(16f)
                moveTo(14f, 15f)
                curveTo(14f, 16.105f, 13.105f, 17f, 12f, 17f)
                curveTo(10.895f, 17f, 10f, 16.105f, 10f, 15f)
                curveTo(10f, 13.895f, 10.895f, 13f, 12f, 13f)
                curveTo(13.105f, 13f, 14f, 13.895f, 14f, 15f)
                close()
            }
        }.build()

        return _MoneyInsert!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyInsert: ImageVector? = null
