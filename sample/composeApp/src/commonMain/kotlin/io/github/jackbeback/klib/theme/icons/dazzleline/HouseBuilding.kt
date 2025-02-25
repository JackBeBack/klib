package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseBuilding: ImageVector
    get() {
        if (_HouseBuilding != null) {
            return _HouseBuilding!!
        }
        _HouseBuilding = ImageVector.Builder(
            name = "HouseBuilding",
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
                moveTo(10f, 7.5f)
                verticalLineTo(6.2f)
                curveTo(10f, 5.08f, 10f, 4.52f, 10.218f, 4.092f)
                curveTo(10.41f, 3.716f, 10.716f, 3.41f, 11.092f, 3.218f)
                curveTo(11.52f, 3f, 12.08f, 3f, 13.2f, 3f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 3f, 19.48f, 3f, 19.908f, 3.218f)
                curveTo(20.284f, 3.41f, 20.59f, 3.716f, 20.782f, 4.092f)
                curveTo(21f, 4.52f, 21f, 5.08f, 21f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(21f, 18.92f, 21f, 19.48f, 20.782f, 19.908f)
                curveTo(20.59f, 20.284f, 20.284f, 20.59f, 19.908f, 20.782f)
                curveTo(19.48f, 21f, 18.92f, 21f, 17.8f, 21f)
                horizontalLineTo(16f)
                moveTo(14f, 7f)
                horizontalLineTo(17f)
                moveTo(14f, 11f)
                horizontalLineTo(17f)
                moveTo(3f, 16f)
                lineTo(7.424f, 11.978f)
                curveTo(7.804f, 11.633f, 7.994f, 11.46f, 8.209f, 11.395f)
                curveTo(8.399f, 11.337f, 8.601f, 11.337f, 8.791f, 11.395f)
                curveTo(9.006f, 11.46f, 9.196f, 11.633f, 9.576f, 11.978f)
                lineTo(14f, 16f)
                moveTo(5f, 14.182f)
                verticalLineTo(19.4f)
                curveTo(5f, 19.96f, 5f, 20.24f, 5.109f, 20.454f)
                curveTo(5.205f, 20.642f, 5.358f, 20.795f, 5.546f, 20.891f)
                curveTo(5.76f, 21f, 6.04f, 21f, 6.6f, 21f)
                horizontalLineTo(10.4f)
                curveTo(10.96f, 21f, 11.24f, 21f, 11.454f, 20.891f)
                curveTo(11.642f, 20.795f, 11.795f, 20.642f, 11.891f, 20.454f)
                curveTo(12f, 20.24f, 12f, 19.96f, 12f, 19.4f)
                lineTo(12f, 14.182f)
            }
        }.build()

        return _HouseBuilding!!
    }

@Suppress("ObjectPropertyName")
private var _HouseBuilding: ImageVector? = null
