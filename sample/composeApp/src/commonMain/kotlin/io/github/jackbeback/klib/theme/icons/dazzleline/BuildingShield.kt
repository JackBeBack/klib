package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BuildingShield: ImageVector
    get() {
        if (_BuildingShield != null) {
            return _BuildingShield!!
        }
        _BuildingShield = ImageVector.Builder(
            name = "BuildingShield",
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
                moveTo(6f, 7f)
                horizontalLineTo(7f)
                moveTo(6f, 10f)
                horizontalLineTo(7f)
                moveTo(11f, 10f)
                horizontalLineTo(12f)
                moveTo(11f, 13f)
                horizontalLineTo(12f)
                moveTo(6f, 13f)
                horizontalLineTo(7f)
                moveTo(11f, 7f)
                horizontalLineTo(12f)
                moveTo(11f, 21f)
                verticalLineTo(18f)
                curveTo(11f, 16.895f, 10.105f, 16f, 9f, 16f)
                curveTo(7.895f, 16f, 7f, 16.895f, 7f, 18f)
                verticalLineTo(21f)
                moveTo(11f, 21f)
                horizontalLineTo(12.5f)
                moveTo(11f, 21f)
                horizontalLineTo(7f)
                moveTo(7f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(4.6f)
                curveTo(3f, 4.04f, 3f, 3.76f, 3.109f, 3.546f)
                curveTo(3.205f, 3.358f, 3.358f, 3.205f, 3.546f, 3.109f)
                curveTo(3.76f, 3f, 4.04f, 3f, 4.6f, 3f)
                horizontalLineTo(13.4f)
                curveTo(13.96f, 3f, 14.24f, 3f, 14.454f, 3.109f)
                curveTo(14.642f, 3.205f, 14.795f, 3.358f, 14.891f, 3.546f)
                curveTo(15f, 3.76f, 15f, 4.04f, 15f, 4.6f)
                verticalLineTo(12f)
                moveTo(20.883f, 16.032f)
                curveTo(20.821f, 16.035f, 20.758f, 16.037f, 20.694f, 16.037f)
                curveTo(19.755f, 16.037f, 18.899f, 15.645f, 18.25f, 15f)
                curveTo(17.601f, 15.645f, 16.745f, 16.037f, 15.806f, 16.037f)
                curveTo(15.742f, 16.037f, 15.679f, 16.035f, 15.617f, 16.032f)
                curveTo(15.54f, 16.359f, 15.5f, 16.702f, 15.5f, 17.055f)
                curveTo(15.5f, 18.953f, 16.669f, 20.548f, 18.25f, 21f)
                curveTo(19.831f, 20.548f, 21f, 18.953f, 21f, 17.055f)
                curveTo(21f, 16.702f, 20.959f, 16.359f, 20.883f, 16.032f)
                close()
            }
        }.build()

        return _BuildingShield!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingShield: ImageVector? = null
