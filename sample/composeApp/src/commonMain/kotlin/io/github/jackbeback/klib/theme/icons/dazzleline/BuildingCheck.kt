package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BuildingCheck: ImageVector
    get() {
        if (_BuildingCheck != null) {
            return _BuildingCheck!!
        }
        _BuildingCheck = ImageVector.Builder(
            name = "BuildingCheck",
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
                moveTo(7f, 7f)
                horizontalLineTo(8f)
                moveTo(7f, 10f)
                horizontalLineTo(8f)
                moveTo(12f, 10f)
                horizontalLineTo(13f)
                moveTo(12f, 13f)
                horizontalLineTo(13f)
                moveTo(7f, 13f)
                horizontalLineTo(8f)
                moveTo(12f, 7f)
                horizontalLineTo(13f)
                moveTo(8f, 21f)
                verticalLineTo(18f)
                curveTo(8f, 16.895f, 8.895f, 16f, 10f, 16f)
                curveTo(10.597f, 16f, 11.134f, 16.262f, 11.5f, 16.677f)
                moveTo(16f, 15f)
                verticalLineTo(4.6f)
                curveTo(16f, 4.04f, 16f, 3.76f, 15.891f, 3.546f)
                curveTo(15.795f, 3.358f, 15.642f, 3.205f, 15.454f, 3.109f)
                curveTo(15.24f, 3f, 14.96f, 3f, 14.4f, 3f)
                horizontalLineTo(5.6f)
                curveTo(5.04f, 3f, 4.76f, 3f, 4.546f, 3.109f)
                curveTo(4.358f, 3.205f, 4.205f, 3.358f, 4.109f, 3.546f)
                curveTo(4f, 3.76f, 4f, 4.04f, 4f, 4.6f)
                verticalLineTo(21f)
                horizontalLineTo(11.5f)
                moveTo(15f, 19f)
                lineTo(17f, 21f)
                lineTo(21f, 17f)
            }
        }.build()

        return _BuildingCheck!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingCheck: ImageVector? = null
