package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BuildingExclamation: ImageVector
    get() {
        if (_BuildingExclamation != null) {
            return _BuildingExclamation!!
        }
        _BuildingExclamation = ImageVector.Builder(
            name = "BuildingExclamation",
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
                moveTo(15f, 21f)
                horizontalLineTo(13f)
                moveTo(13f, 21f)
                horizontalLineTo(9f)
                moveTo(13f, 21f)
                verticalLineTo(18f)
                curveTo(13f, 16.895f, 12.105f, 16f, 11f, 16f)
                curveTo(9.895f, 16f, 9f, 16.895f, 9f, 18f)
                verticalLineTo(21f)
                moveTo(9f, 21f)
                horizontalLineTo(5f)
                verticalLineTo(4.6f)
                curveTo(5f, 4.04f, 5f, 3.76f, 5.109f, 3.546f)
                curveTo(5.205f, 3.358f, 5.358f, 3.205f, 5.546f, 3.109f)
                curveTo(5.76f, 3f, 6.04f, 3f, 6.6f, 3f)
                horizontalLineTo(15.4f)
                curveTo(15.96f, 3f, 16.24f, 3f, 16.454f, 3.109f)
                curveTo(16.642f, 3.205f, 16.795f, 3.358f, 16.891f, 3.546f)
                curveTo(17f, 3.76f, 17f, 4.04f, 17f, 4.6f)
                verticalLineTo(11.5f)
                moveTo(8f, 7f)
                horizontalLineTo(9f)
                moveTo(8f, 10f)
                horizontalLineTo(9f)
                moveTo(13f, 10f)
                horizontalLineTo(14f)
                moveTo(13f, 13f)
                horizontalLineTo(14f)
                moveTo(8f, 13f)
                horizontalLineTo(9f)
                moveTo(13f, 7f)
                horizontalLineTo(14f)
                moveTo(19f, 15f)
                verticalLineTo(18f)
                moveTo(19f, 21f)
                horizontalLineTo(19.01f)
            }
        }.build()

        return _BuildingExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingExclamation: ImageVector? = null
