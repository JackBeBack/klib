package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BuildingUser: ImageVector
    get() {
        if (_BuildingUser != null) {
            return _BuildingUser!!
        }
        _BuildingUser = ImageVector.Builder(
            name = "BuildingUser",
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
                moveTo(7f, 21f)
                verticalLineTo(18f)
                curveTo(7f, 16.895f, 7.895f, 16f, 9f, 16f)
                curveTo(10.105f, 16f, 11f, 16.895f, 11f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                close()
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
                verticalLineTo(9f)
                moveTo(19.7f, 13.5f)
                curveTo(19.7f, 14.328f, 19.028f, 15f, 18.2f, 15f)
                curveTo(17.372f, 15f, 16.7f, 14.328f, 16.7f, 13.5f)
                curveTo(16.7f, 12.672f, 17.372f, 12f, 18.2f, 12f)
                curveTo(19.028f, 12f, 19.7f, 12.672f, 19.7f, 13.5f)
                close()
                moveTo(21.5f, 21f)
                verticalLineTo(20.5f)
                curveTo(21.5f, 19.119f, 20.381f, 18f, 19f, 18f)
                horizontalLineTo(17.5f)
                curveTo(16.119f, 18f, 15f, 19.119f, 15f, 20.5f)
                verticalLineTo(21f)
                horizontalLineTo(21.5f)
                close()
            }
        }.build()

        return _BuildingUser!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingUser: ImageVector? = null
