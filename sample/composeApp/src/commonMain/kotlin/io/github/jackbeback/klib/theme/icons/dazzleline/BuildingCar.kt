package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BuildingCar: ImageVector
    get() {
        if (_BuildingCar != null) {
            return _BuildingCar!!
        }
        _BuildingCar = ImageVector.Builder(
            name = "BuildingCar",
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
                moveTo(5f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(4.6f)
                curveTo(3f, 4.04f, 3f, 3.76f, 3.109f, 3.546f)
                curveTo(3.205f, 3.358f, 3.358f, 3.205f, 3.546f, 3.109f)
                curveTo(3.76f, 3f, 4.04f, 3f, 4.6f, 3f)
                horizontalLineTo(13.4f)
                curveTo(13.96f, 3f, 14.24f, 3f, 14.454f, 3.109f)
                curveTo(14.642f, 3.205f, 14.795f, 3.358f, 14.891f, 3.546f)
                curveTo(15f, 3.76f, 15f, 4.04f, 15f, 4.6f)
                verticalLineTo(8f)
                moveTo(6f, 7f)
                horizontalLineTo(7f)
                moveTo(6f, 10f)
                horizontalLineTo(7f)
                moveTo(6f, 13f)
                horizontalLineTo(7f)
                moveTo(11f, 7f)
                horizontalLineTo(12f)
                moveTo(10f, 15f)
                lineTo(10.271f, 14.188f)
                curveTo(10.533f, 13.401f, 10.664f, 13.008f, 10.907f, 12.717f)
                curveTo(11.122f, 12.46f, 11.398f, 12.261f, 11.71f, 12.139f)
                curveTo(12.062f, 12f, 12.477f, 12f, 13.306f, 12f)
                horizontalLineTo(16.694f)
                curveTo(17.523f, 12f, 17.938f, 12f, 18.291f, 12.139f)
                curveTo(18.602f, 12.261f, 18.878f, 12.46f, 19.093f, 12.717f)
                curveTo(19.336f, 13.008f, 19.467f, 13.401f, 19.729f, 14.188f)
                lineTo(20f, 15f)
                moveTo(21f, 21f)
                verticalLineTo(18.2f)
                curveTo(21f, 17.08f, 21f, 16.52f, 20.782f, 16.092f)
                curveTo(20.59f, 15.716f, 20.284f, 15.41f, 19.908f, 15.218f)
                curveTo(19.48f, 15f, 18.92f, 15f, 17.8f, 15f)
                horizontalLineTo(12.2f)
                curveTo(11.08f, 15f, 10.52f, 15f, 10.092f, 15.218f)
                curveTo(9.716f, 15.41f, 9.41f, 15.716f, 9.218f, 16.092f)
                curveTo(9f, 16.52f, 9f, 17.08f, 9f, 18.2f)
                verticalLineTo(21f)
                moveTo(9f, 20f)
                horizontalLineTo(21f)
                moveTo(12f, 17.5f)
                horizontalLineTo(12.01f)
                moveTo(18f, 17.5f)
                horizontalLineTo(18.01f)
            }
        }.build()

        return _BuildingCar!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingCar: ImageVector? = null
