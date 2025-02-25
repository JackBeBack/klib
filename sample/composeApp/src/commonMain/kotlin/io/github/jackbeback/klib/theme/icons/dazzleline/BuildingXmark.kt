package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BuildingXmark: ImageVector
    get() {
        if (_BuildingXmark != null) {
            return _BuildingXmark!!
        }
        _BuildingXmark = ImageVector.Builder(
            name = "BuildingXmark",
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
                moveTo(12f, 21f)
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
                verticalLineTo(12f)
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
                moveTo(16f, 16f)
                lineTo(18.5f, 18.5f)
                moveTo(18.5f, 18.5f)
                lineTo(21f, 21f)
                moveTo(18.5f, 18.5f)
                lineTo(21f, 16f)
                moveTo(18.5f, 18.5f)
                lineTo(16f, 21f)
            }
        }.build()

        return _BuildingXmark!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingXmark: ImageVector? = null
