package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BuildingArrowRight: ImageVector
    get() {
        if (_BuildingArrowRight != null) {
            return _BuildingArrowRight!!
        }
        _BuildingArrowRight = ImageVector.Builder(
            name = "BuildingArrowRight",
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
                moveTo(13f, 21f)
                horizontalLineTo(11f)
                moveTo(11f, 21f)
                horizontalLineTo(7f)
                moveTo(11f, 21f)
                verticalLineTo(18f)
                curveTo(11f, 16.895f, 10.105f, 16f, 9f, 16f)
                curveTo(7.895f, 16f, 7f, 16.895f, 7f, 18f)
                verticalLineTo(21f)
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
                verticalLineTo(13f)
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
                moveTo(18f, 21f)
                lineTo(21f, 18f)
                moveTo(21f, 18f)
                lineTo(18f, 15f)
                moveTo(21f, 18f)
                horizontalLineTo(15f)
            }
        }.build()

        return _BuildingArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingArrowRight: ImageVector? = null
