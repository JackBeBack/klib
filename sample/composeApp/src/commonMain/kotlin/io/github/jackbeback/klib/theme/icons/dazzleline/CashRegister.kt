package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CashRegister: ImageVector
    get() {
        if (_CashRegister != null) {
            return _CashRegister!!
        }
        _CashRegister = ImageVector.Builder(
            name = "CashRegister",
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
                moveTo(21f, 18f)
                lineTo(20.17f, 11.777f)
                curveTo(20.039f, 10.793f, 19.973f, 10.301f, 19.739f, 9.931f)
                curveTo(19.533f, 9.604f, 19.236f, 9.345f, 18.885f, 9.183f)
                curveTo(18.487f, 9f, 17.991f, 9f, 16.998f, 9f)
                horizontalLineTo(7.002f)
                curveTo(6.009f, 9f, 5.513f, 9f, 5.115f, 9.183f)
                curveTo(4.764f, 9.345f, 4.467f, 9.604f, 4.261f, 9.931f)
                curveTo(4.027f, 10.301f, 3.961f, 10.793f, 3.83f, 11.777f)
                lineTo(3f, 18f)
                moveTo(21f, 18f)
                horizontalLineTo(3f)
                moveTo(21f, 18f)
                verticalLineTo(19.4f)
                curveTo(21f, 19.96f, 21f, 20.24f, 20.891f, 20.454f)
                curveTo(20.795f, 20.642f, 20.642f, 20.795f, 20.454f, 20.891f)
                curveTo(20.24f, 21f, 19.96f, 21f, 19.4f, 21f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 21f, 3.76f, 21f, 3.546f, 20.891f)
                curveTo(3.358f, 20.795f, 3.205f, 20.642f, 3.109f, 20.454f)
                curveTo(3f, 20.24f, 3f, 19.96f, 3f, 19.4f)
                verticalLineTo(18f)
                moveTo(7.5f, 12f)
                verticalLineTo(12.01f)
                moveTo(10.5f, 12f)
                verticalLineTo(12.01f)
                moveTo(9f, 15f)
                verticalLineTo(15.01f)
                moveTo(12f, 15f)
                verticalLineTo(15.01f)
                moveTo(15f, 15f)
                verticalLineTo(15.01f)
                moveTo(13.5f, 12f)
                verticalLineTo(12.01f)
                moveTo(16.5f, 12f)
                verticalLineTo(12.01f)
                moveTo(9f, 9f)
                verticalLineTo(6f)
                moveTo(5.8f, 6f)
                horizontalLineTo(12.2f)
                curveTo(12.48f, 6f, 12.62f, 6f, 12.727f, 5.945f)
                curveTo(12.821f, 5.898f, 12.898f, 5.821f, 12.946f, 5.727f)
                curveTo(13f, 5.62f, 13f, 5.48f, 13f, 5.2f)
                verticalLineTo(3.8f)
                curveTo(13f, 3.52f, 13f, 3.38f, 12.946f, 3.273f)
                curveTo(12.898f, 3.179f, 12.821f, 3.102f, 12.727f, 3.055f)
                curveTo(12.62f, 3f, 12.48f, 3f, 12.2f, 3f)
                horizontalLineTo(5.8f)
                curveTo(5.52f, 3f, 5.38f, 3f, 5.273f, 3.055f)
                curveTo(5.179f, 3.102f, 5.102f, 3.179f, 5.055f, 3.273f)
                curveTo(5f, 3.38f, 5f, 3.52f, 5f, 3.8f)
                verticalLineTo(5.2f)
                curveTo(5f, 5.48f, 5f, 5.62f, 5.055f, 5.727f)
                curveTo(5.102f, 5.821f, 5.179f, 5.898f, 5.273f, 5.945f)
                curveTo(5.38f, 6f, 5.52f, 6f, 5.8f, 6f)
                close()
            }
        }.build()

        return _CashRegister!!
    }

@Suppress("ObjectPropertyName")
private var _CashRegister: ImageVector? = null
