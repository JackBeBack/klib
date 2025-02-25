package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MoneyStack: ImageVector
    get() {
        if (_MoneyStack != null) {
            return _MoneyStack!!
        }
        _MoneyStack = ImageVector.Builder(
            name = "MoneyStack",
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
                moveTo(3f, 21f)
                horizontalLineTo(21f)
                moveTo(3f, 18f)
                horizontalLineTo(21f)
                moveTo(5.823f, 3f)
                curveTo(6.238f, 3.367f, 6.5f, 3.903f, 6.5f, 4.5f)
                curveTo(6.5f, 5.605f, 5.605f, 6.5f, 4.5f, 6.5f)
                curveTo(3.903f, 6.5f, 3.367f, 6.238f, 3f, 5.823f)
                moveTo(5.823f, 3f)
                curveTo(5.941f, 3f, 6.067f, 3f, 6.2f, 3f)
                horizontalLineTo(17.8f)
                curveTo(17.933f, 3f, 18.059f, 3f, 18.177f, 3f)
                moveTo(5.823f, 3f)
                curveTo(4.949f, 3.003f, 4.469f, 3.026f, 4.092f, 3.218f)
                curveTo(3.716f, 3.41f, 3.41f, 3.716f, 3.218f, 4.092f)
                curveTo(3.026f, 4.469f, 3.003f, 4.949f, 3f, 5.823f)
                moveTo(3f, 5.823f)
                curveTo(3f, 5.941f, 3f, 6.067f, 3f, 6.2f)
                verticalLineTo(11.8f)
                curveTo(3f, 11.933f, 3f, 12.059f, 3f, 12.177f)
                moveTo(3f, 12.177f)
                curveTo(3.367f, 11.762f, 3.903f, 11.5f, 4.5f, 11.5f)
                curveTo(5.605f, 11.5f, 6.5f, 12.395f, 6.5f, 13.5f)
                curveTo(6.5f, 14.097f, 6.238f, 14.633f, 5.823f, 15f)
                moveTo(3f, 12.177f)
                curveTo(3.003f, 13.052f, 3.026f, 13.531f, 3.218f, 13.908f)
                curveTo(3.41f, 14.284f, 3.716f, 14.59f, 4.092f, 14.782f)
                curveTo(4.469f, 14.974f, 4.949f, 14.997f, 5.823f, 15f)
                moveTo(5.823f, 15f)
                curveTo(5.941f, 15f, 6.067f, 15f, 6.2f, 15f)
                horizontalLineTo(17.8f)
                curveTo(17.933f, 15f, 18.059f, 15f, 18.177f, 15f)
                moveTo(21f, 12.177f)
                curveTo(20.633f, 11.762f, 20.097f, 11.5f, 19.5f, 11.5f)
                curveTo(18.395f, 11.5f, 17.5f, 12.395f, 17.5f, 13.5f)
                curveTo(17.5f, 14.097f, 17.762f, 14.633f, 18.177f, 15f)
                moveTo(21f, 12.177f)
                curveTo(21f, 12.059f, 21f, 11.933f, 21f, 11.8f)
                verticalLineTo(6.2f)
                curveTo(21f, 6.067f, 21f, 5.941f, 21f, 5.823f)
                moveTo(21f, 12.177f)
                curveTo(20.997f, 13.052f, 20.974f, 13.531f, 20.782f, 13.908f)
                curveTo(20.59f, 14.284f, 20.284f, 14.59f, 19.908f, 14.782f)
                curveTo(19.531f, 14.974f, 19.052f, 14.997f, 18.177f, 15f)
                moveTo(21f, 5.823f)
                curveTo(20.633f, 6.238f, 20.097f, 6.5f, 19.5f, 6.5f)
                curveTo(18.395f, 6.5f, 17.5f, 5.605f, 17.5f, 4.5f)
                curveTo(17.5f, 3.903f, 17.762f, 3.367f, 18.177f, 3f)
                moveTo(21f, 5.823f)
                curveTo(20.997f, 4.949f, 20.974f, 4.469f, 20.782f, 4.092f)
                curveTo(20.59f, 3.716f, 20.284f, 3.41f, 19.908f, 3.218f)
                curveTo(19.531f, 3.026f, 19.052f, 3.003f, 18.177f, 3f)
                moveTo(14f, 9f)
                curveTo(14f, 10.105f, 13.105f, 11f, 12f, 11f)
                curveTo(10.895f, 11f, 10f, 10.105f, 10f, 9f)
                curveTo(10f, 7.895f, 10.895f, 7f, 12f, 7f)
                curveTo(13.105f, 7f, 14f, 7.895f, 14f, 9f)
                close()
            }
        }.build()

        return _MoneyStack!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyStack: ImageVector? = null
