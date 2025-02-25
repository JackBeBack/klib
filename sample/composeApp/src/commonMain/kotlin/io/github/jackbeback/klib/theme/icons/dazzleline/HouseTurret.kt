package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseTurret: ImageVector
    get() {
        if (_HouseTurret != null) {
            return _HouseTurret!!
        }
        _HouseTurret = ImageVector.Builder(
            name = "HouseTurret",
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
                moveTo(15f, 8f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                lineTo(5f, 12f)
                verticalLineTo(21f)
                moveTo(7f, 3f)
                verticalLineTo(5f)
                moveTo(11f, 3f)
                verticalLineTo(5f)
                moveTo(10f, 16f)
                lineTo(14.424f, 11.978f)
                curveTo(14.804f, 11.633f, 14.994f, 11.46f, 15.209f, 11.395f)
                curveTo(15.399f, 11.337f, 15.601f, 11.337f, 15.791f, 11.395f)
                curveTo(16.006f, 11.46f, 16.196f, 11.633f, 16.576f, 11.978f)
                lineTo(21f, 16f)
                moveTo(12f, 14.182f)
                verticalLineTo(19.4f)
                curveTo(12f, 19.96f, 12f, 20.24f, 12.109f, 20.454f)
                curveTo(12.205f, 20.642f, 12.358f, 20.795f, 12.546f, 20.891f)
                curveTo(12.76f, 21f, 13.04f, 21f, 13.6f, 21f)
                horizontalLineTo(17.4f)
                curveTo(17.96f, 21f, 18.24f, 21f, 18.454f, 20.891f)
                curveTo(18.642f, 20.795f, 18.795f, 20.642f, 18.891f, 20.454f)
                curveTo(19f, 20.24f, 19f, 19.96f, 19f, 19.4f)
                verticalLineTo(14.182f)
                moveTo(11f, 9f)
                horizontalLineTo(7f)
            }
        }.build()

        return _HouseTurret!!
    }

@Suppress("ObjectPropertyName")
private var _HouseTurret: ImageVector? = null
